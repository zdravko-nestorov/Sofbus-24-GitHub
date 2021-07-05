package org.xms.g.analytics;

/**
 * This class will capture the root cause (last in a chain of causes) Throwable and report the exception type, class name, method name and thread name.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.StandardExceptionParser: This class will capture the root cause (last in a chain of causes) Throwable and report the exception type, class name, method name and thread name.<br/>
 */
public class StandardExceptionParser extends org.xms.g.utils.XObject implements org.xms.g.analytics.ExceptionParser {

    /**
     * org.xms.g.analytics.StandardExceptionParser.StandardExceptionParser(org.xms.g.utils.XBox) constructor of StandardExceptionParser with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public StandardExceptionParser(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.analytics.StandardExceptionParser.StandardExceptionParser(android.content.Context,java.util.Collection<java.lang.String>) constructor of StandardExceptionParser.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.StandardExceptionParser.StandardExceptionParser(android.content.Context,java.util.Collection<java.lang.String>): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/StandardExceptionParser#public-standardexceptionparser-context-context,-collectionstring-additionalpackages">https://developers.google.com/android/reference/com/google/android/gms/analytics/StandardExceptionParser#public-standardexceptionparser-context-context,-collectionstring-additionalpackages</a><br/>
     *
     * @param param0 the context
     * @param param1 the additional packages
     */
    public StandardExceptionParser(android.content.Context param0, java.util.Collection<java.lang.String> param1) {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.analytics.StandardExceptionParser.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.StandardExceptionParser.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted StandardExceptionParser object
     */
    public static org.xms.g.analytics.StandardExceptionParser dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.StandardExceptionParser.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public java.lang.String getDescription(java.lang.String param0, java.lang.Throwable param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void setIncludedPackages(android.content.Context param0, java.util.Collection<java.lang.String> param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    protected java.lang.StackTraceElement getBestStackTraceElement(java.lang.Throwable param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    protected java.lang.Throwable getCause(java.lang.Throwable param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    protected java.lang.String getDescription(java.lang.Throwable param0, java.lang.StackTraceElement param1, java.lang.String param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}