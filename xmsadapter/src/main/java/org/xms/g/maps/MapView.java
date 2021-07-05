package org.xms.g.maps;

/**
 * A View which displays a map(with data obtained from the Maps service).<br/>
 * Combination of com.huawei.hms.maps.MapView and com.google.android.gms.maps.MapView.<br/>
 * com.huawei.hms.maps.MapView: Extends FrameLayout and represents a view in which a map is displayed. The view data is obtained from HUAWEI Map Kit.<br/>
 * com.google.android.gms.maps.MapView: A View which displays a map(with data obtained from the Google Maps service). When focused, it will capture keypresses and touch gestures to move the map.<br/>
 */
public class MapView extends android.widget.FrameLayout implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;

    /**
     * org.xms.g.maps.MapView.MapView(android.content.Context) constructor of MapView.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.MapView(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview</a><br/>
     * com.google.android.gms.maps.MapView.MapView(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)</a><br/>
     *
     * @param param0 the param is android content Context
     */
    public MapView(android.content.Context param0) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.MapView.MapView(android.content.Context,android.util.AttributeSet) constructor of MapView.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.MapView(android.content.Context,android.util.AttributeSet): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview</a><br/>
     * com.google.android.gms.maps.MapView.MapView(android.content.Context,android.util.AttributeSet): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)</a><br/>
     *
     * @param param0 the param is android content Context
     * @param param1 the param is android util AttributeSet
     */
    public MapView(android.content.Context param0, android.util.AttributeSet param1) {
        super(param0, param1);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.MapView.MapView(android.content.Context,android.util.AttributeSet,int) constructor of MapView.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.MapView(android.content.Context,android.util.AttributeSet,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview</a><br/>
     * com.google.android.gms.maps.MapView.MapView(android.content.Context,android.util.AttributeSet,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)</a><br/>
     *
     * @param param0 the param is android content Context
     * @param param1 the param is android util AttributeSet
     * @param param2 the param is int
     */
    public MapView(android.content.Context param0, android.util.AttributeSet param1, int param2) {
        super(param0, param1, param2);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1, param2));
        } else {
            this.setGInstance(new GImpl(param0, param1, param2));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.MapView.MapView(android.content.Context,org.xms.g.maps.ExtensionMapOptions) constructor of MapView.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.MapView(android.content.Context,com.huawei.hms.maps.HuaweiMapOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview</a><br/>
     * com.google.android.gms.maps.MapView.MapView(android.content.Context,com.google.android.gms.maps.GoogleMapOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#MapView(android.content.Context)</a><br/>
     *
     * @param param0 the param is android content Context
     * @param param1 the params is maps ExtensionMapOptions
     */
    public MapView(android.content.Context param0, org.xms.g.maps.ExtensionMapOptions param1) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, ((com.huawei.hms.maps.HuaweiMapOptions) ((param1) == null ? null : (param1.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(param0, ((com.google.android.gms.maps.GoogleMapOptions) ((param1) == null ? null : (param1.getGInstance())))));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.MapView.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.MapView.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps MapView object
     */
    public static org.xms.g.maps.MapView dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.MapView) param0);
    }

    /**
     * org.xms.g.maps.MapView.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.MapView;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.MapView;
        }
    }

    /**
     * org.xms.g.maps.MapView.getMapAsync(org.xms.g.maps.OnMapReadyCallback) Returns a non-null instance of the GoogleMap, ready to be used.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.getMapAsync(com.huawei.hms.maps.OnMapReadyCallback): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#getMapAsync(OnMapReadyCallback)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#getMapAsync(OnMapReadyCallback)</a><br/>
     * com.google.android.gms.maps.MapView.getMapAsync(com.google.android.gms.maps.OnMapReadyCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-void-getmapasync-onmapreadycallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-void-getmapasync-onmapreadycallback-callback</a><br/>
     *
     * @param param0 The callback object that will be triggered when the map is ready to be used
     */
    public void getMapAsync(org.xms.g.maps.OnMapReadyCallback param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).getMapAsync(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())))");
                ((com.huawei.hms.maps.MapView) this.getHInstance()).getMapAsync(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).getMapAsync(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())))");
                ((com.google.android.gms.maps.MapView) this.getGInstance()).getMapAsync(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.MapView) this.getHInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())))");
                ((HImpl) ((com.huawei.hms.maps.MapView) this.getHInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.MapView) this.getGInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())))");
                ((GImpl) ((com.google.android.gms.maps.MapView) this.getGInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())));
            }
        }
    }

    /**
     * org.xms.g.maps.MapView.onCreate(android.os.Bundle) Called when a map is created. If this method needs to be reloaded, call it from the parent class.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onCreate(android.os.Bundle): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onCreate(Bundle)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onCreate(Bundle)</a><br/>
     * com.google.android.gms.maps.MapView.onCreate(android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-oncreate-bundle-savedinstancestate">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-oncreate-bundle-savedinstancestate</a><br/>
     *
     * @param param0 the param is android os Bundle
     */
    public final void onCreate(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onCreate(param0)");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onCreate(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onCreate(param0)");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onCreate(param0);
        }
    }

    /**
     * org.xms.g.maps.MapView.onDestroy() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onDestroy(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onDestroy()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onDestroy()</a><br/>
     * com.google.android.gms.maps.MapView.onDestroy(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-ondestroy">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-ondestroy</a><br/>
     */
    public final void onDestroy() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onDestroy()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onDestroy();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onDestroy()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onDestroy();
        }
    }

    /**
     * org.xms.g.maps.MapView.onEnterAmbient(android.os.Bundle) You must call this method from the parent WearableActivity's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onEnterAmbient(android.os.Bundle)
     * com.google.android.gms.maps.MapView.onEnterAmbient(android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onenterambient-bundle-ambientdetails">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onenterambient-bundle-ambientdetails</a><br/>
     *
     * @param param0 the param is Bundle
     */
    public final void onEnterAmbient(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onEnterAmbient(param0)");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onEnterAmbient(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onEnterAmbient(param0)");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onEnterAmbient(param0);
        }
    }

    /**
     * org.xms.g.maps.MapView.onExitAmbient() You must call this method from the parent WearableActivity's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onExitAmbient()
     * com.google.android.gms.maps.MapView.onExitAmbient(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onexitambient">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onexitambient</a><br/>
     */
    public final void onExitAmbient() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onExitAmbient()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onExitAmbient();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onExitAmbient()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onExitAmbient();
        }
    }

    /**
     * org.xms.g.maps.MapView.onLowMemory() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onLowMemory(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onLowMemory()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onLowMemory()</a><br/>
     * com.google.android.gms.maps.MapView.onLowMemory(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onlowmemory">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onlowmemory</a><br/>
     */
    public final void onLowMemory() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onLowMemory()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onLowMemory();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onLowMemory()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onLowMemory();
        }
    }

    /**
     * org.xms.g.maps.MapView.onPause() Called when an activity is paused. If this method needs to be reloaded, call it from the parent class.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onPause(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onPause()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onPause()</a><br/>
     * com.google.android.gms.maps.MapView.onPause(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onpause">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onpause</a><br/>
     */
    public final void onPause() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onPause()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onPause();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onPause()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onPause();
        }
    }

    /**
     * org.xms.g.maps.MapView.onResume() Called when an activity is ready. If this method needs to be reloaded, call it from the parent class.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onResume(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onResume()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onResume()</a><br/>
     * com.google.android.gms.maps.MapView.onResume(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onresume">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onresume</a><br/>
     */
    public final void onResume() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onResume()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onResume();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onResume()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onResume();
        }
    }

    /**
     * org.xms.g.maps.MapView.onSaveInstanceState(android.os.Bundle) Called to save the current status of a MapView object upon unexpected exit. If this method needs to be reloaded, call it from the parent class.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onSaveInstanceState(android.os.Bundle): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onSaveInstanceState(Bundle)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onSaveInstanceState(Bundle)</a><br/>
     * com.google.android.gms.maps.MapView.onSaveInstanceState(android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onsaveinstancestate-bundle-outstate">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onsaveinstancestate-bundle-outstate</a><br/>
     *
     * @param param0 the param is android os Bundle
     */
    public final void onSaveInstanceState(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onSaveInstanceState(param0)");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onSaveInstanceState(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onSaveInstanceState(param0)");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onSaveInstanceState(param0);
        }
    }

    /**
     * org.xms.g.maps.MapView.onStart() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onStart(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onStart()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onStart()</a><br/>
     * com.google.android.gms.maps.MapView.onStart(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onstart">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onstart</a><br/>
     */
    public final void onStart() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onStart()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onStart();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onStart()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onStart();
        }
    }

    /**
     * org.xms.g.maps.MapView.onStop() You must call this method from the parent Activity/Fragment's corresponding method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapView.onStop(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onStop()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapview#onStop()</a><br/>
     * com.google.android.gms.maps.MapView.onStop(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onstop">https://developers.google.com/android/reference/com/google/android/gms/maps/MapView#public-final-void-onstop</a><br/>
     */
    public final void onStop() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onStop()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onStop();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onStop()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onStop();
        }
    }

    /**
     * org.xms.g.maps.MapView.getGInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object gInstance
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.maps.MapView.setGInstance(java.lang.Object) setGInstance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should be instanceof java lang Object
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
        this.removeAllViews();
        this.addView(((com.google.android.gms.maps.MapView) gInstance));
        this.setClickable(true);
    }

    /**
     * org.xms.g.maps.MapView.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the return object hInstance
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.maps.MapView.setHInstance(java.lang.Object) set HInstance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should be instanceof java lang Object
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
        this.removeAllViews();
        this.addView(((com.huawei.hms.maps.MapView) hInstance));
        this.setClickable(true);
    }

    /**
     * org.xms.g.maps.MapView.wrapInst(org.xms.g.utils.XBox) wrapInst.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     * @return the return object is maps MapView
     */
    public org.xms.g.maps.MapView wrapInst(org.xms.g.utils.XBox param0) {
        gInstance = param0.getGInstance();
        hInstance = param0.getHInstance();
        wrapper = true;
        return this;
    }

    private class GImpl extends com.google.android.gms.maps.MapView {

        public GImpl(android.content.Context param0) {
            super(param0);
        }

        public GImpl(android.content.Context param0, android.util.AttributeSet param1) {
            super(param0, param1);
        }

        public GImpl(android.content.Context param0, android.util.AttributeSet param1, int param2) {
            super(param0, param1, param2);
        }

        public GImpl(android.content.Context param0, com.google.android.gms.maps.GoogleMapOptions param1) {
            super(param0, param1);
        }

        public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback param0) {
            org.xms.g.maps.MapView.this.getMapAsync(((param0) == null ? null : (new org.xms.g.maps.OnMapReadyCallback.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void getMapAsyncCallSuper(com.google.android.gms.maps.OnMapReadyCallback param0) {
            super.getMapAsync(param0);
        }
    }

    private class HImpl extends com.huawei.hms.maps.MapView {

        public HImpl(android.content.Context param0) {
            super(param0);
        }

        public HImpl(android.content.Context param0, android.util.AttributeSet param1) {
            super(param0, param1);
        }

        public HImpl(android.content.Context param0, android.util.AttributeSet param1, int param2) {
            super(param0, param1, param2);
        }

        public HImpl(android.content.Context param0, com.huawei.hms.maps.HuaweiMapOptions param1) {
            super(param0, param1);
        }

        public void getMapAsync(com.huawei.hms.maps.OnMapReadyCallback param0) {
            org.xms.g.maps.MapView.this.getMapAsync(((param0) == null ? null : (new org.xms.g.maps.OnMapReadyCallback.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void getMapAsyncCallSuper(com.huawei.hms.maps.OnMapReadyCallback param0) {
            super.getMapAsync(param0);
        }
    }
}