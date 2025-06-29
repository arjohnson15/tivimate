package ar.tvplayer.core.data.api.stalker;

import ar.tvplayer.core.util.annotation.SingleToArray;
import java.util.List;
import java.util.Map;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class EpgInfoResponseJs {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1827;

    public EpgInfoResponseJs(@SingleToArray @InterfaceC5065(name = "data") List<? extends Map<String, ? extends List<Program>>> list) {
        this.f1827 = list;
    }

    public final EpgInfoResponseJs copy(@SingleToArray @InterfaceC5065(name = "data") List<? extends Map<String, ? extends List<Program>>> list) {
        return new EpgInfoResponseJs(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpgInfoResponseJs) && AbstractC1549.m5138(this.f1827, ((EpgInfoResponseJs) obj).f1827);
    }

    public final int hashCode() {
        return this.f1827.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("EpgInfoResponseJs(programsMapList="), this.f1827, ')');
    }
}
