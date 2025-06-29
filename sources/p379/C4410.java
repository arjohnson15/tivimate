package p379;

import p070.AbstractC1549;
import p317.AbstractC3625;
import p366.C4155;
import ٴᐧ.ᐧⁱ;

/* renamed from: ᵢᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4410 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4155 f16996;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f16997;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4155 f16998;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C4155 f16994 = ᐧⁱ.ᵎـ(":");

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C4155 f16990 = ᐧⁱ.ᵎـ(":status");

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C4155 f16992 = ᐧⁱ.ᵎـ(":method");

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final C4155 f16993 = ᐧⁱ.ᵎـ(":path");

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static final C4155 f16991 = ᐧⁱ.ᵎـ(":scheme");

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final C4155 f16995 = ᐧⁱ.ᵎـ(":authority");

    public C4410(String str, String str2) {
        C4155 c4155 = new C4155(str.getBytes(AbstractC3625.f13869));
        c4155.f16069 = str;
        C4155 c41552 = new C4155(str2.getBytes(AbstractC3625.f13869));
        c41552.f16069 = str2;
        this(c4155, c41552);
    }

    public C4410(C4155 c4155, String str) {
        C4155 c41552 = new C4155(str.getBytes(AbstractC3625.f13869));
        c41552.f16069 = str;
        this(c4155, c41552);
    }

    public C4410(C4155 c4155, C4155 c41552) {
        this.f16998 = c4155;
        this.f16996 = c41552;
        this.f16997 = c41552.mo9566() + c4155.mo9566() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4410)) {
            return false;
        }
        C4410 c4410 = (C4410) obj;
        return AbstractC1549.m5138(this.f16998, c4410.f16998) && AbstractC1549.m5138(this.f16996, c4410.f16996);
    }

    public final int hashCode() {
        return this.f16996.hashCode() + (this.f16998.hashCode() * 31);
    }

    public final String toString() {
        return this.f16998.m9564() + ": " + this.f16996.m9564();
    }
}
