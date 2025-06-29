package p332;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.nio.charset.Charset;
import p180.AbstractC2497;
import ˆʽ.ᵎˏ;
import ـˈ.ˉᵎ;

/* renamed from: ᴵﾞ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3779 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final byte[] f14619 = {0, 0};

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3779 f14620 = new C3779(1);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C3779 f14621 = new C3779(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f14622;

    public /* synthetic */ C3779(int i) {
        this.f14622 = i;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m8851(AbstractC3777 abstractC3777, int i, Charset charset) throws Buffer$BufferException {
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        abstractC3777.getClass();
        abstractC3777.m8839(i2, bArr);
        return new String(bArr, charset);
    }

    public final String toString() {
        switch (this.f14622) {
            case 0:
                return "big endian";
            default:
                return "little endian";
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m8852(AbstractC3777 abstractC3777) {
        switch (this.f14622) {
            case 0:
                abstractC3777.getClass();
                byte[] bArr = new byte[2];
                abstractC3777.m8839(2, bArr);
                return ((bArr[0] << 8) & 65280) | (bArr[1] & 255);
            default:
                abstractC3777.getClass();
                byte[] bArr2 = new byte[2];
                abstractC3777.m8839(2, bArr2);
                return (bArr2[0] & 255) | ((bArr2[1] << 8) & 65280);
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8853(AbstractC3777 abstractC3777, long j) {
        switch (this.f14622) {
            case 0:
                if (j < 0) {
                    throw new IllegalArgumentException(ᵎˏ.ˏᴵ("Invalid uint64 value: ", j));
                }
                m8856(abstractC3777, j);
                return;
            default:
                if (j < 0) {
                    throw new IllegalArgumentException(ᵎˏ.ˏᴵ("Invalid uint64 value: ", j));
                }
                m8856(abstractC3777, j);
                return;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long m8854(AbstractC3777 abstractC3777) throws Buffer$BufferException {
        switch (this.f14622) {
            case 0:
                abstractC3777.getClass();
                abstractC3777.m8839(4, new byte[4]);
                return (r1[3] & 255) | ((r1[0] << 24) & 4278190080L) | ((r1[1] << 16) & 16711680) | ((r1[2] << 8) & 65280);
            default:
                abstractC3777.getClass();
                abstractC3777.m8839(4, new byte[4]);
                return ((r1[3] << 24) & 4278190080L) | (r1[0] & 255) | ((r1[1] << 8) & 65280) | ((r1[2] << 16) & 16711680);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m8855(AbstractC3777 abstractC3777) throws Buffer$BufferException {
        switch (this.f14622) {
            case 0:
                abstractC3777.getClass();
                abstractC3777.m8839(8, new byte[8]);
                long j = 0;
                for (int i = 0; i < 8; i++) {
                    j = (j << 8) | (r1[i] & 255);
                }
                return j;
            default:
                abstractC3777.getClass();
                abstractC3777.m8839(8, new byte[8]);
                long j2 = 0;
                for (int i2 = 7; i2 >= 0; i2--) {
                    j2 = (j2 << 8) | (r1[i2] & 255);
                }
                return j2;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m8856(AbstractC3777 abstractC3777, long j) {
        switch (this.f14622) {
            case 0:
                abstractC3777.getClass();
                abstractC3777.mo6213(8, new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
                break;
            default:
                abstractC3777.getClass();
                abstractC3777.mo6213(8, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)});
                break;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8857(AbstractC3777 abstractC3777, int i) {
        switch (this.f14622) {
            case 0:
                if (i < 0 || i > 65535) {
                    throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Invalid uint16 value: ", i));
                }
                abstractC3777.getClass();
                abstractC3777.mo6213(2, new byte[]{(byte) (i >> 8), (byte) i});
                return;
            default:
                if (i < 0 || i > 65535) {
                    throw new IllegalArgumentException(ˉᵎ.ˉⁱ("Invalid uint16 value: ", i));
                }
                abstractC3777.getClass();
                abstractC3777.mo6213(2, new byte[]{(byte) i, (byte) (i >> 8)});
                return;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long m8858(AbstractC3777 abstractC3777) throws Buffer$BufferException {
        switch (this.f14622) {
            case 0:
                long jM8854 = (m8854(abstractC3777) << 32) + (m8854(abstractC3777) & 4294967295L);
                if (jM8854 >= 0) {
                    return jM8854;
                }
                throw new Buffer$BufferException("Cannot handle values > 9223372036854775807");
            default:
                long jM88542 = (m8854(abstractC3777) & 4294967295L) + (m8854(abstractC3777) << 32);
                if (jM88542 >= 0) {
                    return jM88542;
                }
                throw new Buffer$BufferException("Cannot handle values > 9223372036854775807");
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final void m8859(AbstractC3777 abstractC3777, String str) {
        switch (this.f14622) {
            case 0:
                byte[] bytes = str.getBytes(AbstractC2497.f9928);
                abstractC3777.getClass();
                abstractC3777.mo6213(bytes.length, bytes);
                break;
            default:
                byte[] bytes2 = str.getBytes(AbstractC2497.f9929);
                abstractC3777.getClass();
                abstractC3777.mo6213(bytes2.length, bytes2);
                break;
        }
    }
}
