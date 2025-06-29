package p118;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p034.C1228;
import p072.C1602;
import p072.InterfaceC1576;
import p072.InterfaceC1589;
import p148.AbstractC2263;
import p288.C3397;
import p330.InterfaceC3747;
import p338.InterfaceC3870;
import ʾʿ.ᵎـ;
import ʿᴵ.ˑﾞ;

/* renamed from: ˈˈ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1852 implements InterfaceC1589, InterfaceC1576 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C1856 f7101;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1602 f7102;

    public C1852(C1856 c1856, C1602 c1602) {
        this.f7101 = c1856;
        this.f7102 = c1602;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        this.f7102.mo3974(obj);
    }

    @Override // p072.InterfaceC1589
    /* renamed from: ˉⁱ */
    public final C1228 mo5180(Object obj, InterfaceC3870 interfaceC3870) {
        C1856 c1856 = this.f7101;
        C1848 c1848 = new C1848(c1856, 0, this);
        C1228 c1228M5216 = this.f7102.m5216((C3397) obj, c1848);
        if (c1228M5216 != null) {
            C1856.f7105.set(c1856, null);
        }
        return c1228M5216;
    }

    @Override // p072.InterfaceC1589
    /* renamed from: ˎٴ */
    public final void mo5181(Object obj) {
        this.f7102.mo5181(obj);
    }

    @Override // p072.InterfaceC1576
    /* renamed from: ـﹶ */
    public final void mo5165(AbstractC2263 abstractC2263, int i) {
        this.f7102.mo5165(abstractC2263, i);
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return this.f7102.f6371;
    }

    @Override // p072.InterfaceC1589
    /* renamed from: ﹶˆ */
    public final void mo5182(Object obj, InterfaceC3870 interfaceC3870) {
        C3397 c3397 = C3397.f13249;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1856.f7105;
        C1856 c1856 = this.f7101;
        atomicReferenceFieldUpdater.set(c1856, null);
        ˑﾞ r6 = new ˑﾞ(c1856, 2, this);
        C1602 c1602 = this.f7102;
        c1602.m5207(c3397, c1602.f6358, new ᵎـ(3, r6));
    }
}
