package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ˎʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0405 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0405 f2688 = new C0405(0, new int[0], new Object[0], false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f2689;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f2690;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f2691;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f2692;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f2693 = -1;

    public C0405(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f2692 = i;
        this.f2689 = iArr;
        this.f2691 = objArr;
        this.f2690 = z;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C0405 m2137() {
        return new C0405(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0405)) {
            return false;
        }
        C0405 c0405 = (C0405) obj;
        int i = this.f2692;
        if (i == c0405.f2692) {
            int[] iArr = this.f2689;
            int[] iArr2 = c0405.f2689;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f2691;
                    Object[] objArr2 = c0405.f2691;
                    int i3 = this.f2692;
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
        int i = this.f2692;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f2689;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f2691;
        int i6 = this.f2692;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2138(int i) {
        int[] iArr = this.f2689;
        if (i > iArr.length) {
            int i2 = this.f2692;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f2689 = Arrays.copyOf(iArr, i);
            this.f2691 = Arrays.copyOf(this.f2691, i);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m2139(int i, Object obj) {
        if (!this.f2690) {
            throw new UnsupportedOperationException();
        }
        m2138(this.f2692 + 1);
        int[] iArr = this.f2689;
        int i2 = this.f2692;
        iArr[i2] = i;
        this.f2691[i2] = obj;
        this.f2692 = i2 + 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m2140() {
        int iM1910;
        int i = this.f2693;
        if (i != -1) {
            return i;
        }
        int iM2140 = 0;
        for (int i2 = 0; i2 < this.f2692; i2++) {
            int i3 = this.f2689[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM1910 = C0346.m1910(i4, ((Long) this.f2691[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f2691[i2]).getClass();
                iM1910 = C0346.m1924(i4);
            } else if (i5 == 2) {
                iM1910 = C0346.m1927(i4, (C0315) this.f2691[i2]);
            } else if (i5 == 3) {
                iM2140 = ((C0405) this.f2691[i2]).m2140() + (C0346.m1929(i4) << 1) + iM2140;
            } else {
                if (i5 != 5) {
                    int i6 = zzlk.f2417;
                    throw new IllegalStateException(new zzln("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.f2691[i2]).getClass();
                iM1910 = C0346.m1925(i4);
            }
            iM2140 = iM1910 + iM2140;
        }
        this.f2693 = iM2140;
        return iM2140;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m2141(C0355 c0355) {
        if (this.f2692 == 0) {
            return;
        }
        c0355.getClass();
        for (int i = 0; i < this.f2692; i++) {
            int i2 = this.f2689[i];
            Object obj = this.f2691[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0355.m1970(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c0355.m1980(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0355.m1975(i3, (C0315) obj);
            } else if (i4 == 3) {
                C0346 c0346 = (C0346) c0355.f2536;
                c0346.m1939(i3, 3);
                ((C0405) obj).m2141(c0355);
                c0346.m1939(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = zzlk.f2417;
                    throw new RuntimeException(new zzln("Protocol message tag had invalid wire type."));
                }
                c0355.m1973(i3, ((Integer) obj).intValue());
            }
        }
    }
}
