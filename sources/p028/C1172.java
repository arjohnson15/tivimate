package p028;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import p080.AbstractC1702;
import p260.C3222;
import p298.C3500;
import p298.C3501;

/* renamed from: ʼˋ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1172 extends InputStream {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public AbstractC1174 f4847;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C3500 f4848;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C3501 f4849;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final char[] f4852;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final PushbackInputStream f4853;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C3222 f4850 = new C3222(14);

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final CRC32 f4855 = new CRC32();

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public boolean f4856 = false;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f4851 = false;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public boolean f4854 = false;

    public C1172(InputStream inputStream, char[] cArr, C3501 c3501) {
        int i = c3501.f13558;
        if (i < 512) {
            throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
        }
        this.f4853 = new PushbackInputStream(inputStream, i);
        this.f4852 = cArr;
        this.f4849 = c3501;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f4851) {
            throw new IOException("Stream closed");
        }
        return !this.f4854 ? 1 : 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4851) {
            return;
        }
        AbstractC1174 abstractC1174 = this.f4847;
        if (abstractC1174 != null) {
            abstractC1174.close();
        }
        this.f4851 = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f4851) {
            throw new IOException("Stream closed");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative read length");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f4848 == null) {
            return -1;
        }
        try {
            int i3 = this.f4847.read(bArr, i, i2);
            if (i3 == -1) {
                m4227();
            } else {
                this.f4855.update(bArr, i, i3);
            }
            return i3;
        } catch (IOException e) {
            C3500 c3500 = this.f4848;
            if (c3500.f13498 && AbstractC1702.m5410(2, c3500.f13497)) {
                throw new ZipException(e.getMessage(), e.getCause());
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4227() throws java.io.IOException {
        /*
            r12 = this;
            ʼˋ.ˑʽ r0 = r12.f4847
            java.io.PushbackInputStream r1 = r12.f4853
            int r0 = r0.mo4228(r1)
            ʼˋ.ˑʽ r2 = r12.f4847
            r2.mo4229(r1, r0)
            ٴﾞ.ٴˎ r0 = r12.f4848
            boolean r2 = r0.f13506
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L83
            boolean r2 = r12.f4856
            if (r2 == 0) goto L1a
            goto L83
        L1a:
            java.util.List r0 = r0.f13503
            r2 = 0
            if (r0 != 0) goto L21
        L1f:
            r0 = 0
            goto L3a
        L21:
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1f
            java.lang.Object r5 = r0.next()
            ٴﾞ.ﹳﹳ r5 = (p298.C3502) r5
            long r5 = r5.f13560
            r7 = 1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L25
            r0 = 1
        L3a:
            יﹶ.ـﹶ r5 = r12.f4850
            r5.getClass()
            byte[] r6 = new byte[r3]
            p223.AbstractC2978.m7358(r1, r6)
            java.lang.Object r5 = r5.f12539
            יﹶ.ـﹶ r5 = (p260.C3222) r5
            long r7 = r5.m7936(r2, r6)
            r9 = 134695760(0x8074b50, double:6.65485477E-316)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L5a
            p223.AbstractC2978.m7358(r1, r6)
            long r7 = r5.m7936(r2, r6)
        L5a:
            if (r0 == 0) goto L71
            java.lang.Object r0 = r5.f12540
            byte[] r0 = (byte[]) r0
            int r6 = r0.length
            p260.C3222.m7930(r1, r0, r6)
            long r9 = r5.m7936(r2, r0)
            int r6 = r0.length
            p260.C3222.m7930(r1, r0, r6)
            long r0 = r5.m7936(r2, r0)
            goto L7b
        L71:
            int r0 = r5.m7935(r1)
            long r9 = (long) r0
            int r0 = r5.m7935(r1)
            long r0 = (long) r0
        L7b:
            ٴﾞ.ٴˎ r2 = r12.f4848
            r2.f13494 = r9
            r2.f13499 = r0
            r2.f13507 = r7
        L83:
            ٴﾞ.ٴˎ r0 = r12.f4848
            int r1 = r0.f13497
            java.util.zip.CRC32 r2 = r12.f4855
            r5 = 2
            if (r1 != r3) goto L97
            ٴﾞ.ـﹶ r0 = r0.f13504
            int r0 = r0.f13553
            boolean r0 = p080.AbstractC1702.m5410(r0, r5)
            if (r0 == 0) goto L97
            goto La3
        L97:
            ٴﾞ.ٴˎ r0 = r12.f4848
            long r0 = r0.f13507
            long r6 = r2.getValue()
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 != 0) goto Lac
        La3:
            r0 = 0
            r12.f4848 = r0
            r2.reset()
            r12.f4854 = r4
            return
        Lac:
            ٴﾞ.ٴˎ r0 = r12.f4848
            boolean r1 = r0.f13498
            if (r1 == 0) goto Lb8
            int r0 = r0.f13497
            boolean r0 = p080.AbstractC1702.m5410(r5, r0)
        Lb8:
            net.lingala.zip4j.exception.ZipException r0 = new net.lingala.zip4j.exception.ZipException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Reached end of entry, but crc verification failed for "
            r1.<init>(r2)
            ٴﾞ.ٴˎ r2 = r12.f4848
            java.lang.String r2 = r2.f13492
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p028.C1172.m4227():void");
    }
}
