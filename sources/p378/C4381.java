package p378;

import android.view.WindowInsetsAnimation;

/* renamed from: ᵢٴ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4381 extends AbstractC4380 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final WindowInsetsAnimation f16887;

    public C4381(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f16887 = windowInsetsAnimation;
    }

    @Override // p378.AbstractC4380
    /* renamed from: ʽᐧ */
    public final float mo9962() {
        return this.f16887.getInterpolatedFraction();
    }

    @Override // p378.AbstractC4380
    /* renamed from: ˑʽ */
    public final int mo9963() {
        return this.f16887.getTypeMask();
    }

    @Override // p378.AbstractC4380
    /* renamed from: ـﹶ */
    public final long mo9964() {
        return this.f16887.getDurationMillis();
    }

    @Override // p378.AbstractC4380
    /* renamed from: ﹳﹳ */
    public final void mo9965(float f) {
        this.f16887.setFraction(f);
    }
}
