package org.xms.g.common;

/**
 * Common account picker similar to the standard framework account picker introduced in ICS: newChooseAccountIntent.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.AccountPicker: Common account picker similar to the standard framework account picker introduced in ICS: newChooseAccountIntent.<br/>
 */
public final class AccountPicker extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.AccountPicker.AccountPicker(org.xms.g.utils.XBox) constructor of with AccountPicker XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public AccountPicker(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public static android.content.Intent newChooseAccountIntent(org.xms.g.common.AccountPicker.AccountChooserOptions param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public static android.content.Intent newChooseAccountIntent(android.accounts.Account param0, java.util.ArrayList param1, java.lang.String[] param2, boolean param3, java.lang.String param4, java.lang.String param5, java.lang.String[] param6, android.os.Bundle param7) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.AccountPicker.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.AccountPicker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted AccountPicker object
     */
    public static org.xms.g.common.AccountPicker dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.AccountPicker.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Options for building an appropriate intent to launch the Account Picker.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.common.AccountPicker.AccountChooserOptions: Options for building an appropriate intent to launch the Account Picker.<br/>
     */
    public static class AccountChooserOptions extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.common.AccountPicker.AccountChooserOptions.AccountChooserOptions(org.xms.g.utils.XBox) constructor of AccountChooserOptions with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public AccountChooserOptions(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.AccountPicker.AccountChooserOptions.AccountChooserOptions() constructor of AccountChooserOptions.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.AccountPicker.AccountChooserOptions.AccountChooserOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/AccountPicker.AccountChooserOptions#public-accountpicker.accountchooseroptions">https://developers.google.com/android/reference/com/google/android/gms/common/AccountPicker.AccountChooserOptions#public-accountpicker.accountchooseroptions</a><br/>
         */
        public AccountChooserOptions() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.common.AccountPicker.AccountChooserOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.AccountPicker.AccountChooserOptions.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted AccountPicker.AccountChooserOptions object
         */
        public static org.xms.g.common.AccountPicker.AccountChooserOptions dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.common.AccountPicker.AccountChooserOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * The builder for creating an instance of the AccountPicker.AccountChooserOptions.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder: The builder for creating an instance of the AccountPicker.AccountChooserOptions.<br/>
         */
        public static class Builder extends org.xms.g.utils.XObject {

            /**
             * org.xms.g.common.AccountPicker.AccountChooserOptions.Builder.Builder(org.xms.g.utils.XBox) constructor of AccountPicker.AccountChooserOptions.Builder with XBox.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             *
             * @param param0 the wrapper of xms instance
             */
            public Builder(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.common.AccountPicker.AccountChooserOptions.Builder.Builder() constructor of AccountPicker.AccountChooserOptions.Builder.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/AccountPicker.AccountChooserOptions.Builder#public-accountpicker.accountchooseroptions.builder">https://developers.google.com/android/reference/com/google/android/gms/common/AccountPicker.AccountChooserOptions.Builder#public-accountpicker.accountchooseroptions.builder</a><br/>
             */
            public Builder() {
                super(((org.xms.g.utils.XBox) null));
            }

            /**
             * org.xms.g.common.AccountPicker.AccountChooserOptions.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.AccountPicker.AccountChooserOptions.Builder.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 the input object
             * @return casted AccountPicker.AccountChooserOptions.Builder object
             */
            public static org.xms.g.common.AccountPicker.AccountChooserOptions.Builder dynamicCast(java.lang.Object param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * org.xms.g.common.AccountPicker.AccountChooserOptions.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            public org.xms.g.common.AccountPicker.AccountChooserOptions build() {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccounts(java.util.List param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccountsTypes(java.util.List param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.common.AccountPicker.AccountChooserOptions.Builder setAlwaysShowAccountPicker(boolean param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.common.AccountPicker.AccountChooserOptions.Builder setOptionsForAddingAccount(android.os.Bundle param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.common.AccountPicker.AccountChooserOptions.Builder setSelectedAccount(android.accounts.Account param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public org.xms.g.common.AccountPicker.AccountChooserOptions.Builder setTitleOverrideText(java.lang.String param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
}