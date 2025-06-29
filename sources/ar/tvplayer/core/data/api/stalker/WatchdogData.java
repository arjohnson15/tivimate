package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class WatchdogData {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Integer f2044;

    public WatchdogData(@InterfaceC5065(name = "msgs") Integer num) {
        this.f2044 = num;
    }

    public final WatchdogData copy(@InterfaceC5065(name = "msgs") Integer num) {
        return new WatchdogData(num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WatchdogData) && AbstractC1549.m5138(this.f2044, ((WatchdogData) obj).f2044);
    }

    public final int hashCode() {
        Integer num = this.f2044;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "WatchdogData(msgs=" + this.f2044 + ')';
    }
}
