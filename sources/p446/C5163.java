package p446;

import com.google.android.gms.internal.measurement.C0559;
import java.io.IOException;
import java.io.OutputStream;
import p153.C2324;
import p344.AbstractC3917;
import p344.InterfaceC3918;

/* renamed from: ﾞˉ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5163 extends OutputStream {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static final InterfaceC3918 f19728 = AbstractC3917.m9105(C5163.class);

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f19729;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C5167 f19730;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C5162 f19731;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5167 c5167;
        while (true) {
            c5167 = this.f19730;
            C2324 c2324 = c5167.f19751;
            if (c2324 == null || c2324.f9220 <= 0) {
                break;
            } else {
                m11459();
            }
        }
        c5167.f19751 = null;
        this.f19729 = true;
        this.f19731 = null;
        f19728.mo5517(Long.valueOf(c5167.f11097), "EOF, {} bytes written");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f19729) {
            throw new IOException("Stream is closed");
        }
        C2324 c2324 = this.f19730.f19751;
        if (c2324 == null || c2324.f9220 <= 0) {
            return;
        }
        m11459();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f19729) {
            throw new IOException("Stream is closed");
        }
        C5167 c5167 = this.f19730;
        C2324 c2324 = c5167.f19751;
        if (c2324.f9220 == c2324.f9219.length) {
            flush();
        }
        C2324 c23242 = c5167.f19751;
        if (c23242.f9220 == c23242.f9219.length) {
            return;
        }
        c23242.m6394(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4 != r3.length) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r2.m6394(r8, r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r9 = r9 + r1;
        r10 = r10 - r1;
     */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.f19729
            if (r0 != 0) goto L4f
        L4:
            ﾞˉ.ᐧʻ r0 = r7.f19730
            ˊˉ.ٴˎ r1 = r0.f19751
            byte[] r1 = r1.f9219
            int r1 = r1.length
            int r1 = java.lang.Math.min(r10, r1)
        Lf:
            ˊˉ.ٴˎ r2 = r0.f19751
            byte[] r3 = r2.f9219
            int r4 = r3.length
            if (r1 > r4) goto L2d
            int r4 = r2.f9220
            int r5 = r4 + r1
            int r6 = r3.length
            if (r5 <= r6) goto L21
            r7.flush()
            goto Lf
        L21:
            int r0 = r3.length
            if (r4 != r0) goto L25
            goto L28
        L25:
            r2.m6394(r8, r9, r1)
        L28:
            int r9 = r9 + r1
            int r10 = r10 - r1
            if (r10 > 0) goto L4
            return
        L2d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "RingBuffer of length "
            r9.<init>(r10)
            int r10 = r3.length
            r9.append(r10)
            java.lang.String r10 = " cannot accomodate "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = " bytes."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L4f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Stream is closed"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p446.C5163.write(byte[], int, int):void");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11459() {
        C5162 c5162 = this.f19731;
        c5162.getClass();
        while (true) {
            C5167 c5167 = this.f19730;
            C2324 c2324 = c5167.f19751;
            if (c2324 == null || c2324.f9220 <= 0) {
                return;
            }
            C5162.f19724.mo5509(c5162.f19726, Long.valueOf(c5167.f11097), "Writing to {} from offset {}");
            C5168 c5168 = c5162.f19727;
            long j = c5168.f19714;
            C0559 c0559 = c5162.f19725;
        }
    }
}
