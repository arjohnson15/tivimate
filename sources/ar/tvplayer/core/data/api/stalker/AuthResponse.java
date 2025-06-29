package ar.tvplayer.core.data.api.stalker;

import android.support.v4.media.session.AbstractC0002;
import p435.InterfaceC5046;
import p435.InterfaceC5065;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class AuthResponse {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean f1787;

    public AuthResponse(@InterfaceC5065(name = "js") boolean z) {
        this.f1787 = z;
    }

    public final AuthResponse copy(@InterfaceC5065(name = "js") boolean z) {
        return new AuthResponse(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthResponse) && this.f1787 == ((AuthResponse) obj).f1787;
    }

    public final int hashCode() {
        return this.f1787 ? 1231 : 1237;
    }

    public final String toString() {
        return AbstractC0002.m38(new StringBuilder("AuthResponse(js="), this.f1787, ')');
    }
}
