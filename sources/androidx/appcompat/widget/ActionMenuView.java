package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p222.AbstractC2891;
import p222.AbstractC2926;
import p222.C2869;
import p222.C2888;
import p222.C2898;
import p222.C2908;
import p222.C2928;
import p222.InterfaceC2890;
import p222.InterfaceC2938;
import p320.C3644;
import p320.InterfaceC3663;
import p320.InterfaceC3665;
import p320.MenuC3643;
import ˆʽ.ᵎˏ;
import ˈˉ.ﹳﹳ;
import ˊﹶ.ˋˉ;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC2891 implements InterfaceC3663, InterfaceC3665 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f134;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final int f135;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public InterfaceC2938 f136;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public boolean f137;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public int f138;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public MenuC3643 f139;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final int f140;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C2908 f141;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public boolean f142;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public Context f143;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public ˋˉ f144;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f140 = (int) (56.0f * f);
        this.f135 = (int) (f * 4.0f);
        this.f143 = context;
        this.f134 = 0;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static C2898 m132() {
        C2898 c2898 = new C2898(-2, -2);
        c2898.f11223 = false;
        ((LinearLayout.LayoutParams) c2898).gravity = 16;
        return c2898;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static C2898 m133(ViewGroup.LayoutParams layoutParams) {
        C2898 c2898;
        if (layoutParams == null) {
            return m132();
        }
        if (layoutParams instanceof C2898) {
            C2898 c28982 = (C2898) layoutParams;
            c2898 = new C2898(c28982);
            c2898.f11223 = c28982.f11223;
        } else {
            c2898 = new C2898(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2898).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2898).gravity = 16;
        }
        return c2898;
    }

    @Override // p222.AbstractC2891, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2898;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p222.AbstractC2891, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m132();
    }

    @Override // p222.AbstractC2891, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2898(getContext(), attributeSet);
    }

    @Override // p222.AbstractC2891, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m133(layoutParams);
    }

    public Menu getMenu() {
        if (this.f139 == null) {
            Context context = getContext();
            MenuC3643 menuC3643 = new MenuC3643(context);
            this.f139 = menuC3643;
            menuC3643.f13902 = new ˋˉ(6, this);
            C2908 c2908 = new C2908(context);
            this.f141 = c2908;
            c2908.f11263 = true;
            c2908.f11272 = true;
            c2908.f11265 = new ﹳﹳ(27);
            this.f139.m8585(c2908, this.f143);
            C2908 c29082 = this.f141;
            c29082.f11267 = this;
            this.f139 = c29082.f11269;
        }
        return this.f139;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C2908 c2908 = this.f141;
        C2888 c2888 = c2908.f11273;
        if (c2888 != null) {
            return c2888.getDrawable();
        }
        if (c2908.f11284) {
            return c2908.f11276;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f134;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2908 c2908 = this.f141;
        if (c2908 != null) {
            c2908.mo7200();
            if (this.f141.m7256()) {
                this.f141.m7257();
                this.f141.m7254();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2908 c2908 = this.f141;
        if (c2908 != null) {
            c2908.m7257();
            C2928 c2928 = c2908.f11277;
            if (c2928 == null || !c2928.m8618()) {
                return;
            }
            c2928.f14007.dismiss();
        }
    }

    @Override // p222.AbstractC2891, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f137) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC2926.f11335;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C2898 c2898 = (C2898) childAt.getLayoutParams();
                if (c2898.f11223) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m134(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c2898).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2898).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2898).leftMargin) + ((LinearLayout.LayoutParams) c2898).rightMargin;
                    m134(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C2898 c28982 = (C2898) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c28982.f11223) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c28982).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c28982).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C2898 c28983 = (C2898) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c28983.f11223) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c28983).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = ᵎˏ.ˋˊ(measuredWidth4, ((LinearLayout.LayoutParams) c28983).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // p222.AbstractC2891, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC3643 menuC3643;
        boolean z3 = this.f137;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f137 = z4;
        if (z3 != z4) {
            this.f138 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f137 && (menuC3643 = this.f139) != null && size != this.f138) {
            this.f138 = size;
            menuC3643.m8592(true);
        }
        int childCount = getChildCount();
        if (!this.f137 || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C2898 c2898 = (C2898) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c2898).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2898).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f140;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i17 = 0;
        int iMax2 = 0;
        int i18 = 0;
        boolean z5 = false;
        long j = 0;
        int i19 = 0;
        while (true) {
            i3 = this.f135;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i22 = i17 + 1;
                if (z6) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C2898 c28982 = (C2898) childAt.getLayoutParams();
                c28982.f11224 = false;
                c28982.f11222 = 0;
                c28982.f11220 = 0;
                c28982.f11225 = false;
                ((LinearLayout.LayoutParams) c28982).leftMargin = 0;
                ((LinearLayout.LayoutParams) c28982).rightMargin = 0;
                c28982.f11221 = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c28982.f11223 ? 1 : i14;
                C2898 c28983 = (C2898) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i23 <= 0 || (z7 && i23 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i16, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z7 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c28983.f11225 = !c28983.f11223 && z7;
                c28983.f11220 = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i10);
                if (c28982.f11225) {
                    i19++;
                }
                if (c28982.f11223) {
                    z5 = true;
                }
                i14 -= i10;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j |= 1 << i18;
                }
                i17 = i22;
            }
            i18++;
            size3 = i20;
            i12 = i21;
            paddingBottom = i9;
            mode = i8;
        }
        int i24 = mode;
        int i25 = i12;
        int i26 = size3;
        boolean z8 = z5 && i17 == 2;
        boolean z9 = false;
        while (i19 > 0 && i14 > 0) {
            int i27 = Integer.MAX_VALUE;
            int i28 = 0;
            int i29 = 0;
            long j2 = 0;
            while (i29 < childCount2) {
                C2898 c28984 = (C2898) getChildAt(i29).getLayoutParams();
                boolean z10 = z9;
                if (c28984.f11225) {
                    int i30 = c28984.f11220;
                    if (i30 < i27) {
                        j2 = 1 << i29;
                        i27 = i30;
                        i28 = 1;
                    } else if (i30 == i27) {
                        j2 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z9 = z10;
            }
            z = z9;
            j |= j2;
            if (i28 > i14) {
                break;
            }
            int i31 = i27 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                C2898 c28985 = (C2898) childAt2.getLayoutParams();
                int i33 = iMax;
                int i34 = childMeasureSpec;
                int i35 = childCount2;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z8 && c28985.f11221) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c28985.f11220 += r4;
                    c28985.f11224 = r4;
                    i14--;
                } else if (c28985.f11220 == i31) {
                    j |= j3;
                }
                i32++;
                childMeasureSpec = i34;
                iMax = i33;
                childCount2 = i35;
            }
            z9 = true;
        }
        z = z9;
        int i36 = iMax;
        int i37 = childMeasureSpec;
        int i38 = childCount2;
        boolean z11 = !z5 && i17 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i17 - 1 && !z11 && iMax2 <= 1)) {
            i4 = i38;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((C2898) getChildAt(0).getLayoutParams()).f11221) {
                    fBitCount -= 0.5f;
                }
                int i39 = i38 - 1;
                if ((j & (1 << i39)) != 0 && !((C2898) getChildAt(i39).getLayoutParams()).f11221) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i14 * i16) / fBitCount) : 0;
            boolean z12 = z;
            i4 = i38;
            for (int i41 = 0; i41 < i4; i41++) {
                if ((j & (1 << i41)) != 0) {
                    View childAt3 = getChildAt(i41);
                    C2898 c28986 = (C2898) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c28986.f11222 = i40;
                        c28986.f11224 = true;
                        if (i41 == 0 && !c28986.f11221) {
                            ((LinearLayout.LayoutParams) c28986).leftMargin = (-i40) / 2;
                        }
                        z12 = true;
                    } else {
                        if (c28986.f11223) {
                            c28986.f11222 = i40;
                            c28986.f11224 = true;
                            ((LinearLayout.LayoutParams) c28986).rightMargin = (-i40) / 2;
                            z12 = true;
                        } else {
                            if (i41 != 0) {
                                ((LinearLayout.LayoutParams) c28986).leftMargin = i40 / 2;
                            }
                            if (i41 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c28986).rightMargin = i40 / 2;
                            }
                        }
                    }
                }
            }
            z2 = z12;
        }
        if (z2) {
            int i42 = 0;
            while (i42 < i4) {
                View childAt4 = getChildAt(i42);
                C2898 c28987 = (C2898) childAt4.getLayoutParams();
                if (c28987.f11224) {
                    i7 = i37;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c28987.f11220 * i16) + c28987.f11222, 1073741824), i7);
                } else {
                    i7 = i37;
                }
                i42++;
                i37 = i7;
            }
        }
        if (i24 != 1073741824) {
            i6 = i25;
            i5 = i36;
        } else {
            i5 = i26;
            i6 = i25;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f141.f11279 = z;
    }

    public void setOnMenuItemClickListener(InterfaceC2938 interfaceC2938) {
        this.f136 = interfaceC2938;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C2908 c2908 = this.f141;
        C2888 c2888 = c2908.f11273;
        if (c2888 != null) {
            c2888.setImageDrawable(drawable);
        } else {
            c2908.f11284 = true;
            c2908.f11276 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f142 = z;
    }

    public void setPopupTheme(int i) {
        if (this.f134 != i) {
            this.f134 = i;
            if (i == 0) {
                this.f143 = getContext();
            } else {
                this.f143 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C2908 c2908) {
        this.f141 = c2908;
        c2908.f11267 = this;
        this.f139 = c2908.f11269;
    }

    @Override // p320.InterfaceC3663
    /* renamed from: ʽᐧ */
    public final boolean mo109(C3644 c3644) {
        return this.f139.m8596(c3644, null, 0);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final boolean m134(int i) {
        boolean zMo107 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC2890)) {
            zMo107 = ((InterfaceC2890) childAt).mo107();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC2890)) ? zMo107 : zMo107 | ((InterfaceC2890) childAt2).mo104();
    }

    @Override // p222.AbstractC2891
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2869 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m133(layoutParams);
    }

    @Override // p320.InterfaceC3665
    /* renamed from: ـﹶ */
    public final void mo110(MenuC3643 menuC3643) {
        this.f139 = menuC3643;
    }

    @Override // p222.AbstractC2891
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2869 generateDefaultLayoutParams() {
        return m132();
    }

    @Override // p222.AbstractC2891
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C2869 generateLayoutParams(AttributeSet attributeSet) {
        return new C2898(getContext(), attributeSet);
    }
}
