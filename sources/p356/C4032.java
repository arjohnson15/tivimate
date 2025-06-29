package p356;

import android.support.v4.media.session.AbstractC0002;
import p383.AbstractC4464;

/* renamed from: ᵔˋ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4032 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f15510;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f15511;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f15512;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f15513;

    public C4032(long j, long j2, String str) {
        this.f15511 = str == null ? "" : str;
        this.f15512 = j;
        this.f15510 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4032.class != obj.getClass()) {
            return false;
        }
        C4032 c4032 = (C4032) obj;
        return this.f15512 == c4032.f15512 && this.f15510 == c4032.f15510 && this.f15511.equals(c4032.f15511);
    }

    public final int hashCode() {
        if (this.f15513 == 0) {
            this.f15513 = this.f15511.hashCode() + ((((527 + ((int) this.f15512)) * 31) + ((int) this.f15510)) * 31);
        }
        return this.f15513;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f15511);
        sb.append(", start=");
        sb.append(this.f15512);
        sb.append(", length=");
        return AbstractC0002.m42(sb, this.f15510, ")");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4032 m9293(C4032 c4032, String str) {
        long j;
        String strM10145 = AbstractC4464.m10145(str, this.f15511);
        if (c4032 == null || !strM10145.equals(AbstractC4464.m10145(str, c4032.f15511))) {
            return null;
        }
        long j2 = c4032.f15510;
        long j3 = this.f15510;
        if (j3 != -1) {
            long j4 = this.f15512;
            if (j4 + j3 == c4032.f15512) {
                return new C4032(j4, j2 == -1 ? -1L : j3 + j2, strM10145);
            }
            j = -1;
        } else {
            j = -1;
        }
        if (j2 != j) {
            long j5 = c4032.f15512;
            if (j5 + j2 == this.f15512) {
                return new C4032(j5, j3 == -1 ? -1L : j2 + j3, strM10145);
            }
        }
        return null;
    }
}
