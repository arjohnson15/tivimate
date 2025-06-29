package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p315.AbstractC3608;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC3608 {
    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // p315.AbstractC3608
    /* renamed from: ʽᐧ */
    public abstract void mo2802(View view);

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public final boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList arrayListM181 = coordinatorLayout.m181(view);
            int size = arrayListM181.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo2802(view);
            }
        }
        return false;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ﹳﹳ */
    public final boolean mo2805(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }
}
