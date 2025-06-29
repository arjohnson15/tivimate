package p028;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;

/* renamed from: ʼˋ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1178 extends AbstractC1174 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public byte[] f4874;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Inflater f4875;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public byte[] f4876;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f4877;

    @Override // p028.AbstractC1174, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Inflater inflater = this.f4875;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override // p028.AbstractC1174, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4874;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // p028.AbstractC1174, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return -1;
     */
    @Override // p028.AbstractC1174, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r6, int r7, int r8) throws java.util.zip.DataFormatException, java.io.IOException {
        /*
            r5 = this;
        L0:
            java.util.zip.Inflater r0 = r5.f4875     // Catch: java.util.zip.DataFormatException -> L3e
            int r0 = r0.inflate(r6, r7, r8)     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 != 0) goto L41
            java.util.zip.Inflater r0 = r5.f4875     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.finished()     // Catch: java.util.zip.DataFormatException -> L3e
            r1 = -1
            if (r0 != 0) goto L40
            java.util.zip.Inflater r0 = r5.f4875     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 == 0) goto L1a
            goto L40
        L1a:
            java.util.zip.Inflater r0 = r5.f4875     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.needsInput()     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 == 0) goto L0
            byte[] r0 = r5.f4876     // Catch: java.util.zip.DataFormatException -> L3e
            int r2 = r0.length     // Catch: java.util.zip.DataFormatException -> L3e
            ʼˋ.ʽᐧ r3 = r5.f4858     // Catch: java.util.zip.DataFormatException -> L3e
            r4 = 0
            int r2 = r3.read(r0, r4, r2)     // Catch: java.util.zip.DataFormatException -> L3e
            r5.f4877 = r2     // Catch: java.util.zip.DataFormatException -> L3e
            if (r2 == r1) goto L36
            java.util.zip.Inflater r1 = r5.f4875     // Catch: java.util.zip.DataFormatException -> L3e
            r1.setInput(r0, r4, r2)     // Catch: java.util.zip.DataFormatException -> L3e
            goto L0
        L36:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L3e
            java.lang.String r7 = "Unexpected end of input stream"
            r6.<init>(r7)     // Catch: java.util.zip.DataFormatException -> L3e
            throw r6     // Catch: java.util.zip.DataFormatException -> L3e
        L3e:
            r6 = move-exception
            goto L42
        L40:
            return r1
        L41:
            return r0
        L42:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p028.C1178.read(byte[], int, int):int");
    }

    @Override // p028.AbstractC1174
    /* renamed from: ʽᐧ */
    public final int mo4228(PushbackInputStream pushbackInputStream) throws IOException {
        int remaining = this.f4875.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(this.f4858.f4833, this.f4877 - remaining, remaining);
        }
        return remaining;
    }

    @Override // p028.AbstractC1174
    /* renamed from: ـﹶ */
    public final void mo4229(PushbackInputStream pushbackInputStream, int i) {
        Inflater inflater = this.f4875;
        if (inflater != null) {
            inflater.end();
            this.f4875 = null;
        }
        super.mo4229(pushbackInputStream, i);
    }
}
