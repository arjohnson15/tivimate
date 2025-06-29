package p140;

import p118.AbstractC1849;
import p118.C1856;
import p118.InterfaceC1853;
import p185.AbstractC2562;
import p262.InterfaceC3254;
import p262.InterfaceC3255;

/* renamed from: ˉˏ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2183 implements InterfaceC3255, InterfaceC1853 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC1853 f8578;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3255 f8579;

    public C2183(InterfaceC3255 interfaceC3255) {
        C1856 c1856M5608 = AbstractC1849.m5608();
        this.f8579 = interfaceC3255;
        this.f8578 = c1856M5608;
    }

    @Override // p262.InterfaceC3255
    public final void close() {
        this.f8579.close();
    }

    @Override // p118.InterfaceC1853
    /* renamed from: ʽᐧ */
    public final Object mo5613(AbstractC2562 abstractC2562) {
        return this.f8578.mo5613(abstractC2562);
    }

    @Override // p118.InterfaceC1853
    /* renamed from: ˑʽ */
    public final boolean mo5614() {
        return this.f8578.mo5614();
    }

    @Override // p118.InterfaceC1853
    /* renamed from: ـﹶ */
    public final void mo5615(Object obj) {
        this.f8578.mo5615(obj);
    }

    @Override // p262.InterfaceC3255
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final InterfaceC3254 mo6108(String str) {
        return this.f8579.mo6108(str);
    }
}
