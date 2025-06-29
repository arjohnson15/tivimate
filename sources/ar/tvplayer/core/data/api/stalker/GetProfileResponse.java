package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class GetProfileResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final GetProfileResponseJs f1888;

    public GetProfileResponse(@InterfaceC5065(name = "js") GetProfileResponseJs getProfileResponseJs) {
        this.f1888 = getProfileResponseJs;
    }

    public final GetProfileResponse copy(@InterfaceC5065(name = "js") GetProfileResponseJs getProfileResponseJs) {
        return new GetProfileResponse(getProfileResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetProfileResponse) && AbstractC1549.m5138(this.f1888, ((GetProfileResponse) obj).f1888);
    }

    public final int hashCode() {
        return this.f1888.hashCode();
    }

    public final String toString() {
        return "GetProfileResponse(js=" + this.f1888 + ')';
    }
}
