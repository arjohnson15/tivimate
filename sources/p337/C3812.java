package p337;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import p056.AbstractC1339;
import p056.C1333;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3812 extends AbstractC1339 {

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public byte[] f14668;

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public boolean f14672;

    /* renamed from: ˑי, reason: contains not printable characters */
    public int f14673;

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int f14674;

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public byte[] f14675;

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public long f14676;

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public int f14670 = 0;

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public int f14677 = 0;

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public int f14665 = 0;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final long f14667 = 100000;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final float f14678 = 0.2f;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final long f14669 = 2000000;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final int f14671 = 10;

    /* renamed from: ˉי, reason: contains not printable characters */
    public final short f14666 = 1024;

    public C3812() {
        byte[] bArr = AbstractC4470.f17203;
        this.f14675 = bArr;
        this.f14668 = bArr;
    }

    @Override // p056.AbstractC1339, p056.InterfaceC1335
    /* renamed from: ʽᐧ */
    public final boolean mo4652() {
        return super.mo4652() && this.f14672;
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˉי */
    public final void mo4666() {
        if (this.f14665 > 0) {
            m8903(true);
            this.f14670 = 0;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m8901(int i) {
        int length = ((((int) ((this.f14669 * this.f5462.f5418) / 1000000)) - this.f14670) * this.f14674) - (this.f14675.length / 2);
        AbstractC4464.m10132(length >= 0);
        int iMin = (int) Math.min((i * this.f14678) + 0.5f, length);
        int i2 = this.f14674;
        return (iMin / i2) * i2;
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˏʾ */
    public final void mo4668() {
        this.f14672 = false;
        byte[] bArr = AbstractC4470.f17203;
        this.f14675 = bArr;
        this.f14668 = bArr;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m8902(int i, int i2) {
        if (i == 0) {
            return;
        }
        AbstractC4464.m10142(this.f14665 >= i);
        if (i2 == 2) {
            int i3 = this.f14677;
            int i4 = this.f14665;
            int i5 = i3 + i4;
            byte[] bArr = this.f14675;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f14668, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.f14668, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.f14668, 0, i6);
                    System.arraycopy(this.f14675, 0, this.f14668, i6, length);
                }
            }
        } else {
            int i7 = this.f14677;
            int i8 = i7 + i;
            byte[] bArr2 = this.f14675;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.f14668, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.f14668, 0, length2);
                System.arraycopy(this.f14675, 0, this.f14668, length2, i - length2);
            }
        }
        AbstractC4464.m10124("sizeToOutput is not aligned to frame size: " + i, i % this.f14674 == 0);
        AbstractC4464.m10132(this.f14677 < this.f14675.length);
        byte[] bArr3 = this.f14668;
        AbstractC4464.m10124("byteOutput size is not aligned to frame size " + i, i % this.f14674 == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.f14671;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = Byte.MAX_VALUE;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = Byte.MIN_VALUE;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        m4667(i).put(bArr3, 0, i).flip();
    }

    @Override // p056.AbstractC1339
    /* renamed from: ˏᵢ */
    public final C1333 mo4665(C1333 c1333) throws AudioProcessor$UnhandledAudioFormatException {
        if (c1333.f5417 == 2) {
            return c1333.f5418 == -1 ? C1333.f5415 : c1333;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c1333);
    }

    @Override // p056.InterfaceC1335
    /* renamed from: ᐧʻ */
    public final void mo4657(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f5467.hasRemaining()) {
            int i = this.f14673;
            short s = this.f14666;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f14675.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f14674;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f14673 = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m4667(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                AbstractC4464.m10132(this.f14677 < this.f14675.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f14674;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f14677;
                int i4 = this.f14665;
                int length2 = length + i4;
                byte[] bArr = this.f14675;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f14675, length2, iMin);
                int i6 = this.f14665 + iMin;
                this.f14665 = i6;
                AbstractC4464.m10132(i6 <= this.f14675.length);
                boolean z2 = z && iPosition3 < i5;
                m8903(z2);
                if (z2) {
                    this.f14673 = 0;
                    this.f14670 = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m8903(boolean z) {
        int length;
        int iM8901;
        int i = this.f14665;
        byte[] bArr = this.f14675;
        if (i == bArr.length || z) {
            if (this.f14670 == 0) {
                if (z) {
                    m8902(i, 3);
                    length = i;
                } else {
                    AbstractC4464.m10132(i >= bArr.length / 2);
                    length = this.f14675.length / 2;
                    m8902(length, 0);
                }
                iM8901 = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM89012 = m8901(length2) + (this.f14675.length / 2);
                m8902(iM89012, 2);
                iM8901 = iM89012;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM8901 = m8901(length);
                m8902(iM8901, 1);
            }
            AbstractC4464.m10130("bytesConsumed is not aligned to frame size: %s" + length, length % this.f14674 == 0);
            AbstractC4464.m10132(i >= iM8901);
            this.f14665 -= length;
            int i2 = this.f14677 + length;
            this.f14677 = i2;
            this.f14677 = i2 % this.f14675.length;
            this.f14670 = (iM8901 / this.f14674) + this.f14670;
            this.f14676 += (length - iM8901) / r2;
        }
    }

    @Override // p056.AbstractC1339
    /* renamed from: ﹶˆ */
    public final void mo4669() {
        if (mo4652()) {
            int i = this.f5462.f5416 * 2;
            this.f14674 = i;
            int i2 = ((((int) ((this.f14667 * r0.f5418) / 1000000)) / 2) / i) * i * 2;
            if (this.f14675.length != i2) {
                this.f14675 = new byte[i2];
                this.f14668 = new byte[i2];
            }
        }
        this.f14673 = 0;
        this.f14676 = 0L;
        this.f14670 = 0;
        this.f14677 = 0;
        this.f14665 = 0;
    }
}
