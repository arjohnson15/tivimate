package p267;

import j$.util.Objects;
import p016.AbstractC1079;
import p447.AbstractC5179;

/* renamed from: ـˎ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3266 extends AbstractC1079 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12729;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12730;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3279 f12731;

    public C3266(int i, int i2, C3279 c3279) {
        this.f12729 = i;
        this.f12730 = i2;
        this.f12731 = c3279;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3266)) {
            return false;
        }
        C3266 c3266 = (C3266) obj;
        return c3266.f12729 == this.f12729 && c3266.m8064() == m8064() && c3266.f12731 == this.f12731;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12729), Integer.valueOf(this.f12730), this.f12731);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f12731);
        sb.append(", ");
        sb.append(this.f12730);
        sb.append("-byte tags, and ");
        return AbstractC5179.m11550(sb, this.f12729, "-byte key)");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m8064() {
        C3279 c3279 = C3279.f12765;
        int i = this.f12730;
        C3279 c32792 = this.f12731;
        if (c32792 == c3279) {
            return i;
        }
        if (c32792 != C3279.f12764 && c32792 != C3279.f12768 && c32792 != C3279.f12757) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }
}
