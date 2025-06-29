package p007;

import android.hardware.display.DisplayManager;

/* renamed from: ʻˉ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0964 implements DisplayManager.DisplayListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C0958 f4265;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final DisplayManager f4266;

    public C0964(C0958 c0958, DisplayManager displayManager) {
        this.f4265 = c0958;
        this.f4266 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C0958.m3891(this.f4265, this.f4266.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
