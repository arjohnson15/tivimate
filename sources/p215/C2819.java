package p215;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: ˏˊ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2819 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long f10959;

    public C2819(long j) {
        this.f10959 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2819.class == obj.getClass() && this.f10959 == ((C2819) obj).f10959;
    }

    public final int hashCode() {
        long j = this.f10959;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return new Date(TimeUnit.MILLISECONDS.convert((this.f10959 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS)).toString();
    }
}
