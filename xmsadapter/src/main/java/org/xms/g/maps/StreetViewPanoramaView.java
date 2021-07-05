package org.xms.g.maps;


/**
 * A View which displays a Street View panorama(with data obtained from the Maps service).<br/>
 * Combination of com.huawei.hms.maps.StreetViewPanoramaView and com.google.android.gms.maps.StreetViewPanoramaView.<br/>
 * com.huawei.hms.maps.StreetViewPanoramaView: A View which displays a Street View panorama(with data obtained from the Huawei Maps service).<br/>
 * com.google.android.gms.maps.StreetViewPanoramaView: A View which displays a Street View panorama(with data obtained from the Google Maps service). When focused, it will capture keypresses and touch gestures to move the panorama.<br/>
 */
public class StreetViewPanoramaView extends android.widget.FrameLayout implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;


    /**
     * org.xms.g.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context) A View which displays a Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context)
     * com.google.android.gms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context</a><br/>
     *
     * @param param0 the param should instanceof android content Context
     */
    public StreetViewPanoramaView(android.content.Context param0) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,android.util.AttributeSet) A View which displays a Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,android.util.AttributeSet)
     * com.google.android.gms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,android.util.AttributeSet): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context,-attributeset-attrs">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context,-attributeset-attrs</a><br/>
     *
     * @param param0 the param should instanceof android content Context
     * @param param1 the param should instanceof android util AttributeSet
     */
    public StreetViewPanoramaView(android.content.Context param0, android.util.AttributeSet param1) {
        super(param0, param1);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,android.util.AttributeSet,int) A View which displays a Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,android.util.AttributeSet,int)
     * com.google.android.gms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,android.util.AttributeSet,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context,-attributeset-attrs,-int-defstyle">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context,-attributeset-attrs,-int-defstyle</a><br/>
     *
     * @param param0 the param should instanceof android content Context
     * @param param1 the param should instanceof android util AttributeSet
     * @param param2 the param should instanceof int
     */
    public StreetViewPanoramaView(android.content.Context param0, android.util.AttributeSet param1, int param2) {
        super(param0, param1, param2);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1, param2));
        } else {
            this.setGInstance(new GImpl(param0, param1, param2));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,org.xms.g.maps.StreetViewPanoramaOptions) A View which displays a Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,com.huawei.hms.maps.StreetViewPanoramaOptions)
     * com.google.android.gms.maps.StreetViewPanoramaView.StreetViewPanoramaView(android.content.Context,com.google.android.gms.maps.StreetViewPanoramaOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context,-streetviewpanoramaoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-streetviewpanoramaview-context-context,-streetviewpanoramaoptions-options</a><br/>
     *
     * @param param0 the param should instanceof android content Context
     * @param param1 the param should instanceof maps StreetViewPanoramaOptions
     */
    public StreetViewPanoramaView(android.content.Context param0, org.xms.g.maps.StreetViewPanoramaOptions param1) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, ((com.huawei.hms.maps.StreetViewPanoramaOptions) ((param1) == null ? null : (param1.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(param0, ((com.google.android.gms.maps.StreetViewPanoramaOptions) ((param1) == null ? null : (param1.getGInstance())))));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanoramaView.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps StreetViewPanoramaView object
     */
    public static org.xms.g.maps.StreetViewPanoramaView dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanoramaView) param0);
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanoramaView;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanoramaView;
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback) Sets a callback object which will be triggered when the StreetViewPanorama instance is ready to be used.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.getStreetViewPanoramaAsync(com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback)
     * com.google.android.gms.maps.StreetViewPanoramaView.getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-getstreetviewpanoramaasync-onstreetviewpanoramareadycallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-getstreetviewpanoramaasync-onstreetviewpanoramareadycallback-callback</a><br/>
     *
     * @param param0 The callback object that will be triggered when the panorama is ready to be used
     */
    public void getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())))");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())))");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())))");
                ((HImpl) ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())))");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())));
            }
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onCreate(android.os.Bundle) You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.onCreate(android.os.Bundle)
     * com.google.android.gms.maps.StreetViewPanoramaView.onCreate(android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-oncreate-bundle-savedinstancestate">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-oncreate-bundle-savedinstancestate</a><br/>
     *
     * @param param0 the param should instanceof android os Bundle
     */
    public final void onCreate(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onCreate(param0)");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onCreate(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onCreate(param0)");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onCreate(param0);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onDestroy() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaView.onDestroy(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-ondestroy">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-ondestroy</a><br/>
     */
    public void onDestroy() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onDestroy()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onDestroy();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onDestroyCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onDestroyCallSuper();
            }
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onLowMemory() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.onLowMemory()
     * com.google.android.gms.maps.StreetViewPanoramaView.onLowMemory(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-onlowmemory">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-onlowmemory</a><br/>
     */
    public final void onLowMemory() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onLowMemory()");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onLowMemory();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onLowMemory()");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onLowMemory();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onPause() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.onPause()
     * com.google.android.gms.maps.StreetViewPanoramaView.onPause(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-onpause">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-onpause</a><br/>
     */
    public final void onPause() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onPause()");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onPause();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onPause()");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onPause();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onResume() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaView.onResume(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-onresume">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-onresume</a><br/>
     */
    public void onResume() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onResume()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onResume();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onResumeCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onResumeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onSaveInstanceState(android.os.Bundle) You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaView.onSaveInstanceState(android.os.Bundle)
     * com.google.android.gms.maps.StreetViewPanoramaView.onSaveInstanceState(android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-onsaveinstancestate-bundle-outstate">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-final-void-onsaveinstancestate-bundle-outstate</a><br/>
     *
     * @param param0 the param should instanceof android os Bundle
     */
    public final void onSaveInstanceState(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onSaveInstanceState(param0)");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onSaveInstanceState(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onSaveInstanceState(param0)");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onSaveInstanceState(param0);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onStart() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaView.onStart(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-onstart">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-onstart</a><br/>
     */
    public void onStart() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStart()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStart();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStartCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStartCallSuper();
            }
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.onStop() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaView.onStop(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-onstop">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaView#public-void-onstop</a><br/>
     */
    public void onStop() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStop()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStop();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStopCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStopCallSuper();
            }
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.getGInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object is hInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.setGInstance(java.lang.Object) setGInstance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should be instanceof java lang Object
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
        this.removeAllViews();
        this.addView(((com.google.android.gms.maps.StreetViewPanoramaView) gInstance));
        this.setClickable(true);
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return obejct is hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.setHInstance(java.lang.Object) set HInstance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should be instanceof java lang Object
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
        this.removeAllViews();
        this.addView(((com.huawei.hms.maps.StreetViewPanoramaView) hInstance));
        this.setClickable(true);
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaView.wrapInst(org.xms.g.utils.XBox) wrapInst.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     * @return the return object is maps StreetViewPanoramaView
     */
    public org.xms.g.maps.StreetViewPanoramaView wrapInst(org.xms.g.utils.XBox param0) {
        gInstance = param0.getGInstance();
        hInstance = param0.getHInstance();
        wrapper = true;
        return this;
    }

    private class GImpl extends com.google.android.gms.maps.StreetViewPanoramaView {

        public GImpl(android.content.Context param0) {
            super(param0);
        }

        public GImpl(android.content.Context param0, android.util.AttributeSet param1) {
            super(param0, param1);
        }

        public GImpl(android.content.Context param0, android.util.AttributeSet param1, int param2) {
            super(param0, param1, param2);
        }

        public GImpl(android.content.Context param0, com.google.android.gms.maps.StreetViewPanoramaOptions param1) {
            super(param0, param1);
        }

        public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback param0) {
            org.xms.g.maps.StreetViewPanoramaView.this.getStreetViewPanoramaAsync(((param0) == null ? null : (new org.xms.g.maps.OnStreetViewPanoramaReadyCallback.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void onDestroy() {
            org.xms.g.maps.StreetViewPanoramaView.this.onDestroy();
        }

        public void onResume() {
            org.xms.g.maps.StreetViewPanoramaView.this.onResume();
        }

        public void onStart() {
            org.xms.g.maps.StreetViewPanoramaView.this.onStart();
        }

        public void onStop() {
            org.xms.g.maps.StreetViewPanoramaView.this.onStop();
        }

        public void getStreetViewPanoramaAsyncCallSuper(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback param0) {
            super.getStreetViewPanoramaAsync(param0);
        }

        public void onDestroyCallSuper() {
            super.onDestroy();
        }

        public void onResumeCallSuper() {
            super.onResume();
        }

        public void onStartCallSuper() {
            super.onStart();
        }

        public void onStopCallSuper() {
            super.onStop();
        }
    }

    private class HImpl extends com.huawei.hms.maps.StreetViewPanoramaView {


        public HImpl(android.content.Context param0) {
            super(param0);
        }

        public HImpl(android.content.Context param0, android.util.AttributeSet param1) {
            super(param0, param1);
        }

        public HImpl(android.content.Context param0, android.util.AttributeSet param1, int param2) {
            super(param0, param1, param2);
        }

        public HImpl(android.content.Context param0, com.huawei.hms.maps.StreetViewPanoramaOptions param1) {
            super(param0, param1);
        }

        public void getStreetViewPanoramaAsync(com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback param0) {
            org.xms.g.maps.StreetViewPanoramaView.this.getStreetViewPanoramaAsync(((param0) == null ? null : (new org.xms.g.maps.OnStreetViewPanoramaReadyCallback.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void getStreetViewPanoramaAsyncCallSuper(com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback param0) {
            super.getStreetViewPanoramaAsync(param0);
        }
    }
}