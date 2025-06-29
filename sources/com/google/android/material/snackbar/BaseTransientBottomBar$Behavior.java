package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p096.AbstractC1764;
import p096.C1763;
import ᵔᵔ.ٴˎ;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final ٴˎ f3388;

    public BaseTransientBottomBar$Behavior() {
        ٴˎ r0 = new ٴˎ(15);
        this.f3134 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3137 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3139 = 0;
        this.f3388 = r0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: ˎٴ */
    public final boolean mo2807(View view) {
        this.f3388.getClass();
        return view instanceof AbstractC1764;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p315.AbstractC3608
    /* renamed from: ٴˎ */
    public final boolean mo2797(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3388.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C1763.f6821 == null) {
                    C1763.f6821 = new C1763(0);
                }
                synchronized (C1763.f6821.f6822) {
                }
            }
        } else if (coordinatorLayout.m185(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C1763.f6821 == null) {
                C1763.f6821 = new C1763(0);
            }
            C1763.f6821.m5479();
        }
        return super.mo2797(coordinatorLayout, view, motionEvent);
    }
}
