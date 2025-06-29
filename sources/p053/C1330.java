package p053;

import ar.tvplayer.core.data.api.xtreamcodes.XtreamCodes$Params;
import java.util.ArrayList;
import java.util.List;
import p013.C1053;
import p070.AbstractC1549;
import p317.AbstractC3616;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ˑʽ;
import ᵎﹳ.ـﹶ;

/* renamed from: ʾʾ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1330 implements ـﹶ {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f5398;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final ˑʽ f5399;

    /* renamed from: ˉי, reason: contains not printable characters */
    public List f5400;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public List f5401;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int f5402;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public List f5403;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final int f5404;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public List f5405;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Long f5406;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f5407;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Integer f5408;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public List f5409;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int f5410;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Integer f5411;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public List f5412;

    public C1330(String str, String str2, Long l, Integer num, ˑʽ r5, Integer num2, List list, List list2, List list3, List list4, List list5, List list6) {
        this.f5407 = str;
        this.f5398 = str2;
        this.f5406 = l;
        this.f5411 = num;
        this.f5399 = r5;
        this.f5408 = num2;
        this.f5409 = list;
        this.f5405 = list2;
        this.f5412 = list3;
        this.f5400 = list4;
        this.f5403 = list5;
        this.f5401 = list6;
        this.f5402 = list2.size();
        this.f5410 = this.f5400.size();
        this.f5404 = this.f5401.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1330)) {
            return false;
        }
        C1330 c1330 = (C1330) obj;
        return AbstractC1549.m5138(this.f5407, c1330.f5407) && AbstractC1549.m5138(this.f5398, c1330.f5398) && AbstractC1549.m5138(this.f5406, c1330.f5406) && AbstractC1549.m5138(this.f5411, c1330.f5411) && this.f5399 == c1330.f5399 && AbstractC1549.m5138(this.f5408, c1330.f5408) && AbstractC1549.m5138(this.f5409, c1330.f5409) && AbstractC1549.m5138(this.f5405, c1330.f5405) && AbstractC1549.m5138(this.f5412, c1330.f5412) && AbstractC1549.m5138(this.f5400, c1330.f5400) && AbstractC1549.m5138(this.f5403, c1330.f5403) && AbstractC1549.m5138(this.f5401, c1330.f5401);
    }

    public final int hashCode() {
        int iHashCode = this.f5407.hashCode() * 31;
        String str = this.f5398;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f5406;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f5411;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ˑʽ r2 = this.f5399;
        return this.f5401.hashCode() + ((this.f5403.hashCode() + ((this.f5400.hashCode() + ((this.f5412.hashCode() + ((this.f5405.hashCode() + ((this.f5409.hashCode() + ((this.f5408.hashCode() + ((iHashCode4 + (r2 != null ? r2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XcPlaylist(playlistUrl=");
        sb.append(this.f5407);
        sb.append(", serverTimezone=");
        sb.append(this.f5398);
        sb.append(", expirationDate=");
        sb.append(this.f5406);
        sb.append(", maxConnections=");
        sb.append(this.f5411);
        sb.append(", catchupType=");
        sb.append(this.f5399);
        sb.append(", catchupDays=");
        sb.append(this.f5408);
        sb.append(", liveCategories=");
        sb.append(this.f5409);
        sb.append(", liveStreams=");
        sb.append(this.f5405);
        sb.append(", vodCategories=");
        sb.append(this.f5412);
        sb.append(", vodStreams=");
        sb.append(this.f5400);
        sb.append(", seriesCategories=");
        sb.append(this.f5403);
        sb.append(", series=");
        return ˉᵎ.ᵎـ(sb, this.f5401, ')');
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m4629(boolean z) {
        return ʾˈ.ˉⁱ(this, z);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4630() {
        this.f5403 = C1053.f4449;
        this.f5401 = new ArrayList();
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m4631(boolean z) {
        this.f5412 = C1053.f4449;
        this.f5400 = new ArrayList();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m4632() {
        return this.f5404;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m4633(String str) {
        String str2;
        XtreamCodes$Params xtreamCodes$Params = ᵔʼ.ˑʽ.ᵎˏ(this.f5407, 0L);
        if (xtreamCodes$Params == null || (str2 = xtreamCodes$Params.f2193) == null) {
            return "";
        }
        int iM8540 = AbstractC3616.m8540(str2, "//", 0, false, 6);
        return iM8540 != -1 ? str2.substring(iM8540 + 2) : str2;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final int m4634(boolean z) {
        return this.f5410;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4635(boolean z) {
        this.f5409 = C1053.f4449;
        this.f5405 = new ArrayList();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m4636() {
        return this.f5407;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final int m4637(boolean z) {
        return this.f5402;
    }
}
