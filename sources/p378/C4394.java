package p378;

import android.os.Build;
import android.view.animation.Interpolator;
import p007.AbstractC0968;

/* renamed from: ᵢٴ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4394 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AbstractC4380 f16922;

    public C4394(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16922 = new C4381(AbstractC0968.m3930(i, interpolator, j));
        } else {
            this.f16922 = new C4382(i, interpolator, j);
        }
    }
}
