package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpgInfoResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EpgInfoResponseJs f1826;

    public EpgInfoResponse(@InterfaceC5065(name = "js") EpgInfoResponseJs epgInfoResponseJs) {
        this.f1826 = epgInfoResponseJs;
    }

    public final EpgInfoResponse copy(@InterfaceC5065(name = "js") EpgInfoResponseJs epgInfoResponseJs) {
        return new EpgInfoResponse(epgInfoResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpgInfoResponse) && AbstractC1549.m5138(this.f1826, ((EpgInfoResponse) obj).f1826);
    }

    public final int hashCode() {
        return this.f1826.f1827.hashCode();
    }

    public final String toString() {
        return "EpgInfoResponse(js=" + this.f1826 + ')';
    }
}
