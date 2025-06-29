package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class FullEpisodesResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final FullEpisodesResponseJs f1861;

    public FullEpisodesResponse(@InterfaceC5065(name = "js") FullEpisodesResponseJs fullEpisodesResponseJs) {
        this.f1861 = fullEpisodesResponseJs;
    }

    public final FullEpisodesResponse copy(@InterfaceC5065(name = "js") FullEpisodesResponseJs fullEpisodesResponseJs) {
        return new FullEpisodesResponse(fullEpisodesResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FullEpisodesResponse) && AbstractC1549.m5138(this.f1861, ((FullEpisodesResponse) obj).f1861);
    }

    public final int hashCode() {
        return this.f1861.hashCode();
    }

    public final String toString() {
        return "FullEpisodesResponse(js=" + this.f1861 + ')';
    }
}
