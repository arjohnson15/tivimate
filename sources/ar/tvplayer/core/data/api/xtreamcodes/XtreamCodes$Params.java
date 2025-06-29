package ar.tvplayer.core.data.api.xtreamcodes;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p041.C1281;
import p070.AbstractC1549;
import p288.C3406;
import p435.C5054;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ʾʾ.ˑי;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class XtreamCodes$Params {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2193;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f2194;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final transient C3406 f2195;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2196;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final transient long f2197;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final transient C3406 f2198;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final transient C3406 f2199;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f2200;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final transient C3406 f2201;

    public XtreamCodes$Params(long j, @InterfaceC5065(name = "h") String str, @InterfaceC5065(name = "u") String str2, @InterfaceC5065(name = "p") String str3, @InterfaceC5065(name = "o") String str4) {
        this.f2197 = j;
        this.f2193 = str;
        this.f2196 = str2;
        this.f2200 = str3;
        this.f2194 = str4;
        this.f2198 = new C3406(new ˑי(this, 0));
        this.f2199 = new C3406(new ˑי(this, 1));
        this.f2195 = new C3406(new ˑי(this, 2));
        this.f2201 = new C3406(new ˑי(this, 3));
    }

    public /* synthetic */ XtreamCodes$Params(long j, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3, str4);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static /* synthetic */ XtreamCodes$Params m1410(XtreamCodes$Params xtreamCodes$Params, long j, String str, String str2, int i) {
        if ((i & 1) != 0) {
            j = xtreamCodes$Params.f2197;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = xtreamCodes$Params.f2196;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = xtreamCodes$Params.f2200;
        }
        return xtreamCodes$Params.copy(j2, xtreamCodes$Params.f2193, str3, str2, xtreamCodes$Params.f2194);
    }

    public final XtreamCodes$Params copy(long j, @InterfaceC5065(name = "h") String str, @InterfaceC5065(name = "u") String str2, @InterfaceC5065(name = "p") String str3, @InterfaceC5065(name = "o") String str4) {
        return new XtreamCodes$Params(j, str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamCodes$Params)) {
            return false;
        }
        XtreamCodes$Params xtreamCodes$Params = (XtreamCodes$Params) obj;
        return this.f2197 == xtreamCodes$Params.f2197 && AbstractC1549.m5138(this.f2193, xtreamCodes$Params.f2193) && AbstractC1549.m5138(this.f2196, xtreamCodes$Params.f2196) && AbstractC1549.m5138(this.f2200, xtreamCodes$Params.f2200) && AbstractC1549.m5138(this.f2194, xtreamCodes$Params.f2194);
    }

    public final int hashCode() {
        long j = this.f2197;
        return this.f2194.hashCode() + ᵎˏ.ˏʾ(ᵎˏ.ˏʾ(ᵎˏ.ˏʾ(((int) (j ^ (j >>> 32))) * 31, 31, this.f2193), 31, this.f2196), 31, this.f2200);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(playlistId=");
        sb.append(this.f2197);
        sb.append(", host=");
        sb.append(this.f2193);
        sb.append(", username=");
        sb.append(this.f2196);
        sb.append(", password=");
        sb.append(this.f2200);
        sb.append(", output=");
        return ˉᵎ.ˑי(sb, this.f2194, ')');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String m1411() {
        return (String) this.f2199.getValue();
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String m1412() {
        return "xc:".concat(new C5054(new C1281(2)).m11214(XtreamCodes$Params.class).m11159(this));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m1413() {
        return (String) this.f2198.getValue();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m1414() {
        return (String) this.f2201.getValue();
    }
}
