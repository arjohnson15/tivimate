package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpisodesResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EpisodesResponseJs f1837;

    public EpisodesResponse(@InterfaceC5065(name = "js") EpisodesResponseJs episodesResponseJs) {
        this.f1837 = episodesResponseJs;
    }

    public final EpisodesResponse copy(@InterfaceC5065(name = "js") EpisodesResponseJs episodesResponseJs) {
        return new EpisodesResponse(episodesResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpisodesResponse) && AbstractC1549.m5138(this.f1837, ((EpisodesResponse) obj).f1837);
    }

    public final int hashCode() {
        return this.f1837.hashCode();
    }

    public final String toString() {
        return "EpisodesResponse(js=" + this.f1837 + ')';
    }
}
