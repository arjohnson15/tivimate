package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ٴﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0642 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f3027;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object[] f3028;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0625 f3029;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f3030;

    public C0642(AbstractC0625 abstractC0625, String str, Object[] objArr) {
        this.f3029 = abstractC0625;
        this.f3027 = str;
        this.f3028 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f3030 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f3030 = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m2657() {
        int i = this.f3030;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m2658() {
        return this.f3027;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0625 m2659() {
        return this.f3029;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object[] m2660() {
        return this.f3028;
    }
}
