package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodGenresResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1994;

    public VodGenresResponse(@InterfaceC5065(name = "js") List<VodGenre> list) {
        this.f1994 = list;
    }

    public final VodGenresResponse copy(@InterfaceC5065(name = "js") List<VodGenre> list) {
        return new VodGenresResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VodGenresResponse) && AbstractC1549.m5138(this.f1994, ((VodGenresResponse) obj).f1994);
    }

    public final int hashCode() {
        return this.f1994.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("VodGenresResponse(genres="), this.f1994, ')');
    }
}
