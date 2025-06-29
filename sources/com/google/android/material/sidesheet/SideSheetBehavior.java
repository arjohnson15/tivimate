package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p120.C1865;
import p204.C2772;
import p239.AbstractC3098;
import p290.C3409;
import p290.C3410;
import p290.C3411;
import p315.AbstractC3608;
import p315.C3610;
import p361.C4087;
import p361.C4089;
import p361.C4097;
import p361.C4105;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p447.AbstractC5179;
import p448.C5184;
import ˆٴ.ᵎᵢ;
import ˎˊ.ˏʾ;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC3608 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4105 f3366;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1865 f3367;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final LinkedHashSet f3368;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f3369;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f3370;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final C3409 f3371;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f3372;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final int f3373;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final float f3374;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f3375;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public int f3376;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final ColorStateList f3377;

    /* renamed from: ˑי, reason: contains not printable characters */
    public WeakReference f3378;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ˏʾ f3379;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final float f3380;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean f3381;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f3382;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public VelocityTracker f3383;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public WeakReference f3384;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f3385;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4089 f3386;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C5184 f3387;

    public SideSheetBehavior() {
        this.f3367 = new C1865(this);
        this.f3381 = true;
        this.f3376 = 5;
        this.f3374 = 0.1f;
        this.f3373 = -1;
        this.f3368 = new LinkedHashSet();
        this.f3371 = new C3409(this, 0);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f3367 = new C1865(this);
        this.f3381 = true;
        this.f3376 = 5;
        this.f3374 = 0.1f;
        this.f3373 = -1;
        this.f3368 = new LinkedHashSet();
        this.f3371 = new C3409(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11981);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3377 = ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f3386 = C4089.m9377(context, attributeSet, 0, R.style._2_res_0x7f1404e0).m9375();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f3373 = resourceId;
            WeakReference weakReference = this.f3384;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f3384 = null;
            WeakReference weakReference2 = this.f3378;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        C4089 c4089 = this.f3386;
        if (c4089 != null) {
            C4105 c4105 = new C4105(c4089);
            this.f3366 = c4105;
            c4105.m9405(context);
            ColorStateList colorStateList = this.f3377;
            if (colorStateList != null) {
                this.f3366.m9407(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3366.setTint(typedValue.data);
            }
        }
        this.f3380 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f3381 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ʿʼ */
    public final void mo2810() {
        this.f3378 = null;
        this.f3387 = null;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m2878() {
        View view;
        WeakReference weakReference = this.f3378;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC4345.m9878(view, 262144);
        AbstractC4345.m9892(view, 0);
        AbstractC4345.m9878(view, 1048576);
        AbstractC4345.m9892(view, 0);
        if (this.f3376 != 5) {
            AbstractC4345.m9888(view, C2772.f10829, new ᵎᵢ(5, 1, this));
        }
        if (this.f3376 != 3) {
            AbstractC4345.m9888(view, C2772.f10833, new ᵎᵢ(3, 1, this));
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˋⁱ */
    public final void mo2792(View view, Parcelable parcelable) {
        int i = ((C3411) parcelable).f13269;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f3376 = i;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m2879(int i) {
        View view;
        if (this.f3376 == i) {
            return;
        }
        this.f3376 = i;
        WeakReference weakReference = this.f3378;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f3376 == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f3368.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m2878();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᵢ */
    public final boolean mo2795(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˑʽ */
    public final void mo2818(C3610 c3610) {
        this.f3378 = null;
        this.f3387 = null;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ٴˎ */
    public final boolean mo2797(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C5184 c5184;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC4345.m9891(view) == null) || !this.f3381) {
            this.f3369 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f3383) != null) {
            velocityTracker.recycle();
            this.f3383 = null;
        }
        if (this.f3383 == null) {
            this.f3383 = VelocityTracker.obtain();
        }
        this.f3383.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f3385 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f3369) {
            this.f3369 = false;
            return false;
        }
        return (this.f3369 || (c5184 = this.f3387) == null || !c5184.m11575(motionEvent)) ? false : true;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public final boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int i3 = 0;
        C4105 c4105 = this.f3366;
        int i4 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3378 == null) {
            this.f3378 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f040408, 300);
            ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040d, 150);
            ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040c, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen._2_res_0x7f0701e6);
            resources.getDimension(R.dimen._2_res_0x7f0701e5);
            resources.getDimension(R.dimen._2_res_0x7f0701e7);
            if (c4105 != null) {
                view.setBackground(c4105);
                float fM9852 = this.f3380;
                if (fM9852 == -1.0f) {
                    WeakHashMap weakHashMap = AbstractC4345.f16838;
                    fM9852 = AbstractC4339.m9852(view);
                }
                c4105.m9406(fM9852);
            } else {
                ColorStateList colorStateList = this.f3377;
                if (colorStateList != null) {
                    AbstractC4345.m9879(view, colorStateList);
                }
            }
            int i5 = this.f3376 == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            m2878();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC4345.m9891(view) == null) {
                AbstractC4345.m9890(view, view.getResources().getString(R.string._2_res_0x7f1303e4));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C3610) view.getLayoutParams()).f13839, i) == 3 ? 1 : 0;
        ˏʾ r7 = this.f3379;
        if (r7 == null || r7.ˈٴ() != i6) {
            C4089 c4089 = this.f3386;
            C3610 c3610 = null;
            if (i6 == 0) {
                this.f3379 = new C3410(this, i4);
                if (c4089 != null) {
                    WeakReference weakReference = this.f3378;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C3610)) {
                        c3610 = (C3610) view3.getLayoutParams();
                    }
                    if (c3610 == null || ((ViewGroup.MarginLayoutParams) c3610).rightMargin <= 0) {
                        C4087 c4087M9381 = c4089.m9381();
                        c4087M9381.f15765 = new C4097(0.0f);
                        c4087M9381.f15766 = new C4097(0.0f);
                        C4089 c4089M9375 = c4087M9381.m9375();
                        if (c4105 != null) {
                            c4105.setShapeAppearanceModel(c4089M9375);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException(AbstractC5179.m11548(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f3379 = new C3410(this, i3);
                if (c4089 != null) {
                    WeakReference weakReference2 = this.f3378;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C3610)) {
                        c3610 = (C3610) view2.getLayoutParams();
                    }
                    if (c3610 == null || ((ViewGroup.MarginLayoutParams) c3610).leftMargin <= 0) {
                        C4087 c4087M93812 = c4089.m9381();
                        c4087M93812.f15758 = new C4097(0.0f);
                        c4087M93812.f15762 = new C4097(0.0f);
                        C4089 c4089M93752 = c4087M93812.m9375();
                        if (c4105 != null) {
                            c4105.setShapeAppearanceModel(c4089M93752);
                        }
                    }
                }
            }
        }
        if (this.f3387 == null) {
            this.f3387 = new C5184(coordinatorLayout.getContext(), coordinatorLayout, this.f3371);
        }
        int i7 = this.f3379.ﾞʽ(view);
        coordinatorLayout.m189(view, i);
        this.f3372 = coordinatorLayout.getWidth();
        this.f3382 = this.f3379.יʻ(coordinatorLayout);
        this.f3370 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f3375 = marginLayoutParams != null ? this.f3379.ٴˎ(marginLayoutParams) : 0;
        int i8 = this.f3376;
        if (i8 == 1 || i8 == 2) {
            i3 = i7 - this.f3379.ﾞʽ(view);
        } else if (i8 != 3) {
            if (i8 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f3376);
            }
            i3 = this.f3379.ʿˏ();
        }
        AbstractC4345.m9876(view, i3);
        if (this.f3384 == null && (i2 = this.f3373) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f3384 = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f3368.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᴵʿ */
    public final Parcelable mo2799(View view) {
        return new C3411(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean m2880() {
        return this.f3387 != null && (this.f3381 || this.f3376 == 1);
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᵎـ */
    public final boolean mo2800(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3376 == 1 && actionMasked == 0) {
            return true;
        }
        if (m2880()) {
            this.f3387.m11568(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f3383) != null) {
            velocityTracker.recycle();
            this.f3383 = null;
        }
        if (this.f3383 == null) {
            this.f3383 = VelocityTracker.obtain();
        }
        this.f3383.addMovement(motionEvent);
        if (m2880() && actionMasked == 2 && !this.f3369 && m2880()) {
            float fAbs = Math.abs(this.f3385 - motionEvent.getX());
            C5184 c5184 = this.f3387;
            if (fAbs > c5184.f19957) {
                c5184.m11566(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3369;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m11572(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m2879(2);
        r2.f3367.m5630(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* renamed from: ﹳˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2881(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            ˎˊ.ˏʾ r0 = r2.f3379
            int r0 = r0.ʿˏ()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = ـˈ.ˉᵎ.ˉⁱ(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            ˎˊ.ˏʾ r0 = r2.f3379
            int r0 = r0.ﹳˎ()
        L1f:
            ﾞˎ.ﹳﹳ r1 = r2.f3387
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.m11572(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f19963 = r3
            r3 = -1
            r1.f19967 = r3
            r3 = 0
            boolean r3 = r1.m11573(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f19969
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f19963
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f19963 = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.m2879(r3)
            ˈˏ.ـﹶ r3 = r2.f3367
            r3.m5630(r4)
            goto L5a
        L57:
            r2.m2879(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m2881(android.view.View, int, boolean):void");
    }
}
