package p166;

import java.util.Locale;
import p383.AbstractC4464;
import p383.AbstractC4470;

/* renamed from: ˊﹶ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2441 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final C2441 f9727 = new C2441(1.0f, 1.0f);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final float f9728;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f9729;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final float f9730;

    static {
        AbstractC4470.m10164(0);
        AbstractC4470.m10164(1);
    }

    public C2441(float f, float f2) {
        AbstractC4464.m10142(f > 0.0f);
        AbstractC4464.m10142(f2 > 0.0f);
        this.f9730 = f;
        this.f9728 = f2;
        this.f9729 = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2441.class != obj.getClass()) {
            return false;
        }
        C2441 c2441 = (C2441) obj;
        return this.f9730 == c2441.f9730 && this.f9728 == c2441.f9728;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9728) + ((Float.floatToRawIntBits(this.f9730) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f9730), Float.valueOf(this.f9728)};
        int i = AbstractC4470.f17202;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
