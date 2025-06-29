package p143;

import com.hierynomus.mssmb2.SMBApiException;
import com.hierynomus.protocol.transport.TransportException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import com.hierynomus.smbj.paths.PathResolveException;
import com.hierynomus.smbj.session.SMB2GuestSigningRequiredException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p018.C1100;
import p018.C1105;
import p018.C1106;
import p018.C1114;
import p018.C1116;
import p018.EnumC1112;
import p055.InterfaceC1332;
import p078.AbstractC1685;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1689;
import p078.EnumC1690;
import p109.EnumC1805;
import p180.AbstractC2500;
import p200.C2753;
import p202.C2766;
import p237.C3093;
import p260.C3222;
import p283.InterfaceC3379;
import p296.C3486;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p390.C4514;
import p390.C4515;
import p408.C4672;
import p409.InterfaceC4674;
import p433.C5028;
import p446.AbstractC5160;
import p446.C5159;
import p446.C5168;
import p446.C5169;
import ʿﾞ.ﹳﹳ;
import ˆʽ.ᵎˏ;
import ˈי.ʾˈ;
import ᵔᵔ.ٴˎ;

/* renamed from: ˉـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2227 implements AutoCloseable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static final InterfaceC3918 f8858 = AbstractC3917.m9105(C2227.class);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2226 f8859;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4514 f8860;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final ArrayList f8861;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f8862;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C3222 f8863;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3486 f8864;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public long f8865;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f8866;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final InterfaceC1332 f8867;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C3222 f8868;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f8869;

    public C2227(C3486 c3486, C3222 c3222, C4514 c4514, InterfaceC1332 interfaceC1332, InterfaceC4674 interfaceC4674) {
        C3222 c32222 = new C3222(6, false);
        c32222.f12538 = new ReentrantReadWriteLock();
        c32222.f12539 = new HashMap();
        c32222.f12540 = new HashMap();
        this.f8868 = c32222;
        this.f8861 = new ArrayList();
        this.f8864 = c3486;
        this.f8863 = c3222;
        this.f8860 = c4514;
        this.f8867 = interfaceC1332;
        EnumC1689 enumC1689 = (EnumC1689) ((C2753) c3486.f13462.f11939).f10767;
        C2226 c2226 = new C2226();
        c2226.f8856 = enumC1689;
        c2226.f8854 = interfaceC4674;
        this.f8859 = c2226;
        if (c4514 != null) {
            c4514.m10278(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m6212();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5160 m6208(String str) {
        AbstractC5160 c5159;
        C2227 c2227M6211;
        if (str.contains("\\")) {
            throw new IllegalArgumentException(ᵎˏ.ˑי("Share name (", str, ") cannot contain '\\' characters."));
        }
        C3222 c3222 = this.f8868;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c3222.f12538;
        reentrantReadWriteLock.readLock().lock();
        try {
            AbstractC5160 abstractC5160 = (AbstractC5160) ((HashMap) c3222.f12540).get(str);
            reentrantReadWriteLock.readLock().unlock();
            InterfaceC3918 interfaceC3918 = f8858;
            if (abstractC5160 != null) {
                interfaceC3918.mo5509(abstractC5160, str, "Returning cached Share {} for {}");
                return abstractC5160;
            }
            InterfaceC1332 interfaceC1332 = this.f8867;
            C3486 c3486 = this.f8864;
            String str2 = c3486.f13464;
            C4672 c4672 = new C4672(str2, str, null);
            interfaceC3918.mo5529(c4672, Long.valueOf(this.f8865), "Connecting to {} on session {}");
            try {
                C1106 c1106 = new C1106(9, (EnumC1689) ((C2753) c3486.f13462.f11939).f10767, EnumC1683.f6541, this.f8865, 0L, 1);
                c1106.f4702 = c4672;
                ((C1696) ((InterfaceC3379) ((ﹳﹳ) c1106).ᐧⁱ)).f6603 = 256;
                C5028 c5028M6209 = m6209(c1106);
                long j = c3486.f13470.f5200;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ٴˎ r12 = TransportException.f3662;
                C1100 c1100 = (C1100) ʾˈ.ˏᵢ(c5028M6209, j, timeUnit);
                try {
                    C4672 c4672Mo4644 = interfaceC1332.mo4644(this, c1100, c4672);
                    boolean zM6612 = AbstractC2500.m6612(c4672Mo4644.f17810, str2);
                    String str3 = c4672Mo4644.f17810;
                    if (zM6612) {
                        c2227M6211 = this;
                    } else {
                        interfaceC3918.mo5513(str3, "Re-routing the connection to host {}");
                        c2227M6211 = m6211(c4672Mo4644);
                    }
                    boolean zM66122 = AbstractC2500.m6612(str3, str2);
                    String str4 = c4672Mo4644.f17808;
                    if (!(zM66122 && AbstractC2500.m6612(str4, str))) {
                        return c2227M6211.m6208(str4);
                    }
                } catch (PathResolveException unused) {
                }
                InterfaceC3379 interfaceC3379 = (InterfaceC3379) ((ﹳﹳ) c1100).ᐧⁱ;
                if ((((C1696) interfaceC3379).f6598 >>> 30) == 3) {
                    interfaceC3918.mo5528(((C1696) interfaceC3379).toString());
                    throw new SMBApiException((C1696) ((InterfaceC3379) ((ﹳﹳ) c1100).ᐧⁱ), "Could not connect to " + c4672);
                }
                if (c1100.f4692.contains(EnumC1690.f6584)) {
                    throw new SMBRuntimeException("ASYMMETRIC capability unsupported");
                }
                C2766 c2766 = new C2766(((C1696) ((InterfaceC3379) ((ﹳﹳ) c1100).ᐧⁱ)).f6609, c4672, this, this.f8864, this.f8860);
                byte b = c1100.f4691;
                if (b == 1) {
                    c5159 = new C5168(c4672, c2766, interfaceC1332);
                } else if (b == 2) {
                    c5159 = new C5169(c4672, c2766);
                } else {
                    if (b != 3) {
                        throw new SMBRuntimeException("Unknown ShareType returned in the TREE_CONNECT Response");
                    }
                    c5159 = new C5159(c4672, c2766);
                }
                AbstractC5160 abstractC51602 = c5159;
                c3222.m7938(abstractC51602);
                return abstractC51602;
            } catch (TransportException e) {
                throw new SMBRuntimeException(e);
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C5028 m6209(AbstractC1685 abstractC1685) throws TransportException {
        boolean z = this.f8862;
        C2226 c2226 = this.f8859;
        if (z && c2226.f8857 == null) {
            throw new TransportException("Message signing is required, but no signing key is negotiated");
        }
        if (c2226.f8857 != null) {
            abstractC1685 = new C1116(c2226, abstractC1685);
        } else {
            C2226.f8853.mo5517(((C1696) abstractC1685.ᵢʿ()).f6597, "Not wrapping {} as signed, as no key is set.");
        }
        return this.f8864.m8371(abstractC1685);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6210(C1114 c1114) {
        this.f8866 = c1114.f4723.contains(EnumC1112.f4714);
        boolean zContains = c1114.f4723.contains(EnumC1112.f4716);
        this.f8869 = zContains;
        C3486 c3486 = this.f8864;
        c3486.f13470.getClass();
        C3093 c3093 = c3486.f13462;
        if ((c3093.f11934 & 2) > 0) {
            this.f8862 = true;
        } else {
            this.f8862 = false;
        }
        if (zContains) {
            this.f8862 = false;
        }
        boolean z = this.f8866;
        if (z && this.f8862) {
            throw new SMB2GuestSigningRequiredException();
        }
        if (z) {
            this.f8862 = false;
        }
        if (((EnumC1689) ((C2753) c3093.f11939).f10767).m5367() && c1114.f4723.contains(EnumC1112.f4717)) {
            this.f8862 = false;
        }
        if (this.f8866 || this.f8869) {
            C2226 c2226 = this.f8859;
            if (c2226.f8856.m5367()) {
                throw new IllegalStateException("Cannot set a signing key (yet) for SMB3.x");
            }
            c2226.f8855 = "HmacSHA256";
            c2226.f8857 = null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2227 m6211(C4672 c4672) {
        try {
            C2227 c2227M8373 = this.f8864.f13468.m4527(c4672.f17810).m8373(this.f8863);
            this.f8861.add(c2227M8373);
            return c2227M8373;
        } catch (IOException e) {
            EnumC1683 enumC1683 = EnumC1683.f6540;
            throw new SMBApiException(4294967295L, "Could not connect to DFS root " + c4672, e);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6212() {
        C4514 c4514 = this.f8860;
        C3486 c3486 = this.f8864;
        InterfaceC3918 interfaceC3918 = f8858;
        try {
            interfaceC3918.mo5529(Long.valueOf(this.f8865), c3486.f13464, "Logging off session {} from host {}");
            C3222 c3222 = this.f8868;
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c3222.f12538;
            reentrantReadWriteLock.readLock().lock();
            try {
                ArrayList arrayList = new ArrayList(((HashMap) c3222.f12539).values());
                reentrantReadWriteLock.readLock().unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5160 abstractC5160 = (AbstractC5160) it.next();
                    try {
                        abstractC5160.close();
                    } catch (IOException e) {
                        interfaceC3918.mo5526(Long.valueOf(abstractC5160.f19711.f10817), e, "Caught exception while closing TreeConnect with id: {}");
                    }
                }
                Iterator it2 = this.f8861.iterator();
                while (it2.hasNext()) {
                    C2227 c2227 = (C2227) it2.next();
                    interfaceC3918.mo5529(Long.valueOf(c2227.f8865), Long.valueOf(this.f8865), "Logging off nested session {} for session {}");
                    try {
                        c2227.m6212();
                    } catch (TransportException unused) {
                        interfaceC3918.mo5518(Long.valueOf(c2227.f8865), "Caught exception while logging off nested session {}");
                    }
                }
                C5028 c5028M6209 = m6209(new C1105(4, (EnumC1689) ((C2753) c3486.f13462.f11939).f10767, EnumC1683.f6548, this.f8865, 0L));
                long j = c3486.f13470.f5200;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ٴˎ r5 = TransportException.f3662;
                C1105 c1105 = (C1105) ʾˈ.ˏᵢ(c5028M6209, j, timeUnit);
                if (EnumC1805.m5550(((C1696) ((InterfaceC3379) ((ﹳﹳ) c1105).ᐧⁱ)).f6598)) {
                    return;
                }
                throw new SMBApiException((C1696) ((InterfaceC3379) ((ﹳﹳ) c1105).ᐧⁱ), "Could not logoff session <<" + this.f8865 + ">>");
            } catch (Throwable th) {
                reentrantReadWriteLock.readLock().unlock();
                throw th;
            }
        } finally {
            c4514.f17374.ᵎـ(new C4515(this.f8865));
        }
    }
}
