package org.xms.g.analytics;

/**
 * This Service is no longer invoked. Campaign tracking happens in the receiver only. Remains for compatibility reasons.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.CampaignTrackingService: This Service is no longer invoked. Campaign tracking happens in the receiver only. Remains for compatibility reasons.<br/>
 */
public class CampaignTrackingService extends android.app.Service implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.analytics.CampaignTrackingService.CampaignTrackingService(org.xms.g.utils.XBox) constructor of CampaignTrackingService with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public CampaignTrackingService(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.CampaignTrackingService() constructor of CampaignTrackingService.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.CampaignTrackingService.CampaignTrackingService(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/CampaignTrackingService#public-campaigntrackingservice">https://developers.google.com/android/reference/com/google/android/gms/analytics/CampaignTrackingService#public-campaigntrackingservice</a><br/>
     */
    public CampaignTrackingService() {
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.CampaignTrackingService.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted CampaignTrackingService object
     */
    public static org.xms.g.analytics.CampaignTrackingService dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public android.os.IBinder onBind(android.content.Intent param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return the instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.analytics.CampaignTrackingService.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}