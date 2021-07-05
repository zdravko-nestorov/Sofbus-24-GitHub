package org.xms.f;

/**
 * Indicates that a requested API is not available.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.firebase.FirebaseApiNotAvailableException: Indicates that a requested API is not available.<br/>
 */
public class ExtensionApiNotAvailableException extends org.xms.f.ExtensionException {

    /**
     * org.xms.f.ExtensionApiNotAvailableException.ExtensionApiNotAvailableException(org.xms.g.utils.XBox) constructor of org.xms.g.safetynet.HarmfulAppsData.HarmfulAppsData with org.xms.g.utils.XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionApiNotAvailableException(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.f.ExtensionApiNotAvailableException.ExtensionApiNotAvailableException(java.lang.String) construction method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.FirebaseApiNotAvailableException.FirebaseApiNotAvailableException(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/FirebaseApiNotAvailableException#FirebaseApiNotAvailableException(java.lang.String)">https://developers.google.com/android/reference/com/google/firebase/FirebaseApiNotAvailableException#FirebaseApiNotAvailableException(java.lang.String)</a><br/>
     *
     * @param param0 This is message
     */
    public ExtensionApiNotAvailableException(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.f.ExtensionApiNotAvailableException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.ExtensionApiNotAvailableException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionApiNotAvailableException object
     */
    public static org.xms.f.ExtensionApiNotAvailableException dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.f.ExtensionApiNotAvailableException.isInstance(java.lang.Object) judge whether the java.lang.Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}