package p222;

import android.view.View;
import p320.InterfaceC3650;
import p320.MenuC3643;

/* renamed from: ˏᴵ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2910 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2908 f11289;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2928 f11290;

    public RunnableC2910(C2908 c2908, C2928 c2928) {
        this.f11289 = c2908;
        this.f11290 = c2928;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3650 interfaceC3650;
        C2908 c2908 = this.f11289;
        MenuC3643 menuC3643 = c2908.f11269;
        if (menuC3643 != null && (interfaceC3650 = menuC3643.f13902) != null) {
            interfaceC3650.mo6654(menuC3643);
        }
        View view = (View) c2908.f11267;
        if (view != null && view.getWindowToken() != null) {
            C2928 c2928 = this.f11290;
            if (c2928.m8618()) {
                c2908.f11278 = c2928;
            } else if (c2928.f13998 != null) {
                c2928.m8620(0, 0, false, false);
                c2908.f11278 = c2928;
            }
        }
        c2908.f11283 = null;
    }
}
