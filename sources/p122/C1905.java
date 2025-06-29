package p122;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ˈי.ʻﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1905 extends AbstractC1975 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f7227;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f7228;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1919 f7229;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f7230;

    public C1905(C1919 c1919, String str, String str2, long j) {
        this.f7229 = c1919;
        this.f7227 = str;
        this.f7228 = str2;
        this.f7230 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1975)) {
            return false;
        }
        C1905 c1905 = (C1905) ((AbstractC1975) obj);
        if (this.f7229.equals(c1905.f7229)) {
            if (this.f7227.equals(c1905.f7227) && this.f7228.equals(c1905.f7228) && this.f7230 == c1905.f7230) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f7229.hashCode() ^ 1000003) * 1000003) ^ this.f7227.hashCode()) * 1000003) ^ this.f7228.hashCode()) * 1000003;
        long j = this.f7230;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f7229);
        sb.append(", parameterKey=");
        sb.append(this.f7227);
        sb.append(", parameterValue=");
        sb.append(this.f7228);
        sb.append(", templateVersion=");
        return AbstractC0002.m42(sb, this.f7230, "}");
    }
}
