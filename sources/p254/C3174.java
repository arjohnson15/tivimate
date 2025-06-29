package p254;

import android.support.v4.media.session.AbstractC0002;

/* renamed from: יי.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3174 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C3174 f12268 = new C3174(0, 0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f12269;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f12270;

    public C3174(long j, long j2) {
        this.f12270 = j;
        this.f12269 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3174.class != obj.getClass()) {
            return false;
        }
        C3174 c3174 = (C3174) obj;
        return this.f12270 == c3174.f12270 && this.f12269 == c3174.f12269;
    }

    public final int hashCode() {
        return (((int) this.f12270) * 31) + ((int) this.f12269);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f12270);
        sb.append(", position=");
        return AbstractC0002.m42(sb, this.f12269, "]");
    }
}
