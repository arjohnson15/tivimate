package p272;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.media3.ui.DefaultTimeBar;

/* renamed from: ـᐧ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C3322 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ DefaultTimeBar f12883;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f12884;

    public /* synthetic */ C3322(DefaultTimeBar defaultTimeBar, int i) {
        this.f12884 = i;
        this.f12883 = defaultTimeBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DefaultTimeBar defaultTimeBar = this.f12883;
        switch (this.f12884) {
            case 0:
                int i = DefaultTimeBar.f1453;
                defaultTimeBar.getClass();
                defaultTimeBar.f1467 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = defaultTimeBar.f1494;
                defaultTimeBar.f1476 = DefaultTimeBar.m1150(3, f);
                if (defaultTimeBar.isEnabled()) {
                    float fM1150 = DefaultTimeBar.m1150(3, f);
                    float fM11502 = DefaultTimeBar.m1150(6, f);
                    float f2 = (fM11502 - fM1150) * defaultTimeBar.f1467;
                    defaultTimeBar.f1476 = Math.round(defaultTimeBar.hasFocus() ? fM1150 + f2 : fM11502 - f2);
                }
                Rect rect = defaultTimeBar.f1461;
                rect.inset(0, (rect.height() - defaultTimeBar.f1476) / 2);
                defaultTimeBar.invalidate();
                break;
            default:
                int i2 = DefaultTimeBar.f1453;
                defaultTimeBar.getClass();
                defaultTimeBar.f1481 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f1484);
                break;
        }
    }
}
