package p126;

import androidx.leanback.widget.ʿˏ;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p036.C1262;
import p041.C1273;
import p041.C1274;
import p041.C1276;
import p041.C1281;
import p041.C1283;
import p070.AbstractC1549;
import p158.AbstractC2339;
import p237.C3093;
import p430.AbstractC4996;
import p430.C4994;
import p430.C4999;
import p430.C5004;
import p430.C5009;
import p430.C5012;
import p430.C5021;
import p430.InterfaceC5016;
import ˆˑ.ﹳﹳ;

/* renamed from: ˈᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2020 implements InterfaceC5016 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public Object f7664;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f7665;

    public /* synthetic */ C2020() {
        this.f7665 = 2;
    }

    public /* synthetic */ C2020(int i, Object obj) {
        this.f7665 = i;
        this.f7664 = obj;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static int m5661(C4994 c4994, int i) {
        String strM11104 = c4994.f18889.m11104("Retry-After");
        if (strM11104 == null) {
            strM11104 = null;
        }
        if (strM11104 == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strM11104).matches()) {
            return Integer.valueOf(strM11104).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public C5021 m5662(C4994 c4994, C1273 c1273) throws ProtocolException {
        C1276 c1276;
        C5012 c5012 = (c1273 == null || (c1276 = (C1276) c1273.f5219) == null) ? null : c1276.f5240;
        int i = c4994.f18886;
        C5021 c5021 = c4994.f18887;
        String str = c5021.f19049;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((C4999) this.f7664).f18939.getClass();
                return null;
            }
            if (i == 421) {
                AbstractC4996 abstractC4996 = c5021.f19054;
                if ((abstractC4996 != null && abstractC4996.isOneShot()) || c1273 == null || AbstractC1549.m5138(((C5009) ((C1283) c1273.f5217).f5273).f19004.f18961, ((C1276) c1273.f5219).f5240.f19016.f19004.f18961)) {
                    return null;
                }
                C1276 c12762 = (C1276) c1273.f5219;
                synchronized (c12762) {
                    c12762.f5245 = true;
                }
                return c4994.f18887;
            }
            if (i == 503) {
                C4994 c49942 = c4994.f18888;
                if ((c49942 == null || c49942.f18886 != 503) && m5661(c4994, Integer.MAX_VALUE) == 0) {
                    return c4994.f18887;
                }
                return null;
            }
            if (i == 407) {
                if (c5012.f19014.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((C4999) this.f7664).f18928.getClass();
                return null;
            }
            if (i == 408) {
                if (!((C4999) this.f7664).f18937) {
                    return null;
                }
                AbstractC4996 abstractC49962 = c5021.f19054;
                if (abstractC49962 != null && abstractC49962.isOneShot()) {
                    return null;
                }
                C4994 c49943 = c4994.f18888;
                if ((c49943 == null || c49943.f18886 != 408) && m5661(c4994, 0) <= 0) {
                    return c4994.f18887;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        C4999 c4999 = (C4999) this.f7664;
        if (!c4999.f18923) {
            return null;
        }
        String strM11104 = c4994.f18889.m11104("Location");
        if (strM11104 == null) {
            strM11104 = null;
        }
        if (strM11104 == null) {
            return null;
        }
        C5021 c50212 = c4994.f18887;
        C3093 c3093M11095 = c50212.f19052.m11095(strM11104);
        C5004 c5004M7602 = c3093M11095 != null ? c3093M11095.m7602() : null;
        if (c5004M7602 == null) {
            return null;
        }
        if (!AbstractC1549.m5138(c5004M7602.f18958, c50212.f19052.f18958) && !c4999.f18929) {
            return null;
        }
        ʿˏ r12 = c50212.m11111();
        if (ﹳﹳ.ˋˊ(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i2 = c4994.f18886;
            boolean z = zEquals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                r12.ˋⁱ(str, z ? c50212.f19054 : null);
            } else {
                r12.ˋⁱ("GET", (AbstractC4996) null);
            }
            if (!z) {
                r12.ˏᴵ("Transfer-Encoding");
                r12.ˏᴵ("Content-Length");
                r12.ˏᴵ("Content-Type");
            }
        }
        if (!AbstractC2339.m6440(c50212.f19052, c5004M7602)) {
            r12.ˏᴵ("Authorization");
        }
        r12.ᐧⁱ = c5004M7602;
        return r12.ˏᵢ();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean m5663(IOException iOException, C1274 c1274, C5021 c5021, boolean z) {
        C1262 c1262;
        boolean zM4513;
        C1276 c1276;
        AbstractC4996 abstractC4996;
        if (!((C4999) this.f7664).f18937) {
            return false;
        }
        if ((z && (((abstractC4996 = c5021.f19054) != null && abstractC4996.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C1283 c1283 = c1274.f5234;
        int i = c1283.f5276;
        if (i == 0 && c1283.f5272 == 0 && c1283.f5275 == 0) {
            zM4513 = false;
        } else if (((C5012) c1283.f5280) != null) {
            zM4513 = true;
        } else {
            C5012 c5012 = null;
            if (i <= 1 && c1283.f5272 <= 1 && c1283.f5275 <= 0 && (c1276 = ((C1274) c1283.f5277).f5223) != null) {
                synchronized (c1276) {
                    if (c1276.f5243 == 0 && AbstractC2339.m6440(c1276.f5240.f19016.f19004, ((C5009) c1283.f5273).f19004)) {
                        c5012 = c1276.f5240;
                    }
                }
            }
            if (c5012 != null) {
                c1283.f5280 = c5012;
            } else {
                C1281 c1281 = (C1281) c1283.f5278;
                if ((c1281 == null || !c1281.m4570()) && (c1262 = (C1262) c1283.f5274) != null) {
                    zM4513 = c1262.m4513();
                }
            }
            zM4513 = true;
        }
        return zM4513;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
    
        r3.m4538(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // p430.InterfaceC5016
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p430.C4994 mo3528(p126.C2021 r32) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126.C2020.mo3528(ˈᵔ.ٴˎ):ﹶˏ.ˆʿ");
    }
}
