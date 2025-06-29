package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.lsposed.hiddenapibypass.library.R;
import p204.C2772;
import p204.C2784;
import p378.C4332;
import ˊﹶ.ˋˉ;

/* renamed from: com.google.android.material.timepicker.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0714 extends C4332 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ ClockFaceView f3512;

    public C0714(ClockFaceView clockFaceView) {
        this.f3512 = clockFaceView;
    }

    @Override // p378.C4332
    /* renamed from: ᐧʻ */
    public final boolean mo2856(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.mo2856(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f3512;
        view.getHitRect(clockFaceView.f3488);
        float fCenterX = clockFaceView.f3488.centerX();
        float fCenterY = clockFaceView.f3488.centerY();
        clockFaceView.f3486.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f3486.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }

    @Override // p378.C4332
    /* renamed from: ﹳﹳ */
    public final void mo2857(View view, C2784 c2784) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16820;
        AccessibilityNodeInfo accessibilityNodeInfo = c2784.f10848;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id._2_res_0x7f0b0279)).intValue();
        if (iIntValue > 0) {
            View view2 = (View) this.f3512.f3485.get(iIntValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        c2784.m7056(ˋˉ.ˎˑ(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c2784.m7051(C2772.f10828);
    }
}
