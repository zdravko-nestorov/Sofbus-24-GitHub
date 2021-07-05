package bg.znestorov.sofbus24.main;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import bg.znestorov.sofbus24.entity.NotificationEntity;
import bg.znestorov.sofbus24.gcm.GcmPreferences;
import bg.znestorov.sofbus24.utils.HmsUtils;

public class GcmMessageHandler extends IntentService {

    public GcmMessageHandler() {
        super("GcmMessageHandler");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        // Get the current service context
        Context context = GcmMessageHandler.this;
        if (HmsUtils.isHms()) {
            return;
        }

        // The getMessageType() intent parameter must be the intent you received
        // in your BroadcastReceiver
        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);
        String messageType = gcm.getMessageType(intent);

        // Check if the notification data is correctly received
        if (GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE.equals(messageType)) {

            // Get the extras (information received from the intent)
            Bundle extras = intent.getExtras();
            NotificationEntity notification = new NotificationEntity(extras);

            // Check if the received notification is with correct format
            if (notification.isValid()) {
                GcmPreferences.storeNotification(context, notification);
            }
        }

        GcmBroadcastReceiver.completeWakefulIntent(intent);
    }

}