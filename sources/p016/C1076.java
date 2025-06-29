package p016;

import j$.util.Objects;
import p447.AbstractC5179;

/* renamed from: ʻᐧ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1076 extends AbstractC1079 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f4640;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1071 f4641;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f4642;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f4643;

    public C1076(int i, int i2, int i3, C1071 c1071) {
        this.f4640 = i;
        this.f4642 = i2;
        this.f4643 = i3;
        this.f4641 = c1071;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1076)) {
            return false;
        }
        C1076 c1076 = (C1076) obj;
        return c1076.f4640 == this.f4640 && c1076.f4642 == this.f4642 && c1076.f4643 == this.f4643 && c1076.f4641 == this.f4641;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4640), Integer.valueOf(this.f4642), Integer.valueOf(this.f4643), this.f4641);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f4641);
        sb.append(", ");
        sb.append(this.f4642);
        sb.append("-byte IV, ");
        sb.append(this.f4643);
        sb.append("-byte tag, and ");
        return AbstractC5179.m11550(sb, this.f4640, "-byte key)");
    }
}
