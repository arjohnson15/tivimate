package p061;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ʾـ.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1364 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f5531;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Interpolator f5532;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f5533;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f5534;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public boolean f5535;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f5536;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f5537;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m4739(RecyclerView recyclerView) {
        int i = this.f5537;
        if (i >= 0) {
            this.f5537 = -1;
            recyclerView.m1320(i);
            this.f5535 = false;
            return;
        }
        if (!this.f5535) {
            this.f5536 = 0;
            return;
        }
        Interpolator interpolator = this.f5532;
        if (interpolator != null && this.f5533 < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f5533;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1654.m4737(this.f5534, this.f5531, i2, interpolator);
        int i3 = this.f5536 + 1;
        this.f5536 = i3;
        if (i3 > 10) {
        }
        this.f5535 = false;
    }
}
