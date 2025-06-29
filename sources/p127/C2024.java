package p127;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p070.AbstractC1549;
import p229.InterfaceC3061;

/* renamed from: ˈⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2024 implements InterfaceC3061 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Method f7679;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final X509TrustManager f7680;

    public C2024(X509TrustManager x509TrustManager, Method method) {
        this.f7680 = x509TrustManager;
        this.f7679 = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2024)) {
            return false;
        }
        C2024 c2024 = (C2024) obj;
        return AbstractC1549.m5138(this.f7680, c2024.f7680) && AbstractC1549.m5138(this.f7679, c2024.f7679);
    }

    public final int hashCode() {
        return this.f7679.hashCode() + (this.f7680.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f7680 + ", findByIssuerAndSignatureMethod=" + this.f7679 + ')';
    }

    @Override // p229.InterfaceC3061
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final X509Certificate mo5669(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.f7679.invoke(this.f7680, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
