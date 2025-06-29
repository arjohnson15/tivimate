package p127;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: ˈⁱ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2027 extends C2034 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f7688;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Provider f7689 = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, ˉⁱ.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f7688 = z;
    }

    @Override // p127.C2034
    /* renamed from: ˋⁱ */
    public final X509TrustManager mo5670() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f7689);
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
    /* renamed from: ˏʾ */
    public final SSLContext mo5671() {
        return SSLContext.getInstance("TLSv1.3", this.f7689);
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ */
    public final String mo5672(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) {
    }
}
