package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lsposed.hiddenapibypass.library.R;
import p239.AbstractC3098;
import p378.AbstractC4345;
import p412.C4696;
import p412.C4700;
import p412.C4709;

/* loaded from: classes.dex */
class ClockFaceView extends AbstractC0713 implements InterfaceC0716 {

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final int f3474;

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final String[] f3475;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final C0714 f3476;

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final int f3477;

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final int[] f3478;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final RectF f3479;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final Rect f3480;

    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final int f3481;

    /* renamed from: יˋ, reason: contains not printable characters */
    public final int f3482;

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public float f3483;

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final ColorStateList f3484;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final SparseArray f3485;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final ClockHandView f3486;

    /* renamed from: ⁱʿ, reason: contains not printable characters */
    public final float[] f3487;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final Rect f3488;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3488 = new Rect();
        this.f3479 = new RectF();
        this.f3480 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3485 = sparseArray;
        this.f3487 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11978, R.attr._2_res_0x7f0403d0, R.style._2_res_0x7f14056f);
        Resources resources = getResources();
        ColorStateList colorStateList = ﹶⁱ.ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 1);
        this.f3484 = colorStateList;
        LayoutInflater.from(context).inflate(R.layout._2_res_0x7f0e00e6, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id._2_res_0x7f0b0269);
        this.f3486 = clockHandView;
        this.f3481 = resources.getDimensionPixelSize(R.dimen._2_res_0x7f070369);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.f3478 = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.f3494.add(this);
        int defaultColor = com.bumptech.glide.ﹳﹳ.ˑי(context, R.color._2_res_0x7f06035d).getDefaultColor();
        ColorStateList colorStateList2 = ﹶⁱ.ـﹶ.ﾞˊ(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0709(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f3476 = new C0714(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3475 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f3475.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f3475.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout._2_res_0x7f0e00e5, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f3475[i]);
                textView.setTag(R.id._2_res_0x7f0b0279, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id._2_res_0x7f0b026a, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                AbstractC4345.m9884(textView, this.f3476);
                textView.setTextColor(this.f3484);
            }
        }
        ClockHandView clockHandView2 = this.f3486;
        if (clockHandView2.f3491 && !z) {
            clockHandView2.f3495 = 1;
        }
        clockHandView2.f3491 = z;
        clockHandView2.invalidate();
        this.f3482 = resources.getDimensionPixelSize(R.dimen._2_res_0x7f070386);
        this.f3474 = resources.getDimensionPixelSize(R.dimen._2_res_0x7f070387);
        this.f3477 = resources.getDimensionPixelSize(R.dimen._2_res_0x7f070370);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3475.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m2914();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f3477 / Math.max(Math.max(this.f3482 / displayMetrics.heightPixels, this.f3474 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.AbstractC0713
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo2913() {
        C4696 c4696 = new C4696();
        c4696.m10615(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id._2_res_0x7f0b00c7 && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id._2_res_0x7f0b026a);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f3509 * 0.66f) : this.f3509;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = c4696.f17893;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C4700());
                }
                C4709 c4709 = ((C4700) map2.get(Integer.valueOf(id))).f17906;
                c4709.f18070 = R.id._2_res_0x7f0b00c7;
                c4709.f18021 = iRound;
                c4709.f18054 = size;
                size += 360.0f / list.size();
            }
        }
        c4696.m10617(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f3485;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m2914() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f3486.f3501;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f3485;
            int size = sparseArray.size();
            rectF = this.f3479;
            rect = this.f3488;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3480);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3478, this.f3487, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }
}
