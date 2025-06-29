package p016;

import j$.util.Objects;
import p447.AbstractC5179;

/* renamed from: ʻᐧ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1077 extends AbstractC1079 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f4644;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1071 f4645;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f4646;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f4647;

    public C1077(int i, int i2, int i3, C1071 c1071) {
        this.f4644 = i;
        this.f4646 = i2;
        this.f4647 = i3;
        this.f4645 = c1071;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1077)) {
            return false;
        }
        C1077 c1077 = (C1077) obj;
        return c1077.f4644 == this.f4644 && c1077.f4646 == this.f4646 && c1077.f4647 == this.f4647 && c1077.f4645 == this.f4645;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4644), Integer.valueOf(this.f4646), Integer.valueOf(this.f4647), this.f4645);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f4645);
        sb.append(", ");
        sb.append(this.f4646);
        sb.append("-byte IV, ");
        sb.append(this.f4647);
        sb.append("-byte tag, and ");
        return AbstractC5179.m11550(sb, this.f4644, "-byte key)");
    }
}
