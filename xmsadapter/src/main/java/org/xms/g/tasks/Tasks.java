package org.xms.g.tasks;


/**
 * Common task utility methods.<br/>
 * Combination of com.huawei.hmf.tasks.Tasks and com.google.android.gms.tasks.Tasks.<br/>
 * com.huawei.hmf.tasks.Tasks: A common task method.<br/>
 * com.google.android.gms.tasks.Tasks: Task utility methods.<br/>
 */
public final class Tasks extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.tasks.Tasks.Tasks(org.xms.g.utils.XBox) constructor of Tasks with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Tasks(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.tasks.Tasks.await(org.xms.g.tasks.Task<XTResult>,long,java.util.concurrent.TimeUnit) Blocks until the specified Task is complete.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.await(com.huawei.hmf.tasks.Task<TResult>,long,java.util.concurrent.TimeUnit): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tasks-0000001050123101-V5#EN-US_TOPIC_0000001050123101__section158212814319">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tasks-0000001050123101-V5#EN-US_TOPIC_0000001050123101__section158212814319</a><br/>
     * com.google.android.gms.tasks.Tasks.await(com.google.android.gms.tasks.Task<TResult>,long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tresult-await-tasktresult-task,-long-timeout,-timeunit-unit">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tresult-await-tasktresult-task,-long-timeout,-timeunit-unit</a><br/>
     *
     * @param param0 Task to be completed
     * @param param1 Timeout duration
     * @param param2 Unit of time
     * @return Result of the task
     * @throws java.util.concurrent.ExecutionException if the Task fails. getCause will return the original exception
     * @throws java.lang.InterruptedException          if an interrupt occurs while waiting for the Task to complete
     * @throws java.util.concurrent.TimeoutException   if the specified timeout is reached before the Task completes
     */
    public static <XTResult> XTResult await(org.xms.g.tasks.Task<XTResult> param0, long param1, java.util.concurrent.TimeUnit param2) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))), param1, param2)");
            java.lang.Object hmsObj = com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))), param1, param2);
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))), param1, param2)");
            java.lang.Object gmsObj = com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))), param1, param2);
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.await(org.xms.g.tasks.Task<XTResult>) Blocks until the specified Task is complete.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.await(com.huawei.hmf.tasks.Task<TResult>): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tasks-0000001050123101-V5#EN-US_TOPIC_0000001050123101__section1257792715383">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tasks-0000001050123101-V5#EN-US_TOPIC_0000001050123101__section1257792715383</a><br/>
     * com.google.android.gms.tasks.Tasks.await(com.google.android.gms.tasks.Task<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tresult-await-tasktresult-task">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tresult-await-tasktresult-task</a><br/>
     *
     * @param param0 Task to be completed
     * @return Result of the task
     * @throws java.util.concurrent.ExecutionException if the Task fails. getCause will return the original exception
     * @throws java.lang.InterruptedException          if an interrupt occurs while waiting for the Task to complete
     */
    public static <XTResult> XTResult await(org.xms.g.tasks.Task<XTResult> param0) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))))");
            java.lang.Object hmsObj = com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))));
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))))");
            java.lang.Object gmsObj = com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))));
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.call(java.util.concurrent.Callable<XTResult>) Returns a Task that will be completed with the result of the specified Callable.The Callable will be called on the main application thread.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.call(java.util.concurrent.Callable<XTResult>): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tasks-0000001050123101-V5#EN-US_TOPIC_0000001050123101__section10478151064312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tasks-0000001050123101-V5#EN-US_TOPIC_0000001050123101__section10478151064312</a><br/>
     * com.google.android.gms.tasks.Tasks.call(java.util.concurrent.Callable<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-call-callabletresult-callable">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-call-callabletresult-callable</a><br/>
     *
     * @param param0 Operation to be performed
     * @return New task returned
     */
    public static <XTResult> org.xms.g.tasks.Task<XTResult> call(java.util.concurrent.Callable<XTResult> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.callInBackground(com.huawei.hmf.tasks.TaskExecutors.uiThread(),param0)");
            com.huawei.hmf.tasks.Task hReturn = null;
            hReturn = com.huawei.hmf.tasks.Tasks.callInBackground(com.huawei.hmf.tasks.TaskExecutors.uiThread(), param0);
            if (hReturn == null) {
                return null;
            }
            return new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.call(param0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.call(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.call(java.util.concurrent.Executor,java.util.concurrent.Callable<XTResult>) Returns a Task that will be completed with the result of the specified Callable.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.callInBackground(java.util.concurrent.Executor,java.util.concurrent.Callable<TResult>)
     * com.google.android.gms.tasks.Tasks.call(java.util.concurrent.Executor,java.util.concurrent.Callable<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-call-executor-executor,-callabletresult-callable">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-call-executor-executor,-callabletresult-callable</a><br/>
     *
     * @param param0 the Executor to use to call the Callable
     * @param param1 Operation to be performed
     * @return New task returned
     */
    public static <XTResult> org.xms.g.tasks.Task<XTResult> call(java.util.concurrent.Executor param0, java.util.concurrent.Callable<XTResult> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.callInBackground(param0, param1)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.callInBackground(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.call(param0, param1)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.call(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.forCanceled() Returns a canceled Task.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.fromCanceled()
     * com.google.android.gms.tasks.Tasks.forCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-forcanceled">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-forcanceled</a><br/>
     *
     * @return a canceled Task
     */
    public static <XTResult> org.xms.g.tasks.Task<XTResult> forCanceled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.fromCanceled()");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.fromCanceled();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.forCanceled()");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.forCanceled();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.forException(java.lang.Exception) Returns a completed Task with the specified exception.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.fromException(java.lang.Exception)
     * com.google.android.gms.tasks.Tasks.forException(java.lang.Exception): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-forexception-exception-e">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-forexception-exception-e</a><br/>
     *
     * @param param0 the specified exception
     * @return a completed Task with the specified exception
     */
    public static <XTResult> org.xms.g.tasks.Task<XTResult> forException(java.lang.Exception param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.fromException(param0)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.fromException(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.forException(param0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.forException(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.forResult(XTResult) Returns a completed Task with the specified result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.tasks.Tasks.forResult(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-forresult-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasktresult-forresult-tresult-result</a><br/>
     *
     * @param param0 the specified result
     * @return a completed Task with the specified result
     */
    public static <XTResult> org.xms.g.tasks.Task<XTResult> forResult(XTResult param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            XTResult hObj0 = ((XTResult) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.fromResult(hObj0)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.fromResult(hObj0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            XTResult gObj0 = ((XTResult) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.forResult(gObj0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.forResult(gObj0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.whenAll(org.xms.g.tasks.Task<?>...) Returns a Task that completes successfully when all of the specified Tasks complete successfully. Does not accept nulls.This Task would fail if any of the provided Tasks fail. This Task would be set to canceled if any of the provided Tasks is canceled and no failure is detected.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.join(com.huawei.hmf.tasks.Task<?>...)
     * com.google.android.gms.tasks.Tasks.whenAll(com.google.android.gms.tasks.Task<?>...): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-taskvoid-whenall-task...-tasks">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-taskvoid-whenall-task...-tasks</a><br/>
     *
     * @param param0 the specified Tasks
     * @return the return object is Task
     */
    public static org.xms.g.tasks.Task<java.lang.Void> whenAll(org.xms.g.tasks.Task<?>... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.join(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.join(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task) x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAll(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAll(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task) x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.whenAll(java.util.Collection<? extends org.xms.g.tasks.Task<?>>) Returns a Task that completes successfully when all of the specified Tasks complete successfully. Does not accept nulls.The returned Task would fail if any of the provided Tasks fail. The returned Task would be set to canceled if any of the provided Tasks is canceled and no failure is detected.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.join(java.util.Collection<? extends com.huawei.hmf.tasks.Task<?>>)
     * com.google.android.gms.tasks.Tasks.whenAllComplete(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-taskvoid-whenall-collection-extends-task-tasks">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-taskvoid-whenall-collection-extends-task-tasks</a><br/>
     *
     * @param param0 the specified Tasks
     * @return the return object is Task
     */
    public static org.xms.g.tasks.Task<java.lang.Void> whenAll(java.util.Collection<? extends org.xms.g.tasks.Task<?>> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.join(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.join(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAll(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAll(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.whenAllComplete(org.xms.g.tasks.Task<?>...) Returns a Task with a list of Tasks that completes successfully when all of the specified Tasks complete. This Task would always succeed even if any of the provided Tasks fail or canceled. Does not accept nulls.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.allOf(com.huawei.hmf.tasks.Task<?>...)
     * com.google.android.gms.tasks.Tasks.whenAllComplete(com.google.android.gms.tasks.Task<?>...): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttask-whenallcomplete-task...-tasks">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttask-whenallcomplete-task...-tasks</a><br/>
     *
     * @param param0 a list of Tasks
     * @return the return object is Task
     */
    public static org.xms.g.tasks.Task<java.util.List<org.xms.g.tasks.Task<?>>> whenAllComplete(org.xms.g.tasks.Task<?>... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.allOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.allOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task) x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllComplete(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllComplete(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task) x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.whenAllComplete(java.util.Collection<? extends org.xms.g.tasks.Task<?>>) Returns a Task with a list of Tasks that completes successfully when all of the specified Tasks complete. This Task would always succeed even if any of the provided Tasks fail or canceled. Does not accept nulls.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.allOf(java.util.Collection<? extends com.huawei.hmf.tasks.Task<?>>)
     * com.google.android.gms.tasks.Tasks.whenAllComplete(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttask-whenallcomplete-collection-extends-task-tasks">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttask-whenallcomplete-collection-extends-task-tasks</a><br/>
     *
     * @param param0 a list of Tasks
     * @return the return object is Task
     */
    public static org.xms.g.tasks.Task<java.util.List<org.xms.g.tasks.Task<?>>> whenAllComplete(java.util.Collection<? extends org.xms.g.tasks.Task<?>> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.allOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.allOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllComplete(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllComplete(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.whenAllSuccess(org.xms.g.tasks.Task<?>...) Returns a Task with a list of Task results that completes successfully when all of the specified Tasks complete successfully. This Task would fail if any of the provided Tasks fail. Does not accept nulls.This Task would be set to canceled if any of the provided Tasks is canceled and no failure is detected.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.successOf(com.huawei.hmf.tasks.Task<?>...)
     * com.google.android.gms.tasks.Tasks.whenAllSuccess(com.google.android.gms.tasks.Task<?>...): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttresult-whenallsuccess-task...-tasks">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttresult-whenallsuccess-task...-tasks</a><br/>
     *
     * @param param0 a list of Task results
     * @return the return object is Task
     */
    public static <XTResult> org.xms.g.tasks.Task<java.util.List<XTResult>> whenAllSuccess(org.xms.g.tasks.Task<?>... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.successOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.successOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task) x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllSuccess(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllSuccess(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task) x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.whenAllSuccess(java.util.Collection) Returns a Task with a list of Task results that completes successfully when all of the specified Tasks complete successfully. This Task would fail if any of the provided Tasks fail. Does not accept nulls.This Task would be set to canceled if any of the provided Tasks is canceled and no failure is detected.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Tasks.successOf(java.util.Collection<? extends com.huawei.hmf.tasks.Task<TResult>>)
     * com.google.android.gms.tasks.Tasks.whenAllSuccess(java.util.Collection<? extends com.google.android.gms.tasks.Task<?>>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttresult-whenallsuccess-collection-extends-task-tasks">https://developers.google.com/android/reference/com/google/android/gms/tasks/Tasks#public-static-tasklisttresult-whenallsuccess-collection-extends-task-tasks</a><br/>
     *
     * @param param0 a list of Task results
     * @return the return object is Task
     */
    public static <XTResult> org.xms.g.tasks.Task<java.util.List<XTResult>> whenAllSuccess(java.util.Collection param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.successOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.successOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllSuccess(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllSuccess(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.tasks.Tasks.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.Tasks.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Tasks object
     */
    public static org.xms.g.tasks.Tasks dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.Tasks) param0);
    }

    /**
     * org.xms.g.tasks.Tasks.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.Tasks;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.Tasks;
        }
    }
}