package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class VodItemsResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final VodItemsResponseJs f2035;

    public VodItemsResponse(@InterfaceC5065(name = "js") VodItemsResponseJs vodItemsResponseJs) {
        this.f2035 = vodItemsResponseJs;
    }

    public final VodItemsResponse copy(@InterfaceC5065(name = "js") VodItemsResponseJs vodItemsResponseJs) {
        return new VodItemsResponse(vodItemsResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VodItemsResponse) && AbstractC1549.m5138(this.f2035, ((VodItemsResponse) obj).f2035);
    }

    public final int hashCode() {
        return this.f2035.hashCode();
    }

    public final String toString() {
        return "VodItemsResponse(js=" + this.f2035 + ')';
    }
}
