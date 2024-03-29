package org.xms.g.utils;

/**
 * Class for XObject
 */
public class XObject implements XGettable {
    private Object gInstance;
    private Object hInstance;

    /**
     * org.xms.g.utils.XObject(XBox xBox)  constructor of XObject with XBox<br/>
     *
     * @param xBox the wrapper of xms instance
     */
    public XObject(XBox xBox) {
        if (xBox == null) {
            return;
        }
        this.gInstance = xBox.getGInstance();
        this.hInstance = xBox.getHInstance();
    }

    /**
     * org.xms.g.utils.isSame(Object one, Object another) judge if the two objects are the same with each other.<br/>
     *
     * @param one     one xms object
     * @param another another xms object
     * @return true if the two objects are the same, otherwise false.
     */
    public static boolean isSame(Object one, Object another) {
        if (one == null) {
            return another == null;
        }
        if (one instanceof XObject) {
            return ((XObject) one).isSameAs(another);
        }
        return one == another;
    }

    /**
     * org.xms.g.utils.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     *
     * @return gInstance
     */
    public Object getGInstance() {
        if (gInstance == null) {
            org.xms.g.utils.XmsLog.d("1", "gInstance is null ");
        } else {
            org.xms.g.utils.XmsLog.d("2", "gInstance : " + gInstance.getClass().getName());
        }
        return gInstance;
    }

    /**
     * org.xms.g.utils.setGInstance(Object gInst) set the gms instance from the corresponding xms instance.<br/>
     *
     * @param gInst gms instance
     */
    public void setGInstance(Object gInst) {
        this.gInstance = gInst;
    }

    /**
     * org.xms.g.utils.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     *
     * @return hInstance
     */
    public Object getHInstance() {
        if (hInstance == null) {
            org.xms.g.utils.XmsLog.d("1", "hInstance is null ");
        } else {
            org.xms.g.utils.XmsLog.d("2", "hInstance : " + hInstance.getClass().getName());
        }
        return hInstance;
    }

    /**
     * org.xms.g.utils.setHInstance(Object gInst) set the hms instance from the corresponding xms instance.<br/>
     *
     * @param hInst hms instance
     */
    public void setHInstance(Object hInst) {
        this.hInstance = hInst;
    }

    /**
     * org.xms.g.utils.isSameAs(Object that) judge whether the object is the same as the other.<br/>
     *
     * @param that another xms object
     * @return true if the object is the same as another, otherwise false.
     */
    @Deprecated
    public boolean isSameAs(Object that) {
        if (that == null) {
            return false;
        }

        if (!(that instanceof XObject)) {
            return false;
        }

        if (GlobalEnvSetting.isHms()) {
            return getHInstance() == ((XObject) that).getHInstance();
        } else {
            return getGInstance() == ((XObject) that).getGInstance();
        }
    }
}
