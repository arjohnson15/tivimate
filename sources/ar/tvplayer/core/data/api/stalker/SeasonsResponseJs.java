package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class SeasonsResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f1932;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f1933;

    public SeasonsResponseJs(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<Season> list) {
        this.f1933 = i;
        this.f1932 = list;
    }

    public final SeasonsResponseJs copy(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<Season> list) {
        return new SeasonsResponseJs(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeasonsResponseJs)) {
            return false;
        }
        SeasonsResponseJs seasonsResponseJs = (SeasonsResponseJs) obj;
        return this.f1933 == seasonsResponseJs.f1933 && AbstractC1549.m5138(this.f1932, seasonsResponseJs.f1932);
    }

    public final int hashCode() {
        return this.f1932.hashCode() + (this.f1933 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonsResponseJs(itemCount=");
        sb.append(this.f1933);
        sb.append(", seasons=");
        return ˉᵎ.ᵎـ(sb, this.f1932, ')');
    }
}
