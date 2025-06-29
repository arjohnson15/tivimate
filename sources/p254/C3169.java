package p254;

import java.io.Serializable;

/* renamed from: יי.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3169 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f12250;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f12251;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public int f12252;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f12253;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f12254;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public Serializable f12255;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f12256;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m7837(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f12253 = i2;
        this.f12255 = AbstractC3152.f12183[3 - i3];
        int i6 = AbstractC3152.f12185[i5];
        this.f12252 = i6;
        if (i2 == 2) {
            this.f12252 = i6 / 2;
        } else if (i2 == 0) {
            this.f12252 = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f12254 = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? AbstractC3152.f12167[i4 - 1] : AbstractC3152.f12170[i4 - 1];
            this.f12251 = i9;
            this.f12250 = (((i9 * 12) / this.f12252) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? AbstractC3152.f12189[i4 - 1] : AbstractC3152.f12188[i4 - 1];
                this.f12251 = i10;
                this.f12250 = ((i10 * 144) / this.f12252) + i7;
            } else {
                int i11 = AbstractC3152.f12178[i4 - 1];
                this.f12251 = i11;
                this.f12250 = (((i3 == 1 ? 72 : 144) * i11) / this.f12252) + i7;
            }
        }
        this.f12256 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
