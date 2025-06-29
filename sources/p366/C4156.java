package p366;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ᵔﾞ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4156 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f16071;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Object f16072;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f16073;

    public /* synthetic */ C4156(Object obj, int i, Object obj2) {
        this.f16073 = i;
        this.f16071 = obj;
        this.f16072 = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f16073) {
            case 0:
                C4156 c4156 = (C4156) this.f16072;
                C4146 c4146 = (C4146) this.f16071;
                c4146.m9582();
                try {
                    c4156.close();
                    if (c4146.m9583()) {
                        throw c4146.m9541(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!c4146.m9583()) {
                        throw e;
                    }
                    throw c4146.m9541(e);
                } finally {
                    c4146.m9583();
                }
            default:
                ((InputStream) this.f16071).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f16073) {
            case 0:
                return "AsyncTimeout.source(" + ((C4156) this.f16072) + ')';
            default:
                return "source(" + ((InputStream) this.f16071) + ')';
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo4577(p366.C4143 r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Object r7 = r5.f16071
            r0 = 8192(0x2000, double:4.0474E-320)
            java.lang.Object r8 = r5.f16072
            int r2 = r5.f16073
            switch(r2) {
                case 0: goto L72;
                default: goto Lb;
            }
        Lb:
            r2 = 1
            ᵔﾞ.ˎˑ r8 = (p366.C4151) r8     // Catch: java.lang.AssertionError -> L3c
            r8.mo9538()     // Catch: java.lang.AssertionError -> L3c
            ᵔﾞ.ﾞˊ r8 = r6.m9514(r2)     // Catch: java.lang.AssertionError -> L3c
            int r3 = r8.f16101     // Catch: java.lang.AssertionError -> L3c
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.lang.AssertionError -> L3c
            long r0 = java.lang.Math.min(r0, r3)     // Catch: java.lang.AssertionError -> L3c
            int r1 = (int) r0     // Catch: java.lang.AssertionError -> L3c
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch: java.lang.AssertionError -> L3c
            byte[] r0 = r8.f16102     // Catch: java.lang.AssertionError -> L3c
            int r3 = r8.f16101     // Catch: java.lang.AssertionError -> L3c
            int r7 = r7.read(r0, r3, r1)     // Catch: java.lang.AssertionError -> L3c
            r0 = -1
            if (r7 != r0) goto L41
            int r7 = r8.f16099     // Catch: java.lang.AssertionError -> L3c
            int r0 = r8.f16101     // Catch: java.lang.AssertionError -> L3c
            if (r7 != r0) goto L3e
            ᵔﾞ.ﾞˊ r7 = r8.m9588()     // Catch: java.lang.AssertionError -> L3c
            r6.f16042 = r7     // Catch: java.lang.AssertionError -> L3c
            p366.AbstractC4171.m9585(r8)     // Catch: java.lang.AssertionError -> L3c
            goto L3e
        L3c:
            r6 = move-exception
            goto L4e
        L3e:
            r6 = -1
            goto L4d
        L41:
            int r0 = r8.f16101     // Catch: java.lang.AssertionError -> L3c
            int r0 = r0 + r7
            r8.f16101 = r0     // Catch: java.lang.AssertionError -> L3c
            long r0 = r6.f16041     // Catch: java.lang.AssertionError -> L3c
            long r7 = (long) r7     // Catch: java.lang.AssertionError -> L3c
            long r0 = r0 + r7
            r6.f16041 = r0     // Catch: java.lang.AssertionError -> L3c
            r6 = r7
        L4d:
            return r6
        L4e:
            java.util.logging.Logger r7 = p366.AbstractC4152.f16061
            java.lang.Throwable r7 = r6.getCause()
            r8 = 0
            if (r7 == 0) goto L68
            java.lang.String r7 = r6.getMessage()
            if (r7 == 0) goto L64
            java.lang.String r0 = "getsockname failed"
            boolean r7 = p317.AbstractC3616.m8533(r7, r0, r8)
            goto L65
        L64:
            r7 = 0
        L65:
            if (r7 == 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 == 0) goto L71
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L71:
            throw r6
        L72:
            ᵔﾞ.ˑʽ r8 = (p366.C4156) r8
            ᵔﾞ.ˈٴ r7 = (p366.C4146) r7
            r7.m9582()
            long r0 = r8.mo4577(r6, r0)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r6 = r7.m9583()
            if (r6 != 0) goto L84
            return r0
        L84:
            r6 = 0
            java.io.IOException r6 = r7.m9541(r6)
            throw r6
        L8a:
            r6 = move-exception
            goto L99
        L8c:
            r6 = move-exception
            boolean r8 = r7.m9583()     // Catch: java.lang.Throwable -> L8a
            if (r8 != 0) goto L94
            goto L98
        L94:
            java.io.IOException r6 = r7.m9541(r6)     // Catch: java.lang.Throwable -> L8a
        L98:
            throw r6     // Catch: java.lang.Throwable -> L8a
        L99:
            r7.m9583()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p366.C4156.mo4577(ᵔﾞ.ʿʼ, long):long");
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        switch (this.f16073) {
            case 0:
                return (C4146) this.f16071;
            default:
                return (C4151) this.f16072;
        }
    }
}
