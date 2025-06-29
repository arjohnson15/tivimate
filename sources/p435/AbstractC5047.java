package p435;

import com.squareup.moshi.JsonDataException;
import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p169.AbstractC2458;
import p169.C2459;

/* renamed from: ﹶᵔ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5047 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C5055 f19151 = new C5055(5);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C5042 f19146 = new C5042(1);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C5042 f19150 = new C5042(2);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C5042 f19154 = new C5042(3);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C5042 f19147 = new C5042(4);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C5042 f19152 = new C5042(5);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C5042 f19153 = new C5042(6);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C5042 f19149 = new C5042(7);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C5042 f19155 = new C5042(8);

    /* renamed from: ˉי, reason: contains not printable characters */
    public static final C5042 f19148 = new C5042(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m11166(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m11166(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m11166(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C2459 ? ((C2459) parameterizedType).f9790 : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C2459 ? ((C2459) parameterizedType2).f9790 : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m11166(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m11166(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m11167(AbstractC5050 abstractC5050, String str, int i, int i2) {
        int iMo11188 = abstractC5050.mo11188();
        if (iMo11188 >= i && iMo11188 <= i2) {
            return iMo11188;
        }
        throw new JsonDataException("Expected " + str + " but was " + iMo11188 + " at path " + abstractC5050.m11186());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m11168(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Type m11169(Type type, Class cls) {
        if (!Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        Type typeM6578 = AbstractC2458.m6578(type, cls, AbstractC2458.m6576(type, cls, Collection.class), new LinkedHashSet());
        if (typeM6578 instanceof WildcardType) {
            typeM6578 = ((WildcardType) typeM6578).getUpperBounds()[0];
        }
        return typeM6578 instanceof ParameterizedType ? ((ParameterizedType) typeM6578).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static C2459 m11170(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C2459(null, cls, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + cls);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Set m11171(Set set, Class cls) {
        if (!cls.isAnnotationPresent(InterfaceC5059.class)) {
            throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
        }
        if (set.isEmpty()) {
            return null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            if (cls.equals(annotation.annotationType())) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return DesugarCollections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Class m11172(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m11172(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m11172(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: ʿʼ */
    public abstract Object mo11156();
}
