package p138;

import android.support.v4.media.session.AbstractC0002;
import p080.AbstractC1702;

/* renamed from: ˉˊ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2113 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f8340;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f8341;

    public C2113(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f8341 = i;
        this.f8340 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2113)) {
            return false;
        }
        C2113 c2113 = (C2113) obj;
        return AbstractC1702.m5410(this.f8341, c2113.f8341) && this.f8340 == c2113.f8340;
    }

    public final int hashCode() {
        int iM5411 = (AbstractC1702.m5411(this.f8341) ^ 1000003) * 1000003;
        long j = this.f8340;
        return iM5411 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f8341;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return AbstractC0002.m42(sb, this.f8340, "}");
    }
}
