package p185;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p072.AbstractC1636;
import p072.C1602;
import p148.AbstractC2269;
import p148.C2257;
import p330.C3753;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p330.InterfaceC3754;

/* renamed from: ˎʻ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2562 extends AbstractC2563 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3747 f10143;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public transient InterfaceC3746 f10144;

    public AbstractC2562(InterfaceC3746 interfaceC3746) {
        this(interfaceC3746, interfaceC3746 != null ? interfaceC3746.mo3963() : null);
    }

    public AbstractC2562(InterfaceC3746 interfaceC3746, InterfaceC3747 interfaceC3747) {
        super(interfaceC3746);
        this.f10143 = interfaceC3747;
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public InterfaceC3747 mo3963() {
        return this.f10143;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void mo6677() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC3746 interfaceC3746 = this.f10144;
        if (interfaceC3746 != null && interfaceC3746 != this) {
            ((AbstractC1636) ((InterfaceC3754) mo3963().mo3966(C3753.f14515))).getClass();
            C2257 c2257 = (C2257) interfaceC3746;
            do {
                atomicReferenceFieldUpdater = C2257.f8977;
            } while (atomicReferenceFieldUpdater.get(c2257) == AbstractC2269.f9002);
            Object obj = atomicReferenceFieldUpdater.get(c2257);
            C1602 c1602 = obj instanceof C1602 ? (C1602) obj : null;
            if (c1602 != null) {
                c1602.m5215();
            }
        }
        this.f10144 = C2559.f10142;
    }
}
