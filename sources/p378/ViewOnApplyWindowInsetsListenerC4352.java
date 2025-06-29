package p378;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import p029.RunnableC1181;
import p139.C2137;
import p331.C3759;
import p421.C4861;

/* renamed from: ᵢٴ.ˎᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC4352 implements View.OnApplyWindowInsetsListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C4369 f16857;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4389 f16858;

    public ViewOnApplyWindowInsetsListenerC4352(View view, C4389 c4389) {
        C4369 c4369Mo9867;
        this.f16858 = c4389;
        C4369 c4369M9882 = AbstractC4345.m9882(view);
        if (c4369M9882 != null) {
            int i = Build.VERSION.SDK_INT;
            c4369Mo9867 = (i >= 30 ? new C4335(c4369M9882) : i >= 29 ? new C4375(c4369M9882) : new C4348(c4369M9882)).mo9867();
        } else {
            c4369Mo9867 = null;
        }
        this.f16857 = c4369Mo9867;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C4331 c4331;
        if (!view.isLaidOut()) {
            this.f16857 = C4369.m9950(view, windowInsets);
            return C4382.m9971(view, windowInsets);
        }
        C4369 c4369M9950 = C4369.m9950(view, windowInsets);
        if (this.f16857 == null) {
            this.f16857 = AbstractC4345.m9882(view);
        }
        if (this.f16857 == null) {
            this.f16857 = c4369M9950;
            return C4382.m9971(view, windowInsets);
        }
        C4389 c4389M9967 = C4382.m9967(view);
        if (c4389M9967 != null && Objects.equals((WindowInsets) c4389M9967.f16910, windowInsets)) {
            return C4382.m9971(view, windowInsets);
        }
        C4369 c4369 = this.f16857;
        int i = 0;
        int i2 = 1;
        while (true) {
            c4331 = c4369M9950.f16871;
            if (i2 > 256) {
                break;
            }
            if (!c4331.mo9839(i2).equals(c4369.f16871.mo9839(i2))) {
                i |= i2;
            }
            i2 <<= 1;
        }
        if (i == 0) {
            return C4382.m9971(view, windowInsets);
        }
        C4369 c43692 = this.f16857;
        C4394 c4394 = new C4394(i, (i & 8) != 0 ? c4331.mo9839(8).f18367 > c43692.f16871.mo9839(8).f18367 ? C4382.f16888 : C4382.f16889 : C4382.f16890, 160L);
        c4394.f16922.mo9965(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c4394.f16922.mo9964());
        C4861 c4861Mo9839 = c4331.mo9839(i);
        C4861 c4861Mo98392 = c43692.f16871.mo9839(i);
        int iMin = Math.min(c4861Mo9839.f18366, c4861Mo98392.f18366);
        int i3 = c4861Mo9839.f18364;
        int i4 = c4861Mo98392.f18364;
        int iMin2 = Math.min(i3, i4);
        int i5 = c4861Mo9839.f18365;
        int i6 = c4861Mo98392.f18365;
        int iMin3 = Math.min(i5, i6);
        int i7 = c4861Mo9839.f18367;
        int i8 = i;
        int i9 = c4861Mo98392.f18367;
        C3759 c3759 = new C3759(C4861.m10935(iMin, iMin2, iMin3, Math.min(i7, i9)), 16, C4861.m10935(Math.max(c4861Mo9839.f18366, c4861Mo98392.f18366), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C4382.m9969(view, windowInsets, false);
        duration.addUpdateListener(new C4384(c4394, c4369M9950, c43692, i8, view));
        duration.addListener(new C2137(c4394, view, 2));
        ViewTreeObserverOnPreDrawListenerC4351.m9908(view, new RunnableC1181(view, c4394, c3759, duration));
        this.f16857 = c4369M9950;
        return C4382.m9971(view, windowInsets);
    }
}
