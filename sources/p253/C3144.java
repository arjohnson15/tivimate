package p253;

import p072.AbstractC1636;
import p148.AbstractC2269;
import p148.C2272;
import p330.InterfaceC3747;

/* renamed from: יˑ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3144 extends AbstractC1636 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final C3144 f12147 = new C3144();

    @Override // p072.AbstractC1636
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p072.AbstractC1636
    /* renamed from: ʽˆ */
    public final void mo5275(InterfaceC3747 interfaceC3747, Runnable runnable) {
        C3150.f12163.f12162.m7785(runnable, true, true);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        C3150.f12163.f12162.m7785(runnable, true, false);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ */
    public final AbstractC1636 mo5222(int i, String str) {
        AbstractC2269.m6283(i);
        return i >= AbstractC3142.f12141 ? str != null ? new C2272(this, str) : this : super.mo5222(i, str);
    }
}
