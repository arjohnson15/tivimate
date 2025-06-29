package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.C0686;
import p220.C2849;
import p222.C2971;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class CheckableImageButton extends C2971 implements Checkable {

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final int[] f3349 = {R.attr.state_checked};

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public boolean f3350;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public boolean f3351;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f3352;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f0402f8);
        this.f3350 = true;
        this.f3352 = true;
        AbstractC4345.m9884(this, new C0686(3, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3351;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f3351 ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f3349) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2849)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2849 c2849 = (C2849) parcelable;
        super.onRestoreInstanceState(c2849.f15438);
        setChecked(c2849.f11088);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2849 c2849 = new C2849(super.onSaveInstanceState());
        c2849.f11088 = this.f3351;
        return c2849;
    }

    public void setCheckable(boolean z) {
        if (this.f3350 != z) {
            this.f3350 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f3350 || this.f3351 == z) {
            return;
        }
        this.f3351 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f3352 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f3352) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3351);
    }
}
