package p284;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.C0700;
import p315.AbstractC3608;
import p378.AbstractC4345;

/* renamed from: ٴˈ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3381 extends AbstractC3608 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C0700 f13217;

    /* renamed from: ˎٴ */
    public void mo2804(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m189(view, i);
    }

    @Override // p315.AbstractC3608
    /* renamed from: ᐧʻ */
    public boolean mo2798(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo2804(coordinatorLayout, view, i);
        if (this.f13217 == null) {
            this.f13217 = new C0700(view);
        }
        C0700 c0700 = this.f13217;
        View view2 = c0700.f3332;
        c0700.f3330 = view2.getTop();
        c0700.f3331 = view2.getLeft();
        C0700 c07002 = this.f13217;
        View view3 = c07002.f3332;
        AbstractC4345.m9880(view3, 0 - (view3.getTop() - c07002.f3330));
        AbstractC4345.m9876(view3, 0 - (view3.getLeft() - c07002.f3331));
        return true;
    }
}
