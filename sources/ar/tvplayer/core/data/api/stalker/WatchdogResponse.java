package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class WatchdogResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final WatchdogResponseJs f2047;

    public WatchdogResponse(@InterfaceC5065(name = "js") WatchdogResponseJs watchdogResponseJs) {
        this.f2047 = watchdogResponseJs;
    }

    public final WatchdogResponse copy(@InterfaceC5065(name = "js") WatchdogResponseJs watchdogResponseJs) {
        return new WatchdogResponse(watchdogResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchdogResponse) && AbstractC1549.m5138(this.f2047, ((WatchdogResponse) obj).f2047);
    }

    public final int hashCode() {
        return this.f2047.hashCode();
    }

    public final String toString() {
        return "WatchdogResponse(js=" + this.f2047 + ')';
    }
}
