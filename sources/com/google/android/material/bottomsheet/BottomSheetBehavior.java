package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.lsposed.hiddenapibypass.library.R;
import p007.C0946;
import p014.C1060;
import p061.C1405;
import p120.C1865;
import p166.C2428;
import p204.C2772;
import p220.ViewOnAttachStateChangeListenerC2852;
import p222.RunnableC2949;
import p239.AbstractC3098;
import p290.C3409;
import p315.AbstractC3608;
import p315.C3610;
import p331.C3758;
import p361.C4089;
import p361.C4098;
import p361.C4105;
import p378.AbstractC4339;
import p378.AbstractC4345;
import p378.AbstractC4362;
import p378.C4329;
import p378.C4332;
import p378.C4366;
import p378.C4382;
import p378.C4389;
import p378.ViewOnApplyWindowInsetsListenerC4352;
import p413.C4711;
import p448.C5184;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;
import ﹶⁱ.ـﹶ;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC3608 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public final float f3140;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final SparseIntArray f3141;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f3142;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public boolean f3143;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f3144;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public VelocityTracker f3145;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final boolean f3146;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f3147;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final float f3148;

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final C1865 f3149;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final C3409 f3150;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final ColorStateList f3151;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public int f3152;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int f3153;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public WeakReference f3154;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public boolean f3155;

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public int f3156;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f3157;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public WeakReference f3158;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public boolean f3159;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f3160;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final boolean f3161;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public int f3162;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f3163;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean f3164;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final int f3165;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final float f3166;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final boolean f3167;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C5184 f3168;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public int f3169;

    /* renamed from: יʻ, reason: contains not printable characters */
    public final C4089 f3170;

    /* renamed from: יˋ, reason: contains not printable characters */
    public HashMap f3171;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f3172;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f3173;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f3174;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f3175;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f3176;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ValueAnimator f3177;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean f3178;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final boolean f3179;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final ArrayList f3180;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean f3181;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final boolean f3182;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public int f3183;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public int f3184;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public boolean f3185;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f3186;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public boolean f3187;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public int f3188;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final boolean f3189;

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public boolean f3190;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f3191;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final float f3192;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4105 f3193;

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final boolean f3194;

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public int f3195;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public int f3196;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final boolean f3197;

    public BottomSheetBehavior() {
        this.f3173 = 0;
        this.f3142 = true;
        this.f3163 = -1;
        this.f3153 = -1;
        this.f3149 = new C1865(this);
        this.f3148 = 0.5f;
        this.f3192 = -1.0f;
        this.f3178 = true;
        this.f3197 = true;
        this.f3169 = 4;
        this.f3140 = 0.1f;
        this.f3180 = new ArrayList();
        this.f3188 = -1;
        this.f3141 = new SparseIntArray();
        this.f3150 = new C3409(this, 1);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i2 = 2;
        this.f3173 = 0;
        this.f3142 = true;
        this.f3163 = -1;
        this.f3153 = -1;
        this.f3149 = new C1865(this);
        this.f3148 = 0.5f;
        this.f3192 = -1.0f;
        this.f3178 = true;
        this.f3197 = true;
        this.f3169 = 4;
        this.f3140 = 0.1f;
        this.f3180 = new ArrayList();
        this.f3188 = -1;
        this.f3141 = new SparseIntArray();
        this.f3150 = new C3409(this, 1);
        this.f3165 = context.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f070405);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11969);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f3151 = ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f3170 = C4089.m9377(context, attributeSet, R.attr._2_res_0x7f040092, R.style._2_res_0x7f1403fa).m9375();
        }
        C4089 c4089 = this.f3170;
        if (c4089 != null) {
            C4105 c4105 = new C4105(c4089);
            this.f3193 = c4105;
            c4105.m9405(context);
            ColorStateList colorStateList = this.f3151;
            if (colorStateList != null) {
                this.f3193.m9407(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f3193.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m2822(), 1.0f);
        this.f3177 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f3177.addUpdateListener(new C1405(i2, this));
        this.f3192 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f3163 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f3153 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            m2814(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            m2814(i);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.f3155 != z) {
            this.f3155 = z;
            if (!z && this.f3169 == 5) {
                m2821(4);
            }
            m2813();
        }
        this.f3179 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f3142 != z2) {
            this.f3142 = z2;
            if (this.f3154 != null) {
                m2817();
            }
            m2812((this.f3142 && this.f3169 == 6) ? 3 : this.f3169);
            m2823(this.f3169, true);
            m2813();
        }
        this.f3172 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f3178 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f3197 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f3173 = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f3148 = f;
        if (this.f3154 != null) {
            this.f3176 = (int) ((1.0f - f) * this.f3196);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f3147 = dimensionPixelOffset;
            m2823(this.f3169, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f3147 = i3;
            m2823(this.f3169, true);
        }
        this.f3191 = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.f3164 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f3167 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f3182 = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f3161 = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.f3181 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f3189 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f3146 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f3194 = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f3166 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static View m2808(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        if (AbstractC4339.m9866(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM2808 = m2808(viewGroup.getChildAt(i));
                if (viewM2808 != null) {
                    return viewM2808;
                }
            }
        }
        return null;
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public static int m2809(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // p315.AbstractC3608
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void mo2810() {
        this.f3154 = null;
        this.f3168 = null;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m2811(int i) {
        if (((View) this.f3154.get()) != null) {
            ArrayList arrayList = this.f3180;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f3186;
            if (i <= i2 && i2 != m2828()) {
                m2828();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            ᐧʻ.ᵎˏ(arrayList.get(0));
            throw null;
        }
    }

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final void m2812(int i) throws Resources.NotFoundException {
        if (this.f3169 == i) {
            return;
        }
        this.f3169 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.f3155;
        }
        WeakReference weakReference = this.f3154;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m2826(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m2826(false);
        }
        m2823(i, true);
        ArrayList arrayList = this.f3180;
        if (arrayList.size() <= 0) {
            m2813();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m2813() throws Resources.NotFoundException {
        View view;
        int iM7047;
        WeakReference weakReference = this.f3154;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC4345.m9878(view, 524288);
        AbstractC4345.m9892(view, 0);
        AbstractC4345.m9878(view, 262144);
        AbstractC4345.m9892(view, 0);
        AbstractC4345.m9878(view, 1048576);
        AbstractC4345.m9892(view, 0);
        SparseIntArray sparseIntArray = this.f3141;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC4345.m9878(view, i);
            AbstractC4345.m9892(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f3142 && this.f3169 != 6) {
            String string = view.getResources().getString(R.string._2_res_0x7f13002a);
            C1060 c1060 = new C1060(i, this);
            ArrayList arrayListM9875 = AbstractC4345.m9875(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM9875.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        int i5 = AbstractC4345.f16836[i4];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListM9875.size(); i6++) {
                            z &= ((C2772) arrayListM9875.get(i6)).m7047() != i5;
                        }
                        if (z) {
                            i3 = i5;
                        }
                    }
                    iM7047 = i3;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C2772) arrayListM9875.get(i2)).f10840).getLabel())) {
                        iM7047 = ((C2772) arrayListM9875.get(i2)).m7047();
                        break;
                    }
                    i2++;
                }
            }
            if (iM7047 != -1) {
                C2772 c2772 = new C2772(null, iM7047, string, c1060, null);
                View.AccessibilityDelegate accessibilityDelegateM9883 = AbstractC4345.m9883(view);
                C4332 c4332 = accessibilityDelegateM9883 == null ? null : accessibilityDelegateM9883 instanceof C4366 ? ((C4366) accessibilityDelegateM9883).f16868 : new C4332(accessibilityDelegateM9883);
                if (c4332 == null) {
                    c4332 = new C4332();
                }
                AbstractC4345.m9884(view, c4332);
                AbstractC4345.m9878(view, c2772.m7047());
                AbstractC4345.m9875(view).add(c2772);
                AbstractC4345.m9892(view, 0);
            }
            sparseIntArray.put(0, iM7047);
        }
        if (this.f3155) {
            int i7 = 5;
            if (this.f3169 != 5) {
                AbstractC4345.m9888(view, C2772.f10829, new C1060(i7, this));
            }
        }
        int i8 = this.f3169;
        int i9 = 4;
        int i10 = 3;
        if (i8 == 3) {
            AbstractC4345.m9888(view, C2772.f10837, new C1060(this.f3142 ? 4 : 6, this));
            return;
        }
        if (i8 == 4) {
            AbstractC4345.m9888(view, C2772.f10833, new C1060(this.f3142 ? 3 : 6, this));
        } else {
            if (i8 != 6) {
                return;
            }
            AbstractC4345.m9888(view, C2772.f10837, new C1060(i9, this));
            AbstractC4345.m9888(view, C2772.f10833, new C1060(i10, this));
        }
    }

    /* renamed from: ˈٴ, reason: contains not printable characters */
    public final void m2814(int i) {
        if (i == -1) {
            if (this.f3174) {
                return;
            } else {
                this.f3174 = true;
            }
        } else {
            if (!this.f3174 && this.f3144 == i) {
                return;
            }
            this.f3174 = false;
            this.f3144 = Math.max(0, i);
        }
        m2815();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˉי */
    public final void mo2791(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) throws Resources.NotFoundException {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f3158;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (!this.f3185 && !this.f3197 && view2 == view3 && view2.canScrollVertically(1)) {
                this.f3143 = true;
                return;
            }
            if (i4 < m2828()) {
                int iM2828 = top - m2828();
                iArr[1] = iM2828;
                AbstractC4345.m9880(view, -iM2828);
                m2812(3);
            } else {
                if (!this.f3178) {
                    return;
                }
                iArr[1] = i2;
                AbstractC4345.m9880(view, -i2);
                m2812(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.f3185 && !this.f3197 && view2 == view3 && zCanScrollVertically) {
                this.f3143 = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.f3186;
                if (i4 > i5 && !this.f3155) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    AbstractC4345.m9880(view, -i6);
                    m2812(4);
                } else {
                    if (!this.f3178) {
                        return;
                    }
                    iArr[1] = i2;
                    AbstractC4345.m9880(view, -i2);
                    m2812(1);
                }
            }
        }
        m2811(view.getTop());
        this.f3162 = i2;
        this.f3185 = true;
        this.f3143 = false;
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final void m2815() {
        View view;
        if (this.f3154 != null) {
            m2817();
            if (this.f3169 != 4 || (view = (View) this.f3154.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˋⁱ */
    public final void mo2792(View view, Parcelable parcelable) {
        C4711 c4711 = (C4711) parcelable;
        int i = this.f3173;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f3144 = c4711.f18082;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f3142 = c4711.f18080;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f3155 = c4711.f18083;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f3172 = c4711.f18084;
            }
        }
        int i2 = c4711.f18081;
        if (i2 == 1 || i2 == 2) {
            this.f3169 = 4;
        } else {
            this.f3169 = i2;
        }
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final boolean m2816(View view, float f) {
        if (this.f3172) {
            return true;
        }
        if (view.getTop() < this.f3186) {
            return false;
        }
        return Math.abs(((f * this.f3140) + ((float) view.getTop())) - ((float) this.f3186)) / ((float) m2824()) > 0.5f;
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m2817() {
        int iM2824 = m2824();
        if (this.f3142) {
            this.f3186 = Math.max(this.f3196 - iM2824, this.f3160);
        } else {
            this.f3186 = this.f3196 - iM2824;
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏʾ */
    public final void mo2793(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᴵ */
    public final boolean mo2794(View view, int i, int i2) {
        this.f3162 = 0;
        this.f3185 = false;
        return (i & 2) != 0;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᵢ */
    public final boolean mo2795(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m2809(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f3163, marginLayoutParams.width), m2809(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f3153, marginLayoutParams.height));
        return true;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo2818(C3610 c3610) {
        this.f3154 = null;
        this.f3168 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p315.AbstractC3608
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2796(android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.m2828()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.m2812(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f3158
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f3185
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f3162
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f3142
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f3176
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f3155
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f3145
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3166
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f3145
            int r0 = r3.f3152
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.m2816(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f3162
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f3142
            if (r2 == 0) goto L74
            int r6 = r3.f3160
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f3186
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f3176
            if (r5 >= r2) goto L83
            int r0 = r3.f3186
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3186
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f3142
            if (r5 == 0) goto L99
        L97:
            r1 = 4
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f3176
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f3186
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = 6
        Laf:
            r5 = 0
            r3.m2820(r4, r1, r5)
            r3.f3185 = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2796(android.view.View, android.view.View, int):void");
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final int m2819(int i) {
        if (i == 3) {
            return m2828();
        }
        if (i == 4) {
            return this.f3186;
        }
        if (i == 5) {
            return this.f3196;
        }
        if (i == 6) {
            return this.f3176;
        }
        throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Invalid state to get top offset: ", i));
    }

    @Override // p315.AbstractC3608
    /* renamed from: ٴˎ */
    public final boolean mo2797(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C5184 c5184;
        if (!view.isShown() || !this.f3178) {
            this.f3187 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3152 = -1;
            this.f3188 = -1;
            VelocityTracker velocityTracker = this.f3145;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3145 = null;
            }
        }
        if (this.f3145 == null) {
            this.f3145 = VelocityTracker.obtain();
        }
        this.f3145.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f3188 = (int) motionEvent.getY();
            if (this.f3169 != 2) {
                WeakReference weakReference = this.f3158;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m185(view2, x, this.f3188)) {
                    this.f3152 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f3159 = true;
                }
            }
            this.f3187 = this.f3152 == -1 && !coordinatorLayout.m185(view, x, this.f3188);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3159 = false;
            this.f3152 = -1;
            if (this.f3187) {
                this.f3187 = false;
                return false;
            }
        }
        if (!this.f3187 && (c5184 = this.f3168) != null && c5184.m11575(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f3158;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f3187 || this.f3169 == 1 || coordinatorLayout.m185(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f3168 == null || (i = this.f3188) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f3168.f19957)) ? false : true;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public final boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        int i2 = this.f3153;
        C4105 c4105 = this.f3193;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f3154 == null) {
            this.f3175 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen._2_res_0x7f07007b);
            int i3 = Build.VERSION.SDK_INT;
            boolean z = (i3 < 29 || this.f3179 || this.f3174) ? false : true;
            if (this.f3164 || this.f3167 || this.f3182 || this.f3181 || this.f3189 || this.f3146 || z) {
                C2428 c2428 = new C2428(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0946 c0946 = new C0946();
                c0946.f4158 = paddingStart;
                c0946.f4156 = paddingEnd;
                c0946.f4157 = paddingBottom;
                C3758 c3758 = new C3758(c2428, 10, c0946);
                WeakHashMap weakHashMap = AbstractC4345.f16838;
                AbstractC4339.m9855(view, c3758);
                if (view.isAttachedToWindow()) {
                    AbstractC4362.m9944(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2852());
                }
            }
            C4389 c4389 = new C4389(view);
            WeakHashMap weakHashMap2 = AbstractC4345.f16838;
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new C4329(c4389));
            } else {
                PathInterpolator pathInterpolator = C4382.f16888;
                Object tag = view.getTag(R.id._2_res_0x7f0b037a);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC4352 = new ViewOnApplyWindowInsetsListenerC4352(view, c4389);
                view.setTag(R.id._2_res_0x7f0b0382, viewOnApplyWindowInsetsListenerC4352);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC4352);
                }
            }
            this.f3154 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f040408, 300);
            ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040d, 150);
            ˎˑ.ᵎˏ(context, R.attr._2_res_0x7f04040c, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen._2_res_0x7f0701e1);
            resources.getDimension(R.dimen._2_res_0x7f0701e2);
            if (c4105 != null) {
                view.setBackground(c4105);
                float fM9852 = this.f3192;
                if (fM9852 == -1.0f) {
                    fM9852 = AbstractC4339.m9852(view);
                }
                c4105.m9406(fM9852);
            } else {
                ColorStateList colorStateList = this.f3151;
                if (colorStateList != null) {
                    AbstractC4345.m9879(view, colorStateList);
                }
            }
            m2813();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f3168 == null) {
            this.f3168 = new C5184(coordinatorLayout.getContext(), coordinatorLayout, this.f3150);
        }
        int top = view.getTop();
        coordinatorLayout.m189(view, i);
        this.f3183 = coordinatorLayout.getWidth();
        this.f3196 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f3184 = height;
        int iMin = this.f3196;
        int i4 = iMin - height;
        int i5 = this.f3195;
        if (i4 < i5) {
            if (this.f3161) {
                if (i2 != -1) {
                    iMin = Math.min(iMin, i2);
                }
                this.f3184 = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i2 != -1) {
                    iMin2 = Math.min(iMin2, i2);
                }
                this.f3184 = iMin2;
            }
        }
        this.f3160 = Math.max(0, this.f3196 - this.f3184);
        this.f3176 = (int) ((1.0f - this.f3148) * this.f3196);
        m2817();
        int i6 = this.f3169;
        if (i6 == 3) {
            AbstractC4345.m9880(view, m2828());
        } else if (i6 == 6) {
            AbstractC4345.m9880(view, this.f3176);
        } else if (this.f3155 && i6 == 5) {
            AbstractC4345.m9880(view, this.f3196);
        } else if (i6 == 4) {
            AbstractC4345.m9880(view, this.f3186);
        } else if (i6 == 1 || i6 == 2) {
            AbstractC4345.m9880(view, top - view.getTop());
        }
        m2823(this.f3169, false);
        this.f3158 = new WeakReference(m2808(view));
        ArrayList arrayList = this.f3180;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m2812(2);
        m2823(r4, true);
        r2.f3149.m5630(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m11572(r3.getLeft(), r0) != false) goto L16;
     */
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2820(android.view.View r3, int r4, boolean r5) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.m2819(r4)
            ﾞˎ.ﹳﹳ r1 = r2.f3168
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.m11572(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f19963 = r3
            r3 = -1
            r1.f19967 = r3
            r3 = 0
            boolean r3 = r1.m11573(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f19969
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f19963
            if (r5 == 0) goto L30
            r5 = 0
            r1.f19963 = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.m2812(r3)
            r3 = 1
            r2.m2823(r4, r3)
            ˈˏ.ـﹶ r3 = r2.f3149
            r3.m5630(r4)
            goto L43
        L40:
            r2.m2812(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2820(android.view.View, int, boolean):void");
    }

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final void m2821(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(ᵎˏ.ˎٴ(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f3155 && i == 5) {
            String str = "Cannot set state: " + i;
            return;
        }
        int i2 = (i == 6 && this.f3142 && m2819(i) <= this.f3160) ? 3 : i;
        WeakReference weakReference = this.f3154;
        if (weakReference == null || weakReference.get() == null) {
            m2812(i);
            return;
        }
        View view = (View) this.f3154.get();
        RunnableC2949 runnableC2949 = new RunnableC2949(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(runnableC2949);
        } else {
            runnableC2949.run();
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᴵʿ */
    public final Parcelable mo2799(View view) {
        return new C4711(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m2822() {
        /*
            r5 = this;
            ᵔᵔ.ﹶˆ r0 = r5.f3193
            r1 = 0
            if (r0 == 0) goto L89
            java.lang.ref.WeakReference r0 = r5.f3154
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L89
            java.lang.ref.WeakReference r0 = r5.f3154
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m2825()
            if (r2 == 0) goto L89
            android.view.WindowInsets r0 = p337.AbstractC3845.m9038(r0)
            if (r0 == 0) goto L89
            ᵔᵔ.ﹶˆ r2 = r5.f3193
            float[] r3 = r2.f15869
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            ᵔᵔ.ᐧʻ r3 = r2.f15848
            ᵔᵔ.ˋⁱ r3 = r3.f15817
            ᵔᵔ.ﹳﹳ r3 = r3.f15772
            android.graphics.RectF r2 = r2.m9415()
            float r2 = r3.mo9371(r2)
        L41:
            android.view.RoundedCorner r3 = p337.AbstractC3834.m8957(r0)
            if (r3 == 0) goto L56
            int r3 = p337.AbstractC3834.m8950(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            float r3 = r3 / r2
            goto L57
        L56:
            r3 = 0
        L57:
            ᵔᵔ.ﹶˆ r2 = r5.f3193
            float[] r4 = r2.f15869
            if (r4 == 0) goto L61
            r2 = 0
            r2 = r4[r2]
            goto L6f
        L61:
            ᵔᵔ.ᐧʻ r4 = r2.f15848
            ᵔᵔ.ˋⁱ r4 = r4.f15817
            ᵔᵔ.ﹳﹳ r4 = r4.f15779
            android.graphics.RectF r2 = r2.m9415()
            float r2 = r4.mo9371(r2)
        L6f:
            android.view.RoundedCorner r0 = p337.AbstractC3834.m8952(r0)
            if (r0 == 0) goto L84
            int r0 = p337.AbstractC3834.m8950(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            float r1 = r0 / r2
        L84:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m2822():float");
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᵎـ */
    public final boolean mo2800(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f3169;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C5184 c5184 = this.f3168;
        if (c5184 != null && (this.f3178 || i == 1)) {
            c5184.m11568(motionEvent);
        }
        if (actionMasked == 0) {
            this.f3152 = -1;
            this.f3188 = -1;
            VelocityTracker velocityTracker = this.f3145;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3145 = null;
            }
        }
        if (this.f3145 == null) {
            this.f3145 = VelocityTracker.obtain();
        }
        this.f3145.addMovement(motionEvent);
        if (this.f3168 != null && ((this.f3178 || this.f3169 == 1) && actionMasked == 2 && !this.f3187)) {
            float fAbs = Math.abs(this.f3188 - motionEvent.getY());
            C5184 c51842 = this.f3168;
            if (fAbs > c51842.f19957) {
                c51842.m11566(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f3187;
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void m2823(int i, boolean z) {
        C4105 c4105 = this.f3193;
        ValueAnimator valueAnimator = this.f3177;
        if (i == 2) {
            return;
        }
        boolean z2 = this.f3169 == 3 && (this.f3194 || m2825());
        if (this.f3190 == z2 || c4105 == null) {
            return;
        }
        this.f3190 = z2;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c4105.f15848.f15809, z2 ? m2822() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM2822 = this.f3190 ? m2822() : 1.0f;
        C4098 c4098 = c4105.f15848;
        if (c4098.f15809 != fM2822) {
            c4098.f15809 = fM2822;
            c4105.f15867 = true;
            c4105.f15870 = true;
            c4105.invalidateSelf();
        }
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final int m2824() {
        int i;
        return this.f3174 ? Math.min(Math.max(this.f3175, this.f3196 - ((this.f3183 * 9) / 16)), this.f3184) + this.f3156 : (this.f3179 || this.f3164 || (i = this.f3157) <= 0) ? this.f3144 + this.f3156 : Math.max(this.f3144, i + this.f3165);
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final boolean m2825() {
        WeakReference weakReference = this.f3154;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f3154.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final void m2826(boolean z) {
        WeakReference weakReference = this.f3154;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f3171 != null) {
                    return;
                } else {
                    this.f3171 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f3154.get() && z) {
                    this.f3171.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f3171 = null;
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final boolean mo2827(View view) {
        WeakReference weakReference = this.f3158;
        return (weakReference == null || view != weakReference.get() || this.f3169 == 3 || this.f3143) ? false : true;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final int m2828() {
        if (this.f3142) {
            return this.f3160;
        }
        return Math.max(this.f3147, this.f3161 ? 0 : this.f3195);
    }
}
