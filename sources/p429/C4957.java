package p429;

import p070.AbstractC1549;
import p447.AbstractC5179;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶˎ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4957 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18743;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f18744;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18745;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f18746;

    public C4957(String str, String str2, int i, long j) {
        this.f18745 = str;
        this.f18743 = str2;
        this.f18744 = i;
        this.f18746 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4957)) {
            return false;
        }
        C4957 c4957 = (C4957) obj;
        return AbstractC1549.m5138(this.f18745, c4957.f18745) && AbstractC1549.m5138(this.f18743, c4957.f18743) && this.f18744 == c4957.f18744 && this.f18746 == c4957.f18746;
    }

    public final int hashCode() {
        int i = (ᵎˏ.ˏʾ(this.f18745.hashCode() * 31, 31, this.f18743) + this.f18744) * 31;
        long j = this.f18746;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.f18745);
        sb.append(", firstSessionId=");
        sb.append(this.f18743);
        sb.append(", sessionIndex=");
        sb.append(this.f18744);
        sb.append(", sessionStartTimestampUs=");
        return AbstractC5179.m11554(sb, this.f18746, ')');
    }
}
