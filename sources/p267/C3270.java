package p267;

import j$.util.Objects;
import p016.AbstractC1079;
import p447.AbstractC5179;

/* renamed from: ـˎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3270 extends AbstractC1079 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f12738;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3279 f12739;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f12740;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3279 f12741;

    public C3270(int i, int i2, C3279 c3279, C3279 c32792) {
        this.f12738 = i;
        this.f12740 = i2;
        this.f12741 = c3279;
        this.f12739 = c32792;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3270)) {
            return false;
        }
        C3270 c3270 = (C3270) obj;
        return c3270.f12738 == this.f12738 && c3270.m8070() == m8070() && c3270.f12741 == this.f12741 && c3270.f12739 == this.f12739;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12738), Integer.valueOf(this.f12740), this.f12741, this.f12739);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f12741);
        sb.append(", hashType: ");
        sb.append(this.f12739);
        sb.append(", ");
        sb.append(this.f12740);
        sb.append("-byte tags, and ");
        return AbstractC5179.m11550(sb, this.f12738, "-byte key)");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m8070() {
        C3279 c3279 = C3279.f12762;
        int i = this.f12740;
        C3279 c32792 = this.f12741;
        if (c32792 == c3279) {
            return i;
        }
        if (c32792 != C3279.f12759 && c32792 != C3279.f12760 && c32792 != C3279.f12767) {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }
}
