package p123;

import android.util.Base64;
import java.util.Arrays;
import p183.EnumC2533;
import p266.C3262;

/* renamed from: ˈـ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1995 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] f7592;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final EnumC2533 f7593;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f7594;

    public C1995(String str, byte[] bArr, EnumC2533 enumC2533) {
        this.f7594 = str;
        this.f7592 = bArr;
        this.f7593 = enumC2533;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3262 m5645() {
        C3262 c3262 = new C3262();
        c3262.f12725 = EnumC2533.f10073;
        return c3262;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1995)) {
            return false;
        }
        C1995 c1995 = (C1995) obj;
        return this.f7594.equals(c1995.f7594) && Arrays.equals(this.f7592, c1995.f7592) && this.f7593.equals(c1995.f7593);
    }

    public final int hashCode() {
        return ((((this.f7594.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7592)) * 1000003) ^ this.f7593.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f7592;
        return "TransportContext(" + this.f7594 + ", " + this.f7593 + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1995 m5646(EnumC2533 enumC2533) {
        C3262 c3262M5645 = m5645();
        c3262M5645.m8036(this.f7594);
        if (enumC2533 == null) {
            throw new NullPointerException("Null priority");
        }
        c3262M5645.f12725 = enumC2533;
        c3262M5645.f12724 = this.f7592;
        return c3262M5645.m8038();
    }
}
