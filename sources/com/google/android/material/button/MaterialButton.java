package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p044.AbstractC1298;
import p044.C1295;
import p190.C2643;
import p190.C2644;
import p190.InterfaceC2645;
import p211.AbstractC2807;
import p220.AbstractC2845;
import p222.C2914;
import p239.AbstractC3098;
import p361.C4087;
import p361.C4089;
import p361.C4097;
import p361.C4103;
import p361.InterfaceC4106;
import p389.C4512;
import ˈⁱ.ﹳﹳ;
import ˊﹶ.ˋˉ;
import ᴵﹳ.ٴˎ;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class MaterialButton extends C2914 implements Checkable, InterfaceC4106 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final int[] f3198 = {R.attr.state_checkable};

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public static final int[] f3199 = {R.attr.state_checked};

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f3200;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final LinkedHashSet f3201;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public ColorStateList f3202;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public boolean f3203;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f3204;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f3205;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public Drawable f3206;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C2644 f3207;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public String f3208;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public int f3209;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public InterfaceC2645 f3210;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f3211;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public PorterDuff.Mode f3212;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f3213;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2807.m7088(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0403ba, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140513), attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0403ba);
        this.f3201 = new LinkedHashSet();
        this.f3211 = false;
        this.f3203 = false;
        Context context2 = getContext();
        TypedArray typedArrayM7129 = AbstractC2845.m7129(context2, attributeSet, AbstractC3098.f11958, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0403ba, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140513, new int[0]);
        this.f3204 = typedArrayM7129.getDimensionPixelSize(12, 0);
        int i = typedArrayM7129.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3212 = AbstractC2845.m7132(i, mode);
        this.f3202 = ـﹶ.ﾞˊ(getContext(), typedArrayM7129, 14);
        this.f3206 = ـﹶ.יʻ(getContext(), typedArrayM7129, 10);
        this.f3209 = typedArrayM7129.getInteger(11, 1);
        this.f3213 = typedArrayM7129.getDimensionPixelSize(13, 0);
        C4103 c4103M9399 = C4103.m9399(context2, typedArrayM7129, 17);
        C2644 c2644 = new C2644(this, c4103M9399 != null ? c4103M9399.m9401() : C4089.m9377(context2, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0403ba, org.lsposed.hiddenapibypass.library.R.style._2_res_0x7f140513).m9375());
        this.f3207 = c2644;
        c2644.f10484 = typedArrayM7129.getDimensionPixelOffset(1, 0);
        c2644.f10497 = typedArrayM7129.getDimensionPixelOffset(2, 0);
        c2644.f10498 = typedArrayM7129.getDimensionPixelOffset(3, 0);
        c2644.f10493 = typedArrayM7129.getDimensionPixelOffset(4, 0);
        if (typedArrayM7129.hasValue(8)) {
            int dimensionPixelSize = typedArrayM7129.getDimensionPixelSize(8, -1);
            c2644.f10504 = dimensionPixelSize;
            float f = dimensionPixelSize;
            C4087 c4087M9381 = c2644.f10483.m9381();
            c4087M9381.f15758 = new C4097(f);
            c4087M9381.f15765 = new C4097(f);
            c4087M9381.f15766 = new C4097(f);
            c4087M9381.f15762 = new C4097(f);
            c2644.f10483 = c4087M9381.m9375();
            c2644.f10494 = null;
            c2644.m6829();
            c2644.f10490 = true;
        }
        c2644.f10486 = typedArrayM7129.getDimensionPixelSize(20, 0);
        c2644.f10491 = AbstractC2845.m7132(typedArrayM7129.getInt(7, -1), mode);
        c2644.f10487 = ـﹶ.ﾞˊ(getContext(), typedArrayM7129, 6);
        c2644.f10489 = ـﹶ.ﾞˊ(getContext(), typedArrayM7129, 19);
        c2644.f10499 = ـﹶ.ﾞˊ(getContext(), typedArrayM7129, 16);
        c2644.f10500 = typedArrayM7129.getBoolean(5, false);
        c2644.f10488 = typedArrayM7129.getDimensionPixelSize(9, 0);
        c2644.f10502 = typedArrayM7129.getBoolean(21, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM7129.hasValue(0)) {
            c2644.f10501 = true;
            setSupportBackgroundTintList(c2644.f10487);
            setSupportBackgroundTintMode(c2644.f10491);
        } else {
            c2644.m6827();
        }
        setPaddingRelative(paddingStart + c2644.f10484, paddingTop + c2644.f10498, paddingEnd + c2644.f10497, paddingBottom + c2644.f10493);
        if (c4103M9399 != null) {
            C4512 c4512 = new C4512();
            c4512.m10277(0.8f);
            c4512.m10275(380.0f);
            c2644.f10503 = c4512;
            if (c2644.f10494 != null) {
                c2644.m6829();
            }
            c2644.f10494 = c4103M9399;
            c2644.m6829();
        }
        typedArrayM7129.recycle();
        setCompoundDrawablePadding(this.f3204);
        m2833(this.f3206 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f3208)) {
            return (m2832() ? CompoundButton.class : Button.class).getName();
        }
        return this.f3208;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2829()) {
            return this.f3207.f10504;
        }
        return 0;
    }

    public C4512 getCornerSpringForce() {
        return this.f3207.f10503;
    }

    public Drawable getIcon() {
        return this.f3206;
    }

    public int getIconGravity() {
        return this.f3209;
    }

    public int getIconPadding() {
        return this.f3204;
    }

    public int getIconSize() {
        return this.f3213;
    }

    public ColorStateList getIconTint() {
        return this.f3202;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3212;
    }

    public int getInsetBottom() {
        return this.f3207.f10493;
    }

    public int getInsetTop() {
        return this.f3207.f10498;
    }

    public ColorStateList getRippleColor() {
        if (m2829()) {
            return this.f3207.f10499;
        }
        return null;
    }

    public C4089 getShapeAppearanceModel() {
        if (m2829()) {
            return this.f3207.f10483;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public C4103 getStateListShapeAppearanceModel() {
        if (m2829()) {
            return this.f3207.f10494;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2829()) {
            return this.f3207.f10489;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2829()) {
            return this.f3207.f10486;
        }
        return 0;
    }

    @Override // p222.C2914
    public ColorStateList getSupportBackgroundTintList() {
        return m2829() ? this.f3207.f10487 : super.getSupportBackgroundTintList();
    }

    @Override // p222.C2914
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2829() ? this.f3207.f10491 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3211;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2829()) {
            ﹳﹳ.ᵢٴ(this, this.f3207.m6828(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m2832()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3198);
        }
        if (this.f3211) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3199);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p222.C2914, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f3211);
    }

    @Override // p222.C2914, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m2832());
        accessibilityNodeInfo.setChecked(this.f3211);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p222.C2914, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2644 c2644;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c2644 = this.f3207) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = c2644.f10492;
            if (drawable != null) {
                drawable.setBounds(c2644.f10484, c2644.f10498, i6 - c2644.f10497, i5 - c2644.f10493);
            }
        }
        m2830(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2643)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2643 c2643 = (C2643) parcelable;
        super.onRestoreInstanceState(c2643.f15438);
        setChecked(c2643.f10480);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2643 c2643 = new C2643(super.onSaveInstanceState());
        c2643.f10480 = this.f3211;
        return c2643;
    }

    @Override // p222.C2914, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m2830(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3207.f10502) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3206 != null) {
            if (this.f3206.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3208 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m2829()) {
            super.setBackgroundColor(i);
            return;
        }
        C2644 c2644 = this.f3207;
        if (c2644.m6828(false) != null) {
            c2644.m6828(false).setTint(i);
        }
    }

    @Override // p222.C2914, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m2829()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        C2644 c2644 = this.f3207;
        c2644.f10501 = true;
        ColorStateList colorStateList = c2644.f10487;
        MaterialButton materialButton = c2644.f10496;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c2644.f10491);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p222.C2914, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ٴˎ.ˏᵢ(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m2829()) {
            this.f3207.f10500 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m2832() && isEnabled() && this.f3211 != z) {
            this.f3211 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.f3211;
                if (!materialButtonToggleGroup.f3227) {
                    materialButtonToggleGroup.m2834(getId(), z2);
                }
            }
            if (this.f3203) {
                return;
            }
            this.f3203 = true;
            Iterator it = this.f3201.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f3203 = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m2829()) {
            C2644 c2644 = this.f3207;
            if (c2644.f10490 && c2644.f10504 == i) {
                return;
            }
            c2644.f10504 = i;
            c2644.f10490 = true;
            float f = i;
            C4087 c4087M9381 = c2644.f10483.m9381();
            c4087M9381.f15758 = new C4097(f);
            c4087M9381.f15765 = new C4097(f);
            c4087M9381.f15766 = new C4097(f);
            c4087M9381.f15762 = new C4097(f);
            c2644.f10483 = c4087M9381.m9375();
            c2644.f10494 = null;
            c2644.m6829();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m2829()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C4512 c4512) {
        C2644 c2644 = this.f3207;
        c2644.f10503 = c4512;
        if (c2644.f10494 != null) {
            c2644.m6829();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m2829()) {
            this.f3207.m6828(false).m9406(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3206 != drawable) {
            this.f3206 = drawable;
            m2833(true);
            m2830(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f3209 != i) {
            this.f3209 = i;
            m2830(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f3204 != i) {
            this.f3204 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? ٴˎ.ˏᵢ(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3213 != i) {
            this.f3213 = i;
            m2833(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3202 != colorStateList) {
            this.f3202 = colorStateList;
            m2833(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3212 != mode) {
            this.f3212 = mode;
            m2833(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(com.bumptech.glide.ﹳﹳ.ˑי(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C2644 c2644 = this.f3207;
        c2644.m6825(c2644.f10498, i);
    }

    public void setInsetTop(int i) {
        C2644 c2644 = this.f3207;
        c2644.m6825(i, c2644.f10493);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC2645 interfaceC2645) {
        this.f3210 = interfaceC2645;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ˋˉ r0 = this.f3210;
        if (r0 != null) {
            ((MaterialButtonToggleGroup) r0.ˆʿ).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2829()) {
            C2644 c2644 = this.f3207;
            if (c2644.f10499 != colorStateList) {
                c2644.f10499 = colorStateList;
                boolean z = C2644.f10482;
                MaterialButton materialButton = c2644.f10496;
                if (z && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1298.m4597(colorStateList));
                } else {
                    if (z || !(materialButton.getBackground() instanceof C1295)) {
                        return;
                    }
                    ((C1295) materialButton.getBackground()).setTintList(AbstractC1298.m4597(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m2829()) {
            setRippleColor(com.bumptech.glide.ﹳﹳ.ˑי(getContext(), i));
        }
    }

    @Override // p361.InterfaceC4106
    public void setShapeAppearanceModel(C4089 c4089) {
        if (!m2829()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C2644 c2644 = this.f3207;
        c2644.f10483 = c4089;
        c2644.f10494 = null;
        c2644.m6829();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m2829()) {
            C2644 c2644 = this.f3207;
            c2644.f10495 = z;
            c2644.m6826();
        }
    }

    public void setStateListShapeAppearanceModel(C4103 c4103) {
        if (!m2829()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C2644 c2644 = this.f3207;
        if (c2644.f10503 == null && c4103.m9402()) {
            C4512 c4512 = new C4512();
            c4512.m10277(0.8f);
            c4512.m10275(380.0f);
            c2644.f10503 = c4512;
            if (c2644.f10494 != null) {
                c2644.m6829();
            }
        }
        c2644.f10494 = c4103;
        c2644.m6829();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2829()) {
            C2644 c2644 = this.f3207;
            if (c2644.f10489 != colorStateList) {
                c2644.f10489 = colorStateList;
                c2644.m6826();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m2829()) {
            setStrokeColor(com.bumptech.glide.ﹳﹳ.ˑי(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m2829()) {
            C2644 c2644 = this.f3207;
            if (c2644.f10486 != i) {
                c2644.f10486 = i;
                c2644.m6826();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m2829()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p222.C2914
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2829()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C2644 c2644 = this.f3207;
        if (c2644.f10487 != colorStateList) {
            c2644.f10487 = colorStateList;
            if (c2644.m6828(false) != null) {
                c2644.m6828(false).setTintList(c2644.f10487);
            }
        }
    }

    @Override // p222.C2914
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2829()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C2644 c2644 = this.f3207;
        if (c2644.f10491 != mode) {
            c2644.f10491 = mode;
            if (c2644.m6828(false) == null || c2644.f10491 == null) {
                return;
            }
            c2644.m6828(false).setTintMode(c2644.f10491);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m2830(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f3207.f10502 = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3211);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m2829() {
        C2644 c2644 = this.f3207;
        return (c2644 == null || c2644.f10501) ? false : true;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m2830(int i, int i2) {
        if (this.f3206 == null || getLayout() == null) {
            return;
        }
        int i3 = this.f3209;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f3200 = 0;
                if (i3 == 16) {
                    this.f3205 = 0;
                    m2833(false);
                    return;
                }
                int intrinsicHeight = this.f3213;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f3206.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f3204) - getPaddingBottom()) / 2);
                if (this.f3205 != iMax) {
                    this.f3205 = iMax;
                    m2833(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f3205 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.f3209;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f3200 = 0;
            m2833(false);
            return;
        }
        int intrinsicWidth = this.f3213;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f3206.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f3204) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f3209 == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f3200 != textLayoutWidth) {
            this.f3200 = textLayoutWidth;
            m2833(false);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m2831() {
        int i = this.f3209;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.f3206, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f3206, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f3206, null, null);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m2832() {
        C2644 c2644 = this.f3207;
        return c2644 != null && c2644.f10500;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m2833(boolean z) {
        Drawable drawable = this.f3206;
        if (drawable != null) {
            Drawable drawableMutate = ˆˑ.ﹳﹳ.ᵢʿ(drawable).mutate();
            this.f3206 = drawableMutate;
            drawableMutate.setTintList(this.f3202);
            PorterDuff.Mode mode = this.f3212;
            if (mode != null) {
                this.f3206.setTintMode(mode);
            }
            int intrinsicWidth = this.f3213;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f3206.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f3213;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3206.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3206;
            int i = this.f3200;
            int i2 = this.f3205;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f3206.setVisible(true, z);
        }
        if (z) {
            m2831();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f3209;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f3206) || (((i3 == 3 || i3 == 4) && drawable5 != this.f3206) || ((i3 == 16 || i3 == 32) && drawable4 != this.f3206))) {
            m2831();
        }
    }
}
