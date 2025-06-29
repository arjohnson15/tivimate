package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class SeasonsResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final SeasonsResponseJs f1931;

    public SeasonsResponse(@InterfaceC5065(name = "js") SeasonsResponseJs seasonsResponseJs) {
        this.f1931 = seasonsResponseJs;
    }

    public final SeasonsResponse copy(@InterfaceC5065(name = "js") SeasonsResponseJs seasonsResponseJs) {
        return new SeasonsResponse(seasonsResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeasonsResponse) && AbstractC1549.m5138(this.f1931, ((SeasonsResponse) obj).f1931);
    }

    public final int hashCode() {
        return this.f1931.hashCode();
    }

    public final String toString() {
        return "SeasonsResponse(js=" + this.f1931 + ')';
    }
}
