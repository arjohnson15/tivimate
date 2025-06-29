package p356;

import p383.AbstractC4470;

/* renamed from: ᵔˋ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4042 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f15551;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f15552;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f15553;

    public C4042(String str, String str2, String str3) {
        this.f15553 = str;
        this.f15551 = str2;
        this.f15552 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4042.class != obj.getClass()) {
            return false;
        }
        C4042 c4042 = (C4042) obj;
        return AbstractC4470.m10194(this.f15553, c4042.f15553) && AbstractC4470.m10194(this.f15551, c4042.f15551) && AbstractC4470.m10194(this.f15552, c4042.f15552);
    }

    public final int hashCode() {
        int iHashCode = this.f15553.hashCode() * 31;
        String str = this.f15551;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15552;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
