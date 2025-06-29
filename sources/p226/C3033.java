package p226;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p338.InterfaceC3856;
import p338.InterfaceC3865;

/* renamed from: ˑʽ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3033 implements OnBackAnimationCallback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3856 f11717;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3865 f11718;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3856 f11719;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3865 f11720;

    public C3033(InterfaceC3856 interfaceC3856, InterfaceC3856 interfaceC38562, InterfaceC3865 interfaceC3865, InterfaceC3865 interfaceC38652) {
        this.f11719 = interfaceC3856;
        this.f11717 = interfaceC38562;
        this.f11718 = interfaceC3865;
        this.f11720 = interfaceC38652;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f11720.mo1053();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f11718.mo1053();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        this.f11717.mo4036(new C3026(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        this.f11719.mo4036(new C3026(backEvent));
    }
}
