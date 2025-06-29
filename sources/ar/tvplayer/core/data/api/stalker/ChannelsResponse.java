package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class ChannelsResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ChannelsResponseJs f1806;

    public ChannelsResponse(@InterfaceC5065(name = "js") ChannelsResponseJs channelsResponseJs) {
        this.f1806 = channelsResponseJs;
    }

    public final ChannelsResponse copy(@InterfaceC5065(name = "js") ChannelsResponseJs channelsResponseJs) {
        return new ChannelsResponse(channelsResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsResponse) && AbstractC1549.m5138(this.f1806, ((ChannelsResponse) obj).f1806);
    }

    public final int hashCode() {
        return this.f1806.f1807.hashCode();
    }

    public final String toString() {
        return "ChannelsResponse(js=" + this.f1806 + ')';
    }
}
