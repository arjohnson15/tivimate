package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class StalkerTtv$TtvJs {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1964;

    public StalkerTtv$TtvJs(List list) {
        this.f1964 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StalkerTtv$TtvJs) && AbstractC1549.m5138(this.f1964, ((StalkerTtv$TtvJs) obj).f1964);
    }

    public final int hashCode() {
        return this.f1964.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("TtvJs(data="), this.f1964, ')');
    }
}
