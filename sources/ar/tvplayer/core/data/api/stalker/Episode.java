package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.ForceToInt;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class Episode {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Integer f1832;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1833;

    public Episode(@InterfaceC5065(name = "id") String str, @ForceToInt @InterfaceC5065(name = "series_number") Integer num) {
        this.f1833 = str;
        this.f1832 = num;
    }

    public final Episode copy(@InterfaceC5065(name = "id") String str, @ForceToInt @InterfaceC5065(name = "series_number") Integer num) {
        return new Episode(str, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        return AbstractC1549.m5138(this.f1833, episode.f1833) && AbstractC1549.m5138(this.f1832, episode.f1832);
    }

    public final int hashCode() {
        int iHashCode = this.f1833.hashCode() * 31;
        Integer num = this.f1832;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Episode(id=" + this.f1833 + ", number=" + this.f1832 + ')';
    }
}
