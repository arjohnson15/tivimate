package p153;

import p383.AbstractC4464;
import p383.AbstractC4470;
import p383.C4457;

/* renamed from: ˊˉ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2324 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public byte[] f9219;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f9220;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f9221;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9222;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f9223;

    public C2324(int i) {
        this.f9222 = i;
        switch (i) {
            case 4:
                break;
            default:
                this.f9219 = AbstractC4470.f17203;
                break;
        }
    }

    public C2324(int i, int i2) {
        this.f9222 = 0;
        this.f9221 = i;
        this.f9223 = i2;
        this.f9219 = new byte[(i2 * 2) - 1];
        this.f9220 = 0;
    }

    public C2324(int i, byte[] bArr) {
        this.f9222 = 3;
        this.f9219 = bArr;
        this.f9220 = i;
    }

    public C2324(byte[] bArr) {
        this.f9222 = 2;
        this.f9219 = bArr;
        this.f9221 = bArr.length;
    }

    public C2324(byte[] bArr, int i, int i2) {
        this.f9222 = 1;
        this.f9219 = bArr;
        this.f9223 = i;
        this.f9221 = i2;
        this.f9220 = 0;
        m6402();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int m6389() {
        return ((this.f9220 - this.f9221) * 8) - this.f9223;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean m6390() {
        int i = this.f9223;
        int i2 = this.f9220;
        int i3 = 0;
        while (this.f9223 < this.f9221 && !m6399()) {
            i3++;
        }
        boolean z = this.f9223 == this.f9221;
        this.f9223 = i;
        this.f9220 = i2;
        return !z && m6409((i3 * 2) + 1);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public void m6391(int i) {
        AbstractC4464.m10132(this.f9223 == 0);
        this.f9221 += i;
        m6402();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public void m6392(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f9219;
            int i4 = this.f9221;
            int i5 = i4 + 1;
            this.f9221 = i5;
            byte b = bArr2[i4];
            int i6 = this.f9223;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f9223;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f9219;
            int i9 = this.f9221;
            this.f9221 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f9223 = i8 - 8;
        }
        int i10 = this.f9223 + i7;
        this.f9223 = i10;
        byte[] bArr4 = this.f9219;
        int i11 = this.f9221;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f9223 = 0;
            this.f9221 = i11 + 1;
        }
        m6402();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public void m6393(int i, byte[] bArr) {
        AbstractC4464.m10132(this.f9223 == 0);
        System.arraycopy(this.f9219, this.f9221, bArr, 0, i);
        this.f9221 += i;
        m6402();
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public void m6394(byte[] bArr, int i, int i2) {
        if (bArr.length - i < i2) {
            throw new IllegalArgumentException("Bytes to write do not exist in source");
        }
        byte[] bArr2 = this.f9219;
        if (i2 > bArr2.length - this.f9220) {
            throw new IndexOutOfBoundsException("Size of bytes to be written is greater than available buffer space");
        }
        int i3 = this.f9221;
        if (i3 + i2 <= bArr2.length) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
        } else {
            int length = bArr2.length - i3;
            System.arraycopy(bArr, i, bArr2, i3, length);
            System.arraycopy(bArr, i + length, bArr2, 0, i2 - length);
        }
        this.f9221 = (this.f9221 + i2) % bArr2.length;
        this.f9220 += i2;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public int m6395() {
        int i = 0;
        while (!m6399()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m6410(i) : 0);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public boolean m6396(int i) {
        if (2 <= i && i < this.f9221) {
            byte[] bArr = this.f9219;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public long m6397(int i) {
        if (i <= 32) {
            int iM6410 = m6410(i);
            int i2 = AbstractC4470.f17202;
            return 4294967295L & iM6410;
        }
        int iM64102 = m6410(i - 32);
        int iM64103 = m6410(32);
        int i3 = AbstractC4470.f17202;
        return (4294967295L & iM64103) | ((iM64102 & 4294967295L) << 32);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public void m6398(int i, byte[] bArr) {
        this.f9219 = bArr;
        this.f9221 = 0;
        this.f9223 = 0;
        this.f9220 = i;
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public boolean m6399() {
        switch (this.f9222) {
            case 1:
                boolean z = (this.f9219[this.f9223] & (128 >> this.f9220)) != 0;
                m6406();
                return z;
            case 2:
                boolean z2 = (((this.f9219[this.f9223] & 255) >> this.f9220) & 1) == 1;
                m6408(1);
                return z2;
            default:
                boolean z3 = (this.f9219[this.f9221] & (128 >> this.f9223)) != 0;
                m6406();
                return z3;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m6400() {
        if (this.f9223 == 0) {
            return;
        }
        this.f9223 = 0;
        this.f9221++;
        m6402();
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public void m6401(C4457 c4457) {
        m6398(c4457.f17170, c4457.f17171);
        m6407(c4457.f17169 * 8);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m6402() {
        int i;
        int i2;
        switch (this.f9222) {
            case 1:
                int i3 = this.f9223;
                AbstractC4464.m10132(i3 >= 0 && (i3 < (i = this.f9221) || (i3 == i && this.f9220 == 0)));
                break;
            default:
                int i4 = this.f9221;
                AbstractC4464.m10132(i4 >= 0 && (i4 < (i2 = this.f9220) || (i4 == i2 && this.f9223 == 0)));
                break;
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int m6403() {
        AbstractC4464.m10132(this.f9223 == 0);
        return this.f9221;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int m6404() {
        return (this.f9221 * 8) + this.f9223;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public int m6405() {
        int iM6395 = m6395();
        return ((iM6395 + 1) / 2) * (iM6395 % 2 == 0 ? -1 : 1);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public void m6406() {
        switch (this.f9222) {
            case 1:
                int i = this.f9220 + 1;
                this.f9220 = i;
                if (i == 8) {
                    this.f9220 = 0;
                    int i2 = this.f9223;
                    this.f9223 = i2 + (m6396(i2 + 1) ? 2 : 1);
                }
                m6402();
                break;
            default:
                int i3 = this.f9223 + 1;
                this.f9223 = i3;
                if (i3 == 8) {
                    this.f9223 = 0;
                    this.f9221++;
                }
                m6402();
                break;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public void m6407(int i) {
        int i2 = i / 8;
        this.f9221 = i2;
        this.f9223 = i - (i2 * 8);
        m6402();
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public void m6408(int i) {
        int i2;
        switch (this.f9222) {
            case 1:
                int i3 = this.f9223;
                int i4 = i / 8;
                int i5 = i3 + i4;
                this.f9223 = i5;
                int i6 = (i - (i4 * 8)) + this.f9220;
                this.f9220 = i6;
                if (i6 > 7) {
                    this.f9223 = i5 + 1;
                    this.f9220 = i6 - 8;
                }
                while (true) {
                    i3++;
                    if (i3 > this.f9223) {
                        m6402();
                        break;
                    } else if (m6396(i3)) {
                        this.f9223++;
                        i3 += 2;
                    }
                }
            case 2:
                int i7 = i / 8;
                int i8 = this.f9223 + i7;
                this.f9223 = i8;
                int i9 = (i - (i7 * 8)) + this.f9220;
                this.f9220 = i9;
                boolean z = true;
                if (i9 > 7) {
                    this.f9223 = i8 + 1;
                    this.f9220 = i9 - 8;
                }
                int i10 = this.f9223;
                if (i10 < 0 || (i10 >= (i2 = this.f9221) && (i10 != i2 || this.f9220 != 0))) {
                    z = false;
                }
                AbstractC4464.m10132(z);
                break;
            default:
                int i11 = i / 8;
                int i12 = this.f9221 + i11;
                this.f9221 = i12;
                int i13 = (i - (i11 * 8)) + this.f9223;
                this.f9223 = i13;
                if (i13 > 7) {
                    this.f9221 = i12 + 1;
                    this.f9223 = i13 - 8;
                }
                m6402();
                break;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public boolean m6409(int i) {
        int i2 = this.f9223;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f9220 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f9221) {
                break;
            }
            if (m6396(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f9221;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public int m6410(int i) {
        switch (this.f9222) {
            case 1:
                this.f9220 += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.f9220;
                    if (i3 <= 8) {
                        byte[] bArr = this.f9219;
                        int i4 = this.f9223;
                        int i5 = ((-1) >>> (32 - i)) & (i2 | ((bArr[i4] & 255) >> (8 - i3)));
                        if (i3 == 8) {
                            this.f9220 = 0;
                            this.f9223 = i4 + (m6396(i4 + 1) ? 2 : 1);
                        }
                        m6402();
                        return i5;
                    }
                    int i6 = i3 - 8;
                    this.f9220 = i6;
                    byte[] bArr2 = this.f9219;
                    int i7 = this.f9223;
                    i2 |= (bArr2[i7] & 255) << i6;
                    if (!m6396(i7 + 1)) {
                        i = 1;
                    }
                    this.f9223 = i7 + i;
                }
            case 2:
                int i8 = this.f9223;
                int iMin = Math.min(i, 8 - this.f9220);
                int i9 = i8 + 1;
                byte[] bArr3 = this.f9219;
                int i10 = ((bArr3[i8] & 255) >> this.f9220) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i10 |= (bArr3[i9] & 255) << iMin;
                    iMin += 8;
                    i9++;
                }
                int i11 = i10 & ((-1) >>> (32 - i));
                m6408(i);
                return i11;
            default:
                if (i == 0) {
                    return 0;
                }
                this.f9223 += i;
                int i12 = 0;
                while (true) {
                    int i13 = this.f9223;
                    if (i13 <= 8) {
                        byte[] bArr4 = this.f9219;
                        int i14 = this.f9221;
                        int i15 = ((-1) >>> (32 - i)) & (i12 | ((bArr4[i14] & 255) >> (8 - i13)));
                        if (i13 == 8) {
                            this.f9223 = 0;
                            this.f9221 = i14 + 1;
                        }
                        m6402();
                        return i15;
                    }
                    int i16 = i13 - 8;
                    this.f9223 = i16;
                    byte[] bArr5 = this.f9219;
                    int i17 = this.f9221;
                    this.f9221 = i17 + 1;
                    i12 |= (bArr5[i17] & 255) << i16;
                }
        }
    }
}
