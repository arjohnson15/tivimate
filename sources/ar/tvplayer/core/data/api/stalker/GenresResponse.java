package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class GenresResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1877;

    public GenresResponse(@InterfaceC5065(name = "js") List<Genre> list) {
        this.f1877 = list;
    }

    public final GenresResponse copy(@InterfaceC5065(name = "js") List<Genre> list) {
        return new GenresResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenresResponse) && AbstractC1549.m5138(this.f1877, ((GenresResponse) obj).f1877);
    }

    public final int hashCode() {
        return this.f1877.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("GenresResponse(genres="), this.f1877, ')');
    }
}
