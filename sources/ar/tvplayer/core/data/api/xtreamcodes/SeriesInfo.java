package ar.tvplayer.core.data.api.xtreamcodes;

import java.util.List;
import java.util.Map;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ʼˈ.ـﹶ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class SeriesInfo {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Map f2107;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final transient C3406 f2108 = new C3406(new ـﹶ(9, this));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SeriesInfoData f2109;

    public SeriesInfo(@InterfaceC5065(name = "info") SeriesInfoData seriesInfoData, @EpisodesMap @InterfaceC5065(name = "episodes") Map<String, ? extends List<Episode>> map) {
        this.f2109 = seriesInfoData;
        this.f2107 = map;
    }

    public final SeriesInfo copy(@InterfaceC5065(name = "info") SeriesInfoData seriesInfoData, @EpisodesMap @InterfaceC5065(name = "episodes") Map<String, ? extends List<Episode>> map) {
        return new SeriesInfo(seriesInfoData, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesInfo)) {
            return false;
        }
        SeriesInfo seriesInfo = (SeriesInfo) obj;
        return AbstractC1549.m5138(this.f2109, seriesInfo.f2109) && AbstractC1549.m5138(this.f2107, seriesInfo.f2107);
    }

    public final int hashCode() {
        int iHashCode = this.f2109.hashCode() * 31;
        Map map = this.f2107;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "SeriesInfo(info=" + this.f2109 + ", episodesMap=" + this.f2107 + ')';
    }
}
