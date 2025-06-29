package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.C0686;
import p220.AbstractC2853;
import p222.C2869;
import p320.C3644;
import p320.InterfaceC3645;
import p371.AbstractC4208;
import p378.AbstractC4345;
import ˆˑ.ﹳﹳ;
import ˈⁱ.ˉⁱ;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC2853 implements InterfaceC3645 {

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public static final int[] f3353 = {R.attr.state_checked};

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public boolean f3354;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final C0686 f3355;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final boolean f3356;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public Drawable f3357;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final CheckedTextView f3358;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f3359;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public boolean f3360;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public C3644 f3361;

    /* renamed from: יˋ, reason: contains not printable characters */
    public ColorStateList f3362;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public boolean f3363;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public FrameLayout f3364;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3356 = true;
        C0686 c0686 = new C0686(4, this);
        this.f3355 = c0686;
        setOrientation(0);
        LayoutInflater.from(context).inflate(org.lsposed.hiddenapibypass.library.R.layout._2_res_0x7f0e0033, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(org.lsposed.hiddenapibypass.library.R.dimen._2_res_0x7f070085));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b011c);
        this.f3358 = checkedTextView;
        AbstractC4345.m9884(checkedTextView, c0686);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3364 == null) {
                this.f3364 = (FrameLayout) ((ViewStub) findViewById(org.lsposed.hiddenapibypass.library.R.id._2_res_0x7f0b011b)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f3364.removeAllViews();
            this.f3364.addView(view);
        }
    }

    @Override // p320.InterfaceC3645
    public C3644 getItemData() {
        return this.f3361;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C3644 c3644 = this.f3361;
        if (c3644 != null && c3644.isCheckable() && this.f3361.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3353);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f3363 != z) {
            this.f3363 = z;
            this.f3355.mo4883(this.f3358, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3358;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f3356) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.f3354) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = ﹳﹳ.ᵢʿ(drawable).mutate();
                drawable.setTintList(this.f3362);
            }
            int i = this.f3359;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f3360) {
            if (this.f3357 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC4208.f16226;
                Drawable drawable2 = resources.getDrawable(org.lsposed.hiddenapibypass.library.R.drawable._2_res_0x7f0801ea, theme);
                this.f3357 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f3359;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f3357;
        }
        this.f3358.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f3358.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f3359 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.f3362 = colorStateList;
        this.f3354 = colorStateList != null;
        C3644 c3644 = this.f3361;
        if (c3644 != null) {
            setIcon(c3644.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f3358.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f3360 = z;
    }

    public void setTextAppearance(int i) {
        ˉⁱ.ﹳˑ(this.f3358, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3358.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3358.setText(charSequence);
    }

    @Override // p320.InterfaceC3645
    /* renamed from: ˑʽ */
    public final void mo106(C3644 c3644) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.f3361 = c3644;
        int i = c3644.f13941;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c3644.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040133, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3353, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c3644.isCheckable());
        setChecked(c3644.isChecked());
        setEnabled(c3644.isEnabled());
        setTitle(c3644.f13926);
        setIcon(c3644.getIcon());
        setActionView(c3644.getActionView());
        setContentDescription(c3644.f13947);
        ˉⁱ.ˈٴ(this, c3644.f13934);
        C3644 c36442 = this.f3361;
        CharSequence charSequence = c36442.f13926;
        CheckedTextView checkedTextView = this.f3358;
        if (charSequence == null && c36442.getIcon() == null && this.f3361.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3364;
            if (frameLayout != null) {
                C2869 c2869 = (C2869) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c2869).width = -1;
                this.f3364.setLayoutParams(c2869);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f3364;
        if (frameLayout2 != null) {
            C2869 c28692 = (C2869) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c28692).width = -2;
            this.f3364.setLayoutParams(c28692);
        }
    }
}
