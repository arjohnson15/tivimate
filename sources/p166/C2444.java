package p166;

import p383.AbstractC4470;

/* renamed from: ˊﹶ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2444 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f9736;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final float f9737;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f9738;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f9739;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f9740;

    static {
        new C2407().m6497();
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
        AbstractC4470.m10164(3);
        AbstractC4470.m10164(4);
    }

    public C2444(C2407 c2407) {
        long j = c2407.f9526;
        long j2 = c2407.f9523;
        long j3 = c2407.f9525;
        float f = c2407.f9527;
        float f2 = c2407.f9524;
        this.f9739 = j;
        this.f9736 = j2;
        this.f9738 = j3;
        this.f9740 = f;
        this.f9737 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2444)) {
            return false;
        }
        C2444 c2444 = (C2444) obj;
        return this.f9739 == c2444.f9739 && this.f9736 == c2444.f9736 && this.f9738 == c2444.f9738 && this.f9740 == c2444.f9740 && this.f9737 == c2444.f9737;
    }

    public final int hashCode() {
        long j = this.f9739;
        long j2 = this.f9736;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f9738;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.f9740;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f9737;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2407 m6563() {
        C2407 c2407 = new C2407();
        c2407.f9526 = this.f9739;
        c2407.f9523 = this.f9736;
        c2407.f9525 = this.f9738;
        c2407.f9527 = this.f9740;
        c2407.f9524 = this.f9737;
        return c2407;
    }
}
