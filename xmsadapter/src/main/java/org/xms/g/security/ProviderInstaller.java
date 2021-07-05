package org.xms.g.security;

/**
 * A utility class for installing a dynamically updatable Provider to replace the platform default provider.<br/>
 * Combination of com.huawei.hms.security.SecComponentInstallWizard and com.google.android.gms.security.ProviderInstaller.<br/>
 * com.huawei.hms.security.SecComponentInstallWizard: not found.<br/>
 * com.google.android.gms.security.ProviderInstaller: A utility class for installing a dynamically updatable Provider to replace the platform default provider.<br/>
 */
public class ProviderInstaller extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.security.ProviderInstaller.ProviderInstaller(org.xms.g.utils.XBox) Constructor of XObject with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 xBox the wrapper of xms instance
     */
    public ProviderInstaller(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.security.ProviderInstaller.ProviderInstaller() Constructor of XObject with null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     */
    public ProviderInstaller() {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.security.ProviderInstaller.getPROVIDER_NAME() Gets Constant Value is "GmsCore_OpenSSL".<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.security.ProviderInstaller.PROVIDER_NAME: <a href="https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller#public-static-final-string-provider_name">https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller#public-static-final-string-provider_name</a><br/>
     *
     * @return Constant Value:"GmsCore_OpenSSL"
     */
    public static java.lang.String getPROVIDER_NAME() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.security.ProviderInstaller.installIfNeeded(android.content.Context) Installs the dynamically updatable security provider, if it's not already installed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.security.SecComponentInstallWizard.install(android.content.Context)
     * com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller#public-static-void-installifneeded-context-context">https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller#public-static-void-installifneeded-context-context</a><br/>
     *
     * @param param0 the android context
     */
    public static void installIfNeeded(android.content.Context param0) throws org.xms.g.common.ExtensionPlayServicesRepairableException, org.xms.g.common.ExtensionPlayServicesNotAvailableException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.security.SecComponentInstallWizard.install(param0)");
                com.huawei.hms.security.SecComponentInstallWizard.install(param0);
            } catch (com.huawei.hms.api.HuaweiServicesRepairableException e) {
                throw new org.xms.g.common.ExtensionPlayServicesRepairableException(new org.xms.g.utils.XBox(null, e));
            } catch (com.huawei.hms.api.HuaweiServicesNotAvailableException e) {
                throw new org.xms.g.common.ExtensionPlayServicesNotAvailableException(new org.xms.g.utils.XBox(null, e));
            }
        } else {
            try {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.security.ProviderInstaller.installIfNeeded(param0)");
                com.google.android.gms.security.ProviderInstaller.installIfNeeded(param0);
            } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e) {
                throw new org.xms.g.common.ExtensionPlayServicesRepairableException(new org.xms.g.utils.XBox(e, null));
            } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
                throw new org.xms.g.common.ExtensionPlayServicesNotAvailableException(new org.xms.g.utils.XBox(e, null));
            }
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public static void installIfNeededAsync(android.content.Context param0, org.xms.g.security.ProviderInstaller.ProviderInstallListener param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.security.ProviderInstaller.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.security.ProviderInstaller.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted WalletConstants object
     */
    public static org.xms.g.security.ProviderInstaller dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.security.ProviderInstaller) param0);
    }

    /**
     * org.xms.g.security.ProviderInstaller.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.security.SecComponentInstallWizard;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.security.ProviderInstaller;
        }
    }

    /**
     * Callback for notification of the result of provider installation.<br/>
     * Combination of com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener and com.google.android.gms.security.ProviderInstaller.ProviderInstallListener.<br/>
     * com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener: not found.<br/>
     * com.google.android.gms.security.ProviderInstaller.ProviderInstallListener: Callback for notification of the result of provider installation.<br/>
     */
    public static interface ProviderInstallListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.security.ProviderInstaller.ProviderInstallListener.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.security.ProviderInstaller.ProviderInstallListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted WalletConstants object
         */
        public static org.xms.g.security.ProviderInstaller.ProviderInstallListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.security.ProviderInstaller.ProviderInstallListener) param0);
        }

        /**
         * org.xms.g.security.ProviderInstaller.ProviderInstallListener.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.security.ProviderInstaller.ProviderInstallListener;
                }
            }
            return param0 instanceof org.xms.g.security.ProviderInstaller.ProviderInstallListener;
        }

        /**
         * org.xms.g.security.ProviderInstaller.ProviderInstallListener.onProviderInstallFailed(int,android.content.Intent) Called when installing the provider fails. This method is always called on the UI thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener.onFailed(int,android.content.Intent)
         * com.google.android.gms.security.ProviderInstaller.ProviderInstallListener.onProviderInstallFailed(int,android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstallfailed-int-errorcode,-intent-recoveryintent">https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstallfailed-int-errorcode,-intent-recoveryintent</a><br/>
         *
         * @param param0 error code for the failure, for use with showErrorDialogFragment(Activity, int, int) or showErrorNotification(Context, ConnectionResult)
         * @param param1 if non-null, an intent that can be used to install or update Google Play Services such that the provider can be installed
         */
        public void onProviderInstallFailed(int param0, android.content.Intent param1);

        /**
         * org.xms.g.security.ProviderInstaller.ProviderInstallListener.onProviderInstalled() Called when installing the provider succeeds. This method is always called on the UI thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener.onSuccess()
         * com.google.android.gms.security.ProviderInstaller.ProviderInstallListener.onProviderInstalled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstalled">https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstalled</a><br/>
         */
        public void onProviderInstalled();

        default java.lang.Object getZInstanceProviderInstallListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceProviderInstallListener();
            } else {
                return getGInstanceProviderInstallListener();
            }
        }

        default com.google.android.gms.security.ProviderInstaller.ProviderInstallListener getGInstanceProviderInstallListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.security.ProviderInstaller.ProviderInstallListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.security.ProviderInstaller.ProviderInstallListener() {

                public void onProviderInstallFailed(int param0, android.content.Intent param1) {
                    org.xms.g.security.ProviderInstaller.ProviderInstallListener.this.onProviderInstallFailed(param0, param1);
                }

                public void onProviderInstalled() {
                    org.xms.g.security.ProviderInstaller.ProviderInstallListener.this.onProviderInstalled();
                }
            };
        }

        default com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener getHInstanceProviderInstallListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener() {

                public void onFailed(int param0, android.content.Intent param1) {
                    org.xms.g.security.ProviderInstaller.ProviderInstallListener.this.onProviderInstallFailed(param0, param1);
                }

                public void onSuccess() {
                    org.xms.g.security.ProviderInstaller.ProviderInstallListener.this.onProviderInstalled();
                }
            };
        }

        /**
         * Callback for notification of the result of provider installation.<br/>
         * Combination of com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener and com.google.android.gms.security.ProviderInstaller.ProviderInstallListener.<br/>
         * com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener: not found.<br/>
         * com.google.android.gms.security.ProviderInstaller.ProviderInstallListener: Callback for notification of the result of provider installation.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.security.ProviderInstaller.ProviderInstallListener {

            /**
             * org.xms.g.security.ProviderInstaller.ProviderInstallListener.XImpl.XImpl(org.xms.g.utils.XBox) Constructor of XObject with XBox.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 XBox the wrapper of xms instance
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.security.ProviderInstaller.ProviderInstallListener.XImpl.onProviderInstallFailed(int,android.content.Intent) Called when installing the provider fails. This method is always called on the UI thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener.onFailed(int,android.content.Intent)
             * com.google.android.gms.security.ProviderInstaller.ProviderInstallListener.onProviderInstallFailed(int,android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstallfailed-int-errorcode,-intent-recoveryintent">https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstallfailed-int-errorcode,-intent-recoveryintent</a><br/>
             *
             * @param param0 error code for the failure, for use with showErrorDialogFragment(Activity, int, int) or showErrorNotification(Context, ConnectionResult)
             * @param param1 if non-null, an intent that can be used to install or update Google Play Services such that the provider can be installed
             */
            public void onProviderInstallFailed(int param0, android.content.Intent param1) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener) this.getHInstance()).onFailed(param0, param1)");
                    ((com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener) this.getHInstance()).onFailed(param0, param1);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.security.ProviderInstaller.ProviderInstallListener) this.getGInstance()).onProviderInstallFailed(param0, param1)");
                    ((com.google.android.gms.security.ProviderInstaller.ProviderInstallListener) this.getGInstance()).onProviderInstallFailed(param0, param1);
                }
            }

            /**
             * org.xms.g.security.ProviderInstaller.ProviderInstallListener.XImpl.onProviderInstalled() Called when installing the provider succeeds. This method is always called on the UI thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener.onSuccess()
             * com.google.android.gms.security.ProviderInstaller.ProviderInstallListener.onProviderInstalled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstalled">https://developers.google.com/android/reference/com/google/android/gms/security/ProviderInstaller.ProviderInstallListener#public-abstract-void-onproviderinstalled</a><br/>
             */
            public void onProviderInstalled() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener) this.getHInstance()).onSuccess()");
                    ((com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener) this.getHInstance()).onSuccess();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.security.ProviderInstaller.ProviderInstallListener) this.getGInstance()).onProviderInstalled()");
                    ((com.google.android.gms.security.ProviderInstaller.ProviderInstallListener) this.getGInstance()).onProviderInstalled();
                }
            }
        }
    }
}