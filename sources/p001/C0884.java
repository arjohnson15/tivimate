package p001;

import p072.AbstractC1642;
import p072.InterfaceC1594;
import p330.InterfaceC3747;

/* renamed from: ʻʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0884 implements AutoCloseable, InterfaceC1594 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3747 f4012;

    public C0884(InterfaceC3747 interfaceC3747) {
        this.f4012 = interfaceC3747;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC1642.m5282(this.f4012, null);
    }

    @Override // p072.InterfaceC1594
    /* renamed from: ˋⁱ */
    public final InterfaceC3747 mo1029() {
        return this.f4012;
    }
}
