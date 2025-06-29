package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.SingleToArray;
import java.util.List;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ʾʾ.ˉי;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class SeriesInfoData {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2110;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f2111;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final transient C3406 f2112 = new C3406(new ˉי(this, 0));

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final transient C3406 f2113 = new C3406(new ˉי(this, 1));

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final List f2114;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2115;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2116;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f2117;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f2118;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f2119;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String f2120;

    public SeriesInfoData(@InterfaceC5065(name = "releaseDate") String str, @InterfaceC5065(name = "youtube_trailer") String str2, @InterfaceC5065(name = "director") String str3, @InterfaceC5065(name = "cast") String str4, @InterfaceC5065(name = "plot") String str5, @InterfaceC5065(name = "description") String str6, @InterfaceC5065(name = "genre") String str7, @SingleToArray @InterfaceC5065(name = "backdrop_path") List<String> list, @InterfaceC5065(name = "backdrop") String str8) {
        this.f2116 = str;
        this.f2110 = str2;
        this.f2115 = str3;
        this.f2119 = str4;
        this.f2111 = str5;
        this.f2117 = str6;
        this.f2118 = str7;
        this.f2114 = list;
        this.f2120 = str8;
    }

    public final SeriesInfoData copy(@InterfaceC5065(name = "releaseDate") String str, @InterfaceC5065(name = "youtube_trailer") String str2, @InterfaceC5065(name = "director") String str3, @InterfaceC5065(name = "cast") String str4, @InterfaceC5065(name = "plot") String str5, @InterfaceC5065(name = "description") String str6, @InterfaceC5065(name = "genre") String str7, @SingleToArray @InterfaceC5065(name = "backdrop_path") List<String> list, @InterfaceC5065(name = "backdrop") String str8) {
        return new SeriesInfoData(str, str2, str3, str4, str5, str6, str7, list, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesInfoData)) {
            return false;
        }
        SeriesInfoData seriesInfoData = (SeriesInfoData) obj;
        return AbstractC1549.m5138(this.f2116, seriesInfoData.f2116) && AbstractC1549.m5138(this.f2110, seriesInfoData.f2110) && AbstractC1549.m5138(this.f2115, seriesInfoData.f2115) && AbstractC1549.m5138(this.f2119, seriesInfoData.f2119) && AbstractC1549.m5138(this.f2111, seriesInfoData.f2111) && AbstractC1549.m5138(this.f2117, seriesInfoData.f2117) && AbstractC1549.m5138(this.f2118, seriesInfoData.f2118) && AbstractC1549.m5138(this.f2114, seriesInfoData.f2114) && AbstractC1549.m5138(this.f2120, seriesInfoData.f2120);
    }

    public final int hashCode() {
        String str = this.f2116;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2110;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2115;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2119;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2111;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2117;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2118;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f2114;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f2120;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeriesInfoData(releaseDate=");
        sb.append(this.f2116);
        sb.append(", youtubeTrailer=");
        sb.append(this.f2110);
        sb.append(", director=");
        sb.append(this.f2115);
        sb.append(", cast=");
        sb.append(this.f2119);
        sb.append(", plot=");
        sb.append(this.f2111);
        sb.append(", description=");
        sb.append(this.f2117);
        sb.append(", genre=");
        sb.append(this.f2118);
        sb.append(", backdropPaths=");
        sb.append(this.f2114);
        sb.append(", backdrop=");
        return ˉᵎ.ˑי(sb, this.f2120, ')');
    }
}
