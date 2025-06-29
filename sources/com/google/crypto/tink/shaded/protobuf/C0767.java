package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0767 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f3618;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object[] f3619;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0758 f3620;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f3621;

    public C0767(AbstractC0758 abstractC0758, String str, Object[] objArr) {
        this.f3620 = abstractC0758;
        this.f3618 = str;
        this.f3619 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f3621 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f3621 = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] m3176() {
        return this.f3619;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m3177() {
        return this.f3618;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0758 m3178() {
        return this.f3620;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m3179() {
        return (this.f3621 & 1) == 1 ? 1 : 2;
    }
}
