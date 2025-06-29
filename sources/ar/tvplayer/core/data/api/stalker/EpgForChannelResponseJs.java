package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpgForChannelResponseJs {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1821;

    public EpgForChannelResponseJs(@InterfaceC5065(name = "data") List<ProgramForChannel> list) {
        this.f1821 = list;
    }

    public final EpgForChannelResponseJs copy(@InterfaceC5065(name = "data") List<ProgramForChannel> list) {
        return new EpgForChannelResponseJs(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpgForChannelResponseJs) && AbstractC1549.m5138(this.f1821, ((EpgForChannelResponseJs) obj).f1821);
    }

    public final int hashCode() {
        return this.f1821.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("EpgForChannelResponseJs(programs="), this.f1821, ')');
    }
}
