package p430;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p070.AbstractC1549;
import p158.AbstractC2339;
import p237.C3093;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;
import ﹶⁱ.ـﹶ;

/* renamed from: ﹶˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5009 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final SocketFactory f19001;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5010 f19002;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final List f19003;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C5004 f19004;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final SSLSocketFactory f19005;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4991 f19006;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C4991 f19007;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final ProxySelector f19008;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final HostnameVerifier f19009;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final List f19010;

    public C5009(String str, int i, C4991 c4991, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C5010 c5010, C4991 c49912, List list, List list2, ProxySelector proxySelector) {
        this.f19006 = c4991;
        this.f19001 = socketFactory;
        this.f19005 = sSLSocketFactory;
        this.f19009 = hostnameVerifier;
        this.f19002 = c5010;
        this.f19007 = c49912;
        this.f19008 = proxySelector;
        C3093 c3093 = new C3093();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c3093.f11937 = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c3093.f11937 = "https";
        }
        String str3 = ـﹶ.ʾʼ(C4991.m11078(str, 0, 0, false, 7));
        if (str3 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c3093.f11939 = str3;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("unexpected port: ", i).toString());
        }
        c3093.f11934 = i;
        this.f19004 = c3093.m7602();
        this.f19010 = AbstractC2339.m6432(list);
        this.f19003 = AbstractC2339.m6432(list2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5009) {
            C5009 c5009 = (C5009) obj;
            if (AbstractC1549.m5138(this.f19004, c5009.f19004) && m11099(c5009)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19002) + ((Objects.hashCode(this.f19009) + ((Objects.hashCode(this.f19005) + ((this.f19008.hashCode() + ((this.f19003.hashCode() + ((this.f19010.hashCode() + ((this.f19007.hashCode() + ((this.f19006.hashCode() + ᵎˏ.ˏʾ(527, 31, this.f19004.f18962)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C5004 c5004 = this.f19004;
        sb.append(c5004.f18961);
        sb.append(':');
        sb.append(c5004.f18954);
        sb.append(", ");
        sb.append("proxySelector=" + this.f19008);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m11099(C5009 c5009) {
        return AbstractC1549.m5138(this.f19006, c5009.f19006) && AbstractC1549.m5138(this.f19007, c5009.f19007) && AbstractC1549.m5138(this.f19010, c5009.f19010) && AbstractC1549.m5138(this.f19003, c5009.f19003) && AbstractC1549.m5138(this.f19008, c5009.f19008) && AbstractC1549.m5138(null, null) && AbstractC1549.m5138(this.f19005, c5009.f19005) && AbstractC1549.m5138(this.f19009, c5009.f19009) && AbstractC1549.m5138(this.f19002, c5009.f19002) && this.f19004.f18954 == c5009.f19004.f18954;
    }
}
