package p366;

import android.support.v4.media.session.AbstractC0002;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p013.AbstractC1036;
import p164.C2372;
import p317.AbstractC3625;
import p332.C3778;
import p376.AbstractC4321;
import ˆʽ.ᵎˏ;
import ˎˊ.ˆʿ;
import ـˈ.ˉᵎ;

/* renamed from: ᵔﾞ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4143 implements InterfaceC4161, InterfaceC4160, Cloneable, ByteChannel {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public long f16041;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C4172 f16042;

    public final Object clone() {
        C4143 c4143 = new C4143();
        if (this.f16041 != 0) {
            C4172 c4172 = this.f16042;
            C4172 c4172M9587 = c4172.m9587();
            c4143.f16042 = c4172M9587;
            c4172M9587.f16104 = c4172M9587;
            c4172M9587.f16103 = c4172M9587;
            for (C4172 c41722 = c4172.f16103; c41722 != c4172; c41722 = c41722.f16103) {
                c4172M9587.f16104.m9586(c41722.m9587());
            }
            c4143.f16041 = this.f16041;
        }
        return c4143;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p366.InterfaceC4168
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4143) {
                long j = this.f16041;
                C4143 c4143 = (C4143) obj;
                if (j == c4143.f16041) {
                    if (j != 0) {
                        C4172 c4172 = this.f16042;
                        C4172 c41722 = c4143.f16042;
                        int i = c4172.f16099;
                        int i2 = c41722.f16099;
                        long j2 = 0;
                        while (j2 < this.f16041) {
                            long jMin = Math.min(c4172.f16101 - i, c41722.f16101 - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = c4172.f16102[i];
                                int i4 = i2 + 1;
                                if (b == c41722.f16102[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == c4172.f16101) {
                                C4172 c41723 = c4172.f16103;
                                i = c41723.f16099;
                                c4172 = c41723;
                            }
                            if (i2 == c41722.f16101) {
                                c41722 = c41722.f16103;
                                i2 = c41722.f16099;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p366.InterfaceC4160, p366.InterfaceC4168, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        C4172 c4172 = this.f16042;
        if (c4172 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c4172.f16101;
            for (int i3 = c4172.f16099; i3 < i2; i3++) {
                i = (i * 31) + c4172.f16102[i3];
            }
            c4172 = c4172.f16103;
        } while (c4172 != this.f16042);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C4172 c4172 = this.f16042;
        if (c4172 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c4172.f16101 - c4172.f16099);
        byteBuffer.put(c4172.f16102, c4172.f16099, iMin);
        int i = c4172.f16099 + iMin;
        c4172.f16099 = i;
        this.f16041 -= iMin;
        if (i == c4172.f16101) {
            this.f16042 = c4172.m9588();
            AbstractC4171.m9585(c4172);
        }
        return iMin;
    }

    @Override // p366.InterfaceC4161
    public final byte readByte() {
        long j = this.f16041;
        if (j == 0) {
            throw new EOFException();
        }
        C4172 c4172 = this.f16042;
        int i = c4172.f16099;
        int i2 = c4172.f16101;
        int i3 = i + 1;
        byte b = c4172.f16102[i];
        this.f16041 = j - 1;
        if (i3 == i2) {
            this.f16042 = c4172.m9588();
            AbstractC4171.m9585(c4172);
        } else {
            c4172.f16099 = i3;
        }
        return b;
    }

    @Override // p366.InterfaceC4161
    public final int readInt() throws EOFException {
        long j = this.f16041;
        if (j < 4) {
            throw new EOFException();
        }
        C4172 c4172 = this.f16042;
        int i = c4172.f16099;
        int i2 = c4172.f16101;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c4172.f16102;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f16041 = j - 4;
        if (i5 == i2) {
            this.f16042 = c4172.m9588();
            AbstractC4171.m9585(c4172);
        } else {
            c4172.f16099 = i5;
        }
        return i6;
    }

    @Override // p366.InterfaceC4161
    public final short readShort() throws EOFException {
        long j = this.f16041;
        if (j < 2) {
            throw new EOFException();
        }
        C4172 c4172 = this.f16042;
        int i = c4172.f16099;
        int i2 = c4172.f16101;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = c4172.f16102;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f16041 = j - 2;
        if (i5 == i2) {
            this.f16042 = c4172.m9588();
            AbstractC4171.m9585(c4172);
        } else {
            c4172.f16099 = i5;
        }
        return (short) i6;
    }

    @Override // p366.InterfaceC4161
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C4172 c4172 = this.f16042;
            if (c4172 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c4172.f16101 - c4172.f16099);
            long j2 = iMin;
            this.f16041 -= j2;
            j -= j2;
            int i = c4172.f16099 + iMin;
            c4172.f16099 = i;
            if (i == c4172.f16101) {
                this.f16042 = c4172.m9588();
                AbstractC4171.m9585(c4172);
            }
        }
    }

    public final String toString() {
        long j = this.f16041;
        if (j <= 2147483647L) {
            return m9516((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f16041).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C4172 c4172M9514 = m9514(1);
            int iMin = Math.min(i, 8192 - c4172M9514.f16101);
            byteBuffer.get(c4172M9514.f16102, c4172M9514.f16101, iMin);
            i -= iMin;
            c4172M9514.f16101 += iMin;
        }
        this.f16041 += iRemaining;
        return iRemaining;
    }

    @Override // p366.InterfaceC4160
    public final InterfaceC4160 write(byte[] bArr) {
        m9521(bArr, 0, bArr.length);
        return this;
    }

    @Override // p366.InterfaceC4160
    public final /* bridge */ /* synthetic */ InterfaceC4160 write(byte[] bArr, int i, int i2) {
        m9521(bArr, i, i2);
        return this;
    }

    @Override // p366.InterfaceC4160
    public final /* bridge */ /* synthetic */ InterfaceC4160 writeByte(int i) {
        m9509(i);
        return this;
    }

    @Override // p366.InterfaceC4160
    public final /* bridge */ /* synthetic */ InterfaceC4160 writeInt(int i) {
        m9492(i);
        return this;
    }

    @Override // p366.InterfaceC4160
    public final /* bridge */ /* synthetic */ InterfaceC4160 writeShort(int i) {
        m9517(i);
        return this;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m9492(int i) {
        C4172 c4172M9514 = m9514(4);
        int i2 = c4172M9514.f16101;
        byte[] bArr = c4172M9514.f16102;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c4172M9514.f16101 = i2 + 4;
        this.f16041 += 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: ʻʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m9493() throws java.io.EOFException {
        /*
            r19 = this;
            r0 = r19
            r1 = 4
            r2 = 48
            r4 = 1
            long r5 = r0.f16041
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto Lb0
            r5 = r7
            r9 = 0
            r10 = 0
        L11:
            ᵔﾞ.ﾞˊ r11 = r0.f16042
            byte[] r12 = r11.f16102
            int r13 = r11.f16099
            int r14 = r11.f16101
        L19:
            if (r13 >= r14) goto L69
            r15 = r12[r13]
            if (r15 < r2) goto L26
            r3 = 57
            if (r15 > r3) goto L26
            int r3 = r15 + (-48)
            goto L3b
        L26:
            r3 = 97
            if (r15 < r3) goto L31
            r3 = 102(0x66, float:1.43E-43)
            if (r15 > r3) goto L31
            int r3 = r15 + (-87)
            goto L3b
        L31:
            r3 = 65
            if (r15 < r3) goto L66
            r3 = 70
            if (r15 > r3) goto L66
            int r3 = r15 + (-55)
        L3b:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r18 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r18 != 0) goto L4b
            long r5 = r5 << r1
            long r2 = (long) r3
            long r5 = r5 | r2
            int r13 = r13 + r4
            int r9 = r9 + r4
            r2 = 48
            goto L19
        L4b:
            ᵔﾞ.ʿʼ r1 = new ᵔﾞ.ʿʼ
            r1.<init>()
            r1.m9535(r5)
            r1.m9509(r15)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.m9515()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L66:
            if (r9 == 0) goto L6b
            r10 = 1
        L69:
            r12 = 0
            goto L90
        L6b:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r3 = p376.AbstractC4318.f16773
            int r1 = r15 >> 4
            r1 = r1 & 15
            char r1 = r3[r1]
            r5 = r15 & 15
            char r3 = r3[r5]
            r5 = 2
            char[] r5 = new char[r5]
            r12 = 0
            r5[r12] = r1
            r5[r4] = r3
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r13 != r14) goto L9c
            ᵔﾞ.ﾞˊ r2 = r11.m9588()
            r0.f16042 = r2
            p366.AbstractC4171.m9585(r11)
            goto L9e
        L9c:
            r11.f16099 = r13
        L9e:
            if (r10 != 0) goto La9
            ᵔﾞ.ﾞˊ r2 = r0.f16042
            if (r2 != 0) goto La5
            goto La9
        La5:
            r2 = 48
            goto L11
        La9:
            long r1 = r0.f16041
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f16041 = r1
            return r5
        Lb0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p366.C4143.m9493():long");
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public final InputStream mo9494() {
        return new C3778(1, this);
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public final String m9495(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("byteCount: ", j).toString());
        }
        if (this.f16041 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C4172 c4172 = this.f16042;
        int i = c4172.f16099;
        if (i + j > c4172.f16101) {
            return new String(m9527(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c4172.f16102, i, i2, charset);
        int i3 = c4172.f16099 + i2;
        c4172.f16099 = i3;
        this.f16041 -= j;
        if (i3 == c4172.f16101) {
            this.f16042 = c4172.m9588();
            AbstractC4171.m9585(c4172);
        }
        return str;
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public final void m9496(String str) {
        m9502(0, str.length(), str);
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("byteCount < 0: ", j).toString());
        }
        long j2 = this.f16041;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c4143.mo4566(this, j);
        return j;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final long mo9497(C4155 c4155) {
        return m9533(c4155, 0L);
    }

    /* renamed from: ˆﾞ, reason: contains not printable characters */
    public final void m9498(int i) {
        if (i < 128) {
            m9509(i);
            return;
        }
        if (i < 2048) {
            C4172 c4172M9514 = m9514(2);
            int i2 = c4172M9514.f16101;
            byte[] bArr = c4172M9514.f16102;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c4172M9514.f16101 = i2 + 2;
            this.f16041 += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m9509(63);
            return;
        }
        if (i < 65536) {
            C4172 c4172M95142 = m9514(3);
            int i3 = c4172M95142.f16101;
            byte[] bArr2 = c4172M95142.f16102;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c4172M95142.f16101 = i3 + 3;
            this.f16041 += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(ˆʿ.ˎٴ(i)));
        }
        C4172 c4172M95143 = m9514(4);
        int i4 = c4172M95143.f16101;
        byte[] bArr3 = c4172M95143.f16102;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c4172M95143.f16101 = i4 + 4;
        this.f16041 += 4;
    }

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public final short m9499() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return C4151.f16057;
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ˉᵎ, reason: contains not printable characters */
    public final OutputStream mo9500() {
        return new C2372(this, 1);
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC4160 mo9501(long j) {
        m9528(j);
        return this;
    }

    /* renamed from: ˊﹶ, reason: contains not printable characters */
    public final void m9502(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            throw new IllegalArgumentException(ˉᵎ.ˉⁱ("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0002.m55(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbM40 = AbstractC0002.m40(i2, "endIndex > string.length: ", " > ");
            sbM40.append(str.length());
            throw new IllegalArgumentException(sbM40.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C4172 c4172M9514 = m9514(1);
                int i3 = c4172M9514.f16101 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = c4172M9514.f16102;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c4172M9514.f16101;
                int i6 = (i3 + i) - i5;
                c4172M9514.f16101 = i5 + i6;
                this.f16041 += i6;
            } else {
                if (cCharAt2 < 2048) {
                    C4172 c4172M95142 = m9514(2);
                    int i7 = c4172M95142.f16101;
                    byte[] bArr2 = c4172M95142.f16102;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c4172M95142.f16101 = i7 + 2;
                    this.f16041 += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C4172 c4172M95143 = m9514(3);
                    int i8 = c4172M95143.f16101;
                    byte[] bArr3 = c4172M95143.f16102;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c4172M95143.f16101 = i8 + 3;
                    this.f16041 += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m9509(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C4172 c4172M95144 = m9514(4);
                        int i11 = c4172M95144.f16101;
                        byte[] bArr4 = c4172M95144.f16102;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c4172M95144.f16101 = i11 + 4;
                        this.f16041 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // p366.InterfaceC4168
    /* renamed from: ˋˉ */
    public final void mo4566(C4143 c4143, long j) {
        C4172 c4172M9584;
        if (c4143 == this) {
            throw new IllegalArgumentException("source == this");
        }
        ˆʿ.ʽᐧ(c4143.f16041, 0L, j);
        while (j > 0) {
            C4172 c4172 = c4143.f16042;
            int i = c4172.f16101 - c4172.f16099;
            if (j < i) {
                C4172 c41722 = this.f16042;
                C4172 c41723 = c41722 != null ? c41722.f16104 : null;
                if (c41723 != null && c41723.f16100) {
                    if ((c41723.f16101 + j) - (c41723.f16105 ? 0 : c41723.f16099) <= 8192) {
                        c4172.m9589(c41723, (int) j);
                        c4143.f16041 -= j;
                        this.f16041 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i2 >= 1024) {
                    c4172M9584 = c4172.m9587();
                } else {
                    c4172M9584 = AbstractC4171.m9584();
                    int i3 = c4172.f16099;
                    AbstractC1036.m3995(i3, i3 + i2, c4172.f16102, c4172M9584.f16102);
                }
                c4172M9584.f16101 = c4172M9584.f16099 + i2;
                c4172.f16099 += i2;
                c4172.f16104.m9586(c4172M9584);
                c4143.f16042 = c4172M9584;
            }
            C4172 c41724 = c4143.f16042;
            long j2 = c41724.f16101 - c41724.f16099;
            c4143.f16042 = c41724.m9588();
            C4172 c41725 = this.f16042;
            if (c41725 == null) {
                this.f16042 = c41724;
                c41724.f16104 = c41724;
                c41724.f16103 = c41724;
            } else {
                c41725.f16104.m9586(c41724);
                C4172 c41726 = c41724.f16104;
                if (c41726 == c41724) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c41726.f16100) {
                    int i4 = c41724.f16101 - c41724.f16099;
                    if (i4 <= (8192 - c41726.f16101) + (c41726.f16105 ? 0 : c41726.f16099)) {
                        c41724.m9589(c41726, i4);
                        c41724.m9588();
                        AbstractC4171.m9585(c41724);
                    }
                }
            }
            c4143.f16041 -= j2;
            this.f16041 += j2;
            j -= j2;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final boolean m9503() {
        return this.f16041 == 0;
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ˎˉ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC4160 mo9504(C4155 c4155) {
        m9524(c4155);
        return this;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final long m9505(C4155 c4155, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        long j2 = j;
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("fromIndex < 0: ", j2).toString());
        }
        C4172 c4172 = this.f16042;
        if (c4172 == null) {
            return -1L;
        }
        long j4 = this.f16041;
        if (j4 - j2 < j2) {
            while (j4 > j2) {
                c4172 = c4172.f16104;
                j4 -= c4172.f16101 - c4172.f16099;
            }
            byte[] bArr = c4155.f16070;
            if (bArr.length == 2) {
                byte b = bArr[0];
                byte b2 = bArr[1];
                while (j4 < this.f16041) {
                    byte[] bArr2 = c4172.f16102;
                    i3 = (int) ((c4172.f16099 + j2) - j4);
                    int i5 = c4172.f16101;
                    while (i3 < i5) {
                        byte b3 = bArr2[i3];
                        if (b3 == b || b3 == b2) {
                            i4 = c4172.f16099;
                        } else {
                            i3++;
                        }
                    }
                    j4 += c4172.f16101 - c4172.f16099;
                    c4172 = c4172.f16103;
                    j2 = j4;
                }
                return -1L;
            }
            while (j4 < this.f16041) {
                byte[] bArr3 = c4172.f16102;
                i3 = (int) ((c4172.f16099 + j2) - j4);
                int i6 = c4172.f16101;
                while (i3 < i6) {
                    byte b4 = bArr3[i3];
                    for (byte b5 : bArr) {
                        if (b4 == b5) {
                            i4 = c4172.f16099;
                        }
                    }
                    i3++;
                }
                j4 += c4172.f16101 - c4172.f16099;
                c4172 = c4172.f16103;
                j2 = j4;
            }
            return -1L;
            return (i3 - i4) + j4;
        }
        while (true) {
            long j5 = (c4172.f16101 - c4172.f16099) + j3;
            if (j5 > j2) {
                break;
            }
            c4172 = c4172.f16103;
            j3 = j5;
        }
        byte[] bArr4 = c4155.f16070;
        if (bArr4.length == 2) {
            byte b6 = bArr4[0];
            byte b7 = bArr4[1];
            while (j3 < this.f16041) {
                byte[] bArr5 = c4172.f16102;
                i = (int) ((c4172.f16099 + j2) - j3);
                int i7 = c4172.f16101;
                while (i < i7) {
                    byte b8 = bArr5[i];
                    if (b8 == b6 || b8 == b7) {
                        i2 = c4172.f16099;
                    } else {
                        i++;
                    }
                }
                j3 += c4172.f16101 - c4172.f16099;
                c4172 = c4172.f16103;
                j2 = j3;
            }
            return -1L;
        }
        while (j3 < this.f16041) {
            byte[] bArr6 = c4172.f16102;
            i = (int) ((c4172.f16099 + j2) - j3);
            int i8 = c4172.f16101;
            while (i < i8) {
                byte b9 = bArr6[i];
                for (byte b10 : bArr4) {
                    if (b9 == b10) {
                        i2 = c4172.f16099;
                    }
                }
                i++;
            }
            j3 += c4172.f16101 - c4172.f16099;
            c4172 = c4172.f16103;
            j2 = j3;
        }
        return -1L;
        return (i - i2) + j3;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final String mo9506(long j) {
        return m9495(j, AbstractC3625.f13869);
    }

    /* renamed from: ˎᵢ, reason: contains not printable characters */
    public final long m9507(InterfaceC4163 interfaceC4163) {
        long j = 0;
        while (true) {
            long jMo4577 = interfaceC4163.mo4577(this, 8192L);
            if (jMo4577 == -1) {
                return j;
            }
            j += jMo4577;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9508() throws EOFException {
        skip(this.f16041);
    }

    /* renamed from: ˑʾ, reason: contains not printable characters */
    public final void m9509(int i) {
        C4172 c4172M9514 = m9514(1);
        int i2 = c4172M9514.f16101;
        c4172M9514.f16101 = i2 + 1;
        c4172M9514.f16102[i2] = (byte) i;
        this.f16041++;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final int mo9510(C4165 c4165) throws EOFException {
        int iM9822 = AbstractC4321.m9822(this, c4165, false);
        if (iM9822 == -1) {
            return -1;
        }
        skip(c4165.f16082[iM9822].mo9566());
        return iM9822;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: יʻ, reason: contains not printable characters */
    public final boolean mo9511(long j) {
        return this.f16041 >= j;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: יˋ, reason: contains not printable characters */
    public final String mo9512(Charset charset) {
        return m9495(this.f16041, charset);
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ـˆ, reason: contains not printable characters */
    public final String mo9513() {
        long jM9523 = m9523((byte) 10, 0L, Long.MAX_VALUE);
        if (jM9523 != -1) {
            return AbstractC4321.m9821(this, jM9523);
        }
        long j = this.f16041;
        if (j != 0) {
            return m9495(j, AbstractC3625.f13869);
        }
        return null;
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final C4172 m9514(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C4172 c4172 = this.f16042;
        if (c4172 == null) {
            C4172 c4172M9584 = AbstractC4171.m9584();
            this.f16042 = c4172M9584;
            c4172M9584.f16104 = c4172M9584;
            c4172M9584.f16103 = c4172M9584;
            return c4172M9584;
        }
        C4172 c41722 = c4172.f16104;
        if (c41722.f16101 + i <= 8192 && c41722.f16100) {
            return c41722;
        }
        C4172 c4172M95842 = AbstractC4171.m9584();
        c41722.m9586(c4172M95842);
        return c4172M95842;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public final String m9515() {
        return m9495(this.f16041, AbstractC3625.f13869);
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public final C4155 m9516(int i) {
        if (i == 0) {
            return C4155.f16067;
        }
        ˆʿ.ʽᐧ(this.f16041, 0L, i);
        C4172 c4172 = this.f16042;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c4172.f16101;
            int i6 = c4172.f16099;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c4172 = c4172.f16103;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C4172 c41722 = this.f16042;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c41722.f16102;
            i2 += c41722.f16101 - c41722.f16099;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c41722.f16099;
            c41722.f16105 = true;
            i7++;
            c41722 = c41722.f16103;
        }
        return new C4158(bArr, iArr);
    }

    /* renamed from: ᐧʼ, reason: contains not printable characters */
    public final void m9517(int i) {
        C4172 c4172M9514 = m9514(2);
        int i2 = c4172M9514.f16101;
        byte[] bArr = c4172M9514.f16102;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c4172M9514.f16101 = i2 + 2;
        this.f16041 += 2;
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final int m9518(byte[] bArr, int i, int i2) {
        ˆʿ.ʽᐧ(bArr.length, i, i2);
        C4172 c4172 = this.f16042;
        if (c4172 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c4172.f16101 - c4172.f16099);
        int i3 = c4172.f16099;
        System.arraycopy(c4172.f16102, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = c4172.f16099 + iMin;
        c4172.f16099 = i4;
        this.f16041 -= iMin;
        if (i4 == c4172.f16101) {
            this.f16042 = c4172.m9588();
            AbstractC4171.m9585(c4172);
        }
        return iMin;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final boolean mo9519(C4155 c4155) {
        byte[] bArr = c4155.f16070;
        int length = bArr.length;
        if (length < 0 || this.f16041 < length || bArr.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (m9520(i) != c4155.f16070[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final byte m9520(long j) {
        ˆʿ.ʽᐧ(this.f16041, j, 1L);
        C4172 c4172 = this.f16042;
        c4172.getClass();
        long j2 = this.f16041;
        if (j2 - j < j) {
            while (j2 > j) {
                c4172 = c4172.f16104;
                j2 -= c4172.f16101 - c4172.f16099;
            }
            return c4172.f16102[(int) ((c4172.f16099 + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c4172.f16101;
            int i2 = c4172.f16099;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return c4172.f16102[(int) ((i2 + j) - j3)];
            }
            c4172 = c4172.f16103;
            j3 = j4;
        }
    }

    /* renamed from: ᵎʾ, reason: contains not printable characters */
    public final void m9521(byte[] bArr, int i, int i2) {
        long j = i2;
        ˆʿ.ʽᐧ(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C4172 c4172M9514 = m9514(1);
            int iMin = Math.min(i3 - i, 8192 - c4172M9514.f16101);
            int i4 = i + iMin;
            System.arraycopy(bArr, i, c4172M9514.f16102, c4172M9514.f16101, i4 - i);
            c4172M9514.f16101 += iMin;
            i = i4;
        }
        this.f16041 += j;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final C4155 mo9522(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("byteCount: ", j).toString());
        }
        if (this.f16041 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C4155(m9527(j));
        }
        C4155 c4155M9516 = m9516((int) j);
        skip(j);
        return c4155M9516;
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final long m9523(byte b, long j, long j2) {
        C4172 c4172;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f16041 + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f16041;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 != j4 && (c4172 = this.f16042) != null) {
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    c4172 = c4172.f16104;
                    j6 -= c4172.f16101 - c4172.f16099;
                }
                while (j6 < j4) {
                    byte[] bArr = c4172.f16102;
                    int iMin = (int) Math.min(c4172.f16101, (c4172.f16099 + j4) - j6);
                    for (int i = (int) ((c4172.f16099 + j3) - j6); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return (i - c4172.f16099) + j6;
                        }
                    }
                    j6 += c4172.f16101 - c4172.f16099;
                    c4172 = c4172.f16103;
                    j3 = j6;
                }
            } else {
                while (true) {
                    long j7 = (c4172.f16101 - c4172.f16099) + j5;
                    if (j7 > j3) {
                        break;
                    }
                    c4172 = c4172.f16103;
                    j5 = j7;
                }
                while (j5 < j4) {
                    byte[] bArr2 = c4172.f16102;
                    int iMin2 = (int) Math.min(c4172.f16101, (c4172.f16099 + j4) - j5);
                    for (int i2 = (int) ((c4172.f16099 + j3) - j5); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b) {
                            return (i2 - c4172.f16099) + j5;
                        }
                    }
                    j5 += c4172.f16101 - c4172.f16099;
                    c4172 = c4172.f16103;
                    j3 = j5;
                }
            }
        }
        return -1L;
    }

    /* renamed from: ᵎᵢ, reason: contains not printable characters */
    public final void m9524(C4155 c4155) {
        c4155.mo9567(this, c4155.mo9566());
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ᵔ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC4160 mo9525(String str) {
        m9496(str);
        return this;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public final void mo9526(long j) throws EOFException {
        if (this.f16041 < j) {
            throw new EOFException();
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final byte[] m9527(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("byteCount: ", j).toString());
        }
        if (this.f16041 < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iM9518 = m9518(bArr, i2, i - i2);
            if (iM9518 == -1) {
                throw new EOFException();
            }
            i2 += iM9518;
        }
        return bArr;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public final void m9528(long j) {
        byte[] bArr;
        if (j == 0) {
            m9509(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m9502(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C4172 c4172M9514 = m9514(i);
        int i2 = c4172M9514.f16101 + i;
        while (true) {
            bArr = c4172M9514.f16102;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = AbstractC4321.f16782[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c4172M9514.f16101 += i;
        this.f16041 += i;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final long mo9529(C4143 c4143) {
        long j = this.f16041;
        if (j > 0) {
            c4143.mo4566(this, j);
        }
        return j;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long m9530() {
        long j = this.f16041;
        if (j == 0) {
            return 0L;
        }
        C4172 c4172 = this.f16042.f16104;
        if (c4172.f16101 < 8192 && c4172.f16100) {
            j -= r3 - c4172.f16099;
        }
        return j;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final long mo9531(C4155 c4155) {
        return m9505(c4155, 0L);
    }

    @Override // p366.InterfaceC4161, p366.InterfaceC4160
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C4143 mo9532() {
        return this;
    }

    /* renamed from: ﾞʽ, reason: contains not printable characters */
    public final long m9533(C4155 c4155, long j) {
        long j2 = j;
        if (c4155.f16070.length <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("fromIndex < 0: ", j2).toString());
        }
        C4172 c4172 = this.f16042;
        if (c4172 != null) {
            long j4 = this.f16041;
            long j5 = j4 - j2;
            byte[] bArr = c4155.f16070;
            if (j5 < j2) {
                while (j4 > j2) {
                    c4172 = c4172.f16104;
                    j4 -= c4172.f16101 - c4172.f16099;
                }
                byte b = bArr[0];
                int length = bArr.length;
                long j6 = (this.f16041 - length) + 1;
                while (j4 < j6) {
                    byte[] bArr2 = c4172.f16102;
                    long j7 = j6;
                    int iMin = (int) Math.min(c4172.f16101, (c4172.f16099 + j6) - j4);
                    for (int i = (int) ((c4172.f16099 + j2) - j4); i < iMin; i++) {
                        if (bArr2[i] == b && AbstractC4321.m9823(c4172, i + 1, bArr, length)) {
                            return (i - c4172.f16099) + j4;
                        }
                    }
                    j4 += c4172.f16101 - c4172.f16099;
                    c4172 = c4172.f16103;
                    j2 = j4;
                    j6 = j7;
                }
            } else {
                while (true) {
                    long j8 = (c4172.f16101 - c4172.f16099) + j3;
                    if (j8 > j2) {
                        break;
                    }
                    c4172 = c4172.f16103;
                    j3 = j8;
                }
                byte b2 = bArr[0];
                int length2 = bArr.length;
                long j9 = (this.f16041 - length2) + 1;
                while (j3 < j9) {
                    byte[] bArr3 = c4172.f16102;
                    long j10 = j9;
                    int iMin2 = (int) Math.min(c4172.f16101, (c4172.f16099 + j9) - j3);
                    for (int i2 = (int) ((c4172.f16099 + j2) - j3); i2 < iMin2; i2++) {
                        if (bArr3[i2] == b2 && AbstractC4321.m9823(c4172, i2 + 1, bArr, length2)) {
                            return (i2 - c4172.f16099) + j3;
                        }
                    }
                    j3 += c4172.f16101 - c4172.f16099;
                    c4172 = c4172.f16103;
                    j2 = j3;
                    j9 = j10;
                }
            }
        }
        return -1L;
    }

    @Override // p366.InterfaceC4160
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC4160 mo9534(int i, int i2, String str) {
        m9502(i, i2, str);
        return this;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final void m9535(long j) {
        if (j == 0) {
            m9509(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C4172 c4172M9514 = m9514(i);
        int i2 = c4172M9514.f16101;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            c4172M9514.f16102[i3] = AbstractC4321.f16782[(int) (15 & j)];
            j >>>= 4;
        }
        c4172M9514.f16101 += i;
        this.f16041 += i;
    }
}
