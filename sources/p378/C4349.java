package p378;

import android.view.WindowInsets;
import p421.C4861;

/* renamed from: ᵢٴ.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4349 extends AbstractC4385 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public C4861 f16853;

    public C4349(C4369 c4369, WindowInsets windowInsets) {
        super(c4369, windowInsets);
        this.f16853 = null;
    }

    @Override // p378.C4331
    /* renamed from: ʽᐧ */
    public C4369 mo9830() {
        return C4369.m9950(null, this.f16902.consumeStableInsets());
    }

    @Override // p378.C4331
    /* renamed from: ˋⁱ */
    public boolean mo9833() {
        return this.f16902.isConsumed();
    }

    @Override // p378.C4331
    /* renamed from: ˏᵢ */
    public final C4861 mo9835() {
        if (this.f16853 == null) {
            WindowInsets windowInsets = this.f16902;
            this.f16853 = C4861.m10935(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f16853;
    }

    @Override // p378.C4331
    /* renamed from: ˑʽ */
    public C4369 mo9836() {
        return C4369.m9950(null, this.f16902.consumeSystemWindowInsets());
    }

    @Override // p378.C4331
    /* renamed from: ᵎـ */
    public void mo9828(C4861 c4861) {
        this.f16853 = c4861;
    }
}
