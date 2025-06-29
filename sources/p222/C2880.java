package p222;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.lsposed.hiddenapibypass.library.R;
import p300.AbstractC3505;
import p331.C3762;
import p378.AbstractC4345;
import ˆˑ.ﹳﹳ;

/* renamed from: ˏᴵ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2880 extends C2883 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C2934 f11145;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f11146;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public PorterDuff.Mode f11147;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Drawable f11148;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public ColorStateList f11149;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public boolean f11150;

    public C2880(C2934 c2934) {
        super(c2934);
        this.f11149 = null;
        this.f11147 = null;
        this.f11150 = false;
        this.f11146 = false;
        this.f11145 = c2934;
    }

    @Override // p222.C2883
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo7192(AttributeSet attributeSet, int i) {
        super.mo7192(attributeSet, R.attr._2_res_0x7f0404f7);
        C2934 c2934 = this.f11145;
        Context context = c2934.getContext();
        int[] iArr = AbstractC3505.f13590;
        C3762 c3762M8778 = C3762.m8778(context, attributeSet, iArr, R.attr._2_res_0x7f0404f7);
        AbstractC4345.m9881(c2934, c2934.getContext(), iArr, attributeSet, (TypedArray) c3762M8778.f14531, R.attr._2_res_0x7f0404f7);
        Drawable drawableM8792 = c3762M8778.m8792(0);
        if (drawableM8792 != null) {
            c2934.setThumb(drawableM8792);
        }
        Drawable drawableM8784 = c3762M8778.m8784(1);
        Drawable drawable = this.f11148;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f11148 = drawableM8784;
        if (drawableM8784 != null) {
            drawableM8784.setCallback(c2934);
            ﹳﹳ.ˈٴ(drawableM8784, c2934.getLayoutDirection());
            if (drawableM8784.isStateful()) {
                drawableM8784.setState(c2934.getDrawableState());
            }
            m7193();
        }
        c2934.invalidate();
        TypedArray typedArray = (TypedArray) c3762M8778.f14531;
        if (typedArray.hasValue(3)) {
            this.f11147 = AbstractC2962.m7331(typedArray.getInt(3, -1), this.f11147);
            this.f11146 = true;
        }
        if (typedArray.hasValue(2)) {
            this.f11149 = c3762M8778.m8782(2);
            this.f11150 = true;
        }
        c3762M8778.m8783();
        m7193();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m7193() {
        Drawable drawable = this.f11148;
        if (drawable != null) {
            if (this.f11150 || this.f11146) {
                Drawable drawable2 = ﹳﹳ.ᵢʿ(drawable.mutate());
                this.f11148 = drawable2;
                if (this.f11150) {
                    drawable2.setTintList(this.f11149);
                }
                if (this.f11146) {
                    this.f11148.setTintMode(this.f11147);
                }
                if (this.f11148.isStateful()) {
                    this.f11148.setState(this.f11145.getDrawableState());
                }
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m7194(Canvas canvas) {
        if (this.f11148 != null) {
            int max = this.f11145.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f11148.getIntrinsicWidth();
                int intrinsicHeight = this.f11148.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f11148.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f11148.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
