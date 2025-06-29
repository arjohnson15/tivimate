package p429;

import java.util.ArrayList;
import p070.AbstractC1549;
import ˆʽ.ᵎˏ;

/* renamed from: ﹶˎ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4969 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f18785;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4976 f18786;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f18787;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18788;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final ArrayList f18789;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f18790;

    public C4969(String str, String str2, String str3, String str4, C4976 c4976, ArrayList arrayList) {
        this.f18788 = str;
        this.f18785 = str2;
        this.f18787 = str3;
        this.f18790 = str4;
        this.f18786 = c4976;
        this.f18789 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4969)) {
            return false;
        }
        C4969 c4969 = (C4969) obj;
        return this.f18788.equals(c4969.f18788) && AbstractC1549.m5138(this.f18785, c4969.f18785) && AbstractC1549.m5138(this.f18787, c4969.f18787) && this.f18790.equals(c4969.f18790) && this.f18786.equals(c4969.f18786) && this.f18789.equals(c4969.f18789);
    }

    public final int hashCode() {
        return this.f18789.hashCode() + ((this.f18786.hashCode() + ᵎˏ.ˏʾ(ᵎˏ.ˏʾ(ᵎˏ.ˏʾ(this.f18788.hashCode() * 31, 31, this.f18785), 31, this.f18787), 31, this.f18790)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f18788 + ", versionName=" + this.f18785 + ", appBuildVersion=" + this.f18787 + ", deviceManufacturer=" + this.f18790 + ", currentProcessDetails=" + this.f18786 + ", appProcessDetails=" + this.f18789 + ')';
    }
}
