package ar.tvplayer.core.data.api.xtreamcodes;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class MovieData {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2092;

    public MovieData(@InterfaceC5065(name = "container_extension") String str) {
        this.f2092 = str;
    }

    public final MovieData copy(@InterfaceC5065(name = "container_extension") String str) {
        return new MovieData(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MovieData) && AbstractC1549.m5138(this.f2092, ((MovieData) obj).f2092);
    }

    public final int hashCode() {
        String str = this.f2092;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ˑי(new StringBuilder("MovieData(containerExtension="), this.f2092, ')');
    }
}
