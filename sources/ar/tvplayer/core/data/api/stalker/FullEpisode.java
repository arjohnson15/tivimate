package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.ForceToInt;
import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class FullEpisode {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f1854;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f1855;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1856;

    public FullEpisode(@InterfaceC5065(name = "id") String str, @ForceToInt @InterfaceC5065(name = "series_number") Integer num, @InterfaceC5065(name = "series") List<Integer> list) {
        this.f1856 = str;
        this.f1854 = num;
        this.f1855 = list;
    }

    public final FullEpisode copy(@InterfaceC5065(name = "id") String str, @ForceToInt @InterfaceC5065(name = "series_number") Integer num, @InterfaceC5065(name = "series") List<Integer> list) {
        return new FullEpisode(str, num, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullEpisode)) {
            return false;
        }
        FullEpisode fullEpisode = (FullEpisode) obj;
        return AbstractC1549.m5138(this.f1856, fullEpisode.f1856) && AbstractC1549.m5138(this.f1854, fullEpisode.f1854) && AbstractC1549.m5138(this.f1855, fullEpisode.f1855);
    }

    public final int hashCode() {
        int iHashCode = this.f1856.hashCode() * 31;
        Integer num = this.f1854;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f1855;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullEpisode(id=");
        sb.append(this.f1856);
        sb.append(", number=");
        sb.append(this.f1854);
        sb.append(", episodeNumbers=");
        return ˉᵎ.ᵎـ(sb, this.f1855, ')');
    }
}
