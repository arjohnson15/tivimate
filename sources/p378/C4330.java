package p378;

import android.view.WindowInsets;
import p421.C4861;

/* renamed from: ᵢٴ.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4330 extends C4363 {

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public C4861 f16813;

    /* renamed from: ˑי, reason: contains not printable characters */
    public C4861 f16814;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public C4861 f16815;

    public C4330(C4369 c4369, WindowInsets windowInsets) {
        super(c4369, windowInsets);
        this.f16815 = null;
        this.f16813 = null;
        this.f16814 = null;
    }

    @Override // p378.AbstractC4385, p378.C4331
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public C4369 mo9825(int i, int i2, int i3, int i4) {
        return C4369.m9950(null, this.f16902.inset(i, i2, i3, i4));
    }

    @Override // p378.C4331
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public C4861 mo9826() {
        if (this.f16814 == null) {
            this.f16814 = C4861.m10936(this.f16902.getTappableElementInsets());
        }
        return this.f16814;
    }

    @Override // p378.C4331
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4861 mo9827() {
        if (this.f16813 == null) {
            this.f16813 = C4861.m10936(this.f16902.getMandatorySystemGestureInsets());
        }
        return this.f16813;
    }

    @Override // p378.C4349, p378.C4331
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void mo9828(C4861 c4861) {
    }

    @Override // p378.C4331
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C4861 mo9829() {
        if (this.f16815 == null) {
            this.f16815 = C4861.m10936(this.f16902.getSystemGestureInsets());
        }
        return this.f16815;
    }
}
