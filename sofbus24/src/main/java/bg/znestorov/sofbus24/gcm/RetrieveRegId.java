package bg.znestorov.sofbus24.gcm;

import android.app.Activity;
import android.os.AsyncTask;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Devices;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * The first step a client app must do is register with GCM. This class is used
 * for registration the Sofbus 24 application with the GCM. In case of
 * unsuccessful registration, the application tries one more time to ensure that
 * this wasn't a connection problem (internet problem)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RetrieveRegId extends AsyncTask<Void, Void, String> {

    private static final Integer MAX_REGISTRATION_ATTEMPTS = 2;
    private final Activity context;
    private final GlobalEntity globalContext;
    private Integer gcmRegistrationAttempt;
    private GoogleCloudMessaging gcm;

    public RetrieveRegId(Activity context, Integer gcmRegistrationAttempt) {
        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();
        this.gcmRegistrationAttempt = gcmRegistrationAttempt;
    }

    @Override
    protected String doInBackground(Void... params) {

        String regId = GcmPreferences.getRegistrationId(context);
        String deviceModel = Devices.getDeviceName();
        String deviceOsVersion = Utils.getDeviceOsVersion();

        try {
            if (gcm == null) {
                gcm = GoogleCloudMessaging.getInstance(globalContext);
            }

            // Register the device/user with the GoogleCloudMessaging (allow the
            // user to receive notifications)
            regId = gcm.register(Constants.GCM_PROJECT_ID);

            // Try to register the regId on the ExternalServer. If the first
            // attempt is unsuccessful - try one more time
            Boolean isSharedSuccessful = GcmShareExternalServer
                    .registerWithAppServer(context, regId, deviceModel,
                            deviceOsVersion);
            if (!isSharedSuccessful) {
                isSharedSuccessful = GcmShareExternalServer
                        .registerWithAppServer(context, regId, deviceModel,
                                deviceOsVersion);
            }

            // If the sharing is unsuccessful - reset the regId (it will try to
            // register again)
            if (!isSharedSuccessful) {
                regId = "";
            }
        } catch (Exception ex) {
            regId = "";
        }

        return regId;
    }

    @Override
    protected void onPostExecute(String regId) {

        gcmRegistrationAttempt++;

        // Check if the registration is successful (if the GCM has returned a
        // registration id), otherwise - try one more time
        if (!Utils.isEmpty(regId)) {
            GcmPreferences.storeRegistrationId(context, regId);
        } else if (gcmRegistrationAttempt < MAX_REGISTRATION_ATTEMPTS) {
            RetrieveRegId retrieveRegId = new RetrieveRegId(context,
                    gcmRegistrationAttempt + 1);
            retrieveRegId.execute();
        }
    }

}