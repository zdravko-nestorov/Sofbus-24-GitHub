package org.xms.g.utils;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Class for XmsLog
 */
public class XmsLog {
    /**
     * org.xms.g.utils.XmsLog.LOG_LEVEL_DEBUG debug level.<br/>
     */
    public static final int LOG_LEVEL_DEBUG = 0;
    /**
     * org.xms.g.utils.XmsLog.LOG_LEVEL_INFO info level.<br/>
     */
    public static final int LOG_LEVEL_INFO = 1;
    /**
     * org.xms.g.utils.XmsLog.LOG_LEVEL_WARN warn level.<br/>
     */
    public static final int LOG_LEVEL_WARN = 2;
    /**
     * org.xms.g.utils.XmsLog.LOG_LEVEL_ERROR error level.<br/>
     */
    public static final int LOG_LEVEL_ERROR = 3;
    /**
     * org.xms.g.utils.XmsLog.LOG_LEVEL_CLOSE close level.<br/>
     */
    public static final int LOG_LEVEL_CLOSE = 4;
    private static final String TAG_XmsLog = XmsLog.class.getSimpleName();
    private static final boolean DEBUG_ENABLE = false;
    private static XmsLogInterface logImpl;
    private static int logLevel = LOG_LEVEL_WARN;

    public static void newInstance(XmsLogInterface inLogImpl) {
        logImpl = inLogImpl;
    }

    /**
     * org.xms.g.utils.XmsLog.defaultImpl() If the user did'nt implements the log interface, use Android default log<br/>
     *
     * @return XmsLogInterface
     */
    private static XmsLogInterface defaultImpl() {
        return new XmsLogInterface() {
            @Override
            public void d(String TAG, String logStr) {
                Log.d(TAG, logStr);
            }

            @Override
            public void d(String TAG, String logStr, Throwable tr) {
                Log.d(TAG, logStr);
            }

            @Override
            public void i(String TAG, String logStr) {
                Log.i(TAG, logStr);
            }

            @Override
            public void i(String TAG, String logStr, Throwable tr) {
                Log.i(TAG, logStr);
            }

            @Override
            public void w(String TAG, String logStr) {
                Log.w(TAG, logStr);
            }

            @Override
            public void w(String TAG, String logStr, Throwable tr) {
                Log.w(TAG, logStr);
            }

            @Override
            public void e(String TAG, String logStr) {
                Log.e(TAG, logStr);
            }

            @Override
            public void e(String TAG, String logStr, Throwable tr) {
                Log.e(TAG, logStr, tr);
            }
        };
    }

    /**
     * org.xms.g.utils.XmsLog.ensureLogImpl() ensure log implementation.<br/>
     */
    private static void ensureLogImpl() {
        if (logImpl == null) {
            XmsLog.newInstance(defaultImpl());
        }
    }

    /**
     * org.xms.g.utils.XmsLog.d(String TAG, String logStr) debug TAG and logStr.<br/>
     */
    public static void d(String TAG, String logStr) {
        d(TAG, logStr, null);
    }

    /**
     * org.xms.g.utils.XmsLog.d(String TAG, String logStr, Throwable tr) debug TAG, logStr and Throwable.<br/>
     */
    public static void d(String TAG, String logStr, Throwable tr) {
        if (!DEBUG_ENABLE || logLevel > LOG_LEVEL_DEBUG) {
            return;
        }
        ensureLogImpl();
        if (tr == null) {
            logImpl.d(TAG, constructLogInfo(TAG, logStr));
        } else {
            logImpl.d(TAG, constructLogInfo(TAG, logStr, tr), tr);
        }
    }

    /**
     * org.xms.g.utils.XmsLog.i(String TAG, String logStr) info of TAG, logStr.<br/>
     */
    public static void i(String TAG, String logStr) {
        i(TAG, logStr, null);
    }

    /**
     * org.xms.g.utils.XmsLog.i(String TAG, String logStr, Throwable tr) info of TAG, logStr and Throwable.<br/>
     */
    public static void i(String TAG, String logStr, Throwable tr) {
        if (!DEBUG_ENABLE || logLevel > LOG_LEVEL_INFO) {
            return;
        }
        ensureLogImpl();
        if (tr == null) {
            logImpl.i(TAG, constructLogInfo(TAG, logStr));
        } else {
            logImpl.i(TAG, constructLogInfo(TAG, logStr, tr), tr);
        }
    }

    /**
     * org.xms.g.utils.XmsLog.w(String TAG, String logStr) warning of TAG, logStr.<br/>
     */
    public static void w(String TAG, String logStr) {
        w(TAG, logStr, null);
    }

    /**
     * org.xms.g.utils.XmsLog.w(String TAG, String logStr, Throwable tr) warning of TAG, logStr and Throwable.<br/>
     */
    public static void w(String TAG, String logStr, Throwable tr) {
        if (!DEBUG_ENABLE || logLevel > LOG_LEVEL_WARN) {
            return;
        }
        ensureLogImpl();
        if (tr == null) {
            logImpl.w(TAG, constructLogInfo(TAG, logStr));
        } else {
            logImpl.w(TAG, constructLogInfo(TAG, logStr, tr), tr);
        }
    }

    /**
     * org.xms.g.utils.XmsLog.e(String TAG, String logStr) error of TAG, logStr.<br/>
     */
    public static void e(String TAG, String logStr) {
        e(TAG, logStr, null);
    }

    /**
     * org.xms.g.utils.XmsLog.e(String TAG, String logStr, Throwable tr) error of TAG, logStr and Throwable.<br/>
     */
    public static void e(String TAG, String logStr, Throwable tr) {
        if (!DEBUG_ENABLE || logLevel > LOG_LEVEL_ERROR) {
            return;
        }
        ensureLogImpl();
        if (tr == null) {
            logImpl.e(TAG, constructLogInfo(TAG, logStr));
        } else {
            logImpl.e(TAG, constructLogInfo(TAG, logStr, tr), tr);
        }
    }

    private static String constructLogInfo(String TAG, String logStr) {
        return constructLogInfo(TAG, logStr, null);
    }

    private static String constructLogInfo(String TAG, String logStr, Throwable tr) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[").append(TAG_XmsLog).append("]").append("[").append(TAG).append("]").append("|");
        if (null != tr) {
            StackTraceElement[] stackElements = tr.getStackTrace();
            buffer.append("[").append(stackElements[0].getClassName()).append(".").append(stackElements[0].getMethodName());
            buffer.append(":").append(stackElements[0].getLineNumber()).append("]");
            buffer.append(" | ");
        }
        buffer.append(logStr).append(" | ");
        buffer.append("[").append(getCurrentTime()).append("]");
        return buffer.toString();
    }

    private static String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        formatter.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        Date currTime = new Date();
        return formatter.format(currTime);
    }

    public interface XmsLogInterface {

        public void d(String TAG, String logStr);

        public void d(String TAG, String logStr, Throwable tr);

        public void i(String TAG, String logStr);

        public void i(String TAG, String logStr, Throwable tr);

        public void w(String TAG, String logStr);

        public void w(String TAG, String logStr, Throwable tr);

        public void e(String TAG, String logStr);

        public void e(String TAG, String logStr, Throwable tr);
    }
}
