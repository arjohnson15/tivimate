package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class ChannelsResponseJs {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1807;

    public ChannelsResponseJs(@InterfaceC5065(name = "data") List<Channel> list) {
        this.f1807 = list;
    }

    public final ChannelsResponseJs copy(@InterfaceC5065(name = "data") List<Channel> list) {
        return new ChannelsResponseJs(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsResponseJs) && AbstractC1549.m5138(this.f1807, ((ChannelsResponseJs) obj).f1807);
    }

    public final int hashCode() {
        return this.f1807.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("ChannelsResponseJs(channels="), this.f1807, ')');
    }
}
