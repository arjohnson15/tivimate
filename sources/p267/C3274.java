package p267;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p005.C0934;
import p115.AbstractC1820;
import p115.C1825;
import p115.InterfaceC1822;
import p115.InterfaceC1824;
import p260.C3222;

/* renamed from: ـˎ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3274 implements InterfaceC1824 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Logger f12750 = Logger.getLogger(C3274.class.getName());

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f12748 = {0};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3274 f12749 = new C3274();

    @Override // p115.InterfaceC1824
    /* renamed from: ʽᐧ */
    public final Object mo4099(C3222 c3222) throws GeneralSecurityException {
        Iterator it = ((ConcurrentHashMap) c3222.f12538).values().iterator();
        while (it.hasNext()) {
            for (C1825 c1825 : (List) it.next()) {
                AbstractC1820 abstractC1820 = c1825.f7043;
                if (abstractC1820 instanceof AbstractC3278) {
                    AbstractC3278 abstractC3278 = (AbstractC3278) abstractC1820;
                    byte[] bArr = c1825.f7044;
                    C0934 c0934M3799 = C0934.m3799(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!c0934M3799.equals(abstractC3278.mo8065())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + abstractC3278.mo8066() + " has wrong output prefix (" + abstractC3278.mo8065() + ") instead of (" + c0934M3799 + ")");
                    }
                }
            }
        }
        return new C3271(c3222);
    }

    @Override // p115.InterfaceC1824
    /* renamed from: ˑʽ */
    public final Class mo4100() {
        return InterfaceC1822.class;
    }

    @Override // p115.InterfaceC1824
    /* renamed from: ـﹶ */
    public final Class mo4101() {
        return InterfaceC1822.class;
    }
}
