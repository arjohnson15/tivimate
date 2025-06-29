package p390;

import java.util.ArrayList;
import p129.C2053;
import p129.C2055;
import p144.C2230;
import p222.C2907;
import p266.C3261;
import p266.C3264;
import p331.C3758;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import ﹶˋ.ـﹶ;

/* renamed from: ⁱˈ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4514 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final InterfaceC3918 f17373 = AbstractC3917.m9105(C4514.class);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ـﹶ f17374;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10278(AutoCloseable autoCloseable) {
        C2907 c2907 = (C2907) this.f17374.ᐧˋ;
        C2230 c2230 = (C2230) c2907.f11261;
        try {
            Class<?> cls = autoCloseable.getClass();
            if (c2230.contains(cls)) {
                return;
            }
            C3261[] c3261ArrM7252 = c2907.m7252(autoCloseable);
            int i = 0;
            if (c3261ArrM7252 != null) {
                int length = c3261ArrM7252.length;
                while (i < length) {
                    c3261ArrM7252[i].m8019(autoCloseable);
                    i++;
                }
                return;
            }
            ArrayList arrayList = ((C2055) c2907.f11258).m5722(cls).f7769;
            C2053[] c2053Arr = (C2053[]) arrayList.toArray(new C2053[arrayList.size()]);
            int length2 = c2053Arr.length;
            if (length2 == 0) {
                c2230.add(cls);
                return;
            }
            C3261[] c3261Arr = new C3261[length2];
            while (i < length2) {
                C2053 c2053 = c2053Arr[i];
                C3264 c3264 = (C3264) c2907.f11256;
                C3758 c3758 = (C3758) c2907.f11260;
                c3264.getClass();
                c3261Arr[i] = C3264.m8045(c3758, c2053);
                i++;
            }
            c2907.m7251(autoCloseable, c3261Arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
