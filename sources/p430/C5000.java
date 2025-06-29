package p430;

import androidx.lifecycle.C0248;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p013.AbstractC1039;
import p070.AbstractC1549;
import p288.C3406;
import p338.InterfaceC3865;

/* renamed from: ﹶˏ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5000 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5005 f18942;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List f18943;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final EnumC4995 f18944;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3406 f18945;

    public C5000(EnumC4995 enumC4995, C5005 c5005, List list, InterfaceC3865 interfaceC3865) {
        this.f18944 = enumC4995;
        this.f18942 = c5005;
        this.f18943 = list;
        this.f18945 = new C3406(new C0248(interfaceC3865));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5000) {
            C5000 c5000 = (C5000) obj;
            if (c5000.f18944 == this.f18944 && AbstractC1549.m5138(c5000.f18942, this.f18942) && AbstractC1549.m5138(c5000.m11088(), m11088()) && AbstractC1549.m5138(c5000.f18943, this.f18943)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18943.hashCode() + ((m11088().hashCode() + ((this.f18942.hashCode() + ((this.f18944.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listM11088 = m11088();
        ArrayList arrayList = new ArrayList(AbstractC1039.m4012(listM11088, 10));
        for (Certificate certificate : listM11088) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f18944);
        sb.append(" cipherSuite=");
        sb.append(this.f18942);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f18943;
        ArrayList arrayList2 = new ArrayList(AbstractC1039.m4012(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final List m11088() {
        return (List) this.f18945.getValue();
    }
}
