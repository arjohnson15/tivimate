package ar.tvplayer.core.data.api.stalker;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import p070.AbstractC1549;
import p288.C3406;
import p289.AbstractC3407;
import p317.AbstractC3616;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ˊﹶ.ˋˉ;
import ـˈ.ˉᵎ;
import ـˈ.ᵔˊ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class GetMainInfoResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1881;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final transient C3406 f1882 = new C3406(new ᵔˊ(16, this));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1883;

    public GetMainInfoResponseJs(@InterfaceC5065(name = "end_date") String str, @InterfaceC5065(name = "phone") String str2) {
        this.f1883 = str;
        this.f1881 = str2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Long m1393(String str, String str2) {
        if (str == null || AbstractC3616.m8523(str) || str2 == null || AbstractC3616.m8523(str2)) {
            return null;
        }
        try {
            return Long.valueOf(LocalDate.parse(str, DateTimeFormatter.ofPattern(str2)).atStartOfDay(ZoneId.systemDefault()).toEpochSecond());
        } catch (Exception unused) {
            AbstractC3407.f13261.ᴵʼ("GetMainInfoResponse");
            ˋˉ.ˑﾞ(new Object[0]);
            return null;
        }
    }

    public final GetMainInfoResponseJs copy(@InterfaceC5065(name = "end_date") String str, @InterfaceC5065(name = "phone") String str2) {
        return new GetMainInfoResponseJs(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMainInfoResponseJs)) {
            return false;
        }
        GetMainInfoResponseJs getMainInfoResponseJs = (GetMainInfoResponseJs) obj;
        return AbstractC1549.m5138(this.f1883, getMainInfoResponseJs.f1883) && AbstractC1549.m5138(this.f1881, getMainInfoResponseJs.f1881);
    }

    public final int hashCode() {
        String str = this.f1883;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1881;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetMainInfoResponseJs(endDate=");
        sb.append(this.f1883);
        sb.append(", phone=");
        return ˉᵎ.ˑי(sb, this.f1881, ')');
    }
}
