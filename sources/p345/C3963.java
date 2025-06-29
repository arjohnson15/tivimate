package p345;

import j$.util.Objects;

/* renamed from: ᵎᴵ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3963 extends AbstractC3962 {
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final AbstractC3985 m9175() {
        int i = this.f15332;
        if (i == 0) {
            int i2 = AbstractC3985.f15365;
            return C3921.f15237;
        }
        if (i != 1) {
            AbstractC3985 abstractC3985M9215 = AbstractC3985.m9215(i, this.f15334);
            this.f15332 = abstractC3985M9215.size();
            this.f15333 = true;
            return abstractC3985M9215;
        }
        Object obj = this.f15334[0];
        Objects.requireNonNull(obj);
        int i3 = AbstractC3985.f15365;
        return new C3948(obj);
    }

    @Override // p345.AbstractC3962
    /* renamed from: ˑʽ */
    public final AbstractC3962 mo9168(Object obj) {
        obj.getClass();
        m9172(obj);
        return this;
    }
}
