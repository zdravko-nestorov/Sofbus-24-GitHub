package org.xms.g.utils;

/**
 * Class for XEnum
 */
public abstract class XEnum<E extends XEnum<E>> extends XObject implements Comparable<E> {
    /**
     * org.xms.g.utils.XEnum.XEnum(org.xms.g.utils.XBox param0) constructor of XEnum with XBox.<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public XEnum(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.utils.XEnum.valueOf(Class<T> enumType, String name) get value Of enum type and name.<br/>
     *
     * @param enumType enum type name
     * @param name     string name
     * @param <T>      generic type of T
     * @return type of T
     */
    public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) {
        return java.lang.Enum.valueOf(enumType, name);
    }

    /**
     * org.xms.g.utils.XEnum.name() get the name of gInstance or hInstance.<br/>
     *
     * @return string of name
     */
    public final String name() {
        if (GlobalEnvSetting.isHms()) {
            return ((Enum) getHInstance()).name();
        } else {
            return ((Enum) getGInstance()).name();
        }
    }

    /**
     * org.xms.g.utils.XEnum.ordinal() get the ordinal of gInstance or hInstance.<br/>
     *
     * @return the number of ordinal
     */
    public final int ordinal() {
        if (GlobalEnvSetting.isHms()) {
            return ((Enum) getHInstance()).ordinal();
        } else {
            return ((Enum) getGInstance()).ordinal();
        }
    }

    /**
     * org.xms.g.utils.XEnum.equals(Object other) judge if the object equals to the gInstance or the hInstance.<br/>
     *
     * @param other the object name
     * @return true or false
     */
    public final boolean equals(Object other) {
        if (!(other instanceof XEnum)) {
            return false;
        }
        if (GlobalEnvSetting.isHms()) {
            return this.getHInstance() == ((XEnum) other).getHInstance();
        } else {
            return this.getGInstance() == ((XEnum) other).getGInstance();
        }
    }

    /**
     * org.xms.g.utils.XEnum.hashCode() get hash code of the gInstance or the hInstance.<br/>
     *
     * @return the number of hash code
     */
    public final int hashCode() {
        if (GlobalEnvSetting.isHms()) {
            return getHInstance().hashCode();
        } else {
            return getGInstance().hashCode();
        }
    }

    /**
     * org.xms.g.utils.XEnum.toString() get string of the gInstance or the hInstance.<br/>
     *
     * @return the string of the gInstance or the hInstance
     */
    public String toString() {
        if (GlobalEnvSetting.isHms()) {
            return getHInstance().toString();
        } else {
            return getGInstance().toString();
        }
    }

    @Override
    public final void setGInstance(Object gInst) {
        throw new RuntimeException("");
    }

    @Override
    public final void setHInstance(Object hInst) {
        throw new RuntimeException("");
    }

    /**
     * org.xms.g.utils.XEnum.compareTo(E o) compare the two objects.<br/>
     *
     * @param o the object name
     * @return value of result
     */
    public final int compareTo(E o) {
        XEnum<?> other = o;
        XEnum<E> self = this;
        if (self.getClass() != other.getClass() && self.getDeclaringClass() != other.getDeclaringClass()) {
            throw new ClassCastException();
        }
        return self.ordinal() - other.ordinal();
    }

    @SuppressWarnings("unchecked")
    public final Class<E> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == Enum.class) ? (Class<E>) clazz : (Class<E>) zuper;
    }
}
