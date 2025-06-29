package p369;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: ᵢʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4182 extends AbstractC4186 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f16131;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f16132;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f16133;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f16134;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f16135;

    public C4182(long j, String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f16131 = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f16133 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f16135 = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f16132 = str4;
        this.f16134 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4186)) {
            return false;
        }
        AbstractC4186 abstractC4186 = (AbstractC4186) obj;
        if (this.f16131.equals(((C4182) abstractC4186).f16131)) {
            C4182 c4182 = (C4182) abstractC4186;
            if (this.f16133.equals(c4182.f16133) && this.f16135.equals(c4182.f16135) && this.f16132.equals(c4182.f16132) && this.f16134 == c4182.f16134) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f16131.hashCode() ^ 1000003) * 1000003) ^ this.f16133.hashCode()) * 1000003) ^ this.f16135.hashCode()) * 1000003) ^ this.f16132.hashCode()) * 1000003;
        long j = this.f16134;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f16131);
        sb.append(", parameterKey=");
        sb.append(this.f16133);
        sb.append(", parameterValue=");
        sb.append(this.f16135);
        sb.append(", variantId=");
        sb.append(this.f16132);
        sb.append(", templateVersion=");
        return AbstractC0002.m42(sb, this.f16134, "}");
    }
}
