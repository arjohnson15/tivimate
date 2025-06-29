package p127;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import ᵔʼ.ˑʽ;

/* renamed from: ˈⁱ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2029 extends C2034 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f7691;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Provider f7692 = Conscrypt.newProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC2032.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC2032.m5683()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f7691 = z;
    }

    @Override // p127.C2034
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final SSLSocketFactory mo5675(X509TrustManager x509TrustManager) throws KeyManagementException {
        SSLContext sSLContextMo5671 = mo5671();
        sSLContextMo5671.init(null, new TrustManager[]{x509TrustManager}, null);
        return sSLContextMo5671.getSocketFactory();
    }

    @Override // p127.C2034
    /* renamed from: ˋⁱ */
    public final X509TrustManager mo5670() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C2033.f7698);
                return x509TrustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @Override // p127.C2034
    /* renamed from: ˏʾ */
    public final SSLContext mo5671() {
        return SSLContext.getInstance("TLS", this.f7692);
    }

    @Override // p127.C2034
    /* renamed from: ٴˎ */
    public final String mo5672(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p127.C2034
    /* renamed from: ﹳﹳ */
    public final void mo5673(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ˑʽ.ˑʽ(list).toArray(new String[0]));
        }
    }
}
