package p396;

import android.support.v4.media.session.AbstractC0002;
import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import p072.C1602;
import p080.AbstractC1702;
import p207.C2789;
import p225.AbstractC3019;
import p288.C3397;
import p330.InterfaceC3746;
import ˏᵢ.ᵢٴ;
import ⁱـ.ˑי;

/* renamed from: ⁱᴵ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4581 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean f17528 = true;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Constructor f17529;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Type[] f17530 = new Type[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Object m10465(InterfaceC4591 interfaceC4591, InterfaceC3746 interfaceC3746) {
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        c1602.m5219(new C4551(interfaceC4591, 0));
        interfaceC4591.mo10461(new C2789(c1602, 1));
        return c1602.m5203();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m10466(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m10466(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: ˉי, reason: contains not printable characters */
    public static boolean m10467(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m10467(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m10467(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m10468(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static boolean m10469(Type type) {
        return f17528 && type == C3397.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ˎٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m10470(java.lang.Throwable r4, p330.InterfaceC3746 r5) {
        /*
            boolean r0 = r5 instanceof p396.C4559
            if (r0 == 0) goto L13
            r0 = r5
            ⁱᴵ.ˋˊ r0 = (p396.C4559) r0
            int r1 = r0.f17468
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17468 = r1
            goto L18
        L13:
            ⁱᴵ.ˋˊ r0 = new ⁱᴵ.ˋˊ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f17469
            int r1 = r0.f17468
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            ˈⁱ.ˉⁱ.ˆʿ(r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L32:
            ˈⁱ.ˉⁱ.ˆʿ(r5)
            r0.f17468 = r2
            יˑ.ﹳﹳ r5 = p072.AbstractC1586.f6345
            יˎ.ˉי r1 = new יˎ.ˉי
            r2 = 19
            r3 = 0
            r1.<init>(r2, r0, r4, r3)
            ᴵⁱ.ˉי r4 = r0.f10143
            r5.mo5198(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p396.AbstractC4581.m10470(java.lang.Throwable, ᴵⁱ.ʿʼ):void");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static Object m10471(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f17529;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC3019.m7496().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f17529 = declaredConstructor;
        }
        return AbstractC3019.m7489(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static IllegalArgumentException m10472(Method method, int i, String str, Object... objArr) {
        return m10478(method, null, str + " (" + AbstractC4597.f17595.mo10418(method, i) + ")", objArr);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static Class m10473(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m10473(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m10473(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Object m10474(InterfaceC4591 interfaceC4591, InterfaceC3746 interfaceC3746) {
        C1602 c1602 = new C1602(1, ˑי.ˏᴵ(interfaceC3746));
        c1602.m5205();
        c1602.m5219(new C4551(interfaceC4591, 1));
        interfaceC4591.mo10461(new ᵢٴ(29, c1602));
        return c1602.m5203();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static IllegalArgumentException m10475(Method method, Exception exc, int i, String str, Object... objArr) {
        return m10478(method, exc, str + " (" + AbstractC4597.f17595.mo10418(method, i) + ")", objArr);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static Type m10476(Type type, Class cls, Class cls2) {
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
                    return m10476(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m10476(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Type m10477(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM40 = AbstractC0002.m40(i, "Index ", " not in range [0,");
        sbM40.append(actualTypeArguments.length);
        sbM40.append(") for ");
        sbM40.append(parameterizedType);
        throw new IllegalArgumentException(sbM40.toString());
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static IllegalArgumentException m10478(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM5409 = AbstractC1702.m5409(String.format(str, objArr), "\n    for method ");
        sbM5409.append(method.getDeclaringClass().getSimpleName());
        sbM5409.append(".");
        sbM5409.append(method.getName());
        return new IllegalArgumentException(sbM5409.toString(), exc);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m10479(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* renamed from: ᵎـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m10480(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p396.AbstractC4581.m10480(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static String m10481(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m10482(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static Type m10483(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m10480(type, cls, m10476(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ـﹶ */
    public abstract void mo10422(C4570 c4570, Object obj);
}
