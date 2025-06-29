package p429;

import p070.AbstractC1549;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶˎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4945 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18703;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f18704;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18705;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4969 f18706;

    public C4945(String str, String str2, String str3, C4969 c4969) {
        this.f18705 = str;
        this.f18703 = str2;
        this.f18704 = str3;
        this.f18706 = c4969;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4945)) {
            return false;
        }
        C4945 c4945 = (C4945) obj;
        return AbstractC1549.m5138(this.f18705, c4945.f18705) && this.f18703.equals(c4945.f18703) && this.f18704.equals(c4945.f18704) && this.f18706.equals(c4945.f18706);
    }

    public final int hashCode() {
        return this.f18706.hashCode() + ((EnumC4958.f18747.hashCode() + ᵎˏ.ˏʾ((((this.f18703.hashCode() + (this.f18705.hashCode() * 31)) * 31) + 47594041) * 31, 31, this.f18704)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f18705 + ", deviceModel=" + this.f18703 + ", sessionSdkVersion=2.0.3, osVersion=" + this.f18704 + ", logEnvironment=" + EnumC4958.f18747 + ", androidAppInfo=" + this.f18706 + ')';
    }
}
