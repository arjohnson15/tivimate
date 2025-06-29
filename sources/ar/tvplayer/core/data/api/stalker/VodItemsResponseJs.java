package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p288.C3406;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;
import ـˈ.ᵔˊ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodItemsResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List f2036;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final transient C3406 f2037 = new C3406(new ᵔˊ(19, this));

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f2038;

    public VodItemsResponseJs(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<VodItem> list) {
        this.f2038 = i;
        this.f2036 = list;
    }

    public final VodItemsResponseJs copy(@InterfaceC5065(name = "total_items") int i, @InterfaceC5065(name = "data") List<VodItem> list) {
        return new VodItemsResponseJs(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VodItemsResponseJs)) {
            return false;
        }
        VodItemsResponseJs vodItemsResponseJs = (VodItemsResponseJs) obj;
        return this.f2038 == vodItemsResponseJs.f2038 && AbstractC1549.m5138(this.f2036, vodItemsResponseJs.f2036);
    }

    public final int hashCode() {
        return this.f2036.hashCode() + (this.f2038 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VodItemsResponseJs(itemCount=");
        sb.append(this.f2038);
        sb.append(", items=");
        return ˉᵎ.ᵎـ(sb, this.f2036, ')');
    }
}
