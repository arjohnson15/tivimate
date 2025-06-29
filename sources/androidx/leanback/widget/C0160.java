package androidx.leanback.widget;

import android.animation.ValueAnimator;
import p357.C4052;

/* renamed from: androidx.leanback.widget.ˎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C0160 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f1111;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f1112;

    public /* synthetic */ C0160(int i, Object obj) {
        this.f1112 = i;
        this.f1111 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f1111;
        switch (this.f1112) {
            case 0:
                int i = SearchOrbView.f931;
                SearchOrbView searchOrbView = (SearchOrbView) obj;
                searchOrbView.getClass();
                searchOrbView.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                int i2 = SearchOrbView.f931;
                SearchOrbView searchOrbView2 = (SearchOrbView) obj;
                searchOrbView2.getClass();
                searchOrbView2.setSearchOrbZ(valueAnimator.getAnimatedFraction());
                break;
            default:
                C4052 c4052 = (C4052) obj;
                c4052.getClass();
                c4052.f15685.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
