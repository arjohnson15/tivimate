package p456;

/* renamed from: ﾞⁱ.ᵢˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5331 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ long f20674;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ Object f20675;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20676;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f20677;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20678 = 0;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5257 f20679;

    public RunnableC5331(C5244 c5244, C5356 c5356, long j, boolean z, C5356 c53562) {
        this.f20677 = c5356;
        this.f20674 = j;
        this.f20676 = z;
        this.f20675 = c53562;
        this.f20679 = c5244;
    }

    public RunnableC5331(C5328 c5328, C5297 c5297, C5297 c52972, long j, boolean z) {
        this.f20677 = c5297;
        this.f20675 = c52972;
        this.f20674 = j;
        this.f20676 = z;
        this.f20679 = c5328;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20678) {
            case 0:
                C5244 c5244 = (C5244) this.f20679;
                C5356 c5356 = (C5356) this.f20677;
                c5244.m11701(c5356);
                C5244.m11695((C5244) this.f20679, (C5356) this.f20677, this.f20674, false, this.f20676);
                C5244.m11696(c5244, c5356, (C5356) this.f20675);
                break;
            default:
                ((C5328) this.f20679).m12004((C5297) this.f20677, (C5297) this.f20675, this.f20674, this.f20676, null);
                break;
        }
    }
}
