package p430;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p070.AbstractC1549;

/* renamed from: ﹶˏ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5012 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Proxy f19014;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InetSocketAddress f19015;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5009 f19016;

    public C5012(C5009 c5009, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.f19016 = c5009;
        this.f19014 = proxy;
        this.f19015 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5012) {
            C5012 c5012 = (C5012) obj;
            if (AbstractC1549.m5138(c5012.f19016, this.f19016) && AbstractC1549.m5138(c5012.f19014, this.f19014) && AbstractC1549.m5138(c5012.f19015, this.f19015)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19015.hashCode() + ((this.f19014.hashCode() + ((this.f19016.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f19015 + '}';
    }
}
