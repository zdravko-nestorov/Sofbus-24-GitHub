package org.xms.g.measurement;

/**
 * This class provide content to applications.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.measurement.AppMeasurementContentProvider: This class provide content to applications.<br/>
 */
public class AppMeasurementContentProvider extends android.content.ContentProvider implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.AppMeasurementContentProvider(org.xms.g.utils.XBox) constructor of AppMeasurementContentProvider with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public AppMeasurementContentProvider(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.AppMeasurementContentProvider() constructor of AppMeasurementContentProvider.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.measurement.AppMeasurementContentProvider.AppMeasurementContentProvider(): <a href="https://developers.google.com/android/reference/com/google/android/gms/measurement/AppMeasurementContentProvider#public-appmeasurementcontentprovider">https://developers.google.com/android/reference/com/google/android/gms/measurement/AppMeasurementContentProvider#public-appmeasurementcontentprovider</a><br/>
     */
    public AppMeasurementContentProvider() {
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.measurement.AppMeasurementContentProvider.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted AppMeasurementContentProvider object
     */
    public static org.xms.g.measurement.AppMeasurementContentProvider dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public void attachInfo(android.content.Context param0, android.content.pm.ProviderInfo param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int delete(android.net.Uri param0, java.lang.String param1, java.lang.String[] param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String getType(android.net.Uri param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public android.net.Uri insert(android.net.Uri param0, android.content.ContentValues param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public boolean onCreate() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public android.database.Cursor query(android.net.Uri param0, java.lang.String[] param1, java.lang.String param2, java.lang.String[] param3, java.lang.String param4) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int update(android.net.Uri param0, android.content.ContentValues param1, java.lang.String param2, java.lang.String[] param3) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.measurement.AppMeasurementContentProvider.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}