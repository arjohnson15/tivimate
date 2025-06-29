package p229;

import com.bumptech.glide.ˑʽ;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p070.AbstractC1549;
import ـˈ.ˉᵎ;

/* renamed from: ˑˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3060 extends ˑʽ {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC3061 f11788;

    public C3060(InterfaceC3061 interfaceC3061) {
        this.f11788 = interfaceC3061;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C3060) && AbstractC1549.m5138(((C3060) obj).f11788, this.f11788);
    }

    public final int hashCode() {
        return this.f11788.hashCode();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final List m7553(String str, List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) ˉᵎ.ﹶˆ(1, arrayList);
            X509Certificate x509CertificateMo5669 = this.f11788.mo5669(x509Certificate);
            if (x509CertificateMo5669 == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (AbstractC1549.m5138(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo5669)) {
                arrayList.add(x509CertificateMo5669);
            }
            if (AbstractC1549.m5138(x509CertificateMo5669.getIssuerDN(), x509CertificateMo5669.getSubjectDN())) {
                try {
                    x509CertificateMo5669.verify(x509CertificateMo5669.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
