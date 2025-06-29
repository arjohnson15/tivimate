package p374;

/* renamed from: ᵢˎ.ᴵʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4278 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C4287 f16608;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f16609;

    public /* synthetic */ RunnableC4278(C4287 c4287, int i) {
        this.f16609 = i;
        this.f16608 = c4287;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16609) {
            case 0:
                this.f16608.f16668 = true;
                break;
            case 1:
                this.f16608.m9752();
                break;
            default:
                C4287 c4287 = this.f16608;
                if (!c4287.f16662) {
                    InterfaceC4295 interfaceC4295 = c4287.f16678;
                    interfaceC4295.getClass();
                    interfaceC4295.mo7664(c4287);
                    break;
                }
                break;
        }
    }
}
