package p127;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: ˈⁱ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2025 extends C2034 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f7681;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Provider f7682 = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, ﹳﹳ.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f7681 = z;
    }

    @Override // p127.C2034
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final X509TrustManager mo5670() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @Override // p127.C2034
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final SSLContext mo5671() {
        return SSLContext.getInstance("TLS", this.f7682);
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final String mo5672(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) {
    }
}
