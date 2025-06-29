package p166;

import p383.AbstractC4470;

/* renamed from: ˊﹶ.ⁱʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2437 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final C2437 f9721 = new C2437(1.0f, 0, 0, 0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f9722;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f9723;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f9724;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final float f9725;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
        AbstractC4470.m10164(2);
        AbstractC4470.m10164(3);
    }

    public C2437(float f, int i, int i2, int i3) {
        this.f9724 = i;
        this.f9722 = i2;
        this.f9723 = i3;
        this.f9725 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2437)) {
            return false;
        }
        C2437 c2437 = (C2437) obj;
        return this.f9724 == c2437.f9724 && this.f9722 == c2437.f9722 && this.f9723 == c2437.f9723 && this.f9725 == c2437.f9725;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9725) + ((((((217 + this.f9724) * 31) + this.f9722) * 31) + this.f9723) * 31);
    }
}
