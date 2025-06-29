package p153;

import p397.C4612;

/* renamed from: ˊˉ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2321 extends C4612 implements Comparable {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public long f9189;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2321 c2321 = (C2321) obj;
        if (m4401(4) == c2321.m4401(4)) {
            long j = this.f13807 - c2321.f13807;
            if (j == 0) {
                j = this.f9189 - c2321.f9189;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!m4401(4)) {
            return -1;
        }
        return 1;
    }
}
