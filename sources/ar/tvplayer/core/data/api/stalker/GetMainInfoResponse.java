package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class GetMainInfoResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final GetMainInfoResponseJs f1880;

    public GetMainInfoResponse(@InterfaceC5065(name = "js") GetMainInfoResponseJs getMainInfoResponseJs) {
        this.f1880 = getMainInfoResponseJs;
    }

    public final GetMainInfoResponse copy(@InterfaceC5065(name = "js") GetMainInfoResponseJs getMainInfoResponseJs) {
        return new GetMainInfoResponse(getMainInfoResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetMainInfoResponse) && AbstractC1549.m5138(this.f1880, ((GetMainInfoResponse) obj).f1880);
    }

    public final int hashCode() {
        return this.f1880.hashCode();
    }

    public final String toString() {
        return "GetMainInfoResponse(js=" + this.f1880 + ')';
    }
}
