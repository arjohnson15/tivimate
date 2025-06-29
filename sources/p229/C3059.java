package p229;

import android.support.v4.media.session.AbstractC0002;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p013.C1053;
import p070.AbstractC1549;
import p447.AbstractC5179;

/* renamed from: ˑˆ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3059 implements HostnameVerifier {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3059 f11787 = new C3059();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m7550(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbM40 = AbstractC0002.m40(length2, "endIndex > string.length: ", " > ");
            sbM40.append(str.length());
            throw new IllegalArgumentException(sbM40.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += 4;
                        i2 += 2;
                    }
                }
                j += i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* renamed from: ˑʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7551(java.lang.String r9, java.security.cert.X509Certificate r10) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p229.C3059.m7551(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static List m7552(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        C1053 c1053 = C1053.f4449;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c1053;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC1549.m5138(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c1053;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (!m7550(str)) {
            return false;
        }
        try {
            return m7551(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
