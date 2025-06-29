package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class StalkerTtv$TtvResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final StalkerTtv$TtvJs f1965;

    public StalkerTtv$TtvResponse(StalkerTtv$TtvJs stalkerTtv$TtvJs) {
        this.f1965 = stalkerTtv$TtvJs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StalkerTtv$TtvResponse) && AbstractC1549.m5138(this.f1965, ((StalkerTtv$TtvResponse) obj).f1965);
    }

    public final int hashCode() {
        return this.f1965.f1964.hashCode();
    }

    public final String toString() {
        return "TtvResponse(js=" + this.f1965 + ')';
    }
}
