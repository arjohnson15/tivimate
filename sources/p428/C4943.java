package p428;

import p070.AbstractC1549;
import ـˈ.ˉᵎ;

/* renamed from: ﹶˊ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4943 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18700;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18701;

    public C4943(String str, String str2) {
        this.f18701 = str;
        this.f18700 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4943)) {
            return false;
        }
        C4943 c4943 = (C4943) obj;
        return AbstractC1549.m5138(this.f18701, c4943.f18701) && AbstractC1549.m5138(this.f18700, c4943.f18700);
    }

    public final int hashCode() {
        String str = this.f18701;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18700;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f18701);
        sb.append(", authToken=");
        return ˉᵎ.ˑי(sb, this.f18700, ')');
    }
}
