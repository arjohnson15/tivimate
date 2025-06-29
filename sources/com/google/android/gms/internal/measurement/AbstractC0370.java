package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p080.AbstractC1702;
import p331.C3758;

/* renamed from: com.google.android.gms.internal.measurement.ˉʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0370 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static InterfaceC0489 m2073(C0389 c0389) {
        if (c0389 == null) {
            return InterfaceC0489.f2827;
        }
        int i = AbstractC0505.f2852[AbstractC1702.m5411(c0389.m2123())];
        if (i == 1) {
            return c0389.m2124() ? new C0429(c0389.m2127()) : InterfaceC0489.f2825;
        }
        if (i == 2) {
            return c0389.m2128() ? new C0477(Double.valueOf(c0389.m2126())) : new C0477(null);
        }
        if (i == 3) {
            return c0389.m2129() ? new C0469(Boolean.valueOf(c0389.m2122())) : new C0469(null);
        }
        if (i != 4) {
            if (i != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(c0389)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listM2121 = c0389.m2121();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM2121.iterator();
        while (it.hasNext()) {
            arrayList.add(m2073((C0389) it.next()));
        }
        return new C0506(c0389.m2125(), arrayList);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m2074(long j, Object obj) {
        AbstractC0325 abstractC0325 = (AbstractC0325) ((InterfaceC0465) AbstractC0547.m2458(j, obj));
        if (abstractC0325.f2443) {
            abstractC0325.f2443 = false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static InterfaceC0489 m2075(Object obj) {
        if (obj == null) {
            return InterfaceC0489.f2823;
        }
        if (obj instanceof String) {
            return new C0429((String) obj);
        }
        if (obj instanceof Double) {
            return new C0477((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0477(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0477(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0469((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0335 c0335 = new C0335();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0335.m1865(m2075(it.next()));
            }
            return c0335;
        }
        C0402 c0402 = new C0402();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC0489 interfaceC0489M2075 = m2075(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c0402.mo1863((String) string, interfaceC0489M2075);
            }
        }
        return c0402;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static InterfaceC0489 m2076(InterfaceC0562 interfaceC0562, C0429 c0429, ﹶˋ.ـﹶ r4, ArrayList arrayList) {
        String str = c0429.f2728;
        if (interfaceC0562.mo1871(str)) {
            InterfaceC0489 interfaceC0489Mo1870 = interfaceC0562.mo1870(str);
            if (interfaceC0489Mo1870 instanceof AbstractC0381) {
                return ((AbstractC0381) interfaceC0489Mo1870).mo1817(r4, arrayList);
            }
            throw new IllegalArgumentException(ᵎﹳ.ᐧʻ.ˉⁱ(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(ᵎﹳ.ᐧʻ.ﾞˊ("Object has no function ", str));
        }
        AbstractC0543.m2446(1, "hasOwnProperty", arrayList);
        return interfaceC0562.mo1871(((C3758) r4.ˎˑ).m8736(r4, (InterfaceC0489) arrayList.get(0)).mo1876()) ? InterfaceC0489.f2828 : InterfaceC0489.f2829;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C0350 m2077() {
        String str;
        ClassLoader classLoader = AbstractC0370.class.getClassLoader();
        if (C0350.class.equals(C0350.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!C0350.class.getPackage().equals(AbstractC0370.class.getPackage())) {
                throw new IllegalArgumentException(C0350.class.getName());
            }
            str = C0350.class.getPackage().getName() + ".BlazeGenerated" + C0350.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    ᵎﹳ.ᐧʻ.ᵎˏ(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e) {
                    throw new IllegalStateException(e);
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC0370.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(C0346.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C0350.class.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C0350) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C0350) C0350.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
