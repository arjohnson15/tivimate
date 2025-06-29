package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ᵎʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0063 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f482;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object[] f483;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0083 f484;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int f485;

    public C0063(AbstractC0083 abstractC0083, String str, Object[] objArr) {
        this.f484 = abstractC0083;
        this.f482 = str;
        this.f483 = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f485 = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f485 = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object[] m496() {
        return this.f483;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final String m497() {
        return this.f482;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC0052 m498() {
        return this.f484;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final int m499() {
        return (this.f485 & 1) == 1 ? 1 : 2;
    }
}
