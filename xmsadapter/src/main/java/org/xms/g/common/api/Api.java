package org.xms.g.common.api;

/**
 * public final class Api extends Object and Describes a section of GMS API or HMS API that should be made available.<br/>
 * Combination of com.huawei.hms.api.Api<O extends com.huawei.hms.api.Api.ApiOptions> and com.google.android.gms.common.api.Api<O extends com.google.android.gms.common.api.Api.ApiOptions>.<br/>
 * com.huawei.hms.api.Api<O extends com.huawei.hms.api.Api.ApiOptions>: <br/>
 * com.google.android.gms.common.api.Api<O extends com.google.android.gms.common.api.Api.ApiOptions>: public final class Api extends Object and Describes a section of the Google Play Services API that should be made available.<br/>
 */
public final class Api<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.api.Api.Api(org.xms.g.utils.XBox) constructor of Api with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Api(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.Api.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Api.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Api object
     */
    public static org.xms.g.common.api.Api dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Api) param0);
    }

    /**
     * org.xms.g.common.api.Api.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.Api;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Api;
        }
    }

    /**
     * Base interface for API options.<br/>
     * Combination of com.huawei.hms.api.Api.ApiOptions and com.google.android.gms.common.api.Api.ApiOptions.<br/>
     * com.huawei.hms.api.Api.ApiOptions: <br/>
     * com.google.android.gms.common.api.Api.ApiOptions: Base interface for API options.<br/>
     */
    public static interface ApiOptions extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.common.api.Api.ApiOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Api.ApiOptions.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted Api.ApiOptions object
         */
        public static org.xms.g.common.api.Api.ApiOptions dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.common.api.Api.ApiOptions) param0);
        }

        /**
         * org.xms.g.common.api.Api.ApiOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.Api.ApiOptions;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Api.ApiOptions;
                }
            }
            return param0 instanceof org.xms.g.common.api.Api.ApiOptions;
        }

        default java.lang.Object getZInstanceApiOptions() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceApiOptions();
            } else {
                return getGInstanceApiOptions();
            }
        }

        default com.google.android.gms.common.api.Api.ApiOptions getGInstanceApiOptions() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.common.api.Api.ApiOptions) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.common.api.Api.ApiOptions() {
            };
        }

        default com.huawei.hms.api.Api.ApiOptions getHInstanceApiOptions() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.api.Api.ApiOptions) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.api.Api.ApiOptions() {
            };
        }

        /**
         * Base interface for Api.ApiOptions in Apis that have options.<br/>
         * Combination of com.huawei.hms.api.Api.ApiOptions.HasOptions and com.google.android.gms.common.api.Api.ApiOptions.HasOptions.<br/>
         * com.huawei.hms.api.Api.ApiOptions.HasOptions: <br/>
         * com.google.android.gms.common.api.Api.ApiOptions.HasOptions: Base interface for Api.ApiOptions in Apis that have options.<br/>
         */
        public static interface HasOptions extends org.xms.g.utils.XInterface, org.xms.g.common.api.Api.ApiOptions {

            /**
             * org.xms.g.common.api.Api.ApiOptions.HasOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Api.ApiOptions.HasOptions.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return casted Api.ApiOptions.HasOptions object
             */
            public static org.xms.g.common.api.Api.ApiOptions.HasOptions dynamicCast(java.lang.Object param0) {
                if (param0 instanceof org.xms.g.common.api.Api.ApiOptions.HasOptions) {
                    return ((org.xms.g.common.api.Api.ApiOptions.HasOptions) param0);
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    com.google.android.gms.common.api.Api.ApiOptions.HasOptions gReturn = ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) ((org.xms.g.utils.XGettable) param0).getGInstance());
                    com.huawei.hms.api.Api.ApiOptions.HasOptions hReturn = ((com.huawei.hms.api.Api.ApiOptions.HasOptions) ((org.xms.g.utils.XGettable) param0).getHInstance());
                    return new org.xms.g.common.api.Api.ApiOptions.HasOptions.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
                }
                return ((org.xms.g.common.api.Api.ApiOptions.HasOptions) param0);
            }

            /**
             * org.xms.g.common.api.Api.ApiOptions.HasOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return true if the Object is XMS instance, otherwise false
             */
            public static boolean isInstance(java.lang.Object param0) {
                if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                    return false;
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                        return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.Api.ApiOptions.HasOptions;
                    } else {
                        return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
                    }
                }
                return param0 instanceof org.xms.g.common.api.Api.ApiOptions.HasOptions;
            }

            default java.lang.Object getZInstanceHasOptions() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return getHInstanceHasOptions();
                } else {
                    return getGInstanceHasOptions();
                }
            }

            default com.google.android.gms.common.api.Api.ApiOptions.HasOptions getGInstanceHasOptions() {
                if (this instanceof org.xms.g.utils.XGettable) {
                    return ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) ((org.xms.g.utils.XGettable) this).getGInstance());
                }
                return new com.google.android.gms.common.api.Api.ApiOptions.HasOptions() {
                };
            }

            default com.huawei.hms.api.Api.ApiOptions.HasOptions getHInstanceHasOptions() {
                if (this instanceof org.xms.g.utils.XGettable) {
                    return ((com.huawei.hms.api.Api.ApiOptions.HasOptions) ((org.xms.g.utils.XGettable) this).getHInstance());
                }
                return new com.huawei.hms.api.Api.ApiOptions.HasOptions() {
                };
            }

            /**
             * Wrapper class of ApiOptions.HasOptions which is base interface for Api.ApiOptions in Apis that have options.<br/>
             * Combination of com.huawei.hms.api.Api.ApiOptions.HasOptions and com.google.android.gms.common.api.Api.ApiOptions.HasOptions.<br/>
             * com.huawei.hms.api.Api.ApiOptions.HasOptions: <br/>
             * com.google.android.gms.common.api.Api.ApiOptions.HasOptions: Base interface for Api.ApiOptions in Apis that have options.<br/>
             */
            public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions.HasOptions {

                /**
                 * org.xms.g.common.api.Api.ApiOptions.HasOptions.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
                 * Support running environments including both HMS and GMS which are chosen by users.<br/>
                 *
                 * @param param0 the wrapper of xms instance
                 */
                public XImpl(org.xms.g.utils.XBox param0) {
                    super(param0);
                }
            }
        }

        /**
         * Base interface for Api.ApiOptions that are not required, don't exist.<br/>
         * Combination of com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions and com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions.<br/>
         * com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions: <br/>
         * com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions: Base interface for Api.ApiOptions that are not required, don't exist.<br/>
         */
        public static interface NotRequiredOptions extends org.xms.g.utils.XInterface, org.xms.g.common.api.Api.ApiOptions {

            /**
             * org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return casted Api.ApiOptions.NotRequiredOptions object
             */
            public static org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions dynamicCast(java.lang.Object param0) {
                if (param0 instanceof org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions) {
                    return ((org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions) param0);
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions gReturn = ((com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions) ((org.xms.g.utils.XGettable) param0).getGInstance());
                    com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions hReturn = ((com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions) ((org.xms.g.utils.XGettable) param0).getHInstance());
                    return new org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
                }
                return ((org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions) param0);
            }

            /**
             * org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return true if the Object is XMS instance, otherwise false
             */
            public static boolean isInstance(java.lang.Object param0) {
                if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                    return false;
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                        return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions;
                    } else {
                        return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions;
                    }
                }
                return param0 instanceof org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions;
            }

            default java.lang.Object getZInstanceNotRequiredOptions() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return getHInstanceNotRequiredOptions();
                } else {
                    return getGInstanceNotRequiredOptions();
                }
            }

            default com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions getGInstanceNotRequiredOptions() {
                if (this instanceof org.xms.g.utils.XGettable) {
                    return ((com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions) ((org.xms.g.utils.XGettable) this).getGInstance());
                }
                return new com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions() {
                };
            }

            default com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions getHInstanceNotRequiredOptions() {
                if (this instanceof org.xms.g.utils.XGettable) {
                    return ((com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions) ((org.xms.g.utils.XGettable) this).getHInstance());
                }
                return new com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions() {
                };
            }

            /**
             * Wrapper class of ApiOptions.NotRequiredOptions which is base interface for Api.ApiOptions that are not required, don't exist.<br/>
             * Combination of com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions and com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions.<br/>
             * com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions: <br/>
             * com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions: Base interface for Api.ApiOptions that are not required, don't exist.<br/>
             */
            public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions {

                /**
                 * org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
                 * Support running environments including both HMS and GMS which are chosen by users.<br/>
                 *
                 * @param param0 the wrapper of xms instance
                 */
                public XImpl(org.xms.g.utils.XBox param0) {
                    super(param0);
                }
            }
        }

        /**
         * Base interface for Api.ApiOptions that are optional.<br/>
         * Combination of com.huawei.hms.api.Api.ApiOptions.Optional and com.google.android.gms.common.api.Api.ApiOptions.Optional.<br/>
         * com.huawei.hms.api.Api.ApiOptions.Optional: <br/>
         * com.google.android.gms.common.api.Api.ApiOptions.Optional: Base interface for Api.ApiOptions that are optional.<br/>
         */
        public static interface Optional extends org.xms.g.utils.XInterface, org.xms.g.common.api.Api.ApiOptions.HasOptions, org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions {

            /**
             * org.xms.g.common.api.Api.ApiOptions.Optional.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Api.ApiOptions.Optional.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return casted Api.ApiOptions.Optional object
             */
            public static org.xms.g.common.api.Api.ApiOptions.Optional dynamicCast(java.lang.Object param0) {
                if (param0 instanceof org.xms.g.common.api.Api.ApiOptions.Optional) {
                    return ((org.xms.g.common.api.Api.ApiOptions.Optional) param0);
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    com.google.android.gms.common.api.Api.ApiOptions.Optional gReturn = ((com.google.android.gms.common.api.Api.ApiOptions.Optional) ((org.xms.g.utils.XGettable) param0).getGInstance());
                    com.huawei.hms.api.Api.ApiOptions.Optional hReturn = ((com.huawei.hms.api.Api.ApiOptions.Optional) ((org.xms.g.utils.XGettable) param0).getHInstance());
                    return new org.xms.g.common.api.Api.ApiOptions.Optional.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
                }
                return ((org.xms.g.common.api.Api.ApiOptions.Optional) param0);
            }

            /**
             * org.xms.g.common.api.Api.ApiOptions.Optional.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return true if the Object is XMS instance, otherwise false
             */
            public static boolean isInstance(java.lang.Object param0) {
                if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                    return false;
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                        return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.Api.ApiOptions.Optional;
                    } else {
                        return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Api.ApiOptions.Optional;
                    }
                }
                return param0 instanceof org.xms.g.common.api.Api.ApiOptions.Optional;
            }

            default java.lang.Object getZInstanceOptional() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return getHInstanceOptional();
                } else {
                    return getGInstanceOptional();
                }
            }

            default com.google.android.gms.common.api.Api.ApiOptions.Optional getGInstanceOptional() {
                if (this instanceof org.xms.g.utils.XGettable) {
                    return ((com.google.android.gms.common.api.Api.ApiOptions.Optional) ((org.xms.g.utils.XGettable) this).getGInstance());
                }
                return new com.google.android.gms.common.api.Api.ApiOptions.Optional() {
                };
            }

            default com.huawei.hms.api.Api.ApiOptions.Optional getHInstanceOptional() {
                if (this instanceof org.xms.g.utils.XGettable) {
                    return ((com.huawei.hms.api.Api.ApiOptions.Optional) ((org.xms.g.utils.XGettable) this).getHInstance());
                }
                return new com.huawei.hms.api.Api.ApiOptions.Optional() {
                };
            }

            /**
             * Wrapper class of ApiOptions.Optional which is base interface for Api.ApiOptions that are optional.<br/>
             * Combination of com.huawei.hms.api.Api.ApiOptions.Optional and com.google.android.gms.common.api.Api.ApiOptions.Optional.<br/>
             * com.huawei.hms.api.Api.ApiOptions.Optional: <br/>
             * com.google.android.gms.common.api.Api.ApiOptions.Optional: Base interface for Api.ApiOptions that are optional.<br/>
             */
            public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions.Optional {

                /**
                 * org.xms.g.common.api.Api.ApiOptions.Optional.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
                 * Support running environments including both HMS and GMS which are chosen by users.<br/>
                 *
                 * @param param0 the wrapper of xms instance
                 */
                public XImpl(org.xms.g.utils.XBox param0) {
                    super(param0);
                }
            }
        }

        /**
         * Wrapper class of ApiOptions which extends Object and Describes a section of GMS API or HMS API that should be made available.<br/>
         * Combination of com.huawei.hms.api.Api<O extends com.huawei.hms.api.Api.ApiOptions> and com.google.android.gms.common.api.Api<O extends com.google.android.gms.common.api.Api.ApiOptions>.<br/>
         * com.huawei.hms.api.Api<O extends com.huawei.hms.api.Api.ApiOptions>: <br/>
         * com.google.android.gms.common.api.Api<O extends com.google.android.gms.common.api.Api.ApiOptions>: public final class Api extends Object and Describes a section of the Google Play Services API that should be made available.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions {

            /**
             * org.xms.g.common.api.Api.ApiOptions.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the wrapper of xms instance
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }
        }

        /**
         * Api.ApiOptions implementation for Apis that do not take any options.<br/>
         * Combination of com.huawei.hms.api.Api.ApiOptions.NoOptions and com.google.android.gms.common.api.Api.ApiOptions.NoOptions.<br/>
         * com.huawei.hms.api.Api.ApiOptions.NoOptions: <br/>
         * com.google.android.gms.common.api.Api.ApiOptions.NoOptions: Api.ApiOptions implementation for Apis that do not take any options.<br/>
         */
        public static final class NoOptions extends org.xms.g.utils.XObject implements org.xms.g.common.api.Api.ApiOptions.NotRequiredOptions {

            /**
             * org.xms.g.common.api.Api.ApiOptions.NoOptions.NoOptions(org.xms.g.utils.XBox) constructor of NoOptions with XBox.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             *
             * @param param0 the wrapper of xms instance
             */
            public NoOptions(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.common.api.Api.ApiOptions.NoOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Api.ApiOptions.NoOptions.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return casted Api.ApiOptions.NoOptions object
             */
            public static org.xms.g.common.api.Api.ApiOptions.NoOptions dynamicCast(java.lang.Object param0) {
                if (param0 instanceof org.xms.g.common.api.Api.ApiOptions.NoOptions) {
                    return ((org.xms.g.common.api.Api.ApiOptions.NoOptions) param0);
                }
                if (param0 instanceof org.xms.g.utils.XGettable) {
                    com.google.android.gms.common.api.Api.ApiOptions.NoOptions gReturn = ((com.google.android.gms.common.api.Api.ApiOptions.NoOptions) ((org.xms.g.utils.XGettable) param0).getGInstance());
                    com.huawei.hms.api.Api.ApiOptions.NoOptions hReturn = ((com.huawei.hms.api.Api.ApiOptions.NoOptions) ((org.xms.g.utils.XGettable) param0).getHInstance());
                    return new org.xms.g.common.api.Api.ApiOptions.NoOptions(new org.xms.g.utils.XBox(gReturn, hReturn));
                }
                return ((org.xms.g.common.api.Api.ApiOptions.NoOptions) param0);
            }

            /**
             * org.xms.g.common.api.Api.ApiOptions.NoOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.Api.ApiOptions.NoOptions;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
                }
            }
        }
    }
}