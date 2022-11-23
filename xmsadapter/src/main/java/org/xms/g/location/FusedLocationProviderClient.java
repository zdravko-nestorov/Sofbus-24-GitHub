package org.xms.g.location;

import android.annotation.SuppressLint;

/**
 * The main entry point for interacting with the fused location provider.<br/>
 * Combination of com.huawei.hms.location.FusedLocationProviderClient and com.google.android.gms.location.FusedLocationProviderClient.<br/>
 * com.huawei.hms.location.FusedLocationProviderClient: Fused location class, which is used for interaction during location.<br/>
 * com.google.android.gms.location.FusedLocationProviderClient: The main entry point for interacting with the fused location provider.<br/>
 */
public class FusedLocationProviderClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {

    /**
     * org.xms.g.location.FusedLocationProviderClient.FusedLocationProviderClient(org.xms.g.utils.XBox) constructor of FusedLocationProviderClient with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public FusedLocationProviderClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.getKEY_VERTICAL_ACCURACY() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY
     * com.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-static-final-string-key_vertical_accuracy">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-static-final-string-key_vertical_accuracy</a><br/>
     *
     * @return Constant Value.Key used for the Bundle extra in Location object holding a float indicating the estimated vertical accuracy of the location, in meters
     */
    public static java.lang.String getKEY_VERTICAL_ACCURACY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY");
            return com.huawei.hms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY");
            return com.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY;
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.FusedLocationProviderClient.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted FusedLocationProviderClient object
     */
    public static org.xms.g.location.FusedLocationProviderClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.FusedLocationProviderClient) {
            return ((org.xms.g.location.FusedLocationProviderClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.FusedLocationProviderClient gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.FusedLocationProviderClient hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.FusedLocationProviderClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.location.FusedLocationProviderClient) param0);
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.FusedLocationProviderClient;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.FusedLocationProviderClient;
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.flushLocations() Flushes any locations currently being batched and sends them to all registered LocationListeners, LocationCallbacks, and PendingIntents. This call is only useful when batching is specified using setMaxWaitTime(long), otherwise locations are already delivered immediately when available.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.flushLocations(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1653772245611">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1653772245611</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.flushLocations(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-flushlocations">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-flushlocations</a><br/>
     *
     * @return The task
     */
    public org.xms.g.tasks.Task<java.lang.Void> flushLocations() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).flushLocations()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).flushLocations();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).flushLocations()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).flushLocations();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.getLastLocation() Returns the best most recent location currently available.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.getLastLocation(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1167913136559">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1167913136559</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.getLastLocation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-tasklocation-getlastlocation">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-tasklocation-getlastlocation</a><br/>
     *
     * @return The task
     */
    @SuppressLint("MissingPermission")
    public org.xms.g.tasks.Task<android.location.Location> getLastLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLastLocation()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLastLocation();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLastLocation()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLastLocation();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.getLocationAvailability() Returns the availability of location data. When isLocationAvailable() returns true, then the location returned by getLastLocation() will be reasonably up to date within the hints specified by the active LocationRequests.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.getLocationAvailability(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section884216175717">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section884216175717</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.getLocationAvailability(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-tasklocationavailability-getlocationavailability">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-tasklocationavailability-getlocationavailability</a><br/>
     *
     * @return The task
     */
    @SuppressLint("MissingPermission")
    public org.xms.g.tasks.Task<org.xms.g.location.LocationAvailability> getLocationAvailability() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLocationAvailability()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLocationAvailability();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLocationAvailability()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLocationAvailability();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.removeLocationUpdates(android.app.PendingIntent) Removes all location updates for the given pending intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.removeLocationUpdates(android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section19967172214018">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section19967172214018</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.removeLocationUpdates(android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-removelocationupdates-pendingintent-callbackintent">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-removelocationupdates-pendingintent-callbackintent</a><br/>
     *
     * @param param0 The PendingIntent that was used in requestLocationUpdates(LocationRequest, PendingIntent) or is equal as defined by equals(Object)
     * @return A Task for the call, check isSuccessful() to determine if it was successful
     */
    public org.xms.g.tasks.Task<java.lang.Void> removeLocationUpdates(android.app.PendingIntent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.removeLocationUpdates(org.xms.g.location.LocationCallback) Removes all location updates for the given location result listener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.removeLocationUpdates(com.huawei.hms.location.LocationCallback): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section14923192365816">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section14923192365816</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.removeLocationUpdates(com.google.android.gms.location.LocationCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-removelocationupdates-locationcallback-callback">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-removelocationupdates-locationcallback-callback</a><br/>
     *
     * @param param0 The callback to remove
     * @return A Task for the call, check isSuccessful() to determine if it was successful
     */
    public org.xms.g.tasks.Task<java.lang.Void> removeLocationUpdates(org.xms.g.location.LocationCallback param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(((com.huawei.hms.location.LocationCallback) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(((com.huawei.hms.location.LocationCallback) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(((com.google.android.gms.location.LocationCallback) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(((com.google.android.gms.location.LocationCallback) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.requestLocationUpdates(org.xms.g.location.LocationRequest,org.xms.g.location.LocationCallback,android.os.Looper) Requests location updates with a callback on the specified Looper thread.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.requestLocationUpdates(com.huawei.hms.location.LocationRequest,com.huawei.hms.location.LocationCallback,android.os.Looper): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1210118391289">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1210118391289</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.requestLocationUpdates(com.google.android.gms.location.LocationRequest,com.google.android.gms.location.LocationCallback,android.os.Looper): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-requestlocationupdates-locationrequest-request,-locationcallback-callback,-looper-looper">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-requestlocationupdates-locationrequest-request,-locationcallback-callback,-looper-looper</a><br/>
     *
     * @param param0 The location request for the updates
     * @param param1 The callback for the location updates
     * @param param2 The Looper object whose message queue will be used to implement the callback mechanism, or null to make callbacks on the calling thread
     * @return A Task for the call, check isSuccessful() to determine if it was successful
     * @throws java.lang.IllegalStateException If looper is null and this method is executed in a thread that has not called Looper.prepare()
     */
    @SuppressLint("MissingPermission")
    public org.xms.g.tasks.Task<java.lang.Void> requestLocationUpdates(org.xms.g.location.LocationRequest param0, org.xms.g.location.LocationCallback param1, android.os.Looper param2) throws java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.location.LocationCallback) ((param1) == null ? null : (param1.getHInstance()))), param2)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.location.LocationCallback) ((param1) == null ? null : (param1.getHInstance()))), param2);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.location.LocationCallback) ((param1) == null ? null : (param1.getGInstance()))), param2)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.location.LocationCallback) ((param1) == null ? null : (param1.getGInstance()))), param2);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.requestLocationUpdates(org.xms.g.location.LocationRequest,android.app.PendingIntent) Requests location updates with a callback on the specified PendingIntent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.requestLocationUpdates(com.huawei.hms.location.LocationRequest,android.app.PendingIntent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section750571415131">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section750571415131</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.requestLocationUpdates(com.google.android.gms.location.LocationRequest,android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-requestlocationupdates-locationrequest-request,-pendingintent-callbackintent">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-requestlocationupdates-locationrequest-request,-pendingintent-callbackintent</a><br/>
     *
     * @param param0 The location request for the updates
     * @param param1 A pending intent to be sent for each location update
     * @return A Task for the call, check isSuccessful() to determine if it was successful
     */
    @SuppressLint("MissingPermission")
    public org.xms.g.tasks.Task<java.lang.Void> requestLocationUpdates(org.xms.g.location.LocationRequest param0, android.app.PendingIntent param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.setMockLocation(android.location.Location) Sets the mock location to be used for the location provider. This location will be used in place of any actual locations from the underlying providers (network or gps).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.setMockLocation(android.location.Location): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section33108178161">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section33108178161</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.setMockLocation(android.location.Location): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-setmocklocation-location-mocklocation">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-setmocklocation-location-mocklocation</a><br/>
     *
     * @param param0 The mock location. Must have a minimum number of fields set to be considered a valild location, as per documentation in the Location class
     * @return A Task for the call, check isSuccessful() to determine if it was successful
     */
    @SuppressLint("MissingPermission")
    public org.xms.g.tasks.Task<java.lang.Void> setMockLocation(android.location.Location param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockLocation(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockLocation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockLocation(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockLocation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.FusedLocationProviderClient.setMockMode(boolean) Sets whether or not the location provider is in mock mode.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.FusedLocationProviderClient.setMockMode(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1333112213152">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/fusedlocationproviderclient-0000001050746169#EN-US_TOPIC_0000001050746169__section1333112213152</a><br/>
     * com.google.android.gms.location.FusedLocationProviderClient.setMockMode(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-setmockmode-boolean-ismockmode">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderClient#public-taskvoid-setmockmode-boolean-ismockmode</a><br/>
     *
     * @param param0 If true the location provider will be set to mock mode. If false it will be returned to its normal state
     * @return A Task for the call, check isSuccessful() to determine if it was successful
     */
    @SuppressLint("MissingPermission")
    public org.xms.g.tasks.Task<java.lang.Void> setMockMode(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockMode(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockMode(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockMode(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockMode(param0);
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