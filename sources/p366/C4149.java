package p366;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p317.AbstractC3625;
import p332.C3778;
import p376.AbstractC4321;
import ˆʽ.ᵎˏ;
import ˎˊ.ˆʿ;

/* renamed from: ᵔﾞ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4149 implements InterfaceC4161 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4143 f16049 = new C4143();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f16050;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4163 f16051;

    public C4149(InterfaceC4163 interfaceC4163) {
        this.f16051 = interfaceC4163;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f16050) {
            return;
        }
        this.f16050 = true;
        this.f16051.close();
        this.f16049.m9508();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16050;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C4143 c4143 = this.f16049;
        if (c4143.f16041 == 0 && this.f16051.mo4577(c4143, 8192L) == -1) {
            return -1;
        }
        return c4143.read(byteBuffer);
    }

    @Override // p366.InterfaceC4161
    public final byte readByte() throws EOFException {
        mo9526(1L);
        return this.f16049.readByte();
    }

    @Override // p366.InterfaceC4161
    public final int readInt() throws EOFException {
        mo9526(4L);
        return this.f16049.readInt();
    }

    @Override // p366.InterfaceC4161
    public final short readShort() throws EOFException {
        mo9526(2L);
        return this.f16049.readShort();
    }

    @Override // p366.InterfaceC4161
    public final void skip(long j) throws EOFException {
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C4143 c4143 = this.f16049;
            if (c4143.f16041 == 0 && this.f16051.mo4577(c4143, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c4143.f16041);
            c4143.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f16051 + ')';
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ʻﹳ */
    public final InputStream mo9494() {
        return new C3778(2, this);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long m9547(byte b, long j, long j2) {
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (0 > j2) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("fromIndex=0 toIndex=", j2).toString());
        }
        while (jMax < j2) {
            C4143 c4143 = this.f16049;
            long jM9523 = c4143.m9523(b, jMax, j2);
            if (jM9523 != -1) {
                return jM9523;
            }
            long j3 = c4143.f16041;
            if (j3 >= j2 || this.f16051.mo4577(c4143, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final short m9548() throws EOFException {
        mo9526(2L);
        return this.f16049.m9499();
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("byteCount < 0: ", j).toString());
        }
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        C4143 c41432 = this.f16049;
        if (c41432.f16041 == 0 && this.f16051.mo4577(c41432, 8192L) == -1) {
            return -1L;
        }
        return c41432.mo4577(c4143, Math.min(j, c41432.f16041));
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ʿˏ */
    public final long mo9497(C4155 c4155) {
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C4143 c4143 = this.f16049;
            long jM9533 = c4143.m9533(c4155, jMax);
            if (jM9533 != -1) {
                return jM9533;
            }
            long j = c4143.f16041;
            if (this.f16051.mo4577(c4143, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j - c4155.f16070.length) + 1);
        }
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return this.f16051.mo8177();
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ˎٴ */
    public final String mo9506(long j) throws EOFException {
        mo9526(j);
        C4143 c4143 = this.f16049;
        c4143.getClass();
        return c4143.m9495(j, AbstractC3625.f13869);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String m9549(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("limit < 0: ", j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM9547 = m9547((byte) 10, 0L, j2);
        C4143 c4143 = this.f16049;
        if (jM9547 != -1) {
            return AbstractC4321.m9821(c4143, jM9547);
        }
        if (j2 < Long.MAX_VALUE && mo9511(j2) && c4143.m9520(j2 - 1) == 13 && mo9511(1 + j2) && c4143.m9520(j2) == 10) {
            return AbstractC4321.m9821(c4143, j2);
        }
        C4143 c41432 = new C4143();
        long jMin = Math.min(32, c4143.f16041);
        long j3 = 0;
        ˆʿ.ʽᐧ(c4143.f16041, 0L, jMin);
        if (jMin != 0) {
            c41432.f16041 += jMin;
            C4172 c4172 = c4143.f16042;
            while (true) {
                long j4 = c4172.f16101 - c4172.f16099;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                c4172 = c4172.f16103;
            }
            while (jMin > 0) {
                C4172 c4172M9587 = c4172.m9587();
                int i = c4172M9587.f16099 + ((int) j3);
                c4172M9587.f16099 = i;
                c4172M9587.f16101 = Math.min(i + ((int) jMin), c4172M9587.f16101);
                C4172 c41722 = c41432.f16042;
                if (c41722 == null) {
                    c4172M9587.f16104 = c4172M9587;
                    c4172M9587.f16103 = c4172M9587;
                    c41432.f16042 = c4172M9587;
                } else {
                    c41722.f16104.m9586(c4172M9587);
                }
                jMin -= c4172M9587.f16101 - c4172M9587.f16099;
                c4172 = c4172.f16103;
                j3 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c4143.f16041, j) + " content=" + c41432.mo9522(c41432.f16041).mo9571() + (char) 8230);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int m9550() throws EOFException {
        mo9526(4L);
        int i = this.f16049.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ˑⁱ */
    public final int mo9510(C4165 c4165) throws EOFException {
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C4143 c4143 = this.f16049;
            int iM9822 = AbstractC4321.m9822(c4143, c4165, true);
            if (iM9822 != -2) {
                if (iM9822 != -1) {
                    c4143.skip(c4165.f16082[iM9822].mo9566());
                    return iM9822;
                }
            } else if (this.f16051.mo4577(c4143, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: יʻ */
    public final boolean mo9511(long j) {
        C4143 c4143;
        if (j < 0) {
            throw new IllegalArgumentException(ᵎˏ.ˏᴵ("byteCount < 0: ", j).toString());
        }
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        do {
            c4143 = this.f16049;
            if (c4143.f16041 >= j) {
                return true;
            }
        } while (this.f16051.mo4577(c4143, 8192L) != -1);
        return false;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: יˋ */
    public final String mo9512(Charset charset) {
        C4143 c4143 = this.f16049;
        c4143.m9507(this.f16051);
        return c4143.m9495(c4143.f16041, charset);
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ـˆ */
    public final String mo9513() {
        long jM9547 = m9547((byte) 10, 0L, Long.MAX_VALUE);
        C4143 c4143 = this.f16049;
        if (jM9547 != -1) {
            return AbstractC4321.m9821(c4143, jM9547);
        }
        long j = c4143.f16041;
        if (j != 0) {
            return mo9506(j);
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m9551() {
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        C4143 c4143 = this.f16049;
        return c4143.m9503() && this.f16051.mo4577(c4143, 8192L) == -1;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ᴵʼ */
    public final boolean mo9519(C4155 c4155) {
        byte[] bArr = c4155.f16070;
        int length = bArr.length;
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        if (length < 0 || bArr.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            long j = i;
            if (!mo9511(1 + j) || this.f16049.m9520(j) != c4155.f16070[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ᵎˏ */
    public final C4155 mo9522(long j) throws EOFException {
        mo9526(j);
        return this.f16049.mo9522(j);
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ᵔٴ */
    public final void mo9526(long j) throws EOFException {
        if (!mo9511(j)) {
            throw new EOFException();
        }
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ﹳˑ */
    public final long mo9529(C4143 c4143) {
        C4143 c41432;
        long j = 0;
        while (true) {
            c41432 = this.f16049;
            if (this.f16051.mo4577(c41432, 8192L) == -1) {
                break;
            }
            long jM9530 = c41432.m9530();
            if (jM9530 > 0) {
                j += jM9530;
                c4143.mo4566(c41432, jM9530);
            }
        }
        long j2 = c41432.f16041;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        c4143.mo4566(c41432, j2);
        return j3;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long m9552() throws EOFException {
        long j;
        mo9526(8L);
        C4143 c4143 = this.f16049;
        long j2 = c4143.f16041;
        if (j2 < 8) {
            throw new EOFException();
        }
        C4172 c4172 = c4143.f16042;
        int i = c4172.f16099;
        int i2 = c4172.f16101;
        if (i2 - i < 8) {
            j = ((c4143.readInt() & 4294967295L) << 32) | (4294967295L & c4143.readInt());
        } else {
            byte[] bArr = c4172.f16102;
            int i3 = i + 7;
            long j3 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j4 = j3 | (bArr[i3] & 255);
            c4143.f16041 = j2 - 8;
            if (i4 == i2) {
                c4143.f16042 = c4172.m9588();
                AbstractC4171.m9585(c4172);
            } else {
                c4172.f16099 = i4;
            }
            j = j4;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // p366.InterfaceC4161
    /* renamed from: ﹳﹶ */
    public final long mo9531(C4155 c4155) {
        if (this.f16050) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C4143 c4143 = this.f16049;
            long jM9505 = c4143.m9505(c4155, jMax);
            if (jM9505 != -1) {
                return jM9505;
            }
            long j = c4143.f16041;
            if (this.f16051.mo4577(c4143, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // p366.InterfaceC4161, p366.InterfaceC4160
    /* renamed from: ﹶˆ */
    public final C4143 mo9532() {
        return this.f16049;
    }
}
