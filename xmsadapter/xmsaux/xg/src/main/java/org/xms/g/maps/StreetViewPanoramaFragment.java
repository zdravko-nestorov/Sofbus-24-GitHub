package org.xms.g.maps;

/**
 * org.xms.g.maps.StreetViewPanoramaFragment : xms A StreetViewPanorama component in an app. This fragment is the simplest way to place a Street View panorama in an application.<br/>
 */
public class StreetViewPanoramaFragment extends com.google.android.gms.maps.StreetViewPanoramaFragment {
    /**
     * org.xms.g.maps.StreetViewPanoramaFragment.StreetViewPanoramaFragment() constructor of StreetViewPanoramaFragment <br/>
     */
    public StreetViewPanoramaFragment() {
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaFragment.newInstance() Creates a streetview panorama fragment, using default options.<br/>
     * Devices under gms running environments are supported.<br/>
     * Below is the reference of GMS apis:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaFragment.newInstance():<a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaFragment#newInstance()">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaFragment#newInstance()</a> <br/>
     *
     * @return the return object is StreetViewPanoramaFragment
     */
    public static org.xms.g.maps.StreetViewPanoramaFragment newInstance() {
        return new org.xms.g.maps.StreetViewPanoramaFragment();
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaFragment.newInstance(org.xms.g.maps.StreetViewPanoramaOptions) Creates a streetview panorama fragment with the given options.<br/>
     * Devices under gms running environments are supported.<br/>
     * Below is the reference of GMS apis:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaFragment.newInstance(com.google.android.gms.maps.StreetViewPanoramaOptions):<a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaFragment#public-static-streetviewpanoramafragment-newinstance-streetviewpanoramaoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaFragment#public-static-streetviewpanoramafragment-newinstance-streetviewpanoramaoptions-options</a> <br/>
     *
     * @param var0 the param should instanceof StreetViewPanoramaOptions
     * @return the return object is StreetViewPanoramaFragment
     */
    public static org.xms.g.maps.StreetViewPanoramaFragment newInstance(org.xms.g.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", (com.google.android.gms.maps.StreetViewPanoramaOptions) (streetViewPanoramaOptions.getGInstance()));
        org.xms.g.maps.StreetViewPanoramaFragment streetViewPanoramaFragment = new org.xms.g.maps.StreetViewPanoramaFragment();
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaFragment.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Devices under gms running environments are supported.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanoramaFragment;
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaFragment.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.maps.StreetViewPanoramaFragment<br/>
     * Devices under gms running environments are supported.<br/>
     *
     * @param param0 the param should instanceof java.lang.Object
     * @return cast maps.StreetViewPanoramaFragment object
     */
    public static org.xms.g.maps.StreetViewPanoramaFragment dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanoramaFragment) param0);
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaFragment.getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback) Sets a callback object which will be triggered when the StreetViewPanorama instance is ready to be used.<br/>
     * Devices under gms running environments are supported.<br/>
     * Below are the references of GMS apis:<br/>
     * com.google.android.gms.maps.StreetViewPanoramaFragment.getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback):<a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaFragment#public-void-getstreetviewpanoramaasync-onstreetviewpanoramareadycallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaFragment#public-void-getstreetviewpanoramaasync-onstreetviewpanoramareadycallback-callback</a> <br/>
     *
     * @param onStreetViewPanoramaReadyCallback the param should be instanceof OnStreetViewPanoramaReadyCallback
     */
    public void getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        super.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback.getGInstanceOnStreetViewPanoramaReadyCallback());
    }
}