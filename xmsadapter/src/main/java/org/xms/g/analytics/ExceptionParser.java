package org.xms.g.analytics;

/**
 * This interface is responsible for parsing a Throwable and providing a short, meaningful description to report to Analytics.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.ExceptionParser: This interface is responsible for parsing a Throwable and providing a short, meaningful description to report to Google Analytics.<br/>
 */
public interface ExceptionParser extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.analytics.ExceptionParser.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.ExceptionParser.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExceptionParser object
     */
    public static org.xms.g.analytics.ExceptionParser dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ExceptionParser.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public java.lang.String getDescription(java.lang.String param0, java.lang.Throwable param1);

    default java.lang.Object getZInstanceExceptionParser() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.analytics.ExceptionParser getGInstanceExceptionParser() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceExceptionParser() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * This interface is responsible for parsing a Throwable and providing a short, meaningful description to report to Analytics.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * : <br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.analytics.ExceptionParser {

        /**
         * org.xms.g.analytics.ExceptionParser.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
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
        public java.lang.String getDescription(java.lang.String param0, java.lang.Throwable param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}