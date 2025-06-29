package ar.tvplayer.core.data.api.xtreamcodes;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class ServerInfo {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2135;

    public ServerInfo(@InterfaceC5065(name = "timezone") String str) {
        this.f2135 = str;
    }

    public final ServerInfo copy(@InterfaceC5065(name = "timezone") String str) {
        return new ServerInfo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerInfo) && AbstractC1549.m5138(this.f2135, ((ServerInfo) obj).f2135);
    }

    public final int hashCode() {
        String str = this.f2135;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ˑי(new StringBuilder("ServerInfo(timezone="), this.f2135, ')');
    }
}
