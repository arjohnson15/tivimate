package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p315.AbstractC3608
    /* renamed from: ʽᐧ */
    public final void mo2802(View view) {
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᵎـ */
    public final boolean mo2800(View view, MotionEvent motionEvent) {
        return false;
    }
}
