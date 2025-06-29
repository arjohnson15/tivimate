package p226;

import androidx.fragment.app.C0118;
import androidx.lifecycle.AbstractC0233;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0262;
import p013.C1056;
import ʾᵔ.ᐧˋ;

/* renamed from: ˑʽ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3045 implements InterfaceC0213, InterfaceC3037 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C0118 f11742;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3028 f11743;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C3031 f11744;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC0233 f11745;

    public C3045(C3031 c3031, AbstractC0233 abstractC0233, C0118 c0118) {
        this.f11744 = c3031;
        this.f11745 = abstractC0233;
        this.f11742 = c0118;
        abstractC0233.mo1032(this);
    }

    @Override // p226.InterfaceC3037
    public final void cancel() {
        this.f11745.mo1031(this);
        this.f11742.f711.remove(this);
        C3028 c3028 = this.f11743;
        if (c3028 != null) {
            c3028.cancel();
        }
        this.f11743 = null;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
        if (enumC0247 == EnumC0247.ON_START) {
            C3031 c3031 = this.f11744;
            C1056 c1056 = c3031.f11707;
            C0118 c0118 = this.f11742;
            c1056.addLast(c0118);
            C3028 c3028 = new C3028(c3031, c0118);
            c0118.f711.add(c3028);
            c3031.m7525();
            c0118.f712 = new ᐧˋ(0, c3031, C3031.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 22);
            this.f11743 = c3028;
            return;
        }
        if (enumC0247 != EnumC0247.ON_STOP) {
            if (enumC0247 == EnumC0247.ON_DESTROY) {
                cancel();
            }
        } else {
            C3028 c30282 = this.f11743;
            if (c30282 != null) {
                c30282.cancel();
            }
        }
    }
}
