package p378;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p421.C4861;

/* renamed from: ᵢٴ.ᵢٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4384 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C4369 f16891;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ View f16892;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C4369 f16893;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C4394 f16894;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ int f16895;

    public C4384(C4394 c4394, C4369 c4369, C4369 c43692, int i, View view) {
        this.f16894 = c4394;
        this.f16891 = c4369;
        this.f16893 = c43692;
        this.f16895 = i;
        this.f16892 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        C4394 c4394;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C4394 c43942 = this.f16894;
        c43942.f16922.mo9965(animatedFraction);
        float fMo9962 = c43942.f16922.mo9962();
        PathInterpolator pathInterpolator = C4382.f16888;
        int i = Build.VERSION.SDK_INT;
        C4369 c4369 = this.f16891;
        AbstractC4342 c4335 = i >= 30 ? new C4335(c4369) : i >= 29 ? new C4375(c4369) : new C4348(c4369);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f16895 & i2;
            C4331 c4331 = c4369.f16871;
            if (i3 == 0) {
                c4335.mo9846(i2, c4331.mo9839(i2));
                f = fMo9962;
                c4394 = c43942;
            } else {
                C4861 c4861Mo9839 = c4331.mo9839(i2);
                C4861 c4861Mo98392 = this.f16893.f16871.mo9839(i2);
                int i4 = (int) (((c4861Mo9839.f18366 - c4861Mo98392.f18366) * r10) + 0.5d);
                int i5 = (int) (((c4861Mo9839.f18364 - c4861Mo98392.f18364) * r10) + 0.5d);
                f = fMo9962;
                int i6 = (int) (((c4861Mo9839.f18365 - c4861Mo98392.f18365) * r10) + 0.5d);
                float f2 = (c4861Mo9839.f18367 - c4861Mo98392.f18367) * (1.0f - fMo9962);
                c4394 = c43942;
                c4335.mo9846(i2, C4369.m9949(c4861Mo9839, i4, i5, i6, (int) (f2 + 0.5d)));
            }
            i2 <<= 1;
            fMo9962 = f;
            c43942 = c4394;
        }
        C4382.m9970(this.f16892, c4335.mo9867(), Collections.singletonList(c43942));
    }
}
