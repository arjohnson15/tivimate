package p429;

import p070.AbstractC1549;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ﹶˎ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4946 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18707;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4952 f18708;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f18709;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18710;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f18711;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f18712;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f18713;

    public C4946(String str, String str2, int i, long j, C4952 c4952, String str3, String str4) {
        this.f18710 = str;
        this.f18707 = str2;
        this.f18709 = i;
        this.f18713 = j;
        this.f18708 = c4952;
        this.f18711 = str3;
        this.f18712 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4946)) {
            return false;
        }
        C4946 c4946 = (C4946) obj;
        return AbstractC1549.m5138(this.f18710, c4946.f18710) && AbstractC1549.m5138(this.f18707, c4946.f18707) && this.f18709 == c4946.f18709 && this.f18713 == c4946.f18713 && AbstractC1549.m5138(this.f18708, c4946.f18708) && AbstractC1549.m5138(this.f18711, c4946.f18711) && AbstractC1549.m5138(this.f18712, c4946.f18712);
    }

    public final int hashCode() {
        int i = (ᵎˏ.ˏʾ(this.f18710.hashCode() * 31, 31, this.f18707) + this.f18709) * 31;
        long j = this.f18713;
        return this.f18712.hashCode() + ᵎˏ.ˏʾ((this.f18708.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31, 31, this.f18711);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f18710);
        sb.append(", firstSessionId=");
        sb.append(this.f18707);
        sb.append(", sessionIndex=");
        sb.append(this.f18709);
        sb.append(", eventTimestampUs=");
        sb.append(this.f18713);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f18708);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f18711);
        sb.append(", firebaseAuthenticationToken=");
        return ˉᵎ.ˑי(sb, this.f18712, ')');
    }
}
