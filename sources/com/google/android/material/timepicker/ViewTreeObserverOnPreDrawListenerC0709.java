package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0709 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f3505;

    public ViewTreeObserverOnPreDrawListenerC0709(ClockFaceView clockFaceView) {
        this.f3505 = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3505;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f3486.f3497) - clockFaceView.f3481;
        if (height != clockFaceView.f3509) {
            clockFaceView.f3509 = height;
            clockFaceView.mo2913();
            int i = clockFaceView.f3509;
            ClockHandView clockHandView = clockFaceView.f3486;
            clockHandView.f3490 = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
