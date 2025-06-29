package p193;

import java.util.HashMap;
import p332.AbstractC3777;
import p332.C3779;

/* renamed from: ˎˊ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2685 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final HashMap f10594;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final HashMap f10595;

    static {
        HashMap map = new HashMap();
        f10595 = map;
        HashMap map2 = new HashMap();
        f10594 = map2;
        map2.put(C2694.class, new C2688(9));
        map2.put(C2679.class, new C2688(10));
        map2.put(C2691.class, new C2688(11));
        C2700 c2700 = new C2700(1);
        map2.put(C2704.class, c2700);
        map.put(C2704.class, c2700);
        C2700 c27002 = new C2700(2);
        map2.put(C2680.class, c27002);
        map.put(C2680.class, c27002);
        map.put(C2705.class, new C2702(2));
        map2.put(C2683.class, new C2688(12));
        map2.put(C2697.class, new C2688(13));
        map.put(ˏʾ.class, new C2702(3));
        map2.put(C2707.class, new C2688(0));
        C2700 c27003 = new C2700(0);
        map2.put(C2693.class, c27003);
        map.put(C2693.class, c27003);
        map2.put(C2682.class, new C2688(1));
        map2.put(C2687.class, new C2688(2));
        map2.put(C2695.class, new C2688(3));
        map2.put(C2696.class, new C2688(4));
        map2.put(C2684.class, new C2688(5));
        map2.put(C2686.class, new C2688(6));
        map2.put(C2699.class, new C2688(7));
        map2.put(C2703.class, new C2688(8));
        map.put(ˆʿ.class, new C2702(0));
        map.put(AbstractC2706.class, new C2702(1));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C2687 m6862(AbstractC3777 abstractC3777) {
        abstractC3777.f14613.m8855(abstractC3777);
        C3779 c3779 = abstractC3777.f14613;
        long jM8858 = c3779.m8858(abstractC3777);
        c3779.m8854(abstractC3777);
        abstractC3777.m8849();
        abstractC3777.m8849();
        abstractC3777.m8843(2);
        C2687 c2687 = new C2687();
        c2687.f10597 = jM8858;
        return c2687;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static InterfaceC2689 m6863(Class cls) {
        InterfaceC2689 interfaceC2689 = (InterfaceC2689) f10594.get(cls);
        if (interfaceC2689 != null) {
            return interfaceC2689;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + cls);
    }
}
