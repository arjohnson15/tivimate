package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p284.AbstractC3381;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC3381 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public boolean f3113;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public VelocityTracker f3116;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f3117;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f3115 = -1;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f3114 = -1;

    public AppBarLayout$BaseBehavior() {
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˉי, reason: contains not printable characters */
    public final /* synthetic */ void mo2791(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo2792(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo2793(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final boolean mo2794(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean mo2795(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ˑי, reason: contains not printable characters */
    public final void mo2796(View view, View view2, int i) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final boolean mo2797(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f3114 < 0) {
            this.f3114 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3113) {
            int i = this.f3115;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f3117) > this.f3114) {
                this.f3117 = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f3116;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f3115 = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p284.AbstractC3381, p315.AbstractC3608
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final Parcelable mo2799(View view) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    @Override // p315.AbstractC3608
    /* renamed from: ᵎـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2800(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L45
            r4 = 2
            if (r0 == r4) goto L2c
            r6 = 3
            if (r0 == r6) goto L49
            r6 = 6
            if (r0 == r6) goto L13
            goto L57
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            int r6 = r7.getPointerId(r2)
            r5.f3115 = r6
            float r6 = r7.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.f3117 = r6
            goto L57
        L2c:
            int r0 = r5.f3115
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L35
            return r3
        L35:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.f3117 = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L45:
            android.view.VelocityTracker r0 = r5.f3116
            if (r0 != 0) goto L61
        L49:
            r5.f3113 = r3
            r5.f3115 = r1
            android.view.VelocityTracker r6 = r5.f3116
            if (r6 == 0) goto L57
            r6.recycle()
            r6 = 0
            r5.f3116 = r6
        L57:
            android.view.VelocityTracker r6 = r5.f3116
            if (r6 == 0) goto L5e
            r6.addMovement(r7)
        L5e:
            boolean r6 = r5.f3113
            return r6
        L61:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.f3116
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.f3116
            int r0 = r5.f3115
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.mo2800(android.view.View, android.view.MotionEvent):boolean");
    }
}
