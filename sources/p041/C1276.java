package p041;

import androidx.leanback.widget.ʿˏ;
import androidx.leanback.widget.ﾞᐧ;
import com.bumptech.glide.ﹳﹳ;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import p013.AbstractC1041;
import p035.C1232;
import p036.C1262;
import p070.AbstractC1549;
import p126.C2021;
import p126.InterfaceC2023;
import p127.C2034;
import p158.AbstractC2339;
import p229.C3059;
import p276.C3360;
import p317.AbstractC3617;
import p363.C4132;
import p366.AbstractC4152;
import p366.C4142;
import p366.C4144;
import p366.C4146;
import p366.C4149;
import p366.C4151;
import p366.C4156;
import p375.C4305;
import p379.AbstractC4397;
import p379.AbstractC4412;
import p379.C4401;
import p379.C4405;
import p379.C4413;
import p379.C4417;
import p379.C4421;
import p430.AbstractC4996;
import p430.C4994;
import p430.C4999;
import p430.C5000;
import p430.C5004;
import p430.C5009;
import p430.C5010;
import p430.C5012;
import p430.C5013;
import p430.C5020;
import p430.C5021;
import p430.EnumC5022;
import ˆʽ.ᵎˏ;
import ˈי.ʾˈ;
import ـˈ.ˉᵎ;
import ᵎﹳ.ᐧʻ;
import ⁱـ.ˑי;
import ﾞﹶ.ᵢʿ;

/* renamed from: ʽˉ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1276 extends AbstractC4412 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5012 f5240;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C5000 f5241;

    /* renamed from: ˉי, reason: contains not printable characters */
    public boolean f5242;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public int f5243;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int f5244;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public boolean f5245;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C4149 f5247;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Socket f5248;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public EnumC5022 f5250;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C4413 f5251;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f5252;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Socket f5254;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public C4144 f5255;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public int f5246 = 1;

    /* renamed from: ˑי, reason: contains not printable characters */
    public final ArrayList f5249 = new ArrayList();

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public long f5253 = Long.MAX_VALUE;

    public C1276(C5012 c5012) {
        this.f5240 = c5012;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m4547(C4999 c4999, C5012 c5012, IOException iOException) {
        if (c5012.f19014.type() != Proxy.Type.DIRECT) {
            C5009 c5009 = c5012.f19016;
            c5009.f19008.connectFailed(c5009.f19004.m11098(), c5012.f19014.address(), iOException);
        }
        ﾞᐧ r3 = c4999.f18919;
        synchronized (r3) {
            ((LinkedHashSet) r3.ˆʿ).add(c5012);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C5012 c5012 = this.f5240;
        sb.append(c5012.f19016.f19004.f18961);
        sb.append(':');
        sb.append(c5012.f19016.f19004.f18954);
        sb.append(", proxy=");
        sb.append(c5012.f19014);
        sb.append(" hostAddress=");
        sb.append(c5012.f19015);
        sb.append(" cipherSuite=");
        C5000 c5000 = this.f5241;
        if (c5000 == null || (obj = c5000.f18942) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f5250);
        sb.append('}');
        return sb.toString();
    }

    @Override // p379.AbstractC4412
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void mo4548(C4401 c4401) {
        c4401.m9997(8, null);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m4549(int i, int i2) throws IOException {
        int i3 = 0;
        int i4 = 1;
        C5012 c5012 = this.f5240;
        Proxy proxy = c5012.f19014;
        C5009 c5009 = c5012.f19016;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : AbstractC1277.f5256[type.ordinal()];
        Socket socketCreateSocket = (i5 == 1 || i5 == 2) ? c5009.f19001.createSocket() : new Socket(proxy);
        this.f5248 = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f5240.f19015;
        socketCreateSocket.setSoTimeout(i2);
        try {
            C2034 c2034 = C2034.f7700;
            C2034.f7700.mo5677(socketCreateSocket, this.f5240.f19015, i);
            try {
                Logger logger = AbstractC4152.f16061;
                C4146 c4146 = new C4146(socketCreateSocket);
                this.f5247 = new C4149(new C4156(c4146, i3, new C4156(socketCreateSocket.getInputStream(), i4, c4146)));
                C4146 c41462 = new C4146(socketCreateSocket);
                this.f5255 = new C4144(new C4142(c41462, i3, new C4142(socketCreateSocket.getOutputStream(), i4, c41462)));
            } catch (NullPointerException e) {
                if (AbstractC1549.m5138(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f5240.f19015);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m4550(boolean z) throws SocketException {
        long j;
        byte[] bArr = AbstractC2339.f9301;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f5248;
        Socket socket2 = this.f5254;
        C4149 c4149 = this.f5247;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C4413 c4413 = this.f5251;
        if (c4413 != null) {
            return c4413.m10021(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.f5253;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z2 = !c4149.m9551();
                socket2.setSoTimeout(soTimeout);
                return z2;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final synchronized void m4551() {
        this.f5242 = true;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m4552() throws SocketException {
        Socket socket = this.f5254;
        C4149 c4149 = this.f5247;
        C4144 c4144 = this.f5255;
        socket.setSoTimeout(0);
        C4132 c4132 = C4132.f16016;
        C4305 c4305 = new C4305();
        c4305.f16745 = c4132;
        c4305.f16749 = AbstractC4412.f16999;
        String str = this.f5240.f19016.f19004.f18961;
        c4305.f16747 = socket;
        c4305.f16748 = AbstractC2339.f9303 + ' ' + str;
        c4305.f16750 = c4149;
        c4305.f16746 = c4144;
        c4305.f16749 = this;
        C4413 c4413 = new C4413(c4305);
        this.f5251 = c4413;
        C4417 c4417 = C4413.f17000;
        this.f5246 = (c4417.f17043 & 16) != 0 ? c4417.f17042[4] : Integer.MAX_VALUE;
        C4421 c4421 = c4413.f17008;
        synchronized (c4421) {
            try {
                if (c4421.f17057) {
                    throw new IOException("closed");
                }
                Logger logger = C4421.f17053;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC2339.m6442(">> CONNECTION " + AbstractC4397.f16936.mo9571(), new Object[0]));
                }
                c4421.f17058.mo9504(AbstractC4397.f16936);
                c4421.f17058.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        c4413.f17008.m10031(c4413.f17010);
        if (c4413.f17010.m10027() != 65535) {
            c4413.f17008.m10036(0, r1 - 65535);
        }
        c4132.m9484().m9479(new C1285(c4413.f17017, c4413.f17009, 1), 0L);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final InterfaceC2023 m4553(C4999 c4999, C2021 c2021) throws SocketException {
        Socket socket = this.f5254;
        C4149 c4149 = this.f5247;
        C4144 c4144 = this.f5255;
        C4413 c4413 = this.f5251;
        if (c4413 != null) {
            return new C4405(c4999, this, c2021, c4413);
        }
        int i = c2021.f7672;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4149.f16051.mo8177().mo9539(i, timeUnit);
        c4144.f16045.mo4565().mo9539(c2021.f7668, timeUnit);
        return new C1262(c4999, this, c4149, c4144);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized void m4554() {
        this.f5244++;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4555(int i, int i2, int i3, boolean z, C1274 c1274) throws Throwable {
        C5012 c5012;
        if (this.f5250 != null) {
            throw new IllegalStateException("already connected");
        }
        C5009 c5009 = this.f5240.f19016;
        List list = c5009.f19003;
        C1272 c1272 = new C1272(list);
        if (c5009.f19005 == null) {
            if (!list.contains(C5020.f19044)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f5240.f19016.f19004.f18961;
            C2034 c2034 = C2034.f7700;
            if (!C2034.f7700.mo5679(str)) {
                throw new RouteException(new UnknownServiceException(ᵎˏ.ˑי("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c5009.f19010.contains(EnumC5022.f19060)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                C5012 c50122 = this.f5240;
                if (c50122.f19016.f19005 != null && c50122.f19014.type() == Proxy.Type.HTTP) {
                    m4557(i, i2, i3);
                    if (this.f5248 == null) {
                    }
                    c5012 = this.f5240;
                    if (c5012.f19016.f19005 == null && c5012.f19014.type() == Proxy.Type.HTTP && this.f5248 == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f5253 = System.nanoTime();
                    return;
                }
                m4549(i, i2);
                m4558(c1272);
                InetSocketAddress inetSocketAddress = this.f5240.f19015;
                c5012 = this.f5240;
                if (c5012.f19016.f19005 == null) {
                }
                this.f5253 = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.f5254;
                if (socket != null) {
                    AbstractC2339.m6447(socket);
                }
                Socket socket2 = this.f5248;
                if (socket2 != null) {
                    AbstractC2339.m6447(socket2);
                }
                this.f5254 = null;
                this.f5248 = null;
                this.f5247 = null;
                this.f5255 = null;
                this.f5241 = null;
                this.f5250 = null;
                this.f5251 = null;
                this.f5246 = 1;
                InetSocketAddress inetSocketAddress2 = this.f5240.f19015;
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    ʾˈ.ـﹶ(routeException.f3910, e);
                    routeException.f3909 = e;
                }
                if (!z) {
                    throw routeException;
                }
                c1272.f5211 = true;
                if (!c1272.f5210) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    @Override // p379.AbstractC4412
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized void mo4556(C4417 c4417) {
        this.f5246 = (c4417.f17043 & 16) != 0 ? c4417.f17042[4] : Integer.MAX_VALUE;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4557(int i, int i2, int i3) throws IOException {
        ʿˏ r0 = new ʿˏ();
        C5012 c5012 = this.f5240;
        r0.ᐧⁱ = c5012.f19016.f19004;
        r0.ˋⁱ("CONNECT", (AbstractC4996) null);
        C5009 c5009 = c5012.f19016;
        ((C1232) r0.ˎˑ).m4428("Host", AbstractC2339.m6429(c5009.f19004, true));
        ((C1232) r0.ˎˑ).m4428("Proxy-Connection", "Keep-Alive");
        ((C1232) r0.ˎˑ).m4428("User-Agent", "okhttp/4.12.0");
        C5021 c5021 = r0.ˏᵢ();
        C1232 c1232 = new C1232(1);
        c1232.m4428("Proxy-Authenticate", "OkHttp-Preemptive");
        c1232.m4429();
        c5009.f19007.getClass();
        m4549(i, i2);
        String str = "CONNECT " + AbstractC2339.m6429(c5021.f19052, true) + " HTTP/1.1";
        C4149 c4149 = this.f5247;
        C4144 c4144 = this.f5255;
        C1262 c1262 = new C1262(null, this, c4149, c4144);
        C4151 c4151Mo8177 = c4149.f16051.mo8177();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4151Mo8177.mo9539(j, timeUnit);
        c4144.f16045.mo4565().mo9539(i3, timeUnit);
        c1262.m4519(c5021.f19051, str);
        c1262.mo4504();
        C5013 c5013Mo4508 = c1262.mo4508(false);
        c5013Mo4508.f19025 = c5021;
        C4994 c4994M11101 = c5013Mo4508.m11101();
        long jM6448 = AbstractC2339.m6448(c4994M11101);
        if (jM6448 != -1) {
            C3360 c3360M4497 = c1262.m4497(jM6448);
            AbstractC2339.m6444(c3360M4497, Integer.MAX_VALUE, timeUnit);
            c3360M4497.close();
        }
        int i4 = c4994M11101.f18886;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(ˉᵎ.ˉⁱ("Unexpected response code for CONNECT: ", i4));
            }
            c5009.f19007.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c4149.f16049.m9503() || !c4144.f16043.m9503()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m4558(C1272 c1272) throws Throwable {
        SSLSocket sSLSocket;
        int i = 1;
        int i2 = 0;
        C5009 c5009 = this.f5240.f19016;
        SSLSocketFactory sSLSocketFactory = c5009.f19005;
        EnumC5022 enumC5022 = EnumC5022.f19058;
        if (sSLSocketFactory == null) {
            List list = c5009.f19010;
            EnumC5022 enumC50222 = EnumC5022.f19060;
            if (!list.contains(enumC50222)) {
                this.f5254 = this.f5248;
                this.f5250 = enumC5022;
                return;
            } else {
                this.f5254 = this.f5248;
                this.f5250 = enumC50222;
                m4552();
                return;
            }
        }
        SSLSocket sSLSocket2 = null;
        String strMo5672 = null;
        try {
            Socket socket = this.f5248;
            C5004 c5004 = c5009.f19004;
            sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, c5004.f18961, c5004.f18954, true);
        } catch (Throwable th) {
            th = th;
        }
        try {
            C5020 c5020M4532 = c1272.m4532(sSLSocket);
            if (c5020M4532.f19045) {
                C2034 c2034 = C2034.f7700;
                C2034.f7700.mo5673(sSLSocket, c5009.f19004.f18961, c5009.f19010);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C5000 c5000 = ᵢʿ.ˏʾ(session);
            if (!c5009.f19009.verify(c5009.f19004.f18961, session)) {
                List listM11088 = c5000.m11088();
                if (listM11088.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c5009.f19004.f18961 + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listM11088.get(0);
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c5009.f19004.f18961);
                sb.append(" not verified:\n              |    certificate: ");
                C5010 c5010 = C5010.f19011;
                sb.append(ˑי.ᵎـ(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(AbstractC1041.m4028(C3059.m7552(x509Certificate, 7), C3059.m7552(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC3617.m8555(sb.toString()));
            }
            C5010 c50102 = c5009.f19002;
            this.f5241 = new C5000(c5000.f18944, c5000.f18942, c5000.f18943, new C1275(c50102, c5000, c5009, i2));
            String str = c5009.f19004.f18961;
            Iterator it = c50102.f19013.iterator();
            if (it.hasNext()) {
                ᐧʻ.ᵎˏ(it.next());
                throw null;
            }
            if (c5020M4532.f19045) {
                C2034 c20342 = C2034.f7700;
                strMo5672 = C2034.f7700.mo5672(sSLSocket);
            }
            this.f5254 = sSLSocket;
            Logger logger = AbstractC4152.f16061;
            C4146 c4146 = new C4146(sSLSocket);
            this.f5247 = new C4149(new C4156(c4146, i2, new C4156(sSLSocket.getInputStream(), i, c4146)));
            C4146 c41462 = new C4146(sSLSocket);
            this.f5255 = new C4144(new C4142(c41462, i2, new C4142(sSLSocket.getOutputStream(), i, c41462)));
            if (strMo5672 != null) {
                enumC5022 = ﹳﹳ.ᴵʿ(strMo5672);
            }
            this.f5250 = enumC5022;
            C2034 c20343 = C2034.f7700;
            C2034.f7700.mo5674(sSLSocket);
            if (this.f5250 == EnumC5022.f19056) {
                m4552();
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C2034 c20344 = C2034.f7700;
                C2034.f7700.mo5674(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC2339.m6447(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4559(p430.C5009 r9, java.util.List r10) {
        /*
            r8 = this;
            byte[] r0 = p158.AbstractC2339.f9301
            java.util.ArrayList r0 = r8.f5249
            int r0 = r0.size()
            int r1 = r8.f5246
            r2 = 0
            if (r0 >= r1) goto Lcf
            boolean r0 = r8.f5242
            if (r0 == 0) goto L13
            goto Lcf
        L13:
            ﹶˏ.ᐧˋ r0 = r8.f5240
            ﹶˏ.ـﹶ r1 = r0.f19016
            boolean r1 = r1.m11099(r9)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            ﹶˏ.ˏᴵ r1 = r9.f19004
            java.lang.String r3 = r1.f18961
            ﹶˏ.ـﹶ r4 = r0.f19016
            ﹶˏ.ˏᴵ r5 = r4.f19004
            java.lang.String r5 = r5.f18961
            boolean r3 = p070.AbstractC1549.m5138(r3, r5)
            r5 = 1
            if (r3 == 0) goto L30
            return r5
        L30:
            ᵢᐧ.ᴵʿ r3 = r8.f5251
            if (r3 != 0) goto L35
            return r2
        L35:
            if (r10 == 0) goto Lcf
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r3 = r10 instanceof java.util.Collection
            if (r3 == 0) goto L48
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L48
            goto Lcf
        L48:
            java.util.Iterator r10 = r10.iterator()
        L4c:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lcf
            java.lang.Object r3 = r10.next()
            ﹶˏ.ᐧˋ r3 = (p430.C5012) r3
            java.net.Proxy r6 = r3.f19014
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4c
            java.net.Proxy r6 = r0.f19014
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4c
            java.net.InetSocketAddress r3 = r3.f19015
            java.net.InetSocketAddress r6 = r0.f19015
            boolean r3 = p070.AbstractC1549.m5138(r6, r3)
            if (r3 == 0) goto L4c
            ˑˆ.ˑʽ r10 = p229.C3059.f11787
            javax.net.ssl.HostnameVerifier r0 = r9.f19009
            if (r0 == r10) goto L7b
            return r2
        L7b:
            byte[] r10 = p158.AbstractC2339.f9301
            ﹶˏ.ˏᴵ r10 = r4.f19004
            int r0 = r10.f18954
            int r3 = r1.f18954
            if (r3 == r0) goto L86
            goto Lcf
        L86:
            java.lang.String r0 = r1.f18961
            java.lang.String r10 = r10.f18961
            boolean r10 = p070.AbstractC1549.m5138(r0, r10)
            if (r10 == 0) goto L91
            goto Lb2
        L91:
            boolean r10 = r8.f5245
            if (r10 != 0) goto Lcf
            ﹶˏ.ˋⁱ r10 = r8.f5241
            if (r10 == 0) goto Lcf
            java.util.List r10 = r10.m11088()
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lcf
            java.lang.Object r10 = r10.get(r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = p229.C3059.m7551(r0, r10)
            if (r10 == 0) goto Lcf
        Lb2:
            ﹶˏ.ٴˎ r9 = r9.f19002     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            ﹶˏ.ˋⁱ r10 = r8.f5241     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            r10.m11088()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            java.util.Set r9 = r9.f19013     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            java.util.Iterator r9 = r9.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            boolean r10 = r9.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            if (r10 != 0) goto Lc6
            return r5
        Lc6:
            java.lang.Object r9 = r9.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            ᵎﹳ.ᐧʻ.ᵎˏ(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
            r9 = 0
            throw r9     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lcf
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p041.C1276.m4559(ﹶˏ.ـﹶ, java.util.List):boolean");
    }
}
