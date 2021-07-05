package org.xms.g.tasks;


/**
 * Provides the ability to create Task-based APIs.<br/>
 * Combination of com.huawei.hmf.tasks.TaskCompletionSource<TResult> and com.google.android.gms.tasks.TaskCompletionSource<TResult>.<br/>
 * com.huawei.hmf.tasks.TaskCompletionSource<TResult>: Sets the result or exception returned by a task.<br/>
 * com.google.android.gms.tasks.TaskCompletionSource<TResult>: Provides the ability to create Task-based APIs.<br/>
 */
public class TaskCompletionSource<XTResult> extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.tasks.TaskCompletionSource.TaskCompletionSource(org.xms.g.utils.XBox) constructor of TaskCompletionSource with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public TaskCompletionSource(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.TaskCompletionSource.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted TaskCompletionSource object
     */
    public static org.xms.g.tasks.TaskCompletionSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.TaskCompletionSource) param0);
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.TaskCompletionSource;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.TaskCompletionSource;
        }
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.getTask() Returns the Task.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.TaskCompletionSource<TResult>.getTask(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/taskcompletionsource-0000001050123103-V5#EN-US_TOPIC_0000001050123103__section42951812135816">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/taskcompletionsource-0000001050123103-V5#EN-US_TOPIC_0000001050123103__section42951812135816</a><br/>
     * com.google.android.gms.tasks.TaskCompletionSource.getTask(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-tasktresult-gettask">https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-tasktresult-gettask</a><br/>
     *
     * @return the return object is Task
     */
    public org.xms.g.tasks.Task<XTResult> getTask() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).getTask()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).getTask();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).getTask()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).getTask();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.setException(java.lang.Exception) Completes the Task with the specified exception.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.TaskCompletionSource<TResult>.setException(java.lang.Exception)
     * com.google.android.gms.tasks.TaskCompletionSource.setException(java.lang.Exception): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-void-setexception-exception-e">https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-void-setexception-exception-e</a><br/>
     *
     * @param param0 the specified exception
     */
    public void setException(java.lang.Exception param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setException(param0)");
            ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setException(param0);
        }
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.setResult(XTResult) Completes the Task with the specified result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.TaskCompletionSource<TResult>.setResult(TResult): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/taskcompletionsource-0000001050123103-V5#EN-US_TOPIC_0000001050123103__section10478151064312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/taskcompletionsource-0000001050123103-V5#EN-US_TOPIC_0000001050123103__section10478151064312</a><br/>
     * com.google.android.gms.tasks.TaskCompletionSource.setResult(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-void-setresult-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-void-setresult-tresult-result</a><br/>
     *
     * @param param0 the specified result
     */
    public void setResult(XTResult param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            java.lang.Object hObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(hObj0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(hObj0);
        } else {
            java.lang.Object gObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setResult(gObj0)");
            ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).setResult(gObj0);
        }
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.trySetException(java.lang.Exception) Completes the Task with the specified exception, unless the Task has already completed. If the Task has already completed, the call does nothing.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.tasks.TaskCompletionSource.trySetException(java.lang.Exception): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-boolean-trysetexception-exception-e">https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-boolean-trysetexception-exception-e</a><br/>
     *
     * @param param0 the specified exception
     * @return true if the exception was set successfully, false otherwise
     */
    public boolean trySetException(java.lang.Exception param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setException(param0);
            return true;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetException(param0)");
            return ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetException(param0);
        }
    }

    /**
     * org.xms.g.tasks.TaskCompletionSource.trySetResult(XTResult) Completes the Task with the specified result, unless the Task has already completed. If the Task has already completed, the call does nothing.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.tasks.TaskCompletionSource.trySetResult(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-boolean-trysetresult-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/TaskCompletionSource#public-boolean-trysetresult-tresult-result</a><br/>
     *
     * @param param0 the specified result
     * @return true if the result was set successfully, false otherwise
     */
    public boolean trySetResult(XTResult param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(param0)");
            ((com.huawei.hmf.tasks.TaskCompletionSource) this.getHInstance()).setResult(param0);
            return true;
        } else {
            java.lang.Object gObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetResult(gObj0)");
            return ((com.google.android.gms.tasks.TaskCompletionSource) this.getGInstance()).trySetResult(gObj0);
        }
    }
}