package p222;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: ˏᴵ.ˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC2906 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC2857 f11253;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11254;

    public /* synthetic */ RunnableC2906(AbstractViewOnTouchListenerC2857 abstractViewOnTouchListenerC2857, int i) {
        this.f11254 = i;
        this.f11253 = abstractViewOnTouchListenerC2857;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11254) {
            case 0:
                ViewParent parent = this.f11253.f11106.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC2857 abstractViewOnTouchListenerC2857 = this.f11253;
                abstractViewOnTouchListenerC2857.m7174();
                View view = abstractViewOnTouchListenerC2857.f11106;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC2857.mo7173()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC2857.f11109 = true;
                    break;
                }
                break;
        }
    }
}
