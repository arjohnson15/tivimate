package p430;

import java.io.Closeable;
import p158.AbstractC2339;
import p366.InterfaceC4161;

/* renamed from: ﹶˏ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5001 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC2339.m6438(mo5667());
    }

    /* renamed from: ʽᐧ */
    public abstract C5002 mo5666();

    /* renamed from: ˑʽ */
    public abstract InterfaceC4161 mo5667();

    /* renamed from: ـﹶ */
    public abstract long mo5668();

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0004, B:5:0x000b, B:7:0x001a, B:9:0x0024, B:16:0x0032, B:21:0x003c, B:20:0x003a), top: B:29:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m11089() {
        /*
            r8 = this;
            ᵔﾞ.ᐧʻ r0 = r8.mo5667()
            ﹶˏ.ˎٴ r1 = r8.mo5666()     // Catch: java.lang.Throwable -> L48
            r2 = 0
            if (r1 == 0) goto L3a
            java.nio.charset.Charset r3 = p317.AbstractC3625.f13869     // Catch: java.lang.Throwable -> L48
            java.lang.String[] r1 = r1.f18949     // Catch: java.lang.Throwable -> L48
            int r4 = r1.length     // Catch: java.lang.Throwable -> L48
            int r4 = r4 + (-1)
            r5 = 2
            r6 = 0
            int r4 = com.google.android.gms.internal.play_billing.ˎˑ.ˑי(r6, r4, r5)     // Catch: java.lang.Throwable -> L48
            if (r4 < 0) goto L2e
        L1a:
            r5 = r1[r6]     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = "charset"
            boolean r5 = p317.AbstractC3629.m8562(r5, r7)     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L29
            int r6 = r6 + 1
            r1 = r1[r6]     // Catch: java.lang.Throwable -> L48
            goto L2f
        L29:
            if (r6 == r4) goto L2e
            int r6 = r6 + 2
            goto L1a
        L2e:
            r1 = r2
        L2f:
            if (r1 != 0) goto L32
            goto L38
        L32:
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.IllegalArgumentException -> L37 java.lang.Throwable -> L48
            goto L38
        L37:
        L38:
            if (r3 != 0) goto L3c
        L3a:
            java.nio.charset.Charset r3 = p317.AbstractC3625.f13869     // Catch: java.lang.Throwable -> L48
        L3c:
            java.nio.charset.Charset r1 = p158.AbstractC2339.m6445(r0, r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r0.mo9512(r1)     // Catch: java.lang.Throwable -> L48
            android.support.v4.media.session.AbstractC0001.m5(r0, r2)
            return r1
        L48:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r2 = move-exception
            android.support.v4.media.session.AbstractC0001.m5(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p430.AbstractC5001.m11089():java.lang.String");
    }
}
