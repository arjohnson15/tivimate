package ar.tvplayer.core.data.api.xtreamcodes;

import ar.tvplayer.core.util.annotation.SingleToArray;
import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodInfo {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final MovieData f2156;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f2157;

    public VodInfo(@SingleToArray @InterfaceC5065(name = "info") List<VodInfoData> list, @InterfaceC5065(name = "movie_data") MovieData movieData) {
        this.f2157 = list;
        this.f2156 = movieData;
    }

    public final VodInfo copy(@SingleToArray @InterfaceC5065(name = "info") List<VodInfoData> list, @InterfaceC5065(name = "movie_data") MovieData movieData) {
        return new VodInfo(list, movieData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodInfo)) {
            return false;
        }
        VodInfo vodInfo = (VodInfo) obj;
        return AbstractC1549.m5138(this.f2157, vodInfo.f2157) && AbstractC1549.m5138(this.f2156, vodInfo.f2156);
    }

    public final int hashCode() {
        return this.f2156.hashCode() + (this.f2157.hashCode() * 31);
    }

    public final String toString() {
        return "VodInfo(info=" + this.f2157 + ", movieData=" + this.f2156 + ')';
    }
}
