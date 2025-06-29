package p366;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p080.AbstractC1702;
import p317.AbstractC3616;
import ˎˊ.ˆʿ;

/* renamed from: ᵔﾞ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4150 implements InterfaceC4163 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C4149 f16052;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final CRC32 f16053;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Inflater f16054;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C4164 f16055;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public byte f16056;

    public C4150(InterfaceC4163 interfaceC4163) {
        C4149 c4149 = new C4149(interfaceC4163);
        this.f16052 = c4149;
        Inflater inflater = new Inflater(true);
        this.f16054 = inflater;
        this.f16055 = new C4164(c4149, inflater);
        this.f16053 = new CRC32();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9553(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbM5409 = AbstractC1702.m5409(str, ": actual 0x");
        sbM5409.append(AbstractC3616.m8515(8, ˆʿ.ˎٴ(i2)));
        sbM5409.append(" != expected 0x");
        sbM5409.append(AbstractC3616.m8515(8, ˆʿ.ˎٴ(i)));
        throw new IOException(sbM5409.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16055.close();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m9554(C4143 c4143, long j, long j2) {
        C4172 c4172 = c4143.f16042;
        while (true) {
            int i = c4172.f16101;
            int i2 = c4172.f16099;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c4172 = c4172.f16103;
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(c4172.f16101 - r7, j2);
            this.f16053.update(c4172.f16102, (int) (c4172.f16099 + j), iMin);
            j2 -= iMin;
            c4172 = c4172.f16103;
            j = 0;
        }
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ʿˊ */
    public final long mo4577(C4143 c4143, long j) throws DataFormatException, IOException {
        C4149 c4149;
        C4143 c41432;
        byte b = this.f16056;
        CRC32 crc32 = this.f16053;
        C4149 c41492 = this.f16052;
        if (b == 0) {
            c41492.mo9526(10L);
            C4143 c41433 = c41492.f16049;
            byte bM9520 = c41433.m9520(3L);
            boolean z = ((bM9520 >> 1) & 1) == 1;
            if (z) {
                m9554(c41433, 0L, 10L);
            }
            m9553(8075, c41492.readShort(), "ID1ID2");
            c41492.skip(8L);
            if (((bM9520 >> 2) & 1) == 1) {
                c41492.mo9526(2L);
                if (z) {
                    m9554(c41433, 0L, 2L);
                }
                long jM9499 = c41433.m9499() & 65535;
                c41492.mo9526(jM9499);
                if (z) {
                    m9554(c41433, 0L, jM9499);
                }
                c41492.skip(jM9499);
            }
            if (((bM9520 >> 3) & 1) == 1) {
                c41432 = c41433;
                long jM9547 = c41492.m9547((byte) 0, 0L, Long.MAX_VALUE);
                if (jM9547 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c4149 = c41492;
                    m9554(c41432, 0L, jM9547 + 1);
                } else {
                    c4149 = c41492;
                }
                c4149.skip(jM9547 + 1);
            } else {
                c4149 = c41492;
                c41432 = c41433;
            }
            if (((bM9520 >> 4) & 1) == 1) {
                long jM95472 = c4149.m9547((byte) 0, 0L, Long.MAX_VALUE);
                if (jM95472 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m9554(c41432, 0L, jM95472 + 1);
                }
                c4149.skip(jM95472 + 1);
            }
            if (z) {
                m9553(c4149.m9548(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f16056 = (byte) 1;
        } else {
            c4149 = c41492;
        }
        if (this.f16056 == 1) {
            long j2 = c4143.f16041;
            long jMo4577 = this.f16055.mo4577(c4143, 8192L);
            if (jMo4577 != -1) {
                m9554(c4143, j2, jMo4577);
                return jMo4577;
            }
            this.f16056 = (byte) 2;
        }
        if (this.f16056 != 2) {
            return -1L;
        }
        m9553(c4149.m9550(), (int) crc32.getValue(), "CRC");
        m9553(c4149.m9550(), (int) this.f16054.getBytesWritten(), "ISIZE");
        this.f16056 = (byte) 3;
        if (c4149.m9551()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return this.f16052.f16051.mo8177();
    }
}
