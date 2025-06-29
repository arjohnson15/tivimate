package p096;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p211.AbstractC2807;
import p220.AbstractC2845;
import p239.AbstractC3098;
import p278.AbstractC3362;
import p361.C4089;
import p361.C4105;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.AbstractC4362;
import ˆˑ.ﹳﹳ;
import ﹶⁱ.ـﹶ;

/* renamed from: ˆˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1764 extends FrameLayout {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final ViewOnTouchListenerC1762 f6823 = new ViewOnTouchListenerC1762();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f6824;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int f6825;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public PorterDuff.Mode f6826;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final float f6827;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final float f6828;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C4089 f6829;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int f6830;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public ColorStateList f6831;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1764(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        Drawable drawable;
        super(AbstractC2807.m7088(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC3098.f11980);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            AbstractC4339.m9854(this, dimensionPixelSize);
        }
        this.f6824 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f6829 = C4089.m9377(context2, attributeSet, 0, 0).m9375();
        }
        this.f6827 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(ـﹶ.ﾞˊ(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC2845.m7132(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f6828 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f6825 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f6830 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f6823);
        setFocusable(true);
        if (getBackground() == null) {
            int iM8206 = AbstractC3362.m8206(getBackgroundOverlayColorAlpha(), AbstractC3362.m8199(this, R.attr._2_res_0x7f040169), AbstractC3362.m8199(this, R.attr._2_res_0x7f04014f));
            C4089 c4089 = this.f6829;
            if (c4089 != null) {
                int i = AbstractC1766.f6833;
                C4105 c4105 = new C4105(c4089);
                c4105.m9407(ColorStateList.valueOf(iM8206));
                gradientDrawable = c4105;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC1766.f6833;
                float dimension = resources.getDimension(R.dimen._2_res_0x7f070434);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iM8206);
                gradientDrawable = gradientDrawable2;
            }
            if (this.f6831 != null) {
                drawable = ﹳﹳ.ᵢʿ(gradientDrawable);
                drawable.setTintList(this.f6831);
            } else {
                drawable = ﹳﹳ.ᵢʿ(gradientDrawable);
            }
            setBackground(drawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC1766 abstractC1766) {
    }

    public float getActionTextColorAlpha() {
        return this.f6828;
    }

    public int getAnimationMode() {
        return this.f6824;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6827;
    }

    public int getMaxInlineActionWidth() {
        return this.f6830;
    }

    public int getMaxWidth() {
        return this.f6825;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f6825;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f6824 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f6831 != null) {
            drawable = ﹳﹳ.ᵢʿ(drawable.mutate());
            drawable.setTintList(this.f6831);
            drawable.setTintMode(this.f6826);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6831 = colorStateList;
        if (getBackground() != null) {
            Drawable drawable = ﹳﹳ.ᵢʿ(getBackground().mutate());
            drawable.setTintList(colorStateList);
            drawable.setTintMode(this.f6826);
            if (drawable != getBackground()) {
                super.setBackgroundDrawable(drawable);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6826 = mode;
        if (getBackground() != null) {
            Drawable drawable = ﹳﹳ.ᵢʿ(getBackground().mutate());
            drawable.setTintMode(mode);
            if (drawable != getBackground()) {
                super.setBackgroundDrawable(drawable);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f6823);
        super.setOnClickListener(onClickListener);
    }
}
