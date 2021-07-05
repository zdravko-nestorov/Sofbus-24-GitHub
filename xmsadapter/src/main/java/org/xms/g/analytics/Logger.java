package org.xms.g.analytics;

/**
 * Deprecated Analytics Logger interface. Analytics will log to logcat under GAv4 tag using Android Log system. By default only ERROR, WARN and INFO levels are enabled.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.Logger: Deprecated Analytics Logger interface. Google Analytics will log to logcat under GAv4 tag using Android Log system. By default only ERROR, WARN and INFO levels are enabled.<br/>
 */
public interface Logger extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.analytics.Logger.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.Logger.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Logger object
     */
    public static org.xms.g.analytics.Logger dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.Logger.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public void error(java.lang.Exception param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public void error(java.lang.String param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public int getLogLevel();

    /**
     * XMS does not provide this api.<br/>
     */
    public void setLogLevel(int param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public void info(java.lang.String param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public void verbose(java.lang.String param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public void warn(java.lang.String param0);

    default java.lang.Object getZInstanceLogger() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.analytics.Logger getGInstanceLogger() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceLogger() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Deprecated Analytics Logger interface. Analytics will log to logcat under GAv4 tag using Android Log system. By default only ERROR, WARN and INFO levels are enabled.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * : <br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.analytics.Logger {

        /**
         * org.xms.g.analytics.Logger.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void error(java.lang.Exception param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void error(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public int getLogLevel() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void setLogLevel(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void info(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void verbose(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void warn(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * This class was deprecated.See Logger interface for details.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.Logger.LogLevel: This class was deprecated.See Logger interface for details.<br/>
     */
    public static class LogLevel extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.analytics.Logger.LogLevel.LogLevel(org.xms.g.utils.XBox) constructor of LogLevel with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public LogLevel(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.LogLevel() constructor of LogLevel.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.Logger.LogLevel.LogLevel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-logger.loglevel">https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-logger.loglevel</a><br/>
         */
        public LogLevel() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.getERROR() Return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.Logger.LogLevel.ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-error">https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-error</a><br/>
         *
         * @return Constant Value:3
         */
        public static int getERROR() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.getINFO() Return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.Logger.LogLevel.INFO: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-info">https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-info</a><br/>
         *
         * @return Constant Value:1
         */
        public static int getINFO() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.getVERBOSE() Return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.Logger.LogLevel.VERBOSE: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-verbose">https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-verbose</a><br/>
         *
         * @return Constant Value:0
         */
        public static int getVERBOSE() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.getWARNING() Return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.Logger.LogLevel.WARNING: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-warning">https://developers.google.com/android/reference/com/google/android/gms/analytics/Logger.LogLevel#public-static-final-int-warning</a><br/>
         *
         * @return Constant Value:2
         */
        public static int getWARNING() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.Logger.LogLevel.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return the casted LogLevel object
         */
        public static org.xms.g.analytics.Logger.LogLevel dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.Logger.LogLevel.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}