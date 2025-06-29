package p066;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p147.C2255;
import ﹳᴵ.ˉי;

/* renamed from: ʾᵢ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1538 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f6254;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f6255;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2255 f6256;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final long f6253 = TimeUnit.HOURS.toMillis(24);

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final long f6252 = TimeUnit.MINUTES.toMillis(30);

    public C1538() {
        if (ˉי.ˎˑ == null) {
            Pattern pattern = C2255.f8972;
            ˉי.ˎˑ = new ˉי(16);
        }
        ˉי r0 = ˉי.ˎˑ;
        if (C2255.f8973 == null) {
            C2255.f8973 = new C2255(r0);
        }
        this.f6256 = C2255.f8973;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m5124() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f6255     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            ˊ.ﹶˆ r0 = r5.f6256     // Catch: java.lang.Throwable -> L19
            ﹳᴵ.ˉי r0 = r0.f8974     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r5.f6254     // Catch: java.lang.Throwable -> L19
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r5)
            return r0
        L1e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066.C1538.m5124():boolean");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m5125() {
        this.f6255 = 0;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized long m5126(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return f6253;
        }
        double dPow = Math.pow(2.0d, this.f6255);
        this.f6256.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f6252);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized void m5127(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            m5125();
            return;
        }
        this.f6255++;
        long jM5126 = m5126(i);
        this.f6256.f8974.getClass();
        this.f6254 = System.currentTimeMillis() + jM5126;
    }
}
