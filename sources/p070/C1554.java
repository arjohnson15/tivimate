package p070;

import p176.InterfaceC2489;
import p288.InterfaceC3402;
import ˆʽ.ᵎˏ;

/* renamed from: ʿ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1554 extends AbstractC1555 implements InterfaceC1559, InterfaceC2489, InterfaceC3402 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final int f6286;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final int f6287;

    public C1554(int i, Class cls, String str, String str2, int i2) {
        this(i, C1544.f6277, cls, str, str2, i2);
    }

    public C1554(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f6287 = i;
        this.f6286 = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1554) {
            C1554 c1554 = (C1554) obj;
            return this.f6291.equals(c1554.f6291) && this.f6289.equals(c1554.f6289) && this.f6286 == c1554.f6286 && this.f6287 == c1554.f6287 && AbstractC1549.m5138(this.f6288, c1554.f6288) && m5150().equals(c1554.m5150());
        }
        if (!(obj instanceof C1554)) {
            return false;
        }
        InterfaceC2489 interfaceC2489 = this.f6292;
        if (interfaceC2489 == null) {
            mo5147();
            this.f6292 = this;
            interfaceC2489 = this;
        }
        return obj.equals(interfaceC2489);
    }

    public final int hashCode() {
        m5150();
        return this.f6289.hashCode() + ᵎˏ.ˏʾ(m5150().hashCode() * 31, 31, this.f6291);
    }

    public final String toString() {
        InterfaceC2489 interfaceC2489 = this.f6292;
        if (interfaceC2489 == null) {
            mo5147();
            this.f6292 = this;
            interfaceC2489 = this;
        }
        if (interfaceC2489 != this) {
            return interfaceC2489.toString();
        }
        String str = this.f6291;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : ᵎˏ.ˑי("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // p070.InterfaceC1559
    /* renamed from: ˑʽ */
    public final int mo5137() {
        return this.f6287;
    }

    @Override // p070.AbstractC1555
    /* renamed from: ٴˎ */
    public final InterfaceC2489 mo5147() {
        AbstractC1563.f6304.getClass();
        return this;
    }
}
