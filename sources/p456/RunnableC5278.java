package p456;

/* renamed from: ﾞⁱ.ˎי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5278 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5311 f20457;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ ServiceConnectionC5246 f20458;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20459;

    public /* synthetic */ RunnableC5278(ServiceConnectionC5246 serviceConnectionC5246, InterfaceC5311 interfaceC5311, int i) {
        this.f20459 = i;
        this.f20457 = interfaceC5311;
        this.f20458 = serviceConnectionC5246;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final void m11850() {
        synchronized (this.f20458) {
            try {
                this.f20458.f20173 = false;
                if (!this.f20458.f20172.m11779()) {
                    this.f20458.f20172.ˏᵢ().f20566.m4533("Connected to service");
                    C5272 c5272 = this.f20458.f20172;
                    InterfaceC5311 interfaceC5311 = this.f20457;
                    c5272.m11846();
                    c5272.f20411 = interfaceC5311;
                    c5272.m11776();
                    c5272.m11778();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20459) {
            case 0:
                m11850();
                return;
            default:
                synchronized (this.f20458) {
                    try {
                        this.f20458.f20173 = false;
                        if (!this.f20458.f20172.m11779()) {
                            this.f20458.f20172.ˏᵢ().f20567.m4533("Connected to remote service");
                            C5272 c5272 = this.f20458.f20172;
                            InterfaceC5311 interfaceC5311 = this.f20457;
                            c5272.m11846();
                            c5272.f20411 = interfaceC5311;
                            c5272.m11776();
                            c5272.m11778();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
