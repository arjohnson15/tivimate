package p368;

import p261.C3233;
import p261.InterfaceC3251;
import p329.C3733;

/* renamed from: ᵢʻ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4179 extends C3733 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C3233 f16125;

    @Override // p329.C3733
    /* renamed from: ʽᐧ */
    public final int mo8698(Object obj) {
        InterfaceC3251 interfaceC3251 = (InterfaceC3251) obj;
        if (interfaceC3251 == null) {
            return 1;
        }
        return interfaceC3251.mo4601();
    }

    @Override // p329.C3733
    /* renamed from: ˑʽ */
    public final void mo3730(Object obj, Object obj2) {
        InterfaceC3251 interfaceC3251 = (InterfaceC3251) obj2;
        C3233 c3233 = this.f16125;
        if (c3233 == null || interfaceC3251 == null) {
            return;
        }
        c3233.f12594.m6534(interfaceC3251, true);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m9592(int i) {
        long j;
        if (i >= 40) {
            m8699(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.f14486;
            }
            m8699(j / 2);
        }
    }
}
