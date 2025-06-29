package p254;

/* renamed from: יי.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3153 implements InterfaceC3157 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f12190;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f12191;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final long f12192;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC3172 f12193;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f12194;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final long f12195;

    public C3153(InterfaceC3172 interfaceC3172, long j, long j2, long j3, long j4, long j5) {
        this.f12193 = interfaceC3172;
        this.f12190 = j;
        this.f12192 = j2;
        this.f12195 = j3;
        this.f12191 = j4;
        this.f12194 = j5;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˋⁱ */
    public final long mo5502() {
        return this.f12190;
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ˏʾ */
    public final C3180 mo5503(long j) {
        C3174 c3174 = new C3174(j, C3171.m7838(this.f12193.mo4095(j), 0L, this.f12192, this.f12195, this.f12191, this.f12194));
        return new C3180(c3174, c3174);
    }

    @Override // p254.InterfaceC3157
    /* renamed from: ﹶˆ */
    public final boolean mo5504() {
        return true;
    }
}
