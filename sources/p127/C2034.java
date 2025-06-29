package p127;

import com.bumptech.glide.ˑʽ;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p229.C3058;
import p229.C3060;
import p229.InterfaceC3061;

/* renamed from: ˈⁱ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2034 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Logger f7699;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static volatile C2034 f7700;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[PHI: r2
  0x0091: PHI (r2v26 ˈⁱ.ᴵʿ) = (r2v15 ˈⁱ.ᴵʿ), (r2v20 ˈⁱ.ᴵʿ), (r2v24 ˈⁱ.ᴵʿ), (r2v29 ˈⁱ.ᴵʿ) binds: [B:54:0x00df, B:48:0x00d1, B:40:0x00b1, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    static {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p127.C2034.<clinit>():void");
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static void m5684(int i, String str, Throwable th) {
        f7699.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: ʽᐧ */
    public ˑʽ mo5676(X509TrustManager x509TrustManager) {
        return new C3060(mo5680(x509TrustManager));
    }

    /* renamed from: ʿʼ */
    public void mo5677(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: ˉי */
    public void mo5678(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m5684(5, str, (Throwable) obj);
    }

    /* renamed from: ˉⁱ */
    public SSLSocketFactory mo5675(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextMo5671 = mo5671();
            sSLContextMo5671.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo5671.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: ˋⁱ */
    public X509TrustManager mo5670() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    /* renamed from: ˏʾ */
    public SSLContext mo5671() {
        return SSLContext.getInstance("TLS");
    }

    /* renamed from: ˏᵢ */
    public boolean mo5679(String str) {
        return true;
    }

    /* renamed from: ˑʽ */
    public InterfaceC3061 mo5680(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C3058((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: ـﹶ */
    public void mo5674(SSLSocket sSLSocket) {
    }

    /* renamed from: ٴˎ */
    public String mo5672(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: ᐧʻ */
    public Object mo5681() {
        if (f7699.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: ﹳﹳ */
    public void mo5673(SSLSocket sSLSocket, String str, List list) {
    }
}
