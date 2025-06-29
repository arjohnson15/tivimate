package p393;

import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;

/* renamed from: ⁱˑ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4522 implements Closeable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public byte[] f17386;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f17387;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f17388;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final FileInputStream f17389;

    public C4522(FileInputStream fileInputStream) {
        Charset charset = AbstractC4525.f17404;
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f17389 = fileInputStream;
        this.f17386 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f17389) {
            try {
                if (this.f17386 != null) {
                    this.f17386 = null;
                    this.f17389.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m10285() {
        /*
            r8 = this;
            java.io.FileInputStream r0 = r8.f17389
            monitor-enter(r0)
            byte[] r1 = r8.f17386     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto La4
            int r2 = r8.f17387     // Catch: java.lang.Throwable -> L3e
            int r3 = r8.f17388     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L23
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3e
            java.io.FileInputStream r3 = r8.f17389     // Catch: java.lang.Throwable -> L3e
            int r1 = r3.read(r1, r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r1 == r5) goto L1d
            r8.f17387 = r4     // Catch: java.lang.Throwable -> L3e
            r8.f17388 = r1     // Catch: java.lang.Throwable -> L3e
            goto L23
        L1d:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        L23:
            int r1 = r8.f17387     // Catch: java.lang.Throwable -> L3e
        L25:
            int r2 = r8.f17388     // Catch: java.lang.Throwable -> L3e
            r3 = 10
            if (r1 == r2) goto L56
            byte[] r2 = r8.f17386     // Catch: java.lang.Throwable -> L3e
            r6 = r2[r1]     // Catch: java.lang.Throwable -> L3e
            if (r6 != r3) goto L53
            int r3 = r8.f17387     // Catch: java.lang.Throwable -> L3e
            if (r1 == r3) goto L40
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L3e
            r6 = 13
            if (r5 != r6) goto L40
            goto L41
        L3e:
            r1 = move-exception
            goto Lac
        L40:
            r4 = r1
        L41:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = p393.AbstractC4525.f17404     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            r8.f17387 = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r5
        L53:
            int r1 = r1 + 1
            goto L25
        L56:
            ⁱˑ.ﹳﹳ r1 = new ⁱˑ.ﹳﹳ     // Catch: java.lang.Throwable -> L3e
            int r2 = r8.f17388     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.f17387     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L3e
        L62:
            byte[] r2 = r8.f17386     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.f17387     // Catch: java.lang.Throwable -> L3e
            int r7 = r8.f17388     // Catch: java.lang.Throwable -> L3e
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L3e
            r8.f17388 = r5     // Catch: java.lang.Throwable -> L3e
            byte[] r2 = r8.f17386     // Catch: java.lang.Throwable -> L3e
            int r6 = r2.length     // Catch: java.lang.Throwable -> L3e
            java.io.FileInputStream r7 = r8.f17389     // Catch: java.lang.Throwable -> L3e
            int r2 = r7.read(r2, r4, r6)     // Catch: java.lang.Throwable -> L3e
            if (r2 == r5) goto L9e
            r8.f17387 = r4     // Catch: java.lang.Throwable -> L3e
            r8.f17388 = r2     // Catch: java.lang.Throwable -> L3e
            r2 = 0
        L7e:
            int r6 = r8.f17388     // Catch: java.lang.Throwable -> L3e
            if (r2 == r6) goto L62
            byte[] r6 = r8.f17386     // Catch: java.lang.Throwable -> L3e
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L3e
            if (r7 != r3) goto L9b
            int r3 = r8.f17387     // Catch: java.lang.Throwable -> L3e
            if (r2 == r3) goto L91
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L3e
        L91:
            int r2 = r2 + 1
            r8.f17387 = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r1
        L9b:
            int r2 = r2 + 1
            goto L7e
        L9e:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        La4:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p393.C4522.m10285():java.lang.String");
    }
}
