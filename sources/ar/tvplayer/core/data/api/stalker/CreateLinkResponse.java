package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class CreateLinkResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final CreateLinkResponseJs f1812;

    public CreateLinkResponse(@InterfaceC5065(name = "js") CreateLinkResponseJs createLinkResponseJs) {
        this.f1812 = createLinkResponseJs;
    }

    public final CreateLinkResponse copy(@InterfaceC5065(name = "js") CreateLinkResponseJs createLinkResponseJs) {
        return new CreateLinkResponse(createLinkResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateLinkResponse) && AbstractC1549.m5138(this.f1812, ((CreateLinkResponse) obj).f1812);
    }

    public final int hashCode() {
        return this.f1812.hashCode();
    }

    public final String toString() {
        return "CreateLinkResponse(js=" + this.f1812 + ')';
    }
}
