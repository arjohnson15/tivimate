package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p033.C1212;
import p124.AbstractC2011;
import p200.C2755;
import p240.C3100;
import p259.ViewTreeObserverOnPreDrawListenerC3213;
import p315.AbstractC3608;
import p315.AbstractC3609;
import p315.C3606;
import p315.C3610;
import p315.InterfaceC3605;
import p315.ViewGroupOnHierarchyChangeListenerC3607;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4369;
import p378.InterfaceC4355;
import p378.InterfaceC4374;
import ʽᵔ.ʽⁱ;
import ˆˑ.ﹳﹳ;
import ˊﹶ.ˋˉ;
import ﹶˋ.ـﹶ;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC4374, InterfaceC4355 {

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public static final ThreadLocal f276;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public static final ʽⁱ f277;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public static final C3100 f278;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final String f279;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public static final Class[] f280;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public ˋˉ f281;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public ViewTreeObserverOnPreDrawListenerC3213 f282;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ـﹶ f283;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final int[] f284;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f285;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final ArrayList f286;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public Drawable f287;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C4369 f288;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f289;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final int[] f290;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ArrayList f291;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ArrayList f292;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public View f293;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final C1212 f294;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f295;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final int[] f296;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f297;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f298;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public View f299;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f279 = r0 != null ? r0.getName() : null;
        f277 = new ʽⁱ(17);
        f280 = new Class[]{Context.class, AttributeSet.class};
        f276 = new ThreadLocal();
        f278 = new C3100(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr._2_res_0x7f040197);
        this.f292 = new ArrayList();
        this.f283 = new ـﹶ(9);
        this.f286 = new ArrayList();
        this.f291 = new ArrayList();
        this.f284 = new int[2];
        this.f296 = new int[2];
        this.f294 = new C1212();
        int[] iArr = AbstractC2011.f7653;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr._2_res_0x7f040197, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr._2_res_0x7f040197, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f290 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f290[i] = (int) (r2[i] * f);
            }
        }
        this.f287 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m192();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC3607(this));
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m176(View view, int i) {
        C3610 c3610 = (C3610) view.getLayoutParams();
        int i2 = c3610.f13845;
        if (i2 != i) {
            AbstractC4345.m9876(view, i - i2);
            c3610.f13845 = i;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m177(int i, Rect rect, Rect rect2, C3610 c3610, int i2, int i3) {
        int i4 = c3610.f13839;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c3610.f13844;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m178(View view, int i) {
        C3610 c3610 = (C3610) view.getLayoutParams();
        int i2 = c3610.f13833;
        if (i2 != i) {
            AbstractC4345.m9880(view, i - i2);
            c3610.f13833 = i;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static Rect m179() {
        Rect rect = (Rect) f278.mo5419();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static C3610 m180(View view) {
        C3610 c3610 = (C3610) view.getLayoutParams();
        if (!c3610.f13831) {
            InterfaceC3605 interfaceC3605 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC3605 = (InterfaceC3605) superclass.getAnnotation(InterfaceC3605.class);
                if (interfaceC3605 != null) {
                    break;
                }
            }
            if (interfaceC3605 != null) {
                try {
                    AbstractC3608 abstractC3608 = (AbstractC3608) interfaceC3605.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC3608 abstractC36082 = c3610.f13840;
                    if (abstractC36082 != abstractC3608) {
                        if (abstractC36082 != null) {
                            abstractC36082.mo2810();
                        }
                        c3610.f13840 = abstractC3608;
                        c3610.f13831 = true;
                        if (abstractC3608 != null) {
                            abstractC3608.mo2818(c3610);
                        }
                    }
                } catch (Exception e) {
                    String str = "Default behavior class " + interfaceC3605.value().getName() + " could not be instantiated. Did you forget a default constructor?";
                }
            }
            c3610.f13831 = true;
        }
        return c3610;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3610) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC3608 abstractC3608 = ((C3610) view.getLayoutParams()).f13840;
        if (abstractC3608 != null) {
            abstractC3608.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f287;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3610();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3610(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3610 ? new C3610((C3610) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3610((ViewGroup.MarginLayoutParams) layoutParams) : new C3610(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m188();
        return DesugarCollections.unmodifiableList(this.f292);
    }

    public final C4369 getLastWindowInsets() {
        return this.f288;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1212 c1212 = this.f294;
        return c1212.f4959 | c1212.f4960;
    }

    public Drawable getStatusBarBackground() {
        return this.f287;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m190(false);
        if (this.f289) {
            if (this.f282 == null) {
                this.f282 = new ViewTreeObserverOnPreDrawListenerC3213(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f282);
        }
        if (this.f288 == null) {
            WeakHashMap weakHashMap = AbstractC4345.f16838;
            if (getFitsSystemWindows()) {
                AbstractC4362.m9944(this);
            }
        }
        this.f285 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m190(false);
        if (this.f289 && this.f282 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f282);
        }
        View view = this.f299;
        if (view != null) {
            mo121(view, 0);
        }
        this.f285 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f297 || this.f287 == null) {
            return;
        }
        C4369 c4369 = this.f288;
        int iM9955 = c4369 != null ? c4369.m9955() : 0;
        if (iM9955 > 0) {
            this.f287.setBounds(0, 0, getWidth(), iM9955);
            this.f287.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m190(true);
        }
        boolean zM183 = m183(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m190(true);
        }
        return zM183;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC3608 abstractC3608;
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f292;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC3608 = ((C3610) view.getLayoutParams()).f13840) == null || !abstractC3608.mo2798(this, view, layoutDirection))) {
                m189(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C3610 c3610 = (C3610) childAt.getLayoutParams();
                if (c3610.m8505(0)) {
                    AbstractC3608 abstractC3608 = c3610.f13840;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC3608 abstractC3608;
        int childCount = getChildCount();
        boolean zMo2827 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C3610 c3610 = (C3610) childAt.getLayoutParams();
                if (c3610.m8505(0) && (abstractC3608 = c3610.f13840) != null) {
                    zMo2827 |= abstractC3608.mo2827(view);
                }
            }
        }
        return zMo2827;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo127(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo122(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo128(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C3606)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3606 c3606 = (C3606) parcelable;
        super.onRestoreInstanceState(c3606.f15438);
        SparseArray sparseArray = c3606.f13827;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3608 abstractC3608 = m180(childAt).f13840;
            if (id != -1 && abstractC3608 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC3608.mo2792(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo2799;
        C3606 c3606 = new C3606(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC3608 abstractC3608 = ((C3610) childAt.getLayoutParams()).f13840;
            if (id != -1 && abstractC3608 != null && (parcelableMo2799 = abstractC3608.mo2799(childAt)) != null) {
                sparseArray.append(id, parcelableMo2799);
            }
        }
        c3606.f13827 = sparseArray;
        return c3606;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo129(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo121(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f293
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.m183(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2a
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.f293
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            ᐧⁱ.ﹳﹳ r6 = (p315.C3610) r6
            ᐧⁱ.ـﹶ r6 = r6.f13840
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f293
            boolean r6 = r6.mo2800(r7, r1)
        L2a:
            android.view.View r7 = r0.f293
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m190(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC3608 abstractC3608 = ((C3610) view.getLayoutParams()).f13840;
        if (abstractC3608 != null) {
            abstractC3608.mo2803(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f298) {
            return;
        }
        m190(false);
        this.f298 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m192();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f295 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f287;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f287 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f287.setState(getDrawableState());
                }
                Drawable drawable3 = this.f287;
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                ﹳﹳ.ˈٴ(drawable3, getLayoutDirection());
                this.f287.setVisible(getVisibility() == 0, false);
                this.f287.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC4345.f16838;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f287;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f287.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f287;
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ʽᐧ */
    public final void mo121(View view, int i) {
        C1212 c1212 = this.f294;
        if (i == 1) {
            c1212.f4959 = 0;
        } else {
            c1212.f4960 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C3610 c3610 = (C3610) childAt.getLayoutParams();
            if (c3610.m8505(i)) {
                AbstractC3608 abstractC3608 = c3610.f13840;
                if (abstractC3608 != null) {
                    abstractC3608.mo2796(childAt, view, i);
                }
                if (i == 0) {
                    c3610.f13835 = false;
                } else if (i == 1) {
                    c3610.f13843 = false;
                }
            }
        }
        this.f299 = null;
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ʿʼ */
    public final void mo122(View view, int i, int i2, int i3, int i4, int i5) {
        mo130(view, i, i2, i3, i4, 0, this.f296);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ArrayList m181(View view) {
        C2755 c2755 = (C2755) this.f283.ᐧˋ;
        int i = c2755.f10778;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c2755.m7016(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2755.m7021(i2));
            }
        }
        ArrayList arrayList3 = this.f291;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m182(int i) {
        int[] iArr = this.f290;
        if (iArr == null) {
            String str = "No keylines defined for " + this + " - attempted index lookup " + i;
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        String str2 = "Keyline index " + i + " out of range for " + this;
        return 0;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final boolean m183(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f286;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ʽⁱ r5 = f277;
        if (r5 != null) {
            Collections.sort(arrayList, r5);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo2797 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC3608 abstractC3608 = ((C3610) view.getLayoutParams()).f13840;
            if (zMo2797 && actionMasked != 0) {
                if (abstractC3608 != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        abstractC3608.mo2797(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC3608.mo2800(view, motionEventObtain);
                    }
                }
            } else if (!zMo2797 && abstractC3608 != null) {
                if (i == 0) {
                    zMo2797 = abstractC3608.mo2797(this, view, motionEvent);
                } else if (i == 1) {
                    zMo2797 = abstractC3608.mo2800(view, motionEvent);
                }
                if (zMo2797) {
                    this.f293 = view;
                }
            }
        }
        arrayList.clear();
        return zMo2797;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m184(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC3609.f13830;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC3609.f13830;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC3609.m8504(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC3609.f13829;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean m185(View view, int i, int i2) {
        C3100 c3100 = f278;
        Rect rectM179 = m179();
        m184(view, rectM179);
        try {
            return rectM179.contains(i, i2);
        } finally {
            rectM179.setEmpty();
            c3100.mo5418(rectM179);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m186(C3610 c3610, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c3610).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c3610).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c3610).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c3610).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ˑʽ */
    public final void mo127(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC3608 abstractC3608;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C3610 c3610 = (C3610) childAt.getLayoutParams();
                if (c3610.m8505(i3) && (abstractC3608 = c3610.f13840) != null) {
                    int[] iArr2 = this.f284;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3608.mo2791(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m187(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004b A[EDGE_INSN: B:134:0x004b->B:10:0x004b BREAK  A[LOOP:2: B:122:0x02d7->B:127:0x02ee], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* renamed from: ˑי, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m187(int r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m187(int):void");
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ـﹶ */
    public final void mo128(View view, View view2, int i, int i2) {
        C1212 c1212 = this.f294;
        if (i2 == 1) {
            c1212.f4959 = i;
        } else {
            c1212.f4960 = i;
        }
        this.f299 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C3610) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // p378.InterfaceC4374
    /* renamed from: ٴˎ */
    public final boolean mo129(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C3610 c3610 = (C3610) childAt.getLayoutParams();
                AbstractC3608 abstractC3608 = c3610.f13840;
                if (abstractC3608 != null) {
                    boolean zMo2794 = abstractC3608.mo2794(childAt, i, i2);
                    z |= zMo2794;
                    if (i2 == 0) {
                        c3610.f13835 = zMo2794;
                    } else if (i2 == 1) {
                        c3610.f13843 = zMo2794;
                    }
                } else if (i2 == 0) {
                    c3610.f13835 = false;
                } else if (i2 == 1) {
                    c3610.f13843 = false;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m188() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m188():void");
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m189(View view, int i) {
        Rect rectM179;
        Rect rectM1792;
        C3610 c3610 = (C3610) view.getLayoutParams();
        View view2 = c3610.f13836;
        if (view2 == null && c3610.f13841 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C3100 c3100 = f278;
        if (view2 != null) {
            rectM179 = m179();
            rectM1792 = m179();
            try {
                m184(view2, rectM179);
                C3610 c36102 = (C3610) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m177(i, rectM179, rectM1792, c36102, measuredWidth, measuredHeight);
                m186(c36102, rectM1792, measuredWidth, measuredHeight);
                view.layout(rectM1792.left, rectM1792.top, rectM1792.right, rectM1792.bottom);
                return;
            } finally {
                rectM179.setEmpty();
                c3100.mo5418(rectM179);
                rectM1792.setEmpty();
                c3100.mo5418(rectM1792);
            }
        }
        int i2 = c3610.f13832;
        if (i2 < 0) {
            C3610 c36103 = (C3610) view.getLayoutParams();
            rectM179 = m179();
            rectM179.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c36103).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c36103).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c36103).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c36103).bottomMargin);
            if (this.f288 != null) {
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectM179.left = this.f288.m9951() + rectM179.left;
                    rectM179.top = this.f288.m9955() + rectM179.top;
                    rectM179.right -= this.f288.m9952();
                    rectM179.bottom -= this.f288.m9953();
                }
            }
            rectM1792 = m179();
            int i3 = c36103.f13839;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM179, rectM1792, i);
            view.layout(rectM1792.left, rectM1792.top, rectM1792.right, rectM1792.bottom);
            return;
        }
        C3610 c36104 = (C3610) view.getLayoutParams();
        int i4 = c36104.f13839;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iM182 = m182(i2) - measuredWidth2;
        if (i5 == 1) {
            iM182 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iM182 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c36104).leftMargin, Math.min(iM182, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c36104).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c36104).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c36104).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final void m190(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC3608 abstractC3608 = ((C3610) childAt.getLayoutParams()).f13840;
            if (abstractC3608 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC3608.mo2797(this, childAt, motionEventObtain);
                } else {
                    abstractC3608.mo2800(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C3610) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f293 = null;
        this.f298 = false;
    }

    @Override // p378.InterfaceC4355
    /* renamed from: ﹳﹳ */
    public final void mo130(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC3608 abstractC3608;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C3610 c3610 = (C3610) childAt.getLayoutParams();
                if (c3610.m8505(i5) && (abstractC3608 = c3610.f13840) != null) {
                    int[] iArr2 = this.f284;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC3608.mo2793(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m187(1);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m191(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m184(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void m192() {
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (!getFitsSystemWindows()) {
            AbstractC4339.m9855(this, null);
            return;
        }
        if (this.f281 == null) {
            this.f281 = new ˋˉ(21, this);
        }
        AbstractC4339.m9855(this, this.f281);
        setSystemUiVisibility(1280);
    }
}
