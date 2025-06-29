package p200;

import java.util.Arrays;
import p013.AbstractC1036;
import p340.AbstractC3876;

/* renamed from: ˎٴ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2742 implements Cloneable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ long[] f10723;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ Object[] f10724;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public /* synthetic */ int f10725;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public /* synthetic */ boolean f10726;

    public C2742() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f10723 = new long[i4];
        this.f10724 = new Object[i4];
    }

    public final String toString() {
        if (m6965() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10725 * 28);
        sb.append('{');
        int i = this.f10725;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m6963(i2));
            sb.append('=');
            Object objM6969 = m6969(i2);
            if (objM6969 != sb) {
                sb.append(objM6969);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long m6963(int i) {
        if (!(i >= 0 && i < this.f10725)) {
            AbstractC3876.m9071("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f10726) {
            int i2 = this.f10725;
            long[] jArr = this.f10723;
            Object[] objArr = this.f10724;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC2746.f10741) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f10726 = false;
            this.f10725 = i3;
        }
        return this.f10723[i];
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void m6964(long j, Object obj) {
        int iM9070 = AbstractC3876.m9070(this.f10723, this.f10725, j);
        if (iM9070 >= 0) {
            this.f10724[iM9070] = obj;
            return;
        }
        int i = ~iM9070;
        int i2 = this.f10725;
        Object obj2 = AbstractC2746.f10741;
        if (i < i2) {
            Object[] objArr = this.f10724;
            if (objArr[i] == obj2) {
                this.f10723[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f10726) {
            long[] jArr = this.f10723;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f10724;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f10726 = false;
                this.f10725 = i3;
                i = ~AbstractC3876.m9070(this.f10723, i3, j);
            }
        }
        int i5 = this.f10725;
        if (i5 >= this.f10723.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.f10723 = Arrays.copyOf(this.f10723, i9);
            this.f10724 = Arrays.copyOf(this.f10724, i9);
        }
        int i10 = this.f10725 - i;
        if (i10 != 0) {
            long[] jArr2 = this.f10723;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f10724;
            AbstractC1036.m3991(i11, i, this.f10725, objArr3, objArr3);
        }
        this.f10723[i] = j;
        this.f10724[i] = obj;
        this.f10725++;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final int m6965() {
        if (this.f10726) {
            int i = this.f10725;
            long[] jArr = this.f10723;
            Object[] objArr = this.f10724;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC2746.f10741) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f10726 = false;
            this.f10725 = i2;
        }
        return this.f10725;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6966(long j, Long l) {
        int i = this.f10725;
        if (i != 0 && j <= this.f10723[i - 1]) {
            m6964(j, l);
            return;
        }
        if (this.f10726) {
            long[] jArr = this.f10723;
            if (i >= jArr.length) {
                Object[] objArr = this.f10724;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != AbstractC2746.f10741) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.f10726 = false;
                this.f10725 = i2;
            }
        }
        int i4 = this.f10725;
        if (i4 >= this.f10723.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            this.f10723 = Arrays.copyOf(this.f10723, i8);
            this.f10724 = Arrays.copyOf(this.f10724, i8);
        }
        this.f10723[i4] = j;
        this.f10724[i4] = l;
        this.f10725 = i4 + 1;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C2742 clone() {
        C2742 c2742 = (C2742) super.clone();
        c2742.f10723 = (long[]) this.f10723.clone();
        c2742.f10724 = (Object[]) this.f10724.clone();
        return c2742;
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object m6968(long j) {
        Object obj;
        int iM9070 = AbstractC3876.m9070(this.f10723, this.f10725, j);
        if (iM9070 < 0 || (obj = this.f10724[iM9070]) == AbstractC2746.f10741) {
            return null;
        }
        return obj;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final Object m6969(int i) {
        if (!(i >= 0 && i < this.f10725)) {
            AbstractC3876.m9071("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f10726) {
            int i2 = this.f10725;
            long[] jArr = this.f10723;
            Object[] objArr = this.f10724;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC2746.f10741) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f10726 = false;
            this.f10725 = i3;
        }
        return this.f10724[i];
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m6970() {
        int i = this.f10725;
        Object[] objArr = this.f10724;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f10725 = 0;
        this.f10726 = false;
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object m6971(long j) {
        Object obj;
        int iM9070 = AbstractC3876.m9070(this.f10723, this.f10725, j);
        if (iM9070 < 0 || (obj = this.f10724[iM9070]) == AbstractC2746.f10741) {
            return -1L;
        }
        return obj;
    }
}
