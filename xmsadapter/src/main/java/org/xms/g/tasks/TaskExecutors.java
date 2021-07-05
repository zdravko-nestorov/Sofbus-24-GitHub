package org.xms.g.tasks;


/**
 * A main task executor instances for use with Task.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.tasks.TaskExecutors: Standard Executor instances for use with Task.<br/>
 */
public final class TaskExecutors extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.tasks.TaskExecutors.TaskExecutors(org.xms.g.utils.XBox) constructor of TaskExecutors with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public TaskExecutors(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.tasks.TaskExecutors.getMAIN_THREAD() return a Executor that uses the main application thread.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD: <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskExecutors#public-static-final-executor-main_thread">https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskExecutors#public-static-final-executor-main_thread</a><br/>
     *
     * @return the return object is MAIN_THREAD
     */
    public static java.util.concurrent.Executor getMAIN_THREAD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.TaskExecutors.uiThread()");
            return com.huawei.hmf.tasks.TaskExecutors.uiThread();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD");
            return com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD;
        }
    }

    /**
     * org.xms.g.tasks.TaskExecutors.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.TaskExecutors.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted TaskExecutors object
     */
    public static org.xms.g.tasks.TaskExecutors dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.TaskExecutors) param0);
    }

    /**
     * org.xms.g.tasks.TaskExecutors.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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

            throw new RuntimeException("HMS does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.TaskExecutors;
        }
    }
}