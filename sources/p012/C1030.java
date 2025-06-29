package p012;

import p125.AbstractC2016;
import p214.C2817;
import p352.EnumC4008;
import p405.C4640;
import p456.C5349;

/* renamed from: ʻˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1030 extends AbstractC2016 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public C2817 f4427;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Long f4428;

    @Override // p125.AbstractC2016
    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final void mo3981(C5349 c5349) {
        C2817 c2817 = new C2817();
        this.f4427 = c2817;
        c5349.m12104(c2817);
        c5349.m12092(EnumC4008.FOUR);
        c5349.m12093();
        if (((C4640) c5349.f20757).readInt() != 0) {
            this.f4428 = Long.valueOf(c5349.m12093());
        } else {
            this.f4428 = null;
        }
    }
}
