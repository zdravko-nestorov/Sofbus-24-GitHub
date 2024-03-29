package org.xms.g.maps;

/**
 * org.xms.g.maps.SupportStreetViewPanoramaFragment : xms A StreetViewPanorama component in an app. This fragment is the simplest way to place a Street View panorama in an application.<br/>
 */
public class SupportStreetViewPanoramaFragment extends com.huawei.hms.maps.SupportStreetViewPanoramaFragment {
    /**
     * org.xms.g.maps.SupportStreetViewPanoramaFragment.SupportStreetViewPanoramaFragment() constructor of SupportStreetViewPanoramaFragment <br/>
     */
    public SupportStreetViewPanoramaFragment() {
    }

    /**
     * org.xms.g.maps.SupportStreetViewPanoramaFragment.newInstance() Creates a streetview panorama fragment, using default options.<br/>
     * Devices under hms running environments are supported.<br/>
     *
     * @return the return object is SupportStreetViewPanoramaFragment
     */
    public static org.xms.g.maps.SupportStreetViewPanoramaFragment newInstance() {
        return new org.xms.g.maps.SupportStreetViewPanoramaFragment();
    }

    /**
     * org.xms.g.maps.SupportStreetViewPanoramaFragment.newInstance(org.xms.g.maps.StreetViewPanoramaOptions) Creates a streetview panorama fragment with the given options.<br/>
     * Devices under hms running environments are supported.<br/>
     *
     * @param var0 the param should instanceof StreetViewPanoramaOptions
     * @return the return object is SupportStreetViewPanoramaFragment
     */
    public static org.xms.g.maps.SupportStreetViewPanoramaFragment newInstance(org.xms.g.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("StreetViewOptions", (com.huawei.hms.maps.StreetViewPanoramaOptions) (streetViewPanoramaOptions.getHInstance()));
        org.xms.g.maps.SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new org.xms.g.maps.SupportStreetViewPanoramaFragment();
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }

    /**
     * org.xms.g.maps.SupportStreetViewPanoramaFragment.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Devices under hms running environments are supported.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.SupportStreetViewPanoramaFragment;
    }

    /**
     * org.xms.g.maps.SupportStreetViewPanoramaFragment.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.maps.SupportStreetViewPanoramaFragment<br/>
     * Devices under hms running environments are supported.<br/>
     *
     * @param param0 the param should instanceof java.lang.Object
     * @return cast maps.SupportStreetViewPanoramaFragment object
     */
    public static org.xms.g.maps.SupportStreetViewPanoramaFragment dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.SupportStreetViewPanoramaFragment) param0);
    }

    /**
     * org.xms.g.maps.SupportStreetViewPanoramaFragment.getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback) Sets a callback object which will be triggered when the StreetViewPanorama instance is ready to be used.<br/>
     * Devices under hms running environments are supported.<br/>
     *
     * @param onStreetViewPanoramaReadyCallback the param should be instanceof OnStreetViewPanoramaReadyCallback
     */
    public void getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        super.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback.getHInstanceOnStreetViewPanoramaReadyCallback());
    }
}