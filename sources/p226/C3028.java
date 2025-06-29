package p226;

import androidx.fragment.app.C0118;
import p013.C1056;
import p070.AbstractC1549;

/* renamed from: ˑʽ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3028 implements InterfaceC3037 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C3031 f11705;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0118 f11706;

    public C3028(C3031 c3031, C0118 c0118) {
        this.f11705 = c3031;
        this.f11706 = c0118;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ʿ.ˏᵢ, ᵎˈ.ـﹶ] */
    @Override // p226.InterfaceC3037
    public final void cancel() {
        C3031 c3031 = this.f11705;
        C1056 c1056 = c3031.f11707;
        C0118 c0118 = this.f11706;
        c1056.remove(c0118);
        if (AbstractC1549.m5138(c3031.f11709, c0118)) {
            c0118.m746();
            c3031.f11709 = null;
        }
        c0118.f711.remove(this);
        ?? r0 = c0118.f712;
        if (r0 != 0) {
            r0.mo1053();
        }
        c0118.f712 = null;
    }
}
