package p296;

import com.google.android.gms.internal.measurement.C0559;
import com.hierynomus.mssmb2.SMBApiException;
import com.hierynomus.protocol.transport.TransportException;
import com.hierynomus.smbj.common.SMBRuntimeException;
import com.hierynomus.spnego.SpnegoException;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p018.C1098;
import p018.C1114;
import p018.C1116;
import p018.EnumC1102;
import p038.C1268;
import p038.C1269;
import p051.AbstractC1315;
import p051.C1316;
import p075.C1651;
import p078.AbstractC1685;
import p078.C1696;
import p078.EnumC1683;
import p078.EnumC1688;
import p078.EnumC1689;
import p087.C1737;
import p091.C1751;
import p109.EnumC1805;
import p110.C1806;
import p114.InterfaceC1819;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p117.EnumC1846;
import p143.C2226;
import p143.C2227;
import p157.C2338;
import p180.AbstractC2500;
import p180.InterfaceC2502;
import p200.C2753;
import p215.C2819;
import p237.C3093;
import p237.C3094;
import p260.C3222;
import p260.InterfaceC3219;
import p266.C3262;
import p266.C3264;
import p283.InterfaceC3379;
import p294.C3483;
import p331.C3762;
import p331.C3767;
import p332.C3776;
import p332.C3778;
import p332.C3779;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import p365.AbstractRunnableC4141;
import p390.C4514;
import p390.C4516;
import p419.C4852;
import p419.C4853;
import p433.C5028;
import p433.C5029;
import p456.C5349;
import ʿﾞ.ﹳﹳ;
import ˈי.ʾˈ;
import ˊﹶ.ˋˉ;
import ـˊ.ʿʼ;
import ᵎﹳ.ᐧʻ;
import ᵔᵔ.ٴˎ;
import ﹳᴵ.ˉי;

/* renamed from: ٴﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3486 extends ﹳﹳ implements Closeable {

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public static final ˋˉ f13459;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public static final InterfaceC3918 f13460 = AbstractC3917.m9105(C3486.class);

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C4514 f13461;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C3093 f13462;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C3762 f13463;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public String f13464;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3767 f13465;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public int f13466;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final ReentrantLock f13467;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C1269 f13468;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C3767 f13469;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C1268 f13470;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C0559 f13471;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final ٴˎ f13472;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C3093 f13473;

    static {
        InterfaceC1819[] interfaceC1819Arr = {new ˉי(13), new C3264(1)};
        ˋˉ r2 = new ˋˉ(18, false);
        r2.ˆʿ = interfaceC1819Arr;
        f13459 = r2;
    }

    public C3486(C1268 c1268, C1269 c1269, C4514 c4514) {
        super(12);
        this.f13465 = new C3767(13);
        this.f13469 = new C3767(13);
        C3762 c3762 = new C3762(11);
        c3762.f14530 = new ReentrantReadWriteLock();
        c3762.f14531 = new HashMap();
        c3762.f14532 = new HashMap();
        this.f13463 = c3762;
        this.f13472 = new ٴˎ(13);
        this.f13467 = new ReentrantLock();
        this.f13470 = c1268;
        this.f13468 = c1269;
        ٴˎ r6 = c1268.f5191;
        C3262 c3262 = new C3262(false, new ʿʼ(1), this, f13459);
        r6.getClass();
        this.f13473 = new C3093(c1268.f5195, c1268.f5196, c3262);
        this.f13461 = c4514;
        c4514.m10278(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (((AtomicInteger) ((ﹳﹳ) this).ᐧⁱ).decrementAndGet() <= 0) {
            C4514 c4514 = this.f13461;
            C3093 c3093 = this.f13473;
            InterfaceC3918 interfaceC3918 = f13460;
            try {
                C3767 c3767 = this.f13465;
                ReentrantLock reentrantLock = (ReentrantLock) c3767.f14557;
                reentrantLock.lock();
                try {
                    ArrayList arrayList = new ArrayList(((HashMap) c3767.f14558).values());
                    reentrantLock.unlock();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C2227 c2227 = (C2227) it.next();
                        try {
                            c2227.m6212();
                        } catch (IOException e) {
                            interfaceC3918.mo5511(Long.valueOf(c2227.f8865), e);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } finally {
                c3093.m7606();
                interfaceC3918.mo5513(this.f13464, "Closed connection to {}");
                c4514.f17374.ᵎـ(new C4516(this.f13464, this.f13466));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x0007, B:5:0x000f, B:8:0x002a, B:10:0x0038, B:17:0x004a, B:19:0x0054, B:22:0x0064, B:24:0x00ce, B:16:0x0048), top: B:29:0x0007 }] */
    /* renamed from: ᴵˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p433.C5028 m8371(p078.AbstractC1685 r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.locks.ReentrantLock r2 = r11.f13467
            r2.lock()
            ʿˋ.ˋⁱ r3 = r12.mo4131()     // Catch: java.lang.Throwable -> L62
            boolean r3 = r3 instanceof p018.C1108     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto Lcd
            com.google.android.gms.internal.measurement.ﹳﾞ r3 = r11.f13471     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r3.f2913     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.Semaphore r3 = (java.util.concurrent.Semaphore) r3     // Catch: java.lang.Throwable -> L62
            int r3 = r3.availablePermits()     // Catch: java.lang.Throwable -> L62
            int r4 = r12.mo4128()     // Catch: java.lang.Throwable -> L62
            int r4 = r4 - r1
            r5 = 65536(0x10000, float:9.1835E-41)
            int r4 = r4 / r5
            int r4 = java.lang.Math.abs(r4)     // Catch: java.lang.Throwable -> L62
            int r4 = r4 + r1
            ᵎᐧ.ـﹶ r5 = p296.C3486.f13460
            if (r4 <= r1) goto L41
            ˑـ.ʽᐧ r6 = r11.f13462     // Catch: java.lang.Throwable -> L62
            ʿˋ.ˏᵢ r7 = p078.EnumC1688.f6572     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r6.f11942     // Catch: java.lang.Throwable -> L62
            java.util.EnumSet r6 = (java.util.EnumSet) r6     // Catch: java.lang.Throwable -> L62
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L62
            if (r6 != 0) goto L41
            java.lang.String r4 = r11.f13464     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "Connection to {} does not support multi-credit requests."
            r5.mo5516(r4, r6)     // Catch: java.lang.Throwable -> L62
        L3f:
            r4 = 1
            goto L4a
        L41:
            if (r4 >= r3) goto L44
            goto L4a
        L44:
            if (r4 <= r1) goto L3f
            if (r3 <= r1) goto L3f
            int r4 = r3 + (-1)
        L4a:
            ٴˆ.ʽᐧ r6 = r12.ᵢʿ()     // Catch: java.lang.Throwable -> L62
            ʿˋ.ﹶˆ r6 = (p078.C1696) r6     // Catch: java.lang.Throwable -> L62
            r6.f6596 = r4     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L64
            java.lang.String r6 = "There are no credits left to send {}, will block until there are more credits available."
            ٴˆ.ʽᐧ r7 = r12.ᵢʿ()     // Catch: java.lang.Throwable -> L62
            ʿˋ.ﹶˆ r7 = (p078.C1696) r7     // Catch: java.lang.Throwable -> L62
            ʿˋ.ˉי r7 = r7.f6597     // Catch: java.lang.Throwable -> L62
            r5.mo5512(r7, r6)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r12 = move-exception
            goto Ld7
        L64:
            com.google.android.gms.internal.measurement.ﹳﾞ r6 = r11.f13471     // Catch: java.lang.Throwable -> L62
            long[] r6 = r6.m2489(r4)     // Catch: java.lang.Throwable -> L62
            ٴˆ.ʽᐧ r7 = r12.ᵢʿ()     // Catch: java.lang.Throwable -> L62
            ʿˋ.ﹶˆ r7 = (p078.C1696) r7     // Catch: java.lang.Throwable -> L62
            r8 = r6[r0]     // Catch: java.lang.Throwable -> L62
            r7.f6605 = r8     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = "Granted {} (out of {}) credits to {}"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L62
            r10[r0] = r8     // Catch: java.lang.Throwable -> L62
            r10[r1] = r9     // Catch: java.lang.Throwable -> L62
            r1 = 2
            r10[r1] = r12     // Catch: java.lang.Throwable -> L62
            r5.mo5520(r7, r10)     // Catch: java.lang.Throwable -> L62
            ٴˆ.ʽᐧ r1 = r12.ᵢʿ()     // Catch: java.lang.Throwable -> L62
            ʿˋ.ﹶˆ r1 = (p078.C1696) r1     // Catch: java.lang.Throwable -> L62
            int r3 = 512 - r3
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Throwable -> L62
            r1.f6603 = r3     // Catch: java.lang.Throwable -> L62
            ٴﹳ.ˑʽ r1 = new ٴﹳ.ˑʽ     // Catch: java.lang.Throwable -> L62
            ʿˋ.ˋⁱ r3 = r12.mo4131()     // Catch: java.lang.Throwable -> L62
            r4 = r6[r0]     // Catch: java.lang.Throwable -> L62
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L62
            r1.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L62
            ᴵﹳ.ˋⁱ r0 = r11.f13463     // Catch: java.lang.Throwable -> L62
            r0.m8798(r1)     // Catch: java.lang.Throwable -> L62
            ٴﹳ.ـﹶ r0 = new ٴﹳ.ـﹶ     // Catch: java.lang.Throwable -> L62
            ٴˆ.ʽᐧ r3 = r12.ᵢʿ()     // Catch: java.lang.Throwable -> L62
            ʿˋ.ﹶˆ r3 = (p078.C1696) r3     // Catch: java.lang.Throwable -> L62
            long r3 = r3.f6602     // Catch: java.lang.Throwable -> L62
            r0.<init>(r11, r1, r3)     // Catch: java.lang.Throwable -> L62
            ﹶᐧ.ʽᐧ r3 = new ﹶᐧ.ʽᐧ     // Catch: java.lang.Throwable -> L62
            ﹶᐧ.ˑʽ r1 = r1.f13477     // Catch: java.lang.Throwable -> L62
            r1.getClass()     // Catch: java.lang.Throwable -> L62
            ﹶᐧ.ﹳﹳ r4 = new ﹶᐧ.ﹳﹳ     // Catch: java.lang.Throwable -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L62
            r4.f19101 = r1     // Catch: java.lang.Throwable -> L62
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L62
            goto Lce
        Lcd:
            r3 = 0
        Lce:
            ˑـ.ʽᐧ r0 = r11.f13473     // Catch: java.lang.Throwable -> L62
            r0.m7607(r12)     // Catch: java.lang.Throwable -> L62
            r2.unlock()
            return r3
        Ld7:
            r2.unlock()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p296.C3486.m8371(ʿˋ.ˋⁱ):ﹶᐧ.ʽᐧ");
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final AbstractC1685 m8372() {
        C1268 c1268 = this.f13470;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) c1268.f5197);
        UUID uuid = (UUID) this.f13462.f11940;
        C1116 c1116 = new C1116(36, EnumC1689.f6575, EnumC1683.f6540, 0L, 0L);
        c1116.f4735 = enumSetCopyOf;
        c1116.f4733 = uuid;
        C5028 c5028M8371 = m8371(c1116);
        long j = c1268.f5200;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ٴˎ r4 = TransportException.f3662;
        return (AbstractC1685) ʾˈ.ˏᵢ(c5028M8371, j, timeUnit);
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final C2227 m8373(C3222 c3222) {
        InterfaceC3379 interfaceC3379;
        String str;
        InterfaceC3918 interfaceC3918;
        C1268 c1268 = this.f13470;
        try {
            InterfaceC3219 interfaceC3219M8374 = m8374(c3222);
            interfaceC3219M8374.mo7919(c1268);
            C2227 c2227 = new C2227(this, c3222, this.f13461, this.f13468.f5206, c1268.f5199);
            byte[] bArr = (byte[]) this.f13462.f11937;
            C1114 c1114M8376 = m8376(0L, m8375(interfaceC3219M8374, c3222, Arrays.copyOf(bArr, bArr.length), c2227));
            long j = ((C1696) ((InterfaceC3379) ((ﹳﹳ) c1114M8376).ᐧⁱ)).f6602;
            C3767 c3767 = this.f13469;
            if (j != 0) {
                Long lValueOf = Long.valueOf(j);
                ReentrantLock reentrantLock = (ReentrantLock) c3767.f14557;
                reentrantLock.lock();
                try {
                    ((HashMap) c3767.f14558).put(lValueOf, c2227);
                    reentrantLock.unlock();
                } finally {
                }
            }
            while (true) {
                try {
                    interfaceC3379 = (InterfaceC3379) ((ﹳﹳ) c1114M8376).ᐧⁱ;
                    long j2 = ((C1696) interfaceC3379).f6598;
                    str = (String) c3222.f12538;
                    interfaceC3918 = f13460;
                    if (j2 != 3221225494L) {
                        break;
                    }
                    interfaceC3918.mo5509(str, interfaceC3219M8374, "More processing required for authentication of {} using {}");
                    c1114M8376 = m8376(j, m8375(interfaceC3219M8374, c3222, c1114M8376.f4722, c2227));
                } catch (Throwable th) {
                    if (j != 0) {
                        c3767.m8812(Long.valueOf(j));
                    }
                    throw th;
                }
            }
            if (((C1696) interfaceC3379).f6598 != 0) {
                throw new SMBApiException((C1696) ((InterfaceC3379) ((ﹳﹳ) c1114M8376).ᐧⁱ), String.format("Authentication failed for '%s' using %s", str, interfaceC3219M8374));
            }
            c2227.f8865 = ((C1696) interfaceC3379).f6602;
            byte[] bArr2 = c1114M8376.f4722;
            if (bArr2 != null) {
                m8375(interfaceC3219M8374, c3222, bArr2, c2227);
            }
            c2227.m6210(c1114M8376);
            interfaceC3918.mo5527(str, this.f13464, Long.valueOf(c2227.f8865));
            C3767 c37672 = this.f13465;
            Long lValueOf2 = Long.valueOf(c2227.f8865);
            ((ReentrantLock) c37672.f14557).lock();
            try {
                ((HashMap) c37672.f14558).put(lValueOf2, c2227);
                if (j != 0) {
                    c3767.m8812(Long.valueOf(j));
                }
                return c2227;
            } finally {
            }
        } catch (SpnegoException | IOException e) {
            throw new SMBRuntimeException(e);
        }
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final InterfaceC3219 m8374(C3222 c3222) throws IOException, SpnegoException {
        C1268 c1268 = this.f13470;
        c1268.getClass();
        ArrayList arrayList = new ArrayList(new ArrayList(c1268.f5187));
        ArrayList arrayList2 = new ArrayList();
        byte[] bArr = (byte[]) this.f13462.f11937;
        if (Arrays.copyOf(bArr, bArr.length).length > 0) {
            C1316 c1316 = new C1316();
            byte[] bArr2 = (byte[]) this.f13462.f11937;
            try {
                C1751 c1751 = new C1751(new C1651(9), new C3778(0, new C3776(Arrays.copyOf(bArr2, bArr2.length), true, C3779.f14620)));
                try {
                    C4852 c4852 = (C4852) c1751.m5467();
                    if (c4852.f7065.f7083 != EnumC1846.f7087) {
                        throw new SpnegoException("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: " + c4852);
                    }
                    ArrayList arrayList3 = ((C4853) c4852.m10916(AbstractC1845.f7075)).f18353;
                    AbstractC1841 abstractC1841 = (AbstractC1841) arrayList3.get(0);
                    if (!(abstractC1841 instanceof C1737)) {
                        throw new SpnegoException("Expected to find the SPNEGO OID (" + AbstractC1315.f5362 + "), not: " + abstractC1841);
                    }
                    c1316.m569((AbstractC1841) arrayList3.get(1));
                    c1751.close();
                    arrayList2 = (ArrayList) c1316.f5359;
                } finally {
                }
            } catch (IOException e) {
                throw new SpnegoException("Could not read NegTokenInit from buffer", e);
            }
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC2502 interfaceC2502 = (InterfaceC2502) it.next();
            if (arrayList2.isEmpty() || arrayList2.contains(new C1737(interfaceC2502.mo6615()))) {
                InterfaceC3219 interfaceC3219 = (InterfaceC3219) interfaceC2502.mo6608();
                if (interfaceC3219.mo7920(c3222)) {
                    return interfaceC3219;
                }
            }
        }
        throw new SMBRuntimeException("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c3222);
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final byte[] m8375(InterfaceC3219 interfaceC3219, C3222 c3222, byte[] bArr, C2227 c2227) {
        C5349 c5349Mo7918 = interfaceC3219.mo7918(c3222, bArr);
        if (c5349Mo7918 == null) {
            return null;
        }
        this.f13462.getClass();
        this.f13462.getClass();
        byte[] bArr2 = (byte[]) c5349Mo7918.f20756;
        byte[] bArr3 = (byte[]) c5349Mo7918.f20757;
        if (bArr3 != null) {
            C2226 c2226 = c2227.f8859;
            if (c2226.f8856.m5367()) {
                throw new IllegalStateException("Cannot set a signing key (yet) for SMB3.x");
            }
            c2226.f8855 = "HmacSHA256";
            c2226.f8857 = bArr3;
        }
        return bArr2;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final C1114 m8376(long j, byte[] bArr) {
        EnumC1689 enumC1689 = (EnumC1689) ((C2753) this.f13462.f11939).f10767;
        EnumSet enumSetOf = EnumSet.of(EnumC1102.f4694);
        EnumSet enumSet = (EnumSet) this.f13462.f11936;
        C1114 c1114 = new C1114(25, enumC1689, EnumC1683.f6543);
        c1114.f4724 = enumC1689;
        c1114.f4725 = (byte) AbstractC2500.m6610(enumSetOf);
        c1114.f4721 = AbstractC2500.m6610(enumSet);
        c1114.f4722 = bArr;
        ((C1696) ((InterfaceC3379) ((ﹳﹳ) c1114).ᐧⁱ)).f6602 = j;
        C5028 c5028M8371 = m8371(c1114);
        long j2 = this.f13470.f5200;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ٴˎ r1 = TransportException.f3662;
        return (C1114) ((AbstractC1685) ʾˈ.ˏᵢ(c5028M8371, j2, timeUnit));
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final void m8377(String str) throws Throwable {
        AbstractC1685 abstractC1685M8372;
        boolean z = false;
        int i = 1;
        C3093 c3093 = this.f13473;
        if (c3093.m7605()) {
            throw new IllegalStateException(ᐧʻ.ﾞˊ("This connection is already connected to ", this.f13464));
        }
        this.f13464 = str;
        this.f13466 = 445;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, 445);
        String hostString = inetSocketAddress.getHostString();
        Socket socketCreateSocket = ((C1806) c3093.f11939).createSocket(hostString, inetSocketAddress.getPort());
        c3093.f11940 = socketCreateSocket;
        socketCreateSocket.setSoTimeout(c3093.f11934);
        c3093.f11936 = new BufferedOutputStream(((Socket) c3093.f11940).getOutputStream(), 9000);
        InputStream inputStream = ((Socket) c3093.f11940).getInputStream();
        C3262 c3262 = (C3262) c3093.f11941;
        C3094 c3094 = new C3094(hostString, inputStream, (ˋˉ) c3262.f12725, (C3486) c3262.f12724);
        c3093.f11942 = c3094;
        Thread thread = c3094.f16036;
        AbstractRunnableC4141.f16033.mo5517(thread.getName(), "Starting PacketReader on thread: {}");
        thread.start();
        C0559 c0559 = new C0559(13, z);
        c0559.f2912 = new AtomicLong(0L);
        c0559.f2913 = new Semaphore(1);
        this.f13471 = c0559;
        C1268 c1268 = this.f13470;
        UUID uuid = c1268.f5188;
        C3093 c30932 = new C3093(i);
        UUID.randomUUID();
        c30932.f11940 = uuid;
        c30932.f11937 = new byte[0];
        c30932.f11935 = str;
        c30932.f11936 = EnumSet.of(EnumC1688.f6571);
        this.f13462 = c30932;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) c1268.f5197);
        String str2 = this.f13464;
        InterfaceC3918 interfaceC3918 = f13460;
        interfaceC3918.mo5509(enumSetCopyOf, str2, "Negotiating dialects {} with server {}");
        if (c1268.f5198) {
            EnumSet enumSetCopyOf2 = EnumSet.copyOf((Collection) c1268.f5197);
            C2338 c2338 = new C2338(new C3483());
            c2338.f9297 = enumSetCopyOf2;
            long j = this.f13471.m2489(1)[0];
            if (j != 0) {
                throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
            }
            C3487 c3487 = new C3487(c2338, j, UUID.randomUUID());
            this.f13463.m8798(c3487);
            c3093.m7607(c2338);
            C5029 c5029 = c3487.f13477;
            c5029.getClass();
            new AtomicBoolean(false);
            new ReentrantReadWriteLock();
            long j2 = c1268.f5200;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ٴˎ r4 = TransportException.f3662;
            ٴˎ r42 = TransportException.f3662;
            try {
                Object objM11145 = c5029.m11145(j2, timeUnit);
                if (objM11145 == null) {
                    throw ((ʿʼ) c5029.f19100).ˏᵢ(new TimeoutException("Timeout expired"));
                }
                AbstractC1685 abstractC1685 = (AbstractC1685) objM11145;
                if (!(abstractC1685 instanceof C1098)) {
                    throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: " + abstractC1685);
                }
                C1098 c1098 = (C1098) abstractC1685;
                EnumC1689 enumC1689 = c1098.f4685;
                abstractC1685M8372 = c1098;
                if (enumC1689 == EnumC1689.f6576) {
                    abstractC1685M8372 = m8372();
                }
            } catch (Throwable th) {
                try {
                    throw new ExecutionException(th);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw r42.ˆʿ(e);
                } catch (ExecutionException e2) {
                    e = e2;
                    throw r42.ˆʿ(e);
                } catch (TimeoutException e3) {
                    e = e3;
                    throw r42.ˆʿ(e);
                }
            }
        } else {
            abstractC1685M8372 = m8372();
        }
        if (!(abstractC1685M8372 instanceof C1098)) {
            throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response, but got: " + abstractC1685M8372);
        }
        C1098 c10982 = (C1098) abstractC1685M8372;
        if (!EnumC1805.m5550(((C1696) ((InterfaceC3379) ((ﹳﹳ) c10982).ᐧⁱ)).f6598)) {
            throw new SMBApiException((C1696) ((InterfaceC3379) ((ﹳﹳ) c10982).ᐧⁱ), "Failure during dialect negotiation");
        }
        C3093 c30933 = this.f13462;
        c30933.getClass();
        c30933.f11941 = c10982.f4680;
        EnumSet enumSetM6614 = AbstractC2500.m6614(c10982.f4682, EnumC1688.class);
        c30933.f11942 = enumSetM6614;
        EnumC1689 enumC16892 = c10982.f4685;
        int iMax = c10982.f4683;
        int iMax2 = c10982.f4686;
        int iMax3 = c10982.f4679;
        boolean zContains = enumSetM6614.contains(EnumC1688.f6572);
        C2753 c2753 = new C2753(1);
        c2753.f10767 = enumC16892;
        if (!zContains) {
            iMax = Math.max(iMax, 65536);
        }
        c2753.f10766 = iMax;
        if (!zContains) {
            iMax2 = Math.max(iMax2, 65536);
        }
        c2753.f10768 = iMax2;
        if (!zContains) {
            iMax3 = Math.max(iMax3, 65536);
        }
        c2753.f10770 = iMax3;
        c30933.f11939 = c2753;
        c30933.f11934 = c10982.f4684;
        System.currentTimeMillis();
        C2819 c2819 = c10982.f4681;
        c2819.getClass();
        TimeUnit.MILLISECONDS.convert((c2819.f10959 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS);
        interfaceC3918.mo5517(this.f13462, "Negotiated the following connection settings: {}");
        interfaceC3918.mo5513(this.f13464, "Successfully connected to: {}");
    }
}
