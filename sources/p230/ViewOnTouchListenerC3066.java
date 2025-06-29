package p230;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: ˑˈ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC3066 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC3069 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final GestureDetector f11821;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3067 f11822;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final PointF f11824 = new PointF();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final PointF f11820 = new PointF();

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final float f11823 = 25.0f;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public volatile float f11825 = 3.1415927f;

    public ViewOnTouchListenerC3066(Context context, C3067 c3067) {
        this.f11822 = c3067;
        this.f11821 = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f11824.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f11824.x) / this.f11823;
        float y = motionEvent2.getY();
        PointF pointF = this.f11824;
        float f3 = (y - pointF.y) / this.f11823;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f11825;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f11820;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        C3067 c3067 = this.f11822;
        PointF pointF3 = this.f11820;
        synchronized (c3067) {
            float f5 = pointF3.y;
            c3067.f11835 = f5;
            Matrix.setRotateM(c3067.f11827, 0, -f5, (float) Math.cos(c3067.f11828), (float) Math.sin(c3067.f11828), 0.0f);
            Matrix.setRotateM(c3067.f11834, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f11822.f11836.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f11821.onTouchEvent(motionEvent);
    }

    @Override // p230.InterfaceC3069
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo7559(float[] fArr, float f) {
        this.f11825 = -f;
    }
}
