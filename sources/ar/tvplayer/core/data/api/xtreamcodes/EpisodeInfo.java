package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.ForceToString;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpisodeInfo {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2064;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2065;

    public EpisodeInfo(@ForceToString @InterfaceC5065(name = "releasedate") String str, @InterfaceC5065(name = "movie_image") String str2) {
        this.f2065 = str;
        this.f2064 = str2;
    }

    public final EpisodeInfo copy(@ForceToString @InterfaceC5065(name = "releasedate") String str, @InterfaceC5065(name = "movie_image") String str2) {
        return new EpisodeInfo(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeInfo)) {
            return false;
        }
        EpisodeInfo episodeInfo = (EpisodeInfo) obj;
        return AbstractC1549.m5138(this.f2065, episodeInfo.f2065) && AbstractC1549.m5138(this.f2064, episodeInfo.f2064);
    }

    public final int hashCode() {
        String str = this.f2065;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2064;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeInfo(releaseDate=");
        sb.append(this.f2065);
        sb.append(", image=");
        return ˉᵎ.ˑי(sb, this.f2064, ')');
    }
}
