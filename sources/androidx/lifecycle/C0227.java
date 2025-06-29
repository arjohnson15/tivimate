package androidx.lifecycle;

import p072.AbstractC1642;
import p072.InterfaceC1594;
import p330.InterfaceC3747;

/* renamed from: androidx.lifecycle.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0227 implements InterfaceC0213, InterfaceC1594 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3747 f1248;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0233 f1249;

    public C0227(AbstractC0233 abstractC0233, InterfaceC3747 interfaceC3747) {
        this.f1249 = abstractC0233;
        this.f1248 = interfaceC3747;
        if (((C0236) abstractC0233).f1275 == EnumC0230.f1254) {
            AbstractC1642.m5282(interfaceC3747, null);
        }
    }

    @Override // p072.InterfaceC1594
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final InterfaceC3747 mo1029() {
        return this.f1248;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
        AbstractC0233 abstractC0233 = this.f1249;
        if (((C0236) abstractC0233).f1275.compareTo(EnumC0230.f1254) <= 0) {
            abstractC0233.mo1031(this);
            AbstractC1642.m5282(this.f1248, null);
        }
    }
}
