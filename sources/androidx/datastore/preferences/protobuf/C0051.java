package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0051 {

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C0051 f458 = new C0051(0, new int[0], new Object[0], false);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int[] f459;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public boolean f460;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public Object[] f461;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public int f462;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f463 = -1;

    public C0051(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f462 = i;
        this.f459 = iArr;
        this.f461 = objArr;
        this.f460 = z;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C0051 m475() {
        return new C0051(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0051)) {
            return false;
        }
        C0051 c0051 = (C0051) obj;
        int i = this.f462;
        if (i == c0051.f462) {
            int[] iArr = this.f459;
            int[] iArr2 = c0051.f459;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f461;
                    Object[] objArr2 = c0051.f461;
                    int i3 = this.f462;
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
        int i = this.f462;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f459;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f461;
        int i6 = this.f462;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m476(int i, Object obj) {
        if (!this.f460) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f462;
        int[] iArr = this.f459;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f459 = Arrays.copyOf(iArr, i3);
            this.f461 = Arrays.copyOf(this.f461, i3);
        }
        int[] iArr2 = this.f459;
        int i4 = this.f462;
        iArr2[i4] = i;
        this.f461[i4] = obj;
        this.f462 = i4 + 1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m477() {
        int iM396;
        int i = this.f463;
        if (i != -1) {
            return i;
        }
        int iM477 = 0;
        for (int i2 = 0; i2 < this.f462; i2++) {
            int i3 = this.f459[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM396 = C0040.m396(i4, ((Long) this.f461[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f461[i2]).getClass();
                iM396 = C0040.m397(i4);
            } else if (i5 == 2) {
                iM396 = C0040.m404(i4, (C0056) this.f461[i2]);
            } else if (i5 == 3) {
                iM477 = ((C0051) this.f461[i2]).m477() + (C0040.m401(i4) * 2) + iM477;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.m218());
                }
                ((Integer) this.f461[i2]).getClass();
                iM396 = C0040.m407(i4);
            }
            iM477 = iM396 + iM477;
        }
        this.f463 = iM477;
        return iM477;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m478(C0030 c0030) {
        if (this.f462 == 0) {
            return;
        }
        c0030.getClass();
        for (int i = 0; i < this.f462; i++) {
            int i2 = this.f459[i];
            Object obj = this.f461[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0030.m329(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c0030.m338(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0030.m327(i3, (C0056) obj);
            } else if (i4 == 3) {
                C0040 c0040 = (C0040) c0030.f398;
                c0040.m411(i3, 3);
                ((C0051) obj).m478(c0030);
                c0040.m411(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m218());
                }
                c0030.m328(i3, ((Integer) obj).intValue());
            }
        }
    }
}
