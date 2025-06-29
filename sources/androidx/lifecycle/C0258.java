package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0258 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C0258 f1317 = new C0258();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f1319 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f1318 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m1091(HashMap map, C0232 c0232, EnumC0247 enumC0247, Class cls) {
        EnumC0247 enumC02472 = (EnumC0247) map.get(c0232);
        if (enumC02472 == null || enumC0247 == enumC02472) {
            if (enumC02472 == null) {
                map.put(c0232, enumC0247);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0232.f1256.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC02472 + ", new value " + enumC0247);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0209 m1092(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1319;
        if (superclass != null) {
            C0209 c0209M1092 = (C0209) map2.get(superclass);
            if (c0209M1092 == null) {
                c0209M1092 = m1092(superclass, null);
            }
            map.putAll(c0209M1092.f1219);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0209 c0209M10922 = (C0209) map2.get(cls2);
            if (c0209M10922 == null) {
                c0209M10922 = m1092(cls2, null);
            }
            for (Map.Entry entry : c0209M10922.f1219.entrySet()) {
                m1091(map, (C0232) entry.getKey(), (EnumC0247) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0238 interfaceC0238 = (InterfaceC0238) method.getAnnotation(InterfaceC0238.class);
            if (interfaceC0238 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0262.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0247 enumC0247Value = interfaceC0238.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0247.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0247Value != EnumC0247.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1091(map, new C0232(method, i), enumC0247Value, cls);
                z = true;
            }
        }
        C0209 c0209 = new C0209(map);
        map2.put(cls, c0209);
        this.f1318.put(cls, Boolean.valueOf(z));
        return c0209;
    }
}
