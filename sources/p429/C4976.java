package p429;

import android.support.v4.media.session.AbstractC0002;
import p070.AbstractC1549;

/* renamed from: ﹶˎ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4976 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f18807;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f18808;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f18809;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean f18810;

    public C4976(int i, int i2, String str, boolean z) {
        this.f18809 = str;
        this.f18807 = i;
        this.f18808 = i2;
        this.f18810 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4976)) {
            return false;
        }
        C4976 c4976 = (C4976) obj;
        return AbstractC1549.m5138(this.f18809, c4976.f18809) && this.f18807 == c4976.f18807 && this.f18808 == c4976.f18808 && this.f18810 == c4976.f18810;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = ((((this.f18809.hashCode() * 31) + this.f18807) * 31) + this.f18808) * 31;
        boolean z = this.f18810;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f18809);
        sb.append(", pid=");
        sb.append(this.f18807);
        sb.append(", importance=");
        sb.append(this.f18808);
        sb.append(", isDefaultProcess=");
        return AbstractC0002.m38(sb, this.f18810, ')');
    }
}
