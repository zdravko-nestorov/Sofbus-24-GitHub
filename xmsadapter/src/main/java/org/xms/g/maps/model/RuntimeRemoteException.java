package org.xms.g.maps.model;

/**
 * A RuntimeException wrapper for RemoteException.<br/>
 * Combination of com.huawei.hms.maps.model.RuntimeRemoteException and com.google.android.gms.maps.model.RuntimeRemoteException.<br/>
 * com.huawei.hms.maps.model.RuntimeRemoteException: Extends RuntimeException. The exception is thrown to indicate a major exception when the map server fails to be accessed and cannot be recovered.<br/>
 * com.google.android.gms.maps.model.RuntimeRemoteException: A RuntimeException wrapper for RemoteException. Thrown when normally there is something seriously wrong and there is no way to recover.<br/>
 */
public final class RuntimeRemoteException extends java.lang.RuntimeException implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.RuntimeRemoteException(org.xms.g.utils.XBox) A RuntimeException wrapper for RemoteException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public RuntimeRemoteException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.RuntimeRemoteException(android.os.RemoteException) A RuntimeException wrapper for RemoteException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.RuntimeRemoteException.RuntimeRemoteException(android.os.RemoteException): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/runtimeremote-0000001050153227-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/runtimeremote-0000001050153227-V5</a><br/>
     * com.google.android.gms.maps.model.RuntimeRemoteException.RuntimeRemoteException(android.os.RemoteException): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/RuntimeRemoteException#public-runtimeremoteexception-remoteexception-e">https://developers.google.com/android/reference/com/google/android/gms/maps/model/RuntimeRemoteException#public-runtimeremoteexception-remoteexception-e</a><br/>
     *
     * @param param0 the param should instanceof android os RemoteException
     */
    public RuntimeRemoteException(android.os.RemoteException param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.RuntimeRemoteException(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.RuntimeRemoteException(param0));
        }
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.RuntimeRemoteException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model RuntimeRemoteException object
     */
    public static org.xms.g.maps.model.RuntimeRemoteException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.RuntimeRemoteException) param0);
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.RuntimeRemoteException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.RuntimeRemoteException;
        }
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.getGInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object is gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.setGInstance(java.lang.Object) setGInstance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should be instanceof java lang Object
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.maps.model.RuntimeRemoteException.setHInstance(java.lang.Object) set HInstance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should be instanceof java lang Object
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}