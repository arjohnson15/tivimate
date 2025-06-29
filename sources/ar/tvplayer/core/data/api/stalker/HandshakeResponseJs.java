package ar.tvplayer.core.data.api.stalker;

import p070.AbstractC1549;
import p435.InterfaceC5046;
import p435.InterfaceC5065;
import ـˈ.ˉᵎ;

@InterfaceC5046(generateAdapter = true)
/* loaded from: classes.dex */
public final class HandshakeResponseJs {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f1899;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String f1900;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f1901;

    public HandshakeResponseJs(@InterfaceC5065(name = "token") String str, @InterfaceC5065(name = "hash") String str2, @InterfaceC5065(name = "random") String str3) {
        this.f1901 = str;
        this.f1899 = str2;
        this.f1900 = str3;
    }

    public final HandshakeResponseJs copy(@InterfaceC5065(name = "token") String str, @InterfaceC5065(name = "hash") String str2, @InterfaceC5065(name = "random") String str3) {
        return new HandshakeResponseJs(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandshakeResponseJs)) {
            return false;
        }
        HandshakeResponseJs handshakeResponseJs = (HandshakeResponseJs) obj;
        return AbstractC1549.m5138(this.f1901, handshakeResponseJs.f1901) && AbstractC1549.m5138(this.f1899, handshakeResponseJs.f1899) && AbstractC1549.m5138(this.f1900, handshakeResponseJs.f1900);
    }

    public final int hashCode() {
        int iHashCode = this.f1901.hashCode() * 31;
        String str = this.f1899;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1900;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandshakeResponseJs(token=");
        sb.append(this.f1901);
        sb.append(", hash=");
        sb.append(this.f1899);
        sb.append(", random=");
        return ˉᵎ.ˑי(sb, this.f1900, ')');
    }
}
