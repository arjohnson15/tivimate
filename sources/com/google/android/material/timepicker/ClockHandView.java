package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.ArrayList;
import java.util.Iterator;
import org.lsposed.hiddenapibypass.library.R;
import p219.AbstractC2840;
import p239.AbstractC3098;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public static final /* synthetic */ int f3489 = 0;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f3490;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f3491;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final float f3492;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f3493;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ArrayList f3494;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f3495;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public float f3496;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int f3497;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ValueAnimator f3498;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f3499;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final Paint f3500;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final RectF f3501;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public double f3502;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr._2_res_0x7f0403d0);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f3498 = valueAnimator;
        this.f3494 = new ArrayList();
        Paint paint = new Paint();
        this.f3500 = paint;
        this.f3501 = new RectF();
        this.f3495 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11955, R.attr._2_res_0x7f0403d0, R.style._2_res_0x7f14056f);
        ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f040404, 200);
        ˎˑ.ﹳˎ(context, R.attr._2_res_0x7f040414, AbstractC2840.f11001);
        this.f3490 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3497 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f3493 = getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07036a);
        this.f3492 = r5.getDimensionPixelSize(R.dimen._2_res_0x7f070368);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m2915(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.ﹳﹳ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f3489;
                ClockHandView clockHandView = this.f3515;
                clockHandView.getClass();
                clockHandView.m2916(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new ʿʼ(0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fM2917 = m2917(this.f3495);
        float fCos = (((float) Math.cos(this.f3502)) * fM2917) + f;
        float f2 = height;
        float fSin = (fM2917 * ((float) Math.sin(this.f3502))) + f2;
        Paint paint = this.f3500;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f3497, paint);
        double dSin = Math.sin(this.f3502);
        paint.setStrokeWidth(this.f3493);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f3502) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.f3492, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3498.isRunning()) {
            return;
        }
        m2915(this.f3496);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z = this.f3499;
                if (this.f3491) {
                    this.f3495 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) m2917(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
                }
            } else {
                z = false;
            }
            z2 = false;
        } else {
            this.f3499 = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.f3499;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.f3496 != f;
        if (z2 && z5) {
            z3 = true;
        } else if (z5 || z) {
            m2915(f);
            z3 = true;
        }
        this.f3499 = z4 | z3;
        return true;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2915(float f) {
        this.f3498.cancel();
        m2916(f);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m2916(float f) {
        float f2 = f % 360.0f;
        this.f3496 = f2;
        this.f3502 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM2917 = m2917(this.f3495);
        float fCos = (((float) Math.cos(this.f3502)) * fM2917) + width;
        float fSin = (fM2917 * ((float) Math.sin(this.f3502))) + height;
        float f3 = this.f3497;
        this.f3501.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f3494.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0716) it.next());
            if (Math.abs(clockFaceView.f3483 - f2) > 0.001f) {
                clockFaceView.f3483 = f2;
                clockFaceView.m2914();
            }
        }
        invalidate();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m2917(int i) {
        return i == 2 ? Math.round(this.f3490 * 0.66f) : this.f3490;
    }
}
