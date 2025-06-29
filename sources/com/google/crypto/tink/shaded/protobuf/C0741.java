package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0741 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0741 f3558 = new C0741(0, new int[0], new Object[0], false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f3559;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f3560;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f3561;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f3562;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f3563 = -1;

    public C0741(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3562 = i;
        this.f3559 = iArr;
        this.f3561 = objArr;
        this.f3560 = z;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C0741 m3054() {
        return new C0741(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0741)) {
            return false;
        }
        C0741 c0741 = (C0741) obj;
        int i = this.f3562;
        if (i == c0741.f3562) {
            int[] iArr = this.f3559;
            int[] iArr2 = c0741.f3559;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f3561;
                    Object[] objArr2 = c0741.f3561;
                    int i3 = this.f3562;
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
        int i = this.f3562;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f3559;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f3561;
        int i6 = this.f3562;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m3055() {
        int iM3018;
        int i = this.f3563;
        if (i != -1) {
            return i;
        }
        int iM3055 = 0;
        for (int i2 = 0; i2 < this.f3562; i2++) {
            int i3 = this.f3559[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM3018 = C0735.m3018(i4, ((Long) this.f3561[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f3561[i2]).getClass();
                iM3018 = C0735.m3034(i4);
            } else if (i5 == 2) {
                iM3018 = C0735.m3016(i4, (AbstractC0748) this.f3561[i2]);
            } else if (i5 == 3) {
                iM3055 = ((C0741) this.f3561[i2]).m3055() + (C0735.m3030(i4) * 2) + iM3055;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.m2923());
                }
                ((Integer) this.f3561[i2]).getClass();
                iM3018 = C0735.m3032(i4);
            }
            iM3055 = iM3018 + iM3055;
        }
        this.f3563 = iM3055;
        return iM3055;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final void m3056(C0756 c0756) throws CodedOutputStream$OutOfSpaceException {
        if (this.f3562 == 0) {
            return;
        }
        c0756.getClass();
        for (int i = 0; i < this.f3562; i++) {
            int i2 = this.f3559[i];
            Object obj = this.f3561[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0756.m3139(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c0756.m3148(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0756.m3137(i3, (AbstractC0748) obj);
            } else if (i4 == 3) {
                C0735 c0735 = (C0735) c0756.f3598;
                c0735.m3038(i3, 3);
                ((C0741) obj).m3056(c0756);
                c0735.m3038(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m2923());
                }
                c0756.m3138(i3, ((Integer) obj).intValue());
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3057(int i) {
        int[] iArr = this.f3559;
        if (i > iArr.length) {
            int i2 = this.f3562;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f3559 = Arrays.copyOf(iArr, i);
            this.f3561 = Arrays.copyOf(this.f3561, i);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m3058(int i, Object obj) {
        if (!this.f3560) {
            throw new UnsupportedOperationException();
        }
        m3057(this.f3562 + 1);
        int[] iArr = this.f3559;
        int i2 = this.f3562;
        iArr[i2] = i;
        this.f3561[i2] = obj;
        this.f3562 = i2 + 1;
    }
}
