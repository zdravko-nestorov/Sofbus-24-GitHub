package org.xms.g.tasks;

/**
 * Runtime version of ExecutionException.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.tasks.RuntimeExecutionException: Runtime version of ExecutionException.<br/>
 */
public class RuntimeExecutionException extends java.lang.RuntimeException implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.tasks.RuntimeExecutionException.RuntimeExecutionException(org.xms.g.utils.XBox) constructor of RuntimeExecutionException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public RuntimeExecutionException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.RuntimeExecutionException(java.lang.Throwable) constructor of RuntimeExecutionException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.tasks.RuntimeExecutionException.RuntimeExecutionException(java.lang.Throwable): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/RuntimeExecutionException#public-runtimeexecutionexception-throwable-cause">https://developers.google.com/android/reference/com/google/android/gms/tasks/RuntimeExecutionException#public-runtimeexecutionexception-throwable-cause</a><br/>
     *
     * @param param0 the cause
     */
    public RuntimeExecutionException(java.lang.Throwable param0) {
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.RuntimeExecutionException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted RuntimeExecutionException object
     */
    public static org.xms.g.tasks.RuntimeExecutionException dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.tasks.RuntimeExecutionException.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}