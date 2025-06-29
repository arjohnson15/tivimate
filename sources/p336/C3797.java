package p336;

import android.net.http.X509TrustManagerExtensions;
import com.bumptech.glide.ˑʽ;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: ᵎʿ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3797 extends ˑʽ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final X509TrustManager f14650;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final X509TrustManagerExtensions f14651;

    public C3797(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f14650 = x509TrustManager;
        this.f14651 = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3797) && ((C3797) obj).f14650 == this.f14650;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f14650);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List m8891(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.f14651.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
