package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p239.AbstractC3098;
import p315.AbstractC3608;
import p315.C3610;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC3608 {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3098.f11971);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˑʽ */
    public final void mo2818(C3610 c3610) {
        if (c3610.f13838 == 0) {
            c3610.f13838 = 80;
        }
    }

    @Override // p315.AbstractC3608
    /* renamed from: ـﹶ */
    public final boolean mo2877(View view) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public final boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ﹳﹳ */
    public final boolean mo2805(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }
}
