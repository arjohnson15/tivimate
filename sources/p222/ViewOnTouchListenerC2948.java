package p222;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: ˏᴵ.ᵔˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2948 implements View.OnTouchListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C2959 f11389;

    public ViewOnTouchListenerC2948(C2959 c2959) {
        this.f11389 = c2959;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2965 c2965;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C2959 c2959 = this.f11389;
        if (action == 0 && (c2965 = c2959.f11410) != null && c2965.isShowing() && x >= 0 && x < c2959.f11410.getWidth() && y >= 0 && y < c2959.f11410.getHeight()) {
            c2959.f11411.postDelayed(c2959.f11405, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c2959.f11411.removeCallbacks(c2959.f11405);
        return false;
    }
}
