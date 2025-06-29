package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpgForChannelResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EpgForChannelResponseJs f1820;

    public EpgForChannelResponse(@InterfaceC5065(name = "js") EpgForChannelResponseJs epgForChannelResponseJs) {
        this.f1820 = epgForChannelResponseJs;
    }

    public final EpgForChannelResponse copy(@InterfaceC5065(name = "js") EpgForChannelResponseJs epgForChannelResponseJs) {
        return new EpgForChannelResponse(epgForChannelResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpgForChannelResponse) && AbstractC1549.m5138(this.f1820, ((EpgForChannelResponse) obj).f1820);
    }

    public final int hashCode() {
        return this.f1820.f1821.hashCode();
    }

    public final String toString() {
        return "EpgForChannelResponse(js=" + this.f1820 + ')';
    }
}
