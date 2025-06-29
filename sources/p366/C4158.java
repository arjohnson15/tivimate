package p366;

import android.support.v4.media.session.AbstractC0002;
import java.util.Arrays;
import p376.AbstractC4318;
import p447.AbstractC5179;
import ˎˊ.ˆʿ;
import ˏʼ.ʽᐧ;

/* renamed from: ᵔﾞ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4158 extends C4155 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient byte[][] f16074;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final transient int[] f16075;

    public C4158(byte[][] bArr, int[] iArr) {
        super(C4155.f16067.f16070);
        this.f16074 = bArr;
        this.f16075 = iArr;
    }

    @Override // p366.C4155
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4155) {
            C4155 c4155 = (C4155) obj;
            if (c4155.mo9566() == mo9566() && mo9563(0, c4155, mo9566())) {
                return true;
            }
        }
        return false;
    }

    @Override // p366.C4155
    public final int hashCode() {
        int i = this.f16068;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f16074;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f16075;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f16068 = i3;
        return i3;
    }

    @Override // p366.C4155
    public final String toString() {
        return m9576().toString();
    }

    @Override // p366.C4155
    /* renamed from: ʿʼ */
    public final int mo9560(int i, byte[] bArr) {
        return m9576().mo9560(i, bArr);
    }

    @Override // p366.C4155
    /* renamed from: ˉי */
    public final boolean mo9561(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > mo9566() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM9813 = AbstractC4318.m9813(this, i);
        while (i < i4) {
            int[] iArr = this.f16075;
            int i5 = iM9813 == 0 ? 0 : iArr[iM9813 - 1];
            int i6 = iArr[iM9813] - i5;
            byte[][] bArr2 = this.f16074;
            int i7 = iArr[bArr2.length + iM9813];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!ˆʿ.ـﹶ(bArr2[iM9813], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM9813++;
        }
        return true;
    }

    @Override // p366.C4155
    /* renamed from: ˉⁱ */
    public final C4155 mo9562(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo9566();
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC5179.m11548(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > mo9566()) {
            StringBuilder sbM40 = AbstractC0002.m40(i2, "endIndex=", " > length(");
            sbM40.append(mo9566());
            sbM40.append(')');
            throw new IllegalArgumentException(sbM40.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0002.m55(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == mo9566()) {
            return this;
        }
        if (i == i2) {
            return C4155.f16067;
        }
        int iM9813 = AbstractC4318.m9813(this, i);
        int iM98132 = AbstractC4318.m9813(this, i2 - 1);
        int i4 = iM98132 + 1;
        byte[][] bArr = this.f16074;
        ʽᐧ.ﹳﹳ(i4, bArr.length);
        byte[][] bArr2 = (byte[][]) Arrays.copyOfRange(bArr, iM9813, i4);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f16075;
        if (iM9813 <= iM98132) {
            int i5 = iM9813;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(iArr2[i5] - i, i3);
                int i7 = i6 + 1;
                iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                if (i5 == iM98132) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = iM9813 != 0 ? iArr2[iM9813 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i8) + iArr[length];
        return new C4158(bArr2, iArr);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final C4155 m9576() {
        return new C4155(m9577());
    }

    @Override // p366.C4155
    /* renamed from: ˏʾ */
    public final boolean mo9563(int i, C4155 c4155, int i2) {
        if (i < 0 || i > mo9566() - i2) {
            return false;
        }
        int i3 = i2 + i;
        int iM9813 = AbstractC4318.m9813(this, i);
        int i4 = 0;
        while (i < i3) {
            int[] iArr = this.f16075;
            int i5 = iM9813 == 0 ? 0 : iArr[iM9813 - 1];
            int i6 = iArr[iM9813] - i5;
            byte[][] bArr = this.f16074;
            int i7 = iArr[bArr.length + iM9813];
            int iMin = Math.min(i3, i6 + i5) - i;
            if (!c4155.mo9561(i4, (i - i5) + i7, iMin, bArr[iM9813])) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iM9813++;
        }
        return true;
    }

    @Override // p366.C4155
    /* renamed from: ˏᵢ */
    public final byte mo9565(int i) {
        byte[][] bArr = this.f16074;
        int length = bArr.length - 1;
        int[] iArr = this.f16075;
        ˆʿ.ʽᐧ(iArr[length], i, 1L);
        int iM9813 = AbstractC4318.m9813(this, i);
        return bArr[iM9813][(i - (iM9813 == 0 ? 0 : iArr[iM9813 - 1])) + iArr[bArr.length + iM9813]];
    }

    @Override // p366.C4155
    /* renamed from: ˑʽ */
    public final int mo9566() {
        return this.f16075[this.f16074.length - 1];
    }

    @Override // p366.C4155
    /* renamed from: ˑי */
    public final void mo9567(C4143 c4143, int i) {
        int iM9813 = AbstractC4318.m9813(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f16075;
            int i3 = iM9813 == 0 ? 0 : iArr[iM9813 - 1];
            int i4 = iArr[iM9813] - i3;
            byte[][] bArr = this.f16074;
            int i5 = iArr[bArr.length + iM9813];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C4172 c4172 = new C4172(bArr[iM9813], i6, i6 + iMin, true);
            C4172 c41722 = c4143.f16042;
            if (c41722 == null) {
                c4172.f16104 = c4172;
                c4172.f16103 = c4172;
                c4143.f16042 = c4172;
            } else {
                c41722.f16104.m9586(c4172);
            }
            i2 += iMin;
            iM9813++;
        }
        c4143.f16041 += i;
    }

    @Override // p366.C4155
    /* renamed from: ـﹶ */
    public final String mo9568() {
        throw null;
    }

    @Override // p366.C4155
    /* renamed from: ᐧʻ */
    public final byte[] mo9569() {
        return m9577();
    }

    @Override // p366.C4155
    /* renamed from: ᴵʿ */
    public final C4155 mo9570() {
        return m9576().mo9570();
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final byte[] m9577() {
        byte[] bArr = new byte[mo9566()];
        byte[][] bArr2 = this.f16074;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f16075;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p366.C4155
    /* renamed from: ﹳﹳ */
    public final String mo9571() {
        return m9576().mo9571();
    }

    @Override // p366.C4155
    /* renamed from: ﹶˆ */
    public final int mo9572(int i, byte[] bArr) {
        return m9576().mo9572(i, bArr);
    }
}
