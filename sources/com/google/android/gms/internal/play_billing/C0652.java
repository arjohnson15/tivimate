package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0652 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0652 f3053 = new C0652(0, new int[0], new Object[0], false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f3054;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f3055;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f3056;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f3057;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f3058 = -1;

    public C0652(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3057 = i;
        this.f3054 = iArr;
        this.f3056 = objArr;
        this.f3055 = z;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C0652 m2667() {
        return new C0652(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0652)) {
            return false;
        }
        C0652 c0652 = (C0652) obj;
        int i = this.f3057;
        if (i == c0652.f3057) {
            int[] iArr = this.f3054;
            int[] iArr2 = c0652.f3054;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f3056;
                    Object[] objArr2 = c0652.f3056;
                    int i3 = this.f3057;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3057;
        int i2 = i + 527;
        int[] iArr = this.f3054;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f3056;
        int i6 = this.f3057;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m2668(int i) {
        int[] iArr = this.f3054;
        if (i > iArr.length) {
            int i2 = this.f3057;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f3054 = Arrays.copyOf(iArr, i);
            this.f3056 = Arrays.copyOf(this.f3056, i);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m2669(int i, Object obj) {
        if (!this.f3055) {
            throw new UnsupportedOperationException();
        }
        m2668(this.f3057 + 1);
        int[] iArr = this.f3054;
        int i2 = this.f3057;
        iArr[i2] = i;
        this.f3056[i2] = obj;
        this.f3057 = i2 + 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m2670() {
        int iM2747;
        int iM2749;
        int iM27472;
        int i = this.f3058;
        if (i != -1) {
            return i;
        }
        int iM27473 = 0;
        for (int i2 = 0; i2 < this.f3057; i2++) {
            int i3 = this.f3054[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.f3056[i2]).getClass();
                    iM27472 = C0678.m2747(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    C0615 c0615 = (C0615) this.f3056[i2];
                    int iM27474 = C0678.m2747(i6);
                    int iMo2574 = c0615.mo2574();
                    iM27473 = C0678.m2747(iMo2574) + iMo2574 + iM27474 + iM27473;
                } else if (i5 == 3) {
                    int iM27475 = C0678.m2747(i4 << 3);
                    iM2747 = iM27475 + iM27475;
                    iM2749 = ((C0652) this.f3056[i2]).m2670();
                } else {
                    if (i5 != 5) {
                        int i7 = zzdc.f2951;
                        throw new IllegalStateException(new zzdb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f3056[i2]).getClass();
                    iM27472 = C0678.m2747(i4 << 3) + 4;
                }
                iM27473 = iM27472 + iM27473;
            } else {
                int i8 = i4 << 3;
                long jLongValue = ((Long) this.f3056[i2]).longValue();
                iM2747 = C0678.m2747(i8);
                iM2749 = C0678.m2749(jLongValue);
            }
            iM27473 = iM2749 + iM2747 + iM27473;
        }
        this.f3058 = iM27473;
        return iM27473;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m2671(C0679 c0679) {
        if (this.f3057 != 0) {
            for (int i = 0; i < this.f3057; i++) {
                int i2 = this.f3054[i];
                Object obj = this.f3056[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    c0679.m2775(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    c0679.m2768(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    c0679.m2778(i4, (C0615) obj);
                } else if (i3 == 3) {
                    ((C0678) c0679.f3103).m2751(i4, 3);
                    ((C0652) obj).m2671(c0679);
                    ((C0678) c0679.f3103).m2751(i4, 4);
                } else {
                    if (i3 != 5) {
                        int i5 = zzdc.f2951;
                        throw new RuntimeException(new zzdb("Protocol message tag had invalid wire type."));
                    }
                    c0679.m2771(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
