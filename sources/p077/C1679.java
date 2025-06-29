package p077;

import p164.C2363;
import p164.InterfaceC2379;
import p184.InterfaceC2551;
import p185.AbstractC2562;
import p338.InterfaceC3864;

/* renamed from: ʿˊ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1679 implements InterfaceC2379 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2363 f6533;

    public C1679(C2363 c2363) {
        this.f6533 = c2363;
    }

    @Override // p164.InterfaceC2379
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final InterfaceC2551 mo5363() {
        return this.f6533.f9353;
    }

    @Override // p164.InterfaceC2379
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object mo5364(InterfaceC3864 interfaceC3864, AbstractC2562 abstractC2562) {
        return this.f6533.mo5364(new C1675(interfaceC3864, null), abstractC2562);
    }
}
