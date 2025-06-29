package p076;

import p254.C3159;
import p383.AbstractC4464;
import p383.C4457;

/* renamed from: ʿˉ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1654 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f6451;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int f6452;

    public C1654(int i, long j) {
        AbstractC4464.m10142(j >= 0);
        this.f6452 = i;
        this.f6451 = j;
    }

    public /* synthetic */ C1654(long j, boolean z, int i) {
        this.f6452 = i;
        this.f6451 = j;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C1654 m5322(C3159 c3159, C4457 c4457) {
        c3159.mo4875(c4457.f17171, 0, 8, false);
        c4457.m10108(0);
        return new C1654(c4457.m10087(), false, c4457.m10092());
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public boolean m5323() {
        int i = this.f6452;
        return i == 0 || i == 1;
    }
}
