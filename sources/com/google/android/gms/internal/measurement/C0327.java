package com.google.android.gms.internal.measurement;

import p080.AbstractC1702;

/* renamed from: com.google.android.gms.internal.measurement.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0327 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final /* synthetic */ int f2446 = 0;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f2447;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f2448;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2449;

    static {
        C0580 c0580 = new C0580();
        c0580.f2944 = "";
        byte b = (byte) (c0580.f2945 | 1);
        c0580.f2942 = false;
        c0580.f2945 = (byte) (b | 2);
        c0580.f2943 = 1;
        c0580.m2528();
        C0580 c05802 = new C0580();
        c05802.f2944 = "";
        byte b2 = (byte) (c05802.f2945 | 1);
        c05802.f2942 = true;
        c05802.f2945 = (byte) (b2 | 2);
        c05802.f2943 = 1;
        c05802.m2528();
    }

    public C0327(String str, boolean z, int i) {
        this.f2449 = str;
        this.f2447 = z;
        this.f2448 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0327) {
            C0327 c0327 = (C0327) obj;
            if (this.f2449.equals(c0327.f2449) && this.f2447 == c0327.f2447 && AbstractC1702.m5410(this.f2448, c0327.f2448)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f2449.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (this.f2447 ? 1231 : 1237)) * 583896283) ^ AbstractC1702.m5411(this.f2448);
    }

    public final String toString() {
        int i = this.f2448;
        return "FileComplianceOptions{fileOwner=" + this.f2449 + ", hasDifferentDmaOwner=false, skipChecks=" + this.f2447 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + (i != 1 ? i != 2 ? i != 3 ? "null" : "WRITE_ONLY" : "READ_ONLY" : "READ_AND_WRITE") + "}";
    }
}
