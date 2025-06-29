package p267;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import p016.C1083;
import p068.AbstractC1540;
import p115.AbstractC1833;
import p115.InterfaceC1822;
import p375.C4304;
import p375.C4306;
import p375.C4317;
import p418.C4782;
import p418.C4824;

/* renamed from: ـˎ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3269 {
    static {
        C1083[] c1083Arr = {new C1083(10, InterfaceC1822.class)};
        HashMap map = new HashMap();
        C1083 c1083 = c1083Arr[0];
        boolean zContainsKey = map.containsKey(c1083.f4654);
        Class cls = c1083.f4654;
        if (zContainsKey) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
        }
        map.put(cls, c1083);
        Class cls2 = c1083Arr[0].f4654;
        DesugarCollections.unmodifiableMap(map);
        int i = C4824.CONFIG_NAME_FIELD_NUMBER;
        try {
            m8069();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8069() {
        AbstractC1833.m5577(C3274.f12749);
        AbstractC1833.m5577(C3280.f12772);
        AbstractC1833.m5580(new C3273(), true);
        C4304 c4304 = AbstractC3268.f12736;
        C4317 c4317 = C4317.f16771;
        c4317.m9805(AbstractC3268.f12736);
        c4317.m9808(AbstractC3268.f12734);
        c4317.m9806(AbstractC3268.f12735);
        c4317.m9804(AbstractC3268.f12737);
        C4306 c4306 = C4306.f16751;
        c4306.m9798(C3273.f12746);
        if (AbstractC1540.f6258.get()) {
            return;
        }
        AbstractC1833.m5580(new C3273(C4782.class, new C1083[]{new C1083(9, InterfaceC1822.class)}), true);
        c4317.m9805(AbstractC3276.f12755);
        c4317.m9808(AbstractC3276.f12753);
        c4317.m9806(AbstractC3276.f12754);
        c4317.m9804(AbstractC3276.f12756);
        c4306.m9798(C3273.f12745);
    }
}
