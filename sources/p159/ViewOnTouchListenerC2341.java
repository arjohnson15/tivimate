package p159;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ˊי.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2341 implements View.OnTouchListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f9307;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final int f9308;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f9309;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Dialog f9310;

    public ViewOnTouchListenerC2341(Dialog dialog, Rect rect) {
        this.f9310 = dialog;
        this.f9307 = rect.left;
        this.f9308 = rect.top;
        this.f9309 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f9307;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f9308, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f9309;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f9310.onTouchEvent(motionEventObtain);
    }
}
