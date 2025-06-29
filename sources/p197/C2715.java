package p197;

import p080.AbstractC1702;

/* renamed from: ˎˑ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2715 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f10628;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2720 f10629;

    public C2715(C2720 c2720, int i) {
        this.f10629 = c2720;
        this.f10628 = i;
    }

    public final String toString() {
        int i = this.f10628;
        StringBuilder sbM5409 = AbstractC1702.m5409(i == 0 ? "start" : i == 1 ? "delay ended" : "end", " ");
        sbM5409.append(this.f10629.f10662.toString());
        return sbM5409.toString();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final long m6881() {
        C2720 c2720 = this.f10629;
        int i = this.f10628;
        if (i == 0) {
            return c2720.f10658;
        }
        if (i != 1) {
            return c2720.f10660;
        }
        long j = c2720.f10658;
        if (j == -1) {
            return -1L;
        }
        c2720.f10662.getClass();
        return j;
    }
}
