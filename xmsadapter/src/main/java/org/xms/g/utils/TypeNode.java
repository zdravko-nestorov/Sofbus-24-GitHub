package org.xms.g.utils;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for TypeNode
 */
public class TypeNode implements Serializable {
    private Type type;

    private Parameter parameter;

    private TypeNode owner;

    private TypeNode componentType;

    private Class<?> clazz;

    private TypeNode superClassType;

    private List<TypeNode> interfaceTypes;

    private TypeNode(Type type, Parameter parameter, TypeNode owner) {
        this.type = type;
        this.parameter = parameter;
        this.owner = owner;
        this.clazz = getClassByType();
    }

    /**
     * org.xms.g.utils.TypeNode.createMethodParameterType(Parameter methodParameter, Type targetType) Create TypeNode by Type or Parameter<br/>
     *
     * @param methodParameter method parameter
     * @param targetType      set it null if method parameter is not null
     * @return TypeNode
     */
    public static TypeNode createMethodParameterType(Parameter methodParameter, Type targetType) {
        TypeNode receiverClassNode = createTypeNode(methodParameter.getReceiverClass(), null, null);
        TypeNode owner = receiverClassNode.findTypeNodeFromOwner(methodParameter.getDeclaringClass());
        return createTypeNode(targetType, methodParameter, owner);
    }

    private static TypeNode createTypeNode(Type type, Parameter parameter, TypeNode owner) {
        if (type == null && parameter != null) {
            type = parameter.toGenericType();
        }

        return new TypeNode(type, parameter, owner);
    }

    /**
     * org.xms.g.utils.TypeNode.getType() get type from the typeNode.<br/>
     *
     * @return get java type
     */
    public Type getType() {
        return this.type;
    }

    /**
     * org.xms.g.utils.TypeNode.getClazz() get clazz from the typeNode.<br/>
     *
     * @return class with generic
     */
    public Class<?> getClazz() {
        return this.clazz;
    }

    /**
     * org.xms.g.utils.TypeNode.resolveComponentType() resolve Component Type<br/>
     *
     * @return Component TypeNode if this is Array type
     */
    public TypeNode resolveComponentType() {
        if (this.type == null) {
            return null;
        }
        if (this.componentType != null) {
            return this.componentType;
        }
        if (this.type instanceof Class) {
            Class<?> componentType = ((Class<?>) this.type).getComponentType();
            return createTypeNode(componentType, null, this.owner);
        }
        if (this.type instanceof GenericArrayType) {
            return createTypeNode(((GenericArrayType) this.type).getGenericComponentType(), null, this.owner);
        }
        return handleSpecialType().resolveComponentType();
    }

    private boolean isArray() {
        if (this.type == null) {
            return false;
        }

        if (this.type instanceof Class) {
            Class<?> cl = (Class<?>) this.type;
            return cl.isArray();
        }

        if (this.type instanceof GenericArrayType) {
            return true;
        }

        TypeNode node = handleSpecialType();
        return node.isArray();
    }

    private TypeNode findTypeNodeFromOwner(Class<?> declaringClass) {
        if (this.type == null || this.clazz == null || this.clazz == declaringClass) {
            return this;
        }

        for (TypeNode interfaceType : getInterfaces()) {
            TypeNode iNode = interfaceType.findTypeNodeFromOwner(declaringClass);
            if (iNode.getType() != null) {
                return iNode;
            }
        }
        return getSuperClassType().findTypeNodeFromOwner(declaringClass);
    }

    private TypeNode getSuperClassType() {
        if (this.clazz == null || this.clazz.getGenericSuperclass() == null) {
            return createTypeNode(null, null, null);
        }
        if (this.superClassType == null) {
            this.superClassType = createTypeNode(this.clazz.getGenericSuperclass(), null, this);
        }
        return this.superClassType;
    }

    private List<TypeNode> getInterfaces() {
        if (this.clazz == null) {
            return new ArrayList<>();
        }

        if (this.interfaceTypes == null) {
            this.interfaceTypes = new ArrayList();
            Type[] genericInterfaces = this.clazz.getGenericInterfaces();
            for (int i = 0; i < genericInterfaces.length; i++) {
                this.interfaceTypes.add(createTypeNode(genericInterfaces[i], null, this));
            }
        }
        return this.interfaceTypes;
    }

    private Class<?> getClassByType() {
        if (this.type == null) {
            return null;
        }
        if (this.type instanceof Class) {
            return (Class<?>) this.type;
        }
        if (this.type instanceof GenericArrayType) {
            Class<?> component = resolveComponentType().getClazz();
            if (component == null) {
                return null;
            } else {
                return Array.newInstance(component, 0).getClass();
            }
        }
        return handleSpecialType().getClazz();
    }

    private TypeNode handleSpecialType() {
        if (this.type instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable<?>) this.type;
            if (this.owner != null) {
                TypeNode node = this.owner.handleVariable(typeVariable);
                if (node.getType() != null) {
                    return node;
                }
            }
            return createTypeNode(getBounds(typeVariable.getBounds()), null, this.owner);
        }
        if (this.type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) this.type;
            Type node = getBounds(wildcardType.getUpperBounds());
            if (node == null) {
                node = getBounds(wildcardType.getLowerBounds());
            }
            return createTypeNode(node, null, this.owner);
        }
        if (this.type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = ((ParameterizedType) this.type);
            return createTypeNode(parameterizedType.getRawType(), null, this.owner);
        }
        return createTypeNode(null, null, null);
    }

    private Type getBounds(Type[] bounds) {
        if (bounds.length == 0) {
            return null;
        }

        if (bounds[0] == Object.class) {
            return null;
        }

        return bounds[0];
    }

    private TypeNode handleVariable(TypeVariable<?> typeVariable) {
        if (this.type instanceof TypeVariable) {
            return handleSpecialType().handleVariable(typeVariable);
        }
        if (this.type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) this.type;
            if (this.clazz == null) {
                return createTypeNode(null, null, null);
            }
            TypeVariable<?>[] variables = this.clazz.getTypeParameters();
            for (int i = 0; i < variables.length; i++) {
                if (variables[i].getName().equals(typeVariable.getName())) {
                    Type actualType = parameterizedType.getActualTypeArguments()[i];
                    return createTypeNode(actualType, null, this.owner);
                }
            }
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                return createTypeNode(ownerType, null, this.owner).handleVariable(typeVariable);
            }
        }
        if (this.owner != null) {
            return this.owner.handleVariable(typeVariable);
        }

        return createTypeNode(null, null, null);
    }
}
