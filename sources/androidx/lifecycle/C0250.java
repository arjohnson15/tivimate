package androidx.lifecycle;

import p072.AbstractC1642;
import p072.InterfaceC1594;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: androidx.lifecycle.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0250 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public /* synthetic */ Object f1300;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C0227 f1301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0250(C0227 c0227, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f1301 = c0227;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object mo1054(Object obj, Object obj2) {
        C0250 c0250 = (C0250) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2);
        C3397 c3397 = C3397.f13249;
        c0250.mo1055(c3397);
        return c3397;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי, reason: contains not printable characters */
    public final Object mo1055(Object obj) {
        ˈⁱ.ˉⁱ.ˆʿ(obj);
        InterfaceC1594 interfaceC1594 = (InterfaceC1594) this.f1300;
        C0227 c0227 = this.f1301;
        AbstractC0233 abstractC0233 = c0227.f1249;
        if (((C0236) abstractC0233).f1275.compareTo(EnumC0230.f1250) >= 0) {
            abstractC0233.mo1032(c0227);
        } else {
            AbstractC1642.m5282(interfaceC1594.mo1029(), null);
        }
        return C3397.f13249;
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C0250 c0250 = new C0250(this.f1301, interfaceC3746);
        c0250.f1300 = obj;
        return c0250;
    }
}
