package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.leanback.widget.ﾞᐧ;
import com.google.android.material.datepicker.C0699;
import java.util.WeakHashMap;
import p004.AbstractC0929;
import p004.AbstractC0932;
import p004.C0926;
import p004.InterfaceC0930;
import p033.C1212;
import p225.C3022;
import p331.C3761;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.C4347;
import p378.C4370;
import p378.InterfaceC4355;
import p453.AbstractC5198;
import ˆˑ.ﹳﹳ;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC4355 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public int f326;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public VelocityTracker f327;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C4347 f328;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f329;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final EdgeEffect f330;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public float f331;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public int f332;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f333;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public C0926 f334;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final C4370 f335;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Rect f336;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final int f337;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public boolean f338;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f339;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f340;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final OverScroller f341;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final float f342;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public View f343;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C1212 f344;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final int[] f345;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final int[] f346;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final int f347;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final EdgeEffect f348;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final int f349;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public InterfaceC0930 f350;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public int f351;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f352;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f353;

    /* renamed from: יˋ, reason: contains not printable characters */
    public static final float f325 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final C0699 f323 = new C0699(3);

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final int[] f324 = {R.attr.fillViewport};

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040435);
        this.f336 = new Rect();
        this.f333 = true;
        this.f340 = false;
        this.f343 = null;
        this.f353 = false;
        this.f338 = true;
        this.f326 = -1;
        this.f346 = new int[2];
        this.f345 = new int[2];
        this.f335 = new C4370(getContext(), new ﾞᐧ(4, this));
        int i = Build.VERSION.SDK_INT;
        this.f330 = i >= 31 ? AbstractC0932.m3791(context, attributeSet) : new EdgeEffect(context);
        this.f348 = i >= 31 ? AbstractC0932.m3791(context, attributeSet) : new EdgeEffect(context);
        this.f342 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f341 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f349 = viewConfiguration.getScaledTouchSlop();
        this.f337 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f347 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f324, org.lsposed.hiddenapibypass.library.R.attr._2_res_0x7f040435, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f344 = new C1212();
        this.f328 = new C4347(this);
        setNestedScrollingEnabled(true);
        AbstractC4345.m9884(this, f323);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static boolean m201(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m201((View) parent, nestedScrollView);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m216(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f328.m9897(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f328.m9893(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f328.m9896(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f328.m9900(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f330;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f348;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1212 c1212 = this.f344;
        return c1212.f4959 | c1212.f4960;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f331 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f331 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f331;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f328.m9898(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f328.f16846;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f340 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f333 = false;
        View view = this.f343;
        if (view != null && m201(view, this)) {
            View view2 = this.f343;
            Rect rect = this.f336;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM209 = m209(rect);
            if (iM209 != 0) {
                scrollBy(0, iM209);
            }
        }
        this.f343 = null;
        if (!this.f340) {
            if (this.f334 != null) {
                scrollTo(getScrollX(), this.f334.f4113);
                this.f334 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f340 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f339 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m203((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f328.m9893(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f328.m9896(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m212(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo128(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m205(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0926)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0926 c0926 = (C0926) parcelable;
        super.onRestoreInstanceState(c0926.getSuperState());
        this.f334 = c0926;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0926 c0926 = new C0926(super.onSaveInstanceState());
        c0926.f4113 = getScrollY();
        return c0926;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0930 interfaceC0930 = this.f350;
        if (interfaceC0930 != null) {
            C3761 c3761 = (C3761) interfaceC0930;
            C3022.m7513(this, (View) c3761.f14527, (View) c3761.f14528);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m205(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f336;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM209 = m209(rect);
        if (iM209 != 0) {
            if (this.f338) {
                m202(0, false, iM209);
            } else {
                scrollBy(0, iM209);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo129(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo121(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f327 == null) {
            this.f327 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f352 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f352);
        C4347 c4347 = this.f328;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f348;
            EdgeEffect edgeEffect2 = this.f330;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f327;
                velocityTracker.computeCurrentVelocity(1000, this.f347);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f326);
                if (Math.abs(yVelocity) >= this.f337) {
                    if (ﹳﹳ.ˉⁱ(edgeEffect2) != 0.0f) {
                        if (m215(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            m203(-yVelocity);
                        }
                    } else if (ﹳﹳ.ˉⁱ(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (m215(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            m203(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!c4347.m9893(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            m203(i2);
                        }
                    }
                } else if (this.f341.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f326 = -1;
                this.f353 = false;
                VelocityTracker velocityTracker2 = this.f327;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f327 = null;
                }
                m217(0);
                this.f330.onRelease();
                this.f348.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f326);
                if (iFindPointerIndex == -1) {
                    String str = "Invalid pointerId=" + this.f326 + " in onTouchEvent";
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f351 - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (ﹳﹳ.ˉⁱ(edgeEffect2) != 0.0f) {
                        float f3 = -ﹳﹳ.ʿˏ(edgeEffect2, -height, x);
                        if (ﹳﹳ.ˉⁱ(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (ﹳﹳ.ˉⁱ(edgeEffect) != 0.0f) {
                        float f4 = ﹳﹳ.ʿˏ(edgeEffect, height, 1.0f - x);
                        if (ﹳﹳ.ˉⁱ(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f = f4;
                    }
                    int iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i4 = i3 - iRound;
                    if (!this.f353 && Math.abs(i4) > this.f349) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f353 = true;
                        i4 = i4 > 0 ? i4 - this.f349 : i4 + this.f349;
                    }
                    if (this.f353) {
                        int iM213 = m213(i4, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f351 = y - iM213;
                        this.f352 += iM213;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f353 && getChildCount() > 0 && this.f341.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f326 = -1;
                this.f353 = false;
                VelocityTracker velocityTracker3 = this.f327;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f327 = null;
                }
                m217(0);
                this.f330.onRelease();
                this.f348.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f351 = (int) motionEvent.getY(actionIndex);
                this.f326 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m208(motionEvent);
                this.f351 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f326));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f353 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f341.isFinished()) {
                this.f341.abortAnimation();
                m217(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f351 = y2;
            this.f326 = pointerId;
            c4347.m9899(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f327;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f333) {
            this.f343 = view2;
        } else {
            Rect rect = this.f336;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM209 = m209(rect);
            if (iM209 != 0) {
                scrollBy(0, iM209);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM209 = m209(rect);
        boolean z2 = iM209 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM209);
            } else {
                m202(0, false, iM209);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f327) != null) {
            velocityTracker.recycle();
            this.f327 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f333 = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f339) {
            this.f339 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C4347 c4347 = this.f328;
        if (c4347.f16846) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            AbstractC4339.m9860(c4347.f16844);
        }
        c4347.f16846 = z;
    }

    public void setOnScrollChangeListener(InterfaceC0930 interfaceC0930) {
        this.f350 = interfaceC0930;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f338 = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f328.m9899(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m217(0);
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ʽᐧ */
    public final void mo121(View view, int i) {
        C1212 c1212 = this.f344;
        if (i == 1) {
            c1212.f4959 = 0;
        } else {
            c1212.f4960 = 0;
        }
        m217(i);
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ʿʼ */
    public final void mo122(View view, int i, int i2, int i3, int i4, int i5) {
        m212(i4, i5, null);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m202(int i, boolean z, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f329 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f341.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                this.f328.m9899(2, 1);
            } else {
                m217(1);
            }
            this.f332 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f341.isFinished()) {
                this.f341.abortAnimation();
                m217(1);
            }
            scrollBy(i, i2);
        }
        this.f329 = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m203(int i) {
        if (getChildCount() > 0) {
            this.f341.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f328.m9899(2, 1);
            this.f332 = getScrollY();
            postInvalidateOnAnimation();
            if (AbstractC5198.m11585()) {
                AbstractC0929.m3788(this, Math.abs(this.f341.getCurrVelocity()));
            }
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final boolean m204(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f330;
        if (ﹳﹳ.ˉⁱ(edgeEffect) != 0.0f) {
            ﹳﹳ.ʿˏ(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f348;
        if (ﹳﹳ.ˉⁱ(edgeEffect2) == 0.0f) {
            return z;
        }
        ﹳﹳ.ʿˏ(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m205(View view, int i, int i2) {
        Rect rect = this.f336;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: ˎٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m206(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.m213(r2, r3, r4, r4)
            r7 = 1
        L82:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m206(int, int, int):boolean");
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m207(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f336;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m206(i, rect.top, rect.bottom);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m208(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f326) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f351 = (int) motionEvent.getY(i);
            this.f326 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f327;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int m209(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ˑʽ */
    public final void mo127(View view, int i, int i2, int[] iArr, int i3) {
        this.f328.m9896(i, i2, i3, iArr, null);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean m210(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            i2 = 0;
            z = true;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !this.f328.m9898(1)) {
            this.f341.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        return z || z2;
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ـﹶ */
    public final void mo128(View view, View view2, int i, int i2) {
        C1212 c1212 = this.f344;
        if (i2 == 1) {
            c1212.f4959 = i;
        } else {
            c1212.f4960 = i;
        }
        this.f328.m9899(2, i2);
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ٴˎ */
    public final boolean mo129(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean m211(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m205(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m213(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f336;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m213(m209(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m205(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m212(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f328.m9900(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final int m213(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        C4347 c4347 = this.f328;
        if (i3 == 1) {
            c4347.m9899(2, i3);
        }
        boolean zM9896 = this.f328.m9896(0, i, i3, this.f345, this.f346);
        int[] iArr = this.f345;
        int[] iArr2 = this.f346;
        if (zM9896) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = m210(i4, 0, scrollY, scrollRange) && !c4347.m9898(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f328.m9900(0, scrollY2, 0, i4 - scrollY2, this.f346, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f348;
        EdgeEffect edgeEffect2 = this.f330;
        if (i8 < 0) {
            if (z3) {
                ﹳﹳ.ʿˏ(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            ﹳﹳ.ʿˏ(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.f327) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m217(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m214(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f336;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m206(i, i2, i3);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean m215(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float f = ﹳﹳ.ˉⁱ(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f2 = this.f342 * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d = f325;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f2))) < f;
    }

    @Override // p378.InterfaceC4355
    /* renamed from: ﹳﹳ */
    public final void mo130(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m212(i4, i5, iArr);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean m216(KeyEvent keyEvent) {
        this.f336.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m207(33) : m211(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m207(130) : m211(130);
                }
                if (keyCode == 62) {
                    m214(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m207(33);
                }
                if (keyCode == 93) {
                    return m207(130);
                }
                if (keyCode == 122) {
                    m214(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                m214(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m217(int i) {
        this.f328.m9895(i);
    }
}
