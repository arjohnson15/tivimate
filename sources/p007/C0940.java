package p007;

import androidx.leanback.widget.ﾞᐧ;
import p166.C2437;
import p200.C2753;
import p230.C3071;
import p383.AbstractC4464;

/* renamed from: ʻˉ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0940 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C0969 f4131;

    /* renamed from: ˉי, reason: contains not printable characters */
    public long f4133;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public C2437 f4134;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ﾞᐧ f4136;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2753 f4137;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public C2437 f4138;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public long f4140;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C0945 f4135 = new C0945();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3071 f4139 = new C3071();

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3071 f4132 = new C3071();

    public C0940(ﾞᐧ r3, C0969 c0969) {
        this.f4136 = r3;
        this.f4131 = c0969;
        C2753 c2753 = new C2753(2);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c2753.f10766 = 0;
        c2753.f10768 = 0;
        c2753.f10767 = new long[iHighestOneBit];
        c2753.f10770 = iHighestOneBit - 1;
        this.f4137 = c2753;
        this.f4134 = C2437.f9721;
        this.f4133 = -9223372036854775807L;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m3809() {
        C2753 c2753 = this.f4137;
        c2753.f10766 = 0;
        c2753.f10768 = 0;
        this.f4133 = -9223372036854775807L;
        C3071 c3071 = this.f4132;
        if (c3071.m7564() > 0) {
            AbstractC4464.m10142(c3071.m7564() > 0);
            while (c3071.m7564() > 1) {
                c3071.m7569();
            }
            Object objM7569 = c3071.m7569();
            objM7569.getClass();
            c3071.m7566(0L, (Long) objM7569);
        }
        C2437 c2437 = this.f4138;
        C3071 c30712 = this.f4139;
        if (c2437 != null) {
            c30712.m7570();
            return;
        }
        if (c30712.m7564() > 0) {
            AbstractC4464.m10142(c30712.m7564() > 0);
            while (c30712.m7564() > 1) {
                c30712.m7569();
            }
            Object objM75692 = c30712.m7569();
            objM75692.getClass();
            this.f4138 = (C2437) objM75692;
        }
    }
}
