package p379;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p158.AbstractC2339;
import p363.C4131;
import p363.C4132;
import p366.C4144;
import p366.C4149;
import p375.C4305;

/* renamed from: ᵢᐧ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4413 implements Closeable {

    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public static final C4417 f17000;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public long f17001;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f17002;

    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final LinkedHashSet f17003;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final LinkedHashMap f17004 = new LinkedHashMap();

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f17005;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final Socket f17006;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C4131 f17007;

    /* renamed from: ˋﾞ, reason: contains not printable characters */
    public final C4421 f17008;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f17009;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final C4417 f17010;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public long f17011;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public long f17012;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C4131 f17013;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f17014;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC4412 f17015;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C4131 f17016;

    /* renamed from: ᵎʽ, reason: contains not printable characters */
    public final C4399 f17017;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public long f17018;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public long f17019;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public C4417 f17020;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f17021;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public long f17022;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C4132 f17023;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public long f17024;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final C4409 f17025;

    static {
        C4417 c4417 = new C4417();
        c4417.m10026(7, 65535);
        c4417.m10026(5, 16384);
        f17000 = c4417;
    }

    public C4413(C4305 c4305) {
        this.f17015 = (AbstractC4412) c4305.f16749;
        String str = (String) c4305.f16748;
        this.f17009 = str == null ? null : str;
        this.f17005 = 3;
        C4132 c4132 = (C4132) c4305.f16745;
        this.f17023 = c4132;
        this.f17007 = c4132.m9484();
        this.f17013 = c4132.m9484();
        this.f17016 = c4132.m9484();
        this.f17025 = C4409.f16989;
        C4417 c4417 = new C4417();
        c4417.m10026(7, 16777216);
        this.f17010 = c4417;
        this.f17020 = f17000;
        this.f17024 = r0.m10027();
        Socket socket = (Socket) c4305.f16747;
        this.f17006 = socket == null ? null : socket;
        C4144 c4144 = (C4144) c4305.f16746;
        this.f17008 = new C4421(c4144 == null ? null : c4144);
        C4149 c4149 = (C4149) c4305.f16750;
        this.f17017 = new C4399(this, new C4403(c4149 != null ? c4149 : null));
        this.f17003 = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m10022(1, 9, null);
    }

    public final void flush() {
        this.f17008.flush();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized C4401 m10016(int i) {
        return (C4401) this.f17004.get(Integer.valueOf(i));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m10017(int i) {
        synchronized (this.f17008) {
            synchronized (this) {
                if (this.f17021) {
                    return;
                }
                this.f17021 = true;
                this.f17008.m10037(AbstractC2339.f9301, this.f17014, i);
            }
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m10018(int i, int i2) {
        this.f17007.m9479(new C4419(this.f17009 + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f17008.f17056);
        r6 = r3;
        r8.f17018 += r6;
     */
    /* renamed from: ˏʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10019(int r9, boolean r10, p366.C4143 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            ᵢᐧ.ﾞˊ r12 = r8.f17008
            r12.m10029(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r3 = r8.f17018     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r5 = r8.f17024     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L34
            java.util.LinkedHashMap r3 = r8.f17004     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r3 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L2a
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2a
            ᵢᐧ.ﾞˊ r3 = r8.f17008     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.f17056     // Catch: java.lang.Throwable -> L2a
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f17018     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f17018 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            ᵢᐧ.ﾞˊ r4 = r8.f17008
            if (r10 == 0) goto L54
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            r4.m10029(r5, r9, r11, r3)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p379.C4413.m10019(int, boolean, ᵔﾞ.ʿʼ, long):void");
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final synchronized void m10020(long j) {
        long j2 = this.f17001 + j;
        this.f17001 = j2;
        long j3 = j2 - this.f17019;
        if (j3 >= this.f17010.m10027() / 2) {
            m10023(0, j3);
            this.f17019 += j3;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized boolean m10021(long j) {
        if (this.f17021) {
            return false;
        }
        if (this.f17011 < this.f17012) {
            if (j >= this.f17022) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10022(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        byte[] bArr = AbstractC2339.f9301;
        try {
            m10017(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f17004.isEmpty()) {
                array = null;
            } else {
                array = this.f17004.values().toArray(new C4401[0]);
                this.f17004.clear();
            }
        }
        C4401[] c4401Arr = (C4401[]) array;
        if (c4401Arr != null) {
            for (C4401 c4401 : c4401Arr) {
                try {
                    c4401.m9997(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f17008.close();
        } catch (IOException unused3) {
        }
        try {
            this.f17006.close();
        } catch (IOException unused4) {
        }
        this.f17007.m9478();
        this.f17013.m9478();
        this.f17016.m9478();
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m10023(int i, long j) {
        this.f17007.m9479(new C4402(this.f17009 + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized C4401 m10024(int i) {
        C4401 c4401;
        c4401 = (C4401) this.f17004.remove(Integer.valueOf(i));
        notifyAll();
        return c4401;
    }
}
