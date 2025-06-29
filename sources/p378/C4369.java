package p378;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import p421.C4861;

/* renamed from: ᵢٴ.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4369 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4369 f16870;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4331 f16871;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f16870 = C4340.f16828;
        } else {
            f16870 = C4331.f16816;
        }
    }

    public C4369() {
        this.f16871 = new C4331(this);
    }

    public C4369(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f16871 = new C4340(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f16871 = new C4330(this, windowInsets);
        } else if (i >= 28) {
            this.f16871 = new C4363(this, windowInsets);
        } else {
            this.f16871 = new C4349(this, windowInsets);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C4861 m9949(C4861 c4861, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c4861.f18366 - i);
        int iMax2 = Math.max(0, c4861.f18364 - i2);
        int iMax3 = Math.max(0, c4861.f18365 - i3);
        int iMax4 = Math.max(0, c4861.f18367 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c4861 : C4861.m10935(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static C4369 m9950(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C4369 c4369 = new C4369(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            C4369 c4369M9882 = AbstractC4345.m9882(view);
            C4331 c4331 = c4369.f16871;
            c4331.mo9837(c4369M9882);
            c4331.mo9841(view.getRootView());
        }
        return c4369;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4369)) {
            return false;
        }
        return Objects.equals(this.f16871, ((C4369) obj).f16871);
    }

    public final int hashCode() {
        C4331 c4331 = this.f16871;
        if (c4331 == null) {
            return 0;
        }
        return c4331.hashCode();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m9951() {
        return this.f16871.mo9832().f18366;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m9952() {
        return this.f16871.mo9832().f18365;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m9953() {
        return this.f16871.mo9832().f18367;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final WindowInsets m9954() {
        C4331 c4331 = this.f16871;
        if (c4331 instanceof AbstractC4385) {
            return ((AbstractC4385) c4331).f16902;
        }
        return null;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m9955() {
        return this.f16871.mo9832().f18364;
    }
}
