package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0209 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final HashMap f1219;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f1220 = new HashMap();

    public C0209(HashMap map) {
        this.f1219 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0247 enumC0247 = (EnumC0247) entry.getValue();
            List arrayList = (List) this.f1220.get(enumC0247);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1220.put(enumC0247, arrayList);
            }
            arrayList.add((C0232) entry.getKey());
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m1005(List list, InterfaceC0262 interfaceC0262, EnumC0247 enumC0247, InterfaceC0222 interfaceC0222) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0232 c0232 = (C0232) list.get(size);
                c0232.getClass();
                try {
                    int i = c0232.f1257;
                    Method method = c0232.f1256;
                    if (i == 0) {
                        method.invoke(interfaceC0222, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0222, interfaceC0262);
                    } else if (i == 2) {
                        method.invoke(interfaceC0222, interfaceC0262, enumC0247);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
