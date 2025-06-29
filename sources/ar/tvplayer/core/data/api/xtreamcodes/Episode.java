package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.ForceToInt;
import ar.tvplayer.core.util.annotation.SingleToArray;
import ar.tvplayer.core.util.annotation.TrimmedString;
import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Episode {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2059;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final List f2060;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f2061;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Integer f2062;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String f2063;

    public Episode(@ForceToInt @InterfaceC5065(name = "id") Integer num, @TrimmedString @InterfaceC5065(name = "title") String str, @InterfaceC5065(name = "season") String str2, @InterfaceC5065(name = "container_extension") String str3, @SingleToArray @InterfaceC5065(name = "info") List<EpisodeInfo> list) {
        this.f2062 = num;
        this.f2059 = str;
        this.f2061 = str2;
        this.f2063 = str3;
        this.f2060 = list;
    }

    public final Episode copy(@ForceToInt @InterfaceC5065(name = "id") Integer num, @TrimmedString @InterfaceC5065(name = "title") String str, @InterfaceC5065(name = "season") String str2, @InterfaceC5065(name = "container_extension") String str3, @SingleToArray @InterfaceC5065(name = "info") List<EpisodeInfo> list) {
        return new Episode(num, str, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        return AbstractC1549.m5138(this.f2062, episode.f2062) && AbstractC1549.m5138(this.f2059, episode.f2059) && AbstractC1549.m5138(this.f2061, episode.f2061) && AbstractC1549.m5138(this.f2063, episode.f2063) && AbstractC1549.m5138(this.f2060, episode.f2060);
    }

    public final int hashCode() {
        Integer num = this.f2062;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f2059;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2061;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2063;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f2060;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Episode(id=");
        sb.append(this.f2062);
        sb.append(", title=");
        sb.append(this.f2059);
        sb.append(", season=");
        sb.append(this.f2061);
        sb.append(", containerExtension=");
        sb.append(this.f2063);
        sb.append(", info=");
        return ˉᵎ.ᵎـ(sb, this.f2060, ')');
    }
}
