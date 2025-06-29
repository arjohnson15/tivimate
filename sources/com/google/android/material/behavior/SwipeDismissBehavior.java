package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p204.C2772;
import p247.C3118;
import p315.AbstractC3608;
import p378.AbstractC4345;
import p448.C5184;
import ˏᵢ.ᵢٴ;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC3608 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f3133;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f3135;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C5184 f3136;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f3139 = 2;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public float f3134 = 0.0f;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public float f3137 = 0.5f;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final C3118 f3138 = new C3118(this);

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean mo2807(View view) {
        return true;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ٴˎ */
    public boolean mo2797(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM185 = this.f3133;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM185 = coordinatorLayout.m185(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3133 = zM185;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3133 = false;
        }
        if (!zM185) {
            return false;
        }
        if (this.f3136 == null) {
            this.f3136 = new C5184(coordinatorLayout.getContext(), coordinatorLayout, this.f3138);
        }
        return !this.f3135 && this.f3136.m11575(motionEvent);
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public final boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC4345.m9878(view, 1048576);
            AbstractC4345.m9892(view, 0);
            if (mo2807(view)) {
                AbstractC4345.m9888(view, C2772.f10829, new ᵢٴ(1, this));
            }
        }
        return false;
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᵎـ */
    public final boolean mo2800(View view, MotionEvent motionEvent) {
        if (this.f3136 == null) {
            return false;
        }
        if (this.f3135 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3136.m11568(motionEvent);
        return true;
    }
}
