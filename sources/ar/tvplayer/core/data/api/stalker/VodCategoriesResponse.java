package ar.tvplayer.core.data.api.stalker;

import java.util.List;
import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodCategoriesResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List f1977;

    public VodCategoriesResponse(@InterfaceC5065(name = "js") List<VodCategory> list) {
        this.f1977 = list;
    }

    public final VodCategoriesResponse copy(@InterfaceC5065(name = "js") List<VodCategory> list) {
        return new VodCategoriesResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VodCategoriesResponse) && AbstractC1549.m5138(this.f1977, ((VodCategoriesResponse) obj).f1977);
    }

    public final int hashCode() {
        return this.f1977.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ᵎـ(new StringBuilder("VodCategoriesResponse(categories="), this.f1977, ')');
    }
}
