package p378;

import android.view.WindowInsets;
import p337.AbstractC3821;
import p421.C4861;

/* renamed from: ᵢٴ.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4375 extends AbstractC4342 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final WindowInsets.Builder f16881;

    public C4375() {
        this.f16881 = AbstractC3821.m8928();
    }

    public C4375(C4369 c4369) {
        super(c4369);
        WindowInsets windowInsetsM9954 = c4369.m9954();
        this.f16881 = windowInsetsM9954 != null ? AbstractC3821.m8922(windowInsetsM9954) : AbstractC3821.m8928();
    }

    @Override // p378.AbstractC4342
    /* renamed from: ʽᐧ */
    public C4369 mo9867() {
        m9870();
        C4369 c4369M9950 = C4369.m9950(null, this.f16881.build());
        c4369M9950.f16871.mo9834(this.f16829);
        return c4369M9950;
    }

    @Override // p378.AbstractC4342
    /* renamed from: ʿʼ */
    public void mo9868(C4861 c4861) {
        this.f16881.setStableInsets(c4861.m10938());
    }

    @Override // p378.AbstractC4342
    /* renamed from: ˏᵢ */
    public void mo9869(C4861 c4861) {
        this.f16881.setTappableElementInsets(c4861.m10938());
    }

    @Override // p378.AbstractC4342
    /* renamed from: ٴˎ */
    public void mo9871(C4861 c4861) {
        this.f16881.setSystemGestureInsets(c4861.m10938());
    }

    @Override // p378.AbstractC4342
    /* renamed from: ᐧʻ */
    public void mo9872(C4861 c4861) {
        this.f16881.setSystemWindowInsets(c4861.m10938());
    }

    @Override // p378.AbstractC4342
    /* renamed from: ﹳﹳ */
    public void mo9873(C4861 c4861) {
        this.f16881.setMandatorySystemGestureInsets(c4861.m10938());
    }
}
