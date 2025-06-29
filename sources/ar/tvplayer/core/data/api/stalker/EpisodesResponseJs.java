package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpisodesResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f1838;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f1839;

    public EpisodesResponseJs(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<Episode> list) {
        this.f1839 = i;
        this.f1838 = list;
    }

    public final EpisodesResponseJs copy(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<Episode> list) {
        return new EpisodesResponseJs(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodesResponseJs)) {
            return false;
        }
        EpisodesResponseJs episodesResponseJs = (EpisodesResponseJs) obj;
        return this.f1839 == episodesResponseJs.f1839 && AbstractC1549.m5138(this.f1838, episodesResponseJs.f1838);
    }

    public final int hashCode() {
        return this.f1838.hashCode() + (this.f1839 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodesResponseJs(itemCount=");
        sb.append(this.f1839);
        sb.append(", episodes=");
        return ˉᵎ.ᵎـ(sb, this.f1838, ')');
    }
}
