package org.xms.g.analytics;

/**
 * Used to catch any uncaught exceptions and report them to Analytics.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.ExceptionReporter: Used to catch any uncaught exceptions and report them to Google Analytics.<br/>
 */
public class ExceptionReporter extends org.xms.g.utils.XObject implements java.lang.Thread.UncaughtExceptionHandler {

    /**
     * org.xms.g.analytics.ExceptionReporter.ExceptionReporter(org.xms.g.utils.XBox) constructor of ExceptionReporter with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExceptionReporter(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.analytics.ExceptionReporter.ExceptionReporter(org.xms.g.analytics.Tracker,java.lang.Thread.UncaughtExceptionHandler,android.content.Context) constructor of ExceptionReporter with tracker, originalHandler and context.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ExceptionReporter.ExceptionReporter(com.google.android.gms.analytics.Tracker,java.lang.Thread.UncaughtExceptionHandler,android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ExceptionReporter#public-exceptionreporter-tracker-tracker,-thread.uncaughtexceptionhandler-originalhandler,-context-context">https://developers.google.com/android/reference/com/google/android/gms/analytics/ExceptionReporter#public-exceptionreporter-tracker-tracker,-thread.uncaughtexceptionhandler-originalhandler,-context-context</a><br/>
     *
     * @param param0 an active Tracker instance. Should not be null
     * @param param1 the current DefaultUncaughtExceptionHandler
     * @param param2 the current app context. Should not be null
     */
    public ExceptionReporter(org.xms.g.analytics.Tracker param0, java.lang.Thread.UncaughtExceptionHandler param1, android.content.Context param2) {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.analytics.ExceptionReporter.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.ExceptionReporter.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExceptionReporter object
     */
    public static org.xms.g.analytics.ExceptionReporter dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ExceptionReporter.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public org.xms.g.analytics.ExceptionParser getExceptionParser() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void setExceptionParser(org.xms.g.analytics.ExceptionParser param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void uncaughtException(java.lang.Thread param0, java.lang.Throwable param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}