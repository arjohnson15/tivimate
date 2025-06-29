package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class HandshakeResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HandshakeResponseJs f1898;

    public HandshakeResponse(@InterfaceC5065(name = "js") HandshakeResponseJs handshakeResponseJs) {
        this.f1898 = handshakeResponseJs;
    }

    public final HandshakeResponse copy(@InterfaceC5065(name = "js") HandshakeResponseJs handshakeResponseJs) {
        return new HandshakeResponse(handshakeResponseJs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HandshakeResponse) && AbstractC1549.m5138(this.f1898, ((HandshakeResponse) obj).f1898);
    }

    public final int hashCode() {
        return this.f1898.hashCode();
    }

    public final String toString() {
        return "HandshakeResponse(js=" + this.f1898 + ')';
    }
}
