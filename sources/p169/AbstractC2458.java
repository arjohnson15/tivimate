package p169;

import com.squareup.moshi.JsonDataException;
import j$.util.DesugarCollections;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435.AbstractC5050;

/* renamed from: ˋʿ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2458 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Class f9786;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Class f9788;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Set f9787 = Collections.emptySet();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Type[] f9785 = new Type[0];

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f9788 = cls;
        f9786 = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6572(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static JsonDataException m6573(String str, String str2, AbstractC5050 abstractC5050) {
        String str3;
        String strM11186 = abstractC5050.m11186();
        if (str2.equals(str)) {
            str3 = "Required value '" + str + "' missing at " + strM11186;
        } else {
            str3 = "Required value '" + str + "' (JSON name '" + str2 + "') missing at " + strM11186;
        }
        return new JsonDataException(str3);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static JsonDataException m6574(String str, String str2, AbstractC5050 abstractC5050) {
        String str3;
        String strM11186 = abstractC5050.m11186();
        if (str2.equals(str)) {
            str3 = "Non-null value '" + str + "' was null at " + strM11186;
        } else {
            str3 = "Non-null value '" + str + "' (JSON name '" + str2 + "') was null at " + strM11186;
        }
        return new JsonDataException(str3);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static String m6575(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Type m6576(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m6576(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m6576(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Type m6577(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C2457(m6577(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C2459) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C2459(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof C2457 ? type : new C2457(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C2461)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C2461(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m6578(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10, java.util.LinkedHashSet r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p169.AbstractC2458.m6578(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.LinkedHashSet):java.lang.reflect.Type");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m6579(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static boolean m6580(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static String m6581(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
