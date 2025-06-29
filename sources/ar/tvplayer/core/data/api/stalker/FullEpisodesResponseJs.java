package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class FullEpisodesResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f1862;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f1863;

    public FullEpisodesResponseJs(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<FullEpisode> list) {
        this.f1863 = i;
        this.f1862 = list;
    }

    public final FullEpisodesResponseJs copy(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<FullEpisode> list) {
        return new FullEpisodesResponseJs(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullEpisodesResponseJs)) {
            return false;
        }
        FullEpisodesResponseJs fullEpisodesResponseJs = (FullEpisodesResponseJs) obj;
        return this.f1863 == fullEpisodesResponseJs.f1863 && AbstractC1549.m5138(this.f1862, fullEpisodesResponseJs.f1862);
    }

    public final int hashCode() {
        return this.f1862.hashCode() + (this.f1863 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullEpisodesResponseJs(itemCount=");
        sb.append(this.f1863);
        sb.append(", episodes=");
        return ˉᵎ.ᵎـ(sb, this.f1862, ')');
    }
}
