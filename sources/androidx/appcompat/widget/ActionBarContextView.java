package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.leanback.widget.ViewOnClickListenerC0202;
import org.lsposed.hiddenapibypass.library.R;
import p182.AbstractC2517;
import p222.AbstractC2926;
import p222.C2908;
import p222.C2928;
import p300.AbstractC3505;
import p320.InterfaceC3665;
import p320.MenuC3643;
import p378.AbstractC4345;
import p378.C4361;
import p378.InterfaceC4360;
import ˆٴ.ʽﹶ;
import ᴵﹳ.ٴˎ;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final int f83;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public View f84;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Context f85;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f86;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f87;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public ActionMenuView f88;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public TextView f89;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public LinearLayout f90;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public View f91;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public CharSequence f92;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2908 f93;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ʽﹶ f94;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public CharSequence f95;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final int f96;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f97;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final int f98;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C4361 f99;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public TextView f100;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f101;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public View f102;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr._2_res_0x7f04001e);
        this.f94 = new ʽﹶ(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr._2_res_0x7f040004, typedValue, true) || typedValue.resourceId == 0) {
            this.f85 = context;
        } else {
            this.f85 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3505.f13596, R.attr._2_res_0x7f04001e, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : ٴˎ.ˏᵢ(context, resourceId));
        this.f98 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f83 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f86 = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f96 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout._2_res_0x7f0e0005);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m113(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static int m114(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f99 != null ? this.f94.ʽᐧ : getVisibility();
    }

    public int getContentHeight() {
        return this.f86;
    }

    public CharSequence getSubtitle() {
        return this.f95;
    }

    public CharSequence getTitle() {
        return this.f92;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC3505.f13588, R.attr._2_res_0x7f040007, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C2908 c2908 = this.f93;
        if (c2908 != null) {
            Configuration configuration2 = c2908.f11264.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c2908.f11270 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC3643 menuC3643 = c2908.f11269;
            if (menuC3643 != null) {
                menuC3643.m8592(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2908 c2908 = this.f93;
        if (c2908 != null) {
            c2908.m7257();
            C2928 c2928 = this.f93.f11277;
            if (c2928 == null || !c2928.m8618()) {
                return;
            }
            c2928.f14007.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f87 = false;
        }
        if (!this.f87) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f87 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f87 = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC2926.f11335;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f102;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f102.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iM114 = m114(this.f102, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iM114 - i6 : iM114 + i6;
        }
        LinearLayout linearLayout = this.f90;
        if (linearLayout != null && this.f91 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m114(this.f90, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.f91;
        if (view2 != null) {
            m114(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f88;
        if (actionMenuView != null) {
            m114(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f86;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f102;
        if (view != null) {
            int iM113 = m113(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f102.getLayoutParams();
            paddingLeft = iM113 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f88;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m113(this.f88, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f90;
        if (linearLayout != null && this.f91 == null) {
            if (this.f97) {
                this.f90.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f90.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f90.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m113(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f91;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f91.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f86 > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f101 = false;
        }
        if (!this.f101) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f101 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f101 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f86 = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f91;
        if (view2 != null) {
            removeView(view2);
        }
        this.f91 = view;
        if (view != null && (linearLayout = this.f90) != null) {
            removeView(linearLayout);
            this.f90 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f95 = charSequence;
        m118();
    }

    public void setTitle(CharSequence charSequence) {
        this.f92 = charSequence;
        m118();
        AbstractC4345.m9890(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f97) {
            requestLayout();
        }
        this.f97 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m115() {
        removeAllViews();
        this.f91 = null;
        this.f88 = null;
        this.f93 = null;
        View view = this.f84;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: ˏᵢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C4361 c4361 = this.f99;
            if (c4361 != null) {
                c4361.m9938();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m117(AbstractC2517 abstractC2517) {
        View view = this.f102;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f96, (ViewGroup) this, false);
            this.f102 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f102);
        }
        View viewFindViewById = this.f102.findViewById(R.id._2_res_0x7f0b004d);
        this.f84 = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0202(4, abstractC2517));
        MenuC3643 menuC3643Mo6647 = abstractC2517.mo6647();
        C2908 c2908 = this.f93;
        if (c2908 != null) {
            c2908.m7257();
            C2928 c2928 = c2908.f11277;
            if (c2928 != null && c2928.m8618()) {
                c2928.f14007.dismiss();
            }
        }
        C2908 c29082 = new C2908(getContext());
        this.f93 = c29082;
        c29082.f11263 = true;
        c29082.f11272 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC3643Mo6647.m8585(this.f93, this.f85);
        C2908 c29083 = this.f93;
        InterfaceC3665 interfaceC3665 = c29083.f11267;
        if (interfaceC3665 == null) {
            InterfaceC3665 interfaceC36652 = (InterfaceC3665) c29083.f11274.inflate(c29083.f11280, (ViewGroup) this, false);
            c29083.f11267 = interfaceC36652;
            interfaceC36652.mo110(c29083.f11269);
            c29083.mo7200();
        }
        InterfaceC3665 interfaceC36653 = c29083.f11267;
        if (interfaceC3665 != interfaceC36653) {
            ((ActionMenuView) interfaceC36653).setPresenter(c29083);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC36653;
        this.f88 = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f88, layoutParams);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m118() {
        if (this.f90 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout._2_res_0x7f0e0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f90 = linearLayout;
            this.f100 = (TextView) linearLayout.findViewById(R.id._2_res_0x7f0b0041);
            this.f89 = (TextView) this.f90.findViewById(R.id._2_res_0x7f0b0040);
            int i = this.f98;
            if (i != 0) {
                this.f100.setTextAppearance(getContext(), i);
            }
            int i2 = this.f83;
            if (i2 != 0) {
                this.f89.setTextAppearance(getContext(), i2);
            }
        }
        this.f100.setText(this.f92);
        this.f89.setText(this.f95);
        boolean zIsEmpty = TextUtils.isEmpty(this.f92);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f95);
        this.f89.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f90.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f90.getParent() == null) {
            addView(this.f90);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4361 m119(int i, long j) {
        C4361 c4361 = this.f99;
        if (c4361 != null) {
            c4361.m9938();
        }
        InterfaceC4360 interfaceC4360 = this.f94;
        if (i != 0) {
            C4361 c4361M9885 = AbstractC4345.m9885(this);
            c4361M9885.m9941(0.0f);
            c4361M9885.m9940(j);
            ((ActionBarContextView) ((ʽﹶ) interfaceC4360).ˑʽ).f99 = c4361M9885;
            ((ʽﹶ) interfaceC4360).ʽᐧ = i;
            c4361M9885.m9942(interfaceC4360);
            return c4361M9885;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C4361 c4361M98852 = AbstractC4345.m9885(this);
        c4361M98852.m9941(1.0f);
        c4361M98852.m9940(j);
        ((ActionBarContextView) ((ʽﹶ) interfaceC4360).ˑʽ).f99 = c4361M98852;
        ((ʽﹶ) interfaceC4360).ʽᐧ = i;
        c4361M98852.m9942(interfaceC4360);
        return c4361M98852;
    }
}
