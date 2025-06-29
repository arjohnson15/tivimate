package p219;

import android.animation.TimeInterpolator;
import p447.AbstractC5179;

/* renamed from: ˏـ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2839 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public long f10996;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public int f10997;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public TimeInterpolator f10998;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public long f10999;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public int f11000;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2839)) {
            return false;
        }
        C2839 c2839 = (C2839) obj;
        if (this.f10999 == c2839.f10999 && this.f10996 == c2839.f10996 && this.f11000 == c2839.f11000 && this.f10997 == c2839.f10997) {
            return m7111().getClass().equals(c2839.m7111().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10999;
        long j2 = this.f10996;
        return ((((m7111().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f11000) * 31) + this.f10997;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C2839.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f10999);
        sb.append(" duration: ");
        sb.append(this.f10996);
        sb.append(" interpolator: ");
        sb.append(m7111().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f11000);
        sb.append(" repeatMode: ");
        return AbstractC5179.m11550(sb, this.f10997, "}\n");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final TimeInterpolator m7111() {
        TimeInterpolator timeInterpolator = this.f10998;
        return timeInterpolator != null ? timeInterpolator : AbstractC2840.f11001;
    }
}
