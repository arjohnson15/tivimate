package p379;

import androidx.leanback.widget.C0137;
import java.io.IOException;
import java.util.ArrayList;
import p013.AbstractC1036;
import p158.AbstractC2339;
import p366.C4143;
import p366.C4149;
import p366.C4155;

/* renamed from: ᵢᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4396 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C4149 f16929;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public int f16931;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public int f16932;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f16930 = 4096;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ArrayList f16927 = new ArrayList();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public C4410[] f16933 = new C4410[8];

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f16928 = 7;

    public C4396(C4415 c4415) {
        this.f16929 = new C4149(c4415);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C4155 m9982(int i) throws IOException {
        if (i >= 0) {
            C4410[] c4410Arr = AbstractC4418.f17045;
            if (i <= c4410Arr.length - 1) {
                return c4410Arr[i].f16998;
            }
        }
        int length = this.f16928 + 1 + (i - AbstractC4418.f17045.length);
        if (length >= 0) {
            C4410[] c4410Arr2 = this.f16933;
            if (length < c4410Arr2.length) {
                return c4410Arr2[length].f16998;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final int m9983(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f16929.readByte();
            byte[] bArr = AbstractC2339.f9301;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m9984(C4410 c4410) {
        this.f16927.add(c4410);
        int i = this.f16930;
        int i2 = c4410.f16997;
        if (i2 > i) {
            AbstractC1036.m3994(this.f16933, null);
            this.f16928 = this.f16933.length - 1;
            this.f16931 = 0;
            this.f16932 = 0;
            return;
        }
        m9985((this.f16932 + i2) - i);
        int i3 = this.f16931 + 1;
        C4410[] c4410Arr = this.f16933;
        if (i3 > c4410Arr.length) {
            C4410[] c4410Arr2 = new C4410[c4410Arr.length * 2];
            System.arraycopy(c4410Arr, 0, c4410Arr2, c4410Arr.length, c4410Arr.length);
            this.f16928 = this.f16933.length - 1;
            this.f16933 = c4410Arr2;
        }
        int i4 = this.f16928;
        this.f16928 = i4 - 1;
        this.f16933[i4] = c4410;
        this.f16931++;
        this.f16932 += i2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m9985(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f16933.length;
            while (true) {
                length--;
                i2 = this.f16928;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f16933[length].f16997;
                i -= i4;
                this.f16932 -= i4;
                this.f16931--;
                i3++;
            }
            C4410[] c4410Arr = this.f16933;
            System.arraycopy(c4410Arr, i2 + 1, c4410Arr, i2 + 1 + i3, this.f16931);
            this.f16928 += i3;
        }
        return i3;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C4155 m9986() {
        int i;
        C4149 c4149 = this.f16929;
        byte b = c4149.readByte();
        byte[] bArr = AbstractC2339.f9301;
        int i2 = b & 255;
        int i3 = 0;
        boolean z = (b & 128) == 128;
        long jM9983 = m9983(i2, 127);
        if (!z) {
            return c4149.mo9522(jM9983);
        }
        C4143 c4143 = new C4143();
        C0137 c0137 = AbstractC4420.f17051;
        C0137 c01372 = c0137;
        int i4 = 0;
        for (long j = 0; j < jM9983; j++) {
            byte b2 = c4149.readByte();
            byte[] bArr2 = AbstractC2339.f9301;
            i3 = (i3 << 8) | (b2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                c01372 = ((C0137[]) c01372.f1033)[(i3 >>> (i4 - 8)) & 255];
                if (((C0137[]) c01372.f1033) == null) {
                    c4143.m9509(c01372.f1034);
                    i4 -= c01372.f1032;
                    c01372 = c0137;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            C0137 c01373 = ((C0137[]) c01372.f1033)[(i3 << (8 - i4)) & 255];
            if (((C0137[]) c01373.f1033) != null || (i = c01373.f1032) > i4) {
                break;
            }
            c4143.m9509(c01373.f1034);
            i4 -= i;
            c01372 = c0137;
        }
        return c4143.mo9522(c4143.f16041);
    }
}
