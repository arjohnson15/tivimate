package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class WatchdogResponseJs {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final WatchdogData f2048;

    public WatchdogResponseJs(@InterfaceC5065(name = "data") WatchdogData watchdogData) {
        this.f2048 = watchdogData;
    }

    public final WatchdogResponseJs copy(@InterfaceC5065(name = "data") WatchdogData watchdogData) {
        return new WatchdogResponseJs(watchdogData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchdogResponseJs) && AbstractC1549.m5138(this.f2048, ((WatchdogResponseJs) obj).f2048);
    }

    public final int hashCode() {
        WatchdogData watchdogData = this.f2048;
        if (watchdogData == null) {
            return 0;
        }
        return watchdogData.hashCode();
    }

    public final String toString() {
        return "WatchdogResponseJs(data=" + this.f2048 + ')';
    }
}
