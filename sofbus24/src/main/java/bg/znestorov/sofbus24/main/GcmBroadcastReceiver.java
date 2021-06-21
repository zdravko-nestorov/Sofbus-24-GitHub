package bg.znestorov.sofbus24.main;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import androidx.legacy.content.WakefulBroadcastReceiver;

/**
 * This class will receive the GCM message & pass it to the GcmMessageHandler.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        // Explicitly specify that GcmMessageHandler will handle the intent.
        ComponentName componentName = new ComponentName(
                context.getPackageName(), GcmMessageHandler.class.getName());

        // Start the service, keeping the device awake while it is launching.
        startWakefulService(context, (intent.setComponent(componentName)));
        setResultCode(Activity.RESULT_OK);
    }
}