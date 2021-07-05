package org.xms.g.measurement;

/**
 * A BroadcastReceiver for Analytics.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.measurement.AppMeasurementReceiver: A BroadcastReceiver for Firebase Analytics. Firebase Analytics requires this receiver to be correctly declared in AndroidManifest.xml and enabled.<br/>
 */
public final class AppMeasurementReceiver extends androidx.legacy.content.WakefulBroadcastReceiver implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.AppMeasurementReceiver(org.xms.g.utils.XBox) constructor of AppMeasurementReceiver with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public AppMeasurementReceiver(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.AppMeasurementReceiver() constructor of AppMeasurementReceiver.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.measurement.AppMeasurementReceiver.AppMeasurementReceiver(): <a href="https://developers.google.com/android/reference/com/google/android/gms/measurement/AppMeasurementReceiver#public-appmeasurementreceiver">https://developers.google.com/android/reference/com/google/android/gms/measurement/AppMeasurementReceiver#public-appmeasurementreceiver</a><br/>
     */
    public AppMeasurementReceiver() {
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.measurement.AppMeasurementReceiver.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted AppMeasurementReceiver object
     */
    public static org.xms.g.measurement.AppMeasurementReceiver dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final android.content.BroadcastReceiver.PendingResult doGoAsync() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void doStartService(android.content.Context param0, android.content.Intent param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void onReceive(android.content.Context param0, android.content.Intent param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.measurement.AppMeasurementReceiver.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}