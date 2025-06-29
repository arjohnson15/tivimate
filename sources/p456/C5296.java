package p456;

/* renamed from: ﾞⁱ.יˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5296 extends AbstractC5274 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final /* synthetic */ int f20546;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20547;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5296(C5272 c5272, C5236 c5236, int i) {
        super(c5236);
        this.f20546 = i;
        this.f20547 = c5272;
    }

    @Override // p456.AbstractC5274
    /* renamed from: ˑʽ */
    public final void mo11643() {
        switch (this.f20546) {
            case 0:
                C5272 c5272 = this.f20547;
                c5272.m11846();
                if (c5272.m11779()) {
                    c5272.ˏᵢ().f20566.m4533("Inactivity, disconnecting from the service");
                    c5272.m11782();
                    break;
                }
                break;
            default:
                this.f20547.ˏᵢ().f20568.m4533("Tasks have been queued for a long time");
                break;
        }
    }
}
