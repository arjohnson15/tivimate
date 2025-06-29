package p122;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ˈי.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1969 extends AbstractC1910 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7520;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f7521;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7522;

    public C1969(long j, String str, String str2) {
        this.f7522 = str;
        this.f7520 = str2;
        this.f7521 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1910)) {
            return false;
        }
        AbstractC1910 abstractC1910 = (AbstractC1910) obj;
        if (this.f7522.equals(((C1969) abstractC1910).f7522)) {
            C1969 c1969 = (C1969) abstractC1910;
            if (this.f7520.equals(c1969.f7520) && this.f7521 == c1969.f7521) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f7522.hashCode() ^ 1000003) * 1000003) ^ this.f7520.hashCode()) * 1000003;
        long j = this.f7521;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f7522);
        sb.append(", code=");
        sb.append(this.f7520);
        sb.append(", address=");
        return AbstractC0002.m42(sb, this.f7521, "}");
    }
}
