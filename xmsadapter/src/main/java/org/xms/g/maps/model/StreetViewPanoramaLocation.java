package org.xms.g.maps.model;

/**
 * An immutable class that contains details of the user's current Street View panorama.<br/>
 * Combination of com.huawei.hms.maps.model.StreetViewPanoramaLocation and com.google.android.gms.maps.model.StreetViewPanoramaLocation.<br/>
 * com.huawei.hms.maps.model.StreetViewPanoramaLocation: An immutable class that contains details of the user's current Street View panorama.<br/>
 * com.google.android.gms.maps.model.StreetViewPanoramaLocation: An immutable class that contains details of the user's current Street View panorama.<br/>
 */
public class StreetViewPanoramaLocation extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.StreetViewPanoramaLocation createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.StreetViewPanoramaLocation hReturn = com.huawei.hms.maps.model.StreetViewPanoramaLocation.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.StreetViewPanoramaLocation gReturn = com.google.android.gms.maps.model.StreetViewPanoramaLocation.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.StreetViewPanoramaLocation[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaLocation[param0];
        }
    };
    private boolean wrapper = true;

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.StreetViewPanoramaLocation(org.xms.g.utils.XBox) An immutable class that contains details of the user's current Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public StreetViewPanoramaLocation(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.StreetViewPanoramaLocation(org.xms.g.maps.model.StreetViewPanoramaLink[],org.xms.g.maps.model.LatLng,java.lang.String) An immutable class that contains details of the user's current Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.StreetViewPanoramaLocation(com.huawei.hms.maps.model.StreetViewPanoramaLink[],com.huawei.hms.maps.model.LatLng,java.lang.String)
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.StreetViewPanoramaLocation(com.google.android.gms.maps.model.StreetViewPanoramaLink[],com.google.android.gms.maps.model.LatLng,java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation</a><br/>
     *
     * @param param0 Identification string for the current Street View panorama
     * @param param1 List of StreetViewPanoramaLink reachable from the current position
     * @param param2 The location of the current Street View panorama
     */
    public StreetViewPanoramaLocation(org.xms.g.maps.model.StreetViewPanoramaLink[] param0, org.xms.g.maps.model.LatLng param1, java.lang.String param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.maps.model.StreetViewPanoramaLink[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.StreetViewPanoramaLink.class, x -> (com.huawei.hms.maps.model.StreetViewPanoramaLink) x.getHInstance())), ((com.huawei.hms.maps.model.LatLng) ((param1) == null ? null : (param1.getHInstance()))), param2));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.maps.model.StreetViewPanoramaLink[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.StreetViewPanoramaLink.class, x -> (com.google.android.gms.maps.model.StreetViewPanoramaLink) x.getGInstance())), ((com.google.android.gms.maps.model.LatLng) ((param1) == null ? null : (param1.getGInstance()))), param2));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewPanoramaLocation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model StreetViewPanoramaLocation object
     */
    public static org.xms.g.maps.model.StreetViewPanoramaLocation dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaLocation) param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaLocation;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaLocation;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.getLinks() Array of StreetViewPanoramaLink able to be reached from the current position.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.links
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.links: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-final-streetviewpanoramalink[]-links">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-final-streetviewpanoramalink[]-links</a><br/>
     *
     * @return the return object is maps model StreetViewPanoramaLink[]
     */
    public org.xms.g.maps.model.StreetViewPanoramaLink[] getLinks() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).links");
            com.huawei.hms.maps.model.StreetViewPanoramaLink[] hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).links;
            return org.xms.g.utils.Utils.genericArrayCopy(hReturn, org.xms.g.maps.model.StreetViewPanoramaLink.class, new org.xms.g.utils.Function<com.huawei.hms.maps.model.StreetViewPanoramaLink, org.xms.g.maps.model.StreetViewPanoramaLink>() {

                public org.xms.g.maps.model.StreetViewPanoramaLink apply(com.huawei.hms.maps.model.StreetViewPanoramaLink param0) {
                    return new org.xms.g.maps.model.StreetViewPanoramaLink(new org.xms.g.utils.XBox(null, param0));
                }
            });
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).links");
            com.google.android.gms.maps.model.StreetViewPanoramaLink[] gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).links;
            return org.xms.g.utils.Utils.genericArrayCopy(gReturn, org.xms.g.maps.model.StreetViewPanoramaLink.class, new org.xms.g.utils.Function<com.google.android.gms.maps.model.StreetViewPanoramaLink, org.xms.g.maps.model.StreetViewPanoramaLink>() {

                public org.xms.g.maps.model.StreetViewPanoramaLink apply(com.google.android.gms.maps.model.StreetViewPanoramaLink param0) {
                    return new org.xms.g.maps.model.StreetViewPanoramaLink(new org.xms.g.utils.XBox(param0, null));
                }
            });
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.getPanoId() The panorama ID of the current Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.panoId
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.panoId: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-final-string-panoid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-final-string-panoid</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String getPanoId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).panoId");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).panoId;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).panoId");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).panoId;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.getPosition() The location of the current Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.position
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.position: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-final-latlng-position">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-final-latlng-position</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).position");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).position;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).position");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).position;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.equals(java.lang.Object) equals.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.equals(java.lang.Object)
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.hashCode()
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.toString()
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).toString()");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).toString()");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).toStringCallSuper();
            }
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLocation.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLocation.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.StreetViewPanoramaLocation.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLocation#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    private class GImpl extends com.google.android.gms.maps.model.StreetViewPanoramaLocation {

        public GImpl(com.google.android.gms.maps.model.StreetViewPanoramaLink[] param0, com.google.android.gms.maps.model.LatLng param1, java.lang.String param2) {
            super(param0, param1, param2);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.equals(param0);
        }

        public int hashCode() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.hashCode();
        }

        public java.lang.String toString() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.maps.model.StreetViewPanoramaLocation.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.maps.model.StreetViewPanoramaLocation {

        public HImpl(com.huawei.hms.maps.model.StreetViewPanoramaLink[] param0, com.huawei.hms.maps.model.LatLng param1, java.lang.String param2) {
            super(param0, param1, param2);
        }

        protected HImpl(android.os.Parcel param0) {
            super(param0);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.equals(param0);
        }

        public int hashCode() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.hashCode();
        }

        public java.lang.String toString() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.maps.model.StreetViewPanoramaLocation.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }
}