package p267;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p115.C1825;
import p115.InterfaceC1824;
import p260.C3222;

/* renamed from: ـˎ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3280 implements InterfaceC1824 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3280 f12772 = new C3280();

    @Override // p115.InterfaceC1824
    /* renamed from: ʽᐧ */
    public final Object mo4099(C3222 c3222) throws GeneralSecurityException {
        if (((C1825) c3222.f12539) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentHashMap) c3222.f12538).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new C3272();
    }

    @Override // p115.InterfaceC1824
    /* renamed from: ˑʽ */
    public final Class mo4100() {
        return InterfaceC3277.class;
    }

    @Override // p115.InterfaceC1824
    /* renamed from: ـﹶ */
    public final Class mo4101() {
        return InterfaceC3277.class;
    }
}
