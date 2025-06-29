package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0001;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p239.AbstractC3098;
import p284.AbstractC3381;
import p315.AbstractC3608;
import p315.C3610;
import p378.AbstractC4345;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC3381 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f3118;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11956);
        this.f3118 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m2801(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo2802(View view) {
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo2803(CoordinatorLayout coordinatorLayout, View view) {
        m2801(coordinatorLayout.m181(view));
    }

    @Override // p284.AbstractC3381
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void mo2804(CoordinatorLayout coordinatorLayout, View view, int i) {
        m2801(coordinatorLayout.m181(view));
        coordinatorLayout.m189(view, i);
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᵢ */
    public final boolean mo2795(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m2801(coordinatorLayout.m181(view));
        return false;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean mo2805(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC3608 abstractC3608 = ((C3610) view2.getLayoutParams()).f13840;
        if (abstractC3608 instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC3608).getClass();
            int i = this.f3118;
            AbstractC4345.m9880(view, bottom - (i == 0 ? 0 : AbstractC0001.m26((int) (0.0f * i), 0, i)));
        }
        return false;
    }
}
