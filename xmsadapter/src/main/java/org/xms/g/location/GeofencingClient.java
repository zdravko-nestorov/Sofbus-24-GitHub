package org.xms.g.location;

/**
 * The main entry point for interacting with the geofencing APIs.<br/>
 * Combination of com.huawei.hms.location.GeofenceService and com.google.android.gms.location.GeofencingClient.<br/>
 * com.huawei.hms.location.GeofenceService: Geofence location class, which is used for interaction during location.<br/>
 * com.google.android.gms.location.GeofencingClient: The main entry point for interacting with the geofencing APIs.<br/>
 */
public class GeofencingClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {

    /**
     * org.xms.g.location.GeofencingClient.GeofencingClient(org.xms.g.utils.XBox) Constructor of GeofencingClient with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public GeofencingClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.GeofencingClient.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.GeofencingClient.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted GeofencingClient object
     */
    public static org.xms.g.location.GeofencingClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.GeofencingClient) {
            return ((org.xms.g.location.GeofencingClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.GeofencingClient gReturn = ((com.google.android.gms.location.GeofencingClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.GeofenceService hReturn = ((com.huawei.hms.location.GeofenceService) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.GeofencingClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.location.GeofencingClient) param0);
    }

    /**
     * org.xms.g.location.GeofencingClient.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceService;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingClient;
        }
    }

    /**
     * org.xms.g.location.GeofencingClient.addGeofences(org.xms.g.location.GeofencingRequest,android.app.PendingIntent) Sets alerts to be notified when the device enters or exits one of the specified geofences.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceService.createGeofenceList(com.huawei.hms.location.GeofenceRequest,android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceservice-0000001050986187-V5#EN-US_TOPIC_0000001050986187__section9254532817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceservice-0000001050986187-V5#EN-US_TOPIC_0000001050986187__section9254532817</a><br/>
     * com.google.android.gms.location.GeofencingClient.addGeofences(com.google.android.gms.location.GeofencingRequest,android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingClient#public-taskvoid-addgeofences-geofencingrequest-geofencingrequest,-pendingintent-pendingintent">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingClient#public-taskvoid-addgeofences-geofencingrequest-geofencingrequest,-pendingintent-pendingintent</a><br/>
     *
     * @param param0 Geofencing request that include a list of geofences to be added and related triggering behavior. The request must be created using GeofencingRequest.Builder
     * @param param1 A pending intent that will be used to generate an intent when matched geofence transition is observed
     * @return The task
     */
    public org.xms.g.tasks.Task<java.lang.Void> addGeofences(org.xms.g.location.GeofencingRequest param0, android.app.PendingIntent param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceService) this.getHInstance()).createGeofenceList(((com.huawei.hms.location.GeofenceRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.GeofenceService) this.getHInstance()).createGeofenceList(((com.huawei.hms.location.GeofenceRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingClient) this.getGInstance()).addGeofences(((com.google.android.gms.location.GeofencingRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.GeofencingClient) this.getGInstance()).addGeofences(((com.google.android.gms.location.GeofencingRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.GeofencingClient.removeGeofences(java.util.List<java.lang.String>) Removes geofences by their request IDs. Request ID is specified when you create a Geofence by calling setRequestId(String).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceService.deleteGeofenceList(java.util.List<java.lang.String>): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceservice-0000001050986187-V5#EN-US_TOPIC_0000001050986187__section8918132319409">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceservice-0000001050986187-V5#EN-US_TOPIC_0000001050986187__section8918132319409</a><br/>
     * com.google.android.gms.location.GeofencingClient.removeGeofences(java.util.List<java.lang.String>): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingClient#public-taskvoid-removegeofences-liststring-geofencerequestids">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingClient#public-taskvoid-removegeofences-liststring-geofencerequestids</a><br/>
     *
     * @param param0 A list of request IDs of geofences that need to be removed
     * @return The task
     */
    public org.xms.g.tasks.Task<java.lang.Void> removeGeofences(java.util.List<java.lang.String> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.GeofencingClient.removeGeofences(android.app.PendingIntent) Removes all geofences associated with the given pendingIntent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceService.deleteGeofenceList(android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceservice-0000001050986187-V5#EN-US_TOPIC_0000001050986187__section1270519314305">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceservice-0000001050986187-V5#EN-US_TOPIC_0000001050986187__section1270519314305</a><br/>
     * com.google.android.gms.location.GeofencingClient.removeGeofences(android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingClient#public-taskvoid-removegeofences-pendingintent-pendingintent">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingClient#public-taskvoid-removegeofences-pendingintent-pendingintent</a><br/>
     *
     * @param param0 The pending intent associated with the geofences that need to be removed
     * @return The task
     */
    public org.xms.g.tasks.Task<java.lang.Void> removeGeofences(android.app.PendingIntent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}