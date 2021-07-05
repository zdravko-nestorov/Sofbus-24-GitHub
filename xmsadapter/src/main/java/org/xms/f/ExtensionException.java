package org.xms.f;

/**
 * Base class for all Firebase exceptions.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.firebase.FirebaseException: Base class for all Firebase exceptions.<br/>
 */
public class ExtensionException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.f.ExtensionException.ExtensionException(org.xms.g.utils.XBox) constructor of org.xms.f.ExtensionException.ExtensionException with org.xms.g.utils.XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.f.ExtensionException.ExtensionException(java.lang.String) Construct a ExtensionException from code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.FirebaseException.FirebaseException(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/FirebaseException#FirebaseException(java.lang.String)">https://developers.google.com/android/reference/com/google/firebase/FirebaseException#FirebaseException(java.lang.String)</a><br/>
     *
     * @param param0 This is detail message
     */
    public ExtensionException(java.lang.String param0) {
    }

    /**
     * org.xms.f.ExtensionException.ExtensionException(java.lang.String,java.lang.Throwable) Construct a ExtensionException from code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.FirebaseException.FirebaseException(java.lang.String,java.lang.Throwable): <a href="https://developers.google.com/android/reference/com/google/firebase/FirebaseException#FirebaseException(java.lang.String,%20java.lang.Throwable)">https://developers.google.com/android/reference/com/google/firebase/FirebaseException#FirebaseException(java.lang.String,%20java.lang.Throwable)</a><br/>
     *
     * @param param0 This is detail message
     * @param param1 This is Throwable
     */
    public ExtensionException(java.lang.String param0, java.lang.Throwable param1) {
    }

    /**
     * org.xms.f.ExtensionException.ExtensionException() Construct a ExtensionException from code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.firebase.FirebaseException.FirebaseException(): <a href="https://developers.google.com/android/reference/com/google/firebase/FirebaseException#FirebaseException()">https://developers.google.com/android/reference/com/google/firebase/FirebaseException#FirebaseException()</a><br/>
     */
    public ExtensionException() {
    }

    /**
     * org.xms.f.ExtensionException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.ExtensionException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionException object
     */
    public static org.xms.f.ExtensionException dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.f.ExtensionException.isInstance(java.lang.Object) judge whether the java.lang.Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.f.ExtensionException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return is gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.f.ExtensionException.setGInstance(java.lang.Object) set the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 gms instance
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.f.ExtensionException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return this is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.f.ExtensionException.setHInstance(java.lang.Object) set the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 hms instance
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}