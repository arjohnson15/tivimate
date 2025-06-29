package p332;

import com.hierynomus.protocol.commons.buffer.Buffer$BufferException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import p180.AbstractC2497;
import p344.AbstractC3917;
import p447.AbstractC5179;
import ˆʽ.ᵎˏ;

/* renamed from: ᴵﾞ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3777 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3779 f14613;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f14614;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public byte[] f14615;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f14616;

    static {
        AbstractC3917.m9105(AbstractC3777.class);
    }

    public AbstractC3777() {
        this(new byte[m8837(256)], false, C3779.f14620);
    }

    public AbstractC3777(byte[] bArr, boolean z, C3779 c3779) {
        this.f14615 = bArr;
        this.f14613 = c3779;
        this.f14614 = 0;
        this.f14616 = z ? bArr.length : 0;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m8837(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException(AbstractC5179.m11548(i, "Cannot get next power of 2; ", " is too large"));
            }
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer [rpos=");
        sb.append(this.f14614);
        sb.append(", wpos=");
        sb.append(this.f14616);
        sb.append(", size=");
        return AbstractC5179.m11550(sb, this.f14615.length, "]");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final byte[] m8838() {
        int iM8845 = m8845();
        if (iM8845 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iM8845];
        System.arraycopy(this.f14615, this.f14614, bArr, 0, iM8845);
        return bArr;
    }

    /* renamed from: ʿʼ */
    public AbstractC3777 mo6213(int i, byte[] bArr) {
        int length = this.f14615.length;
        int i2 = this.f14616;
        if (length - i2 < i) {
            byte[] bArr2 = new byte[m8837(i2 + i)];
            byte[] bArr3 = this.f14615;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            this.f14615 = bArr2;
        }
        System.arraycopy(bArr, 0, this.f14615, this.f14616, i);
        this.f14616 += i;
        return this;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m8839(int i, byte[] bArr) throws Buffer$BufferException {
        if (m8845() < i) {
            throw new Buffer$BufferException("Underflow");
        }
        System.arraycopy(this.f14615, this.f14614, bArr, 0, i);
        this.f14614 += i;
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final String m8840(int i, Charset charset) throws Buffer$BufferException {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                switch (this.f14613.f14622) {
                    case 0:
                        return C3779.m8851(this, i, AbstractC2497.f9928);
                    default:
                        return C3779.m8851(this, i, AbstractC2497.f9929);
                }
            case "UTF-8":
                byte[] bArr = new byte[i];
                m8839(i, bArr);
                return new String(bArr, charset);
            case "UTF-16BE":
                return C3779.m8851(this, i, AbstractC2497.f9928);
            case "UTF-16LE":
                return C3779.m8851(this, i, AbstractC2497.f9929);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m8841() {
        this.f14613.m8852(this);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final byte[] m8842(int i) throws Buffer$BufferException {
        byte[] bArr = new byte[i];
        m8839(i, bArr);
        return bArr;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8843(int i) throws Buffer$BufferException {
        if (m8845() < i) {
            throw new Buffer$BufferException("Underflow");
        }
        this.f14614 += i;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m8844(long j) {
        switch (this.f14613.f14622) {
            case 0:
                if (j < 0 || j > 4294967295L) {
                    throw new IllegalArgumentException(ᵎˏ.ˏᴵ("Invalid uint32 value: ", j));
                }
                mo6213(4, new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j});
                return;
            default:
                if (j < 0 || j > 4294967295L) {
                    throw new IllegalArgumentException(ᵎˏ.ˏᴵ("Invalid uint32 value: ", j));
                }
                mo6213(4, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)});
                return;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m8845() {
        return this.f14616 - this.f14614;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m8846(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f14613.m8859(this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                mo6213(bytes.length, bytes);
                return;
            case "UTF-16BE":
                C3779.f14621.m8859(this, str);
                return;
            case "UTF-16LE":
                C3779.f14620.m8859(this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m8847(int i) {
        this.f14613.m8857(this, i);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final int m8848() {
        return (int) this.f14613.m8854(this);
    }

    /* renamed from: ﹳﹳ */
    public AbstractC3777 mo6214(byte b) {
        int length = this.f14615.length;
        int i = this.f14616;
        if (length - i < 1) {
            byte[] bArr = new byte[m8837(i + 1)];
            byte[] bArr2 = this.f14615;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f14615 = bArr;
        }
        byte[] bArr3 = this.f14615;
        int i2 = this.f14616;
        this.f14616 = i2 + 1;
        bArr3[i2] = b;
        return this;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final byte m8849() throws Buffer$BufferException {
        if (m8845() < 1) {
            throw new Buffer$BufferException("Underflow");
        }
        byte[] bArr = this.f14615;
        int i = this.f14614;
        this.f14614 = i + 1;
        return bArr[i];
    }
}
