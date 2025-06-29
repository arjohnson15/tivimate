package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.ForceToInt;
import ar.tvplayer.core.util.annotation.SingleToArray;
import java.util.List;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ʾʾ.ᴵʿ;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodInfoData {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f2158;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final String f2159;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final String f2160;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String f2164;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2165;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2166;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String f2167;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final String f2168;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f2169;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final List f2170;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final transient C3406 f2163 = new C3406(new ᴵʿ(this, 0));

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final transient C3406 f2161 = new C3406(new ᴵʿ(this, 1));

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final transient C3406 f2162 = new C3406(new ᴵʿ(this, 2));

    public VodInfoData(@InterfaceC5065(name = "releasedate") String str, @ForceToInt @InterfaceC5065(name = "duration_secs") Integer num, @InterfaceC5065(name = "youtube_trailer") String str2, @InterfaceC5065(name = "director") String str3, @InterfaceC5065(name = "cast") String str4, @InterfaceC5065(name = "plot") String str5, @InterfaceC5065(name = "description") String str6, @InterfaceC5065(name = "genre") String str7, @SingleToArray @InterfaceC5065(name = "backdrop_path") List<String> list, @InterfaceC5065(name = "backdrop") String str8) {
        this.f2166 = str;
        this.f2158 = num;
        this.f2165 = str2;
        this.f2169 = str3;
        this.f2159 = str4;
        this.f2167 = str5;
        this.f2168 = str6;
        this.f2164 = str7;
        this.f2170 = list;
        this.f2160 = str8;
    }

    public final VodInfoData copy(@InterfaceC5065(name = "releasedate") String str, @ForceToInt @InterfaceC5065(name = "duration_secs") Integer num, @InterfaceC5065(name = "youtube_trailer") String str2, @InterfaceC5065(name = "director") String str3, @InterfaceC5065(name = "cast") String str4, @InterfaceC5065(name = "plot") String str5, @InterfaceC5065(name = "description") String str6, @InterfaceC5065(name = "genre") String str7, @SingleToArray @InterfaceC5065(name = "backdrop_path") List<String> list, @InterfaceC5065(name = "backdrop") String str8) {
        return new VodInfoData(str, num, str2, str3, str4, str5, str6, str7, list, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodInfoData)) {
            return false;
        }
        VodInfoData vodInfoData = (VodInfoData) obj;
        return AbstractC1549.m5138(this.f2166, vodInfoData.f2166) && AbstractC1549.m5138(this.f2158, vodInfoData.f2158) && AbstractC1549.m5138(this.f2165, vodInfoData.f2165) && AbstractC1549.m5138(this.f2169, vodInfoData.f2169) && AbstractC1549.m5138(this.f2159, vodInfoData.f2159) && AbstractC1549.m5138(this.f2167, vodInfoData.f2167) && AbstractC1549.m5138(this.f2168, vodInfoData.f2168) && AbstractC1549.m5138(this.f2164, vodInfoData.f2164) && AbstractC1549.m5138(this.f2170, vodInfoData.f2170) && AbstractC1549.m5138(this.f2160, vodInfoData.f2160);
    }

    public final int hashCode() {
        String str = this.f2166;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f2158;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f2165;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2169;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2159;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2167;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2168;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2164;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f2170;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f2160;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VodInfoData(releaseDate=");
        sb.append(this.f2166);
        sb.append(", durationSec=");
        sb.append(this.f2158);
        sb.append(", youtubeTrailer=");
        sb.append(this.f2165);
        sb.append(", director=");
        sb.append(this.f2169);
        sb.append(", cast=");
        sb.append(this.f2159);
        sb.append(", plot=");
        sb.append(this.f2167);
        sb.append(", description=");
        sb.append(this.f2168);
        sb.append(", genre=");
        sb.append(this.f2164);
        sb.append(", backdropPaths=");
        sb.append(this.f2170);
        sb.append(", backdrop=");
        return ˉᵎ.ˑי(sb, this.f2160, ')');
    }
}
