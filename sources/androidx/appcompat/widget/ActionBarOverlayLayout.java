package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.leanback.widget.C0168;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p033.C1212;
import p182.C2522;
import p222.C2872;
import p222.C2881;
import p222.C2885;
import p222.C2908;
import p222.C2966;
import p222.InterfaceC2911;
import p222.InterfaceC2942;
import p222.InterfaceC2946;
import p222.RunnableC2868;
import p225.C3016;
import p320.InterfaceC3660;
import p320.MenuC3643;
import p378.AbstractC4339;
import p378.AbstractC4342;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4331;
import p378.C4335;
import p378.C4348;
import p378.C4369;
import p378.C4375;
import p378.InterfaceC4355;
import p378.InterfaceC4374;
import p421.C4861;
import ᴵﹳ.ٴˎ;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC2946, InterfaceC4374, InterfaceC4355 {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final C4369 f103;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final Rect f104;

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final int[] f105 = {R.attr._2_res_0x7f040005, android.R.attr.windowContentOverlay};

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public C4369 f106;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public int f107;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final RunnableC2868 f108;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f109;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC2942 f110;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final RunnableC2868 f111;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public OverScroller f112;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f113;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public ViewPropertyAnimator f114;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final C2872 f115;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public ContentFrameLayout f116;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final Rect f117;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Rect f118;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Rect f119;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f120;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ActionBarContainer f121;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f122;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f123;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C0168 f124;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public C4369 f125;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C4369 f126;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C4369 f127;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Drawable f128;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Rect f129;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final C1212 f130;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f131;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public InterfaceC2911 f132;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public int f133;

    static {
        int i = Build.VERSION.SDK_INT;
        AbstractC4342 c4335 = i >= 30 ? new C4335() : i >= 29 ? new C4375() : new C4348();
        c4335.mo9872(C4861.m10935(0, 1, 0, 1));
        f103 = c4335.mo9867();
        f104 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109 = 0;
        this.f119 = new Rect();
        this.f118 = new Rect();
        this.f129 = new Rect();
        this.f117 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C4369 c4369 = C4369.f16870;
        this.f127 = c4369;
        this.f106 = c4369;
        this.f126 = c4369;
        this.f125 = c4369;
        this.f124 = new C0168(3, this);
        this.f108 = new RunnableC2868(this, 0);
        this.f111 = new RunnableC2868(this, 1);
        m131(context);
        this.f130 = new C1212();
        C2872 c2872 = new C2872(context);
        c2872.setWillNotDraw(true);
        this.f115 = c2872;
        addView(c2872);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m120(View view, Rect rect, boolean z) {
        boolean z2;
        C2966 c2966 = (C2966) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c2966).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c2966).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c2966).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c2966).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c2966).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c2966).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c2966).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c2966).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2966;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f128 != null) {
            if (this.f121.getVisibility() == 0) {
                translationY = (int) (this.f121.getTranslationY() + this.f121.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f128.setBounds(0, translationY, getWidth(), this.f128.getIntrinsicHeight() + translationY);
            this.f128.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2966(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2966(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2966(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f121;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1212 c1212 = this.f130;
        return c1212.f4959 | c1212.f4960;
    }

    public CharSequence getTitle() {
        m125();
        return ((C2885) this.f110).f11179.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m125();
        C4369 c4369M9950 = C4369.m9950(this, windowInsets);
        boolean zM120 = m120(this.f121, new Rect(c4369M9950.m9951(), c4369M9950.m9955(), c4369M9950.m9952(), c4369M9950.m9953()), false);
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        Rect rect = this.f119;
        AbstractC4339.m9851(this, c4369M9950, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C4331 c4331 = c4369M9950.f16871;
        C4369 c4369Mo9825 = c4331.mo9825(i, i2, i3, i4);
        this.f127 = c4369Mo9825;
        boolean z = true;
        if (!this.f106.equals(c4369Mo9825)) {
            this.f106 = this.f127;
            zM120 = true;
        }
        Rect rect2 = this.f118;
        if (rect2.equals(rect)) {
            z = zM120;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c4331.mo9838().f16871.mo9836().f16871.mo9830().m9954();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m131(getContext());
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m126();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C2966 c2966 = (C2966) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c2966).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c2966).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f120 || !z) {
            return false;
        }
        this.f112.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f112.getFinalY() > this.f121.getHeight()) {
            m126();
            this.f111.run();
        } else {
            m126();
            this.f108.run();
        }
        this.f123 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f133 + i2;
        this.f133 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C3016 c3016;
        C2522 c2522;
        this.f130.f4960 = i;
        this.f133 = getActionBarHideOffset();
        m126();
        InterfaceC2911 interfaceC2911 = this.f132;
        if (interfaceC2911 == null || (c2522 = (c3016 = (C3016) interfaceC2911).f11599) == null) {
            return;
        }
        c2522.m6663();
        c3016.f11599 = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f121.getVisibility() != 0) {
            return false;
        }
        return this.f120;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f120 || this.f123) {
            return;
        }
        if (this.f133 <= this.f121.getHeight()) {
            m126();
            postDelayed(this.f108, 600L);
        } else {
            m126();
            postDelayed(this.f111, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m125();
        int i2 = this.f107 ^ i;
        this.f107 = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC2911 interfaceC2911 = this.f132;
        if (interfaceC2911 != null) {
            C3016 c3016 = (C3016) interfaceC2911;
            c3016.f11591 = !z2;
            if (z || !z2) {
                if (c3016.f11594) {
                    c3016.f11594 = false;
                    c3016.m7458(true);
                }
            } else if (!c3016.f11594) {
                c3016.f11594 = true;
                c3016.m7458(true);
            }
        }
        if ((i2 & 256) == 0 || this.f132 == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f109 = i;
        InterfaceC2911 interfaceC2911 = this.f132;
        if (interfaceC2911 != null) {
            ((C3016) interfaceC2911).f11598 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m126();
        this.f121.setTranslationY(-Math.max(0, Math.min(i, this.f121.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC2911 interfaceC2911) {
        this.f132 = interfaceC2911;
        if (getWindowToken() != null) {
            ((C3016) this.f132).f11598 = this.f109;
            int i = this.f107;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                AbstractC4362.m9944(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f113 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f120) {
            this.f120 = z;
            if (z) {
                return;
            }
            m126();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m125();
        C2885 c2885 = (C2885) this.f110;
        c2885.f11183 = i != 0 ? ٴˎ.ˏᵢ(c2885.f11179.getContext(), i) : null;
        c2885.m7209();
    }

    public void setIcon(Drawable drawable) {
        m125();
        C2885 c2885 = (C2885) this.f110;
        c2885.f11183 = drawable;
        c2885.m7209();
    }

    public void setLogo(int i) {
        m125();
        C2885 c2885 = (C2885) this.f110;
        c2885.f11171 = i != 0 ? ٴˎ.ˏᵢ(c2885.f11179.getContext(), i) : null;
        c2885.m7209();
    }

    public void setOverlayMode(boolean z) {
        this.f131 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p222.InterfaceC2946
    public void setWindowCallback(Window.Callback callback) {
        m125();
        ((C2885) this.f110).f11175 = callback;
    }

    @Override // p222.InterfaceC2946
    public void setWindowTitle(CharSequence charSequence) {
        m125();
        C2885 c2885 = (C2885) this.f110;
        if (c2885.f11181) {
            return;
        }
        c2885.f11177 = charSequence;
        if ((c2885.f11170 & 8) != 0) {
            Toolbar toolbar = c2885.f11179;
            toolbar.setTitle(charSequence);
            if (c2885.f11181) {
                AbstractC4345.m9890(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo121(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo122(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m123(int i) {
        m125();
        if (i == 2) {
            ((C2885) this.f110).getClass();
        } else if (i == 5) {
            ((C2885) this.f110).getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m124(MenuC3643 menuC3643, InterfaceC3660 interfaceC3660) {
        m125();
        C2885 c2885 = (C2885) this.f110;
        C2908 c2908 = c2885.f11174;
        Toolbar toolbar = c2885.f11179;
        if (c2908 == null) {
            c2885.f11174 = new C2908(toolbar.getContext());
        }
        C2908 c29082 = c2885.f11174;
        c29082.f11265 = interfaceC3660;
        if (menuC3643 == null && toolbar.f235 == null) {
            return;
        }
        toolbar.m157();
        MenuC3643 menuC36432 = toolbar.f235.f139;
        if (menuC36432 == menuC3643) {
            return;
        }
        if (menuC36432 != null) {
            menuC36432.m8589(toolbar.f238);
            menuC36432.m8589(toolbar.f224);
        }
        if (toolbar.f224 == null) {
            toolbar.f224 = new C2881(toolbar);
        }
        c29082.f11279 = true;
        if (menuC3643 != null) {
            menuC3643.m8585(c29082, toolbar.f236);
            menuC3643.m8585(toolbar.f224, toolbar.f236);
        } else {
            c29082.mo7195(toolbar.f236, null);
            toolbar.f224.mo7195(toolbar.f236, null);
            c29082.mo7200();
            toolbar.f224.mo7200();
        }
        toolbar.f235.setPopupTheme(toolbar.f249);
        toolbar.f235.setPresenter(c29082);
        toolbar.f238 = c29082;
        toolbar.m149();
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m125() {
        InterfaceC2942 wrapper;
        if (this.f116 == null) {
            this.f116 = (ContentFrameLayout) findViewById(R.id._2_res_0x7f0b003c);
            this.f121 = (ActionBarContainer) findViewById(R.id._2_res_0x7f0b003d);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id._2_res_0x7f0b003b);
            if (callbackFindViewById instanceof InterfaceC2942) {
                wrapper = (InterfaceC2942) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f110 = wrapper;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m126() {
        removeCallbacks(this.f108);
        removeCallbacks(this.f111);
        ViewPropertyAnimator viewPropertyAnimator = this.f114;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo127(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo128(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo129(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p378.InterfaceC4355
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo130(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo122(view, i, i2, i3, i4, i5);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m131(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f105);
        this.f122 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f128 = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f112 = new OverScroller(context);
    }
}
