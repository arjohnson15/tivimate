package p229;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p070.AbstractC1549;

/* renamed from: ˑˆ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3058 implements InterfaceC3061 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final LinkedHashMap f11786;

    public C3058(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f11786 = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C3058) && AbstractC1549.m5138(((C3058) obj).f11786, this.f11786));
    }

    public final int hashCode() {
        return this.f11786.hashCode();
    }

    @Override // p229.InterfaceC3061
    /* renamed from: ـﹶ */
    public final X509Certificate mo5669(X509Certificate x509Certificate) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        Set set = (Set) this.f11786.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }
}
