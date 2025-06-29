package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ˉʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0371 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2625;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object[] f2626;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0563 f2627;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f2628;

    public C0371(AbstractC0563 abstractC0563, String str, Object[] objArr) {
        this.f2627 = abstractC0563;
        this.f2625 = str;
        this.f2626 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2628 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f2628 = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m2078() {
        int i = this.f2628;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m2079() {
        return this.f2625;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0563 m2080() {
        return this.f2627;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object[] m2081() {
        return this.f2626;
    }
}
