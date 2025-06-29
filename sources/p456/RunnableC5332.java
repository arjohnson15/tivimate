package p456;

import p177.AbstractC2491;

/* renamed from: ﾞⁱ.ᵢˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5332 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C5253 f20680;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2491 f20681;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20682;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20683;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20684;

    public /* synthetic */ RunnableC5332(C5272 c5272, C5253 c5253, boolean z, AbstractC2491 abstractC2491, int i) {
        this.f20684 = i;
        this.f20680 = c5253;
        this.f20682 = z;
        this.f20681 = abstractC2491;
        this.f20683 = c5272;
    }

    public RunnableC5332(C5272 c5272, C5253 c5253, boolean z, C5345 c5345, C5345 c53452) {
        this.f20684 = 1;
        this.f20680 = c5253;
        this.f20682 = z;
        this.f20681 = c5345;
        this.f20683 = c5272;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f20684) {
            case 0:
                C5272 c5272 = this.f20683;
                InterfaceC5311 interfaceC5311 = c5272.f20411;
                if (interfaceC5311 != null) {
                    c5272.m11775(interfaceC5311, this.f20682 ? null : (C5290) this.f20681, this.f20680);
                    c5272.m11776();
                    break;
                } else {
                    c5272.ˏᵢ().f20571.m4533("Discarding data. Failed to set user property");
                    break;
                }
            case 1:
                C5272 c52722 = this.f20683;
                InterfaceC5311 interfaceC53112 = c52722.f20411;
                if (interfaceC53112 != null) {
                    c52722.m11775(interfaceC53112, this.f20682 ? null : (C5345) this.f20681, this.f20680);
                    c52722.m11776();
                    break;
                } else {
                    c52722.ˏᵢ().f20571.m4533("Discarding data. Failed to send conditional user property to service");
                    break;
                }
            default:
                C5272 c52723 = this.f20683;
                InterfaceC5311 interfaceC53113 = c52723.f20411;
                if (interfaceC53113 != null) {
                    C5343 c5343 = (C5343) this.f20681;
                    C5253 c5253 = this.f20680;
                    if (this.f20682) {
                        c5343 = null;
                    }
                    c52723.m11775(interfaceC53113, c5343, c5253);
                    c52723.m11776();
                    break;
                } else {
                    c52723.ˏᵢ().f20571.m4533("Discarding data. Failed to send event to service");
                    break;
                }
        }
    }
}
