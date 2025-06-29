package p456;

import android.os.RemoteException;

/* renamed from: ﾞⁱ.ˉˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5261 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ C5272 f20379;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20380;

    public /* synthetic */ RunnableC5261(int i) {
        this.f20380 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20380) {
            case 0:
                C5272 c5272 = this.f20379;
                InterfaceC5311 interfaceC5311 = c5272.f20411;
                if (interfaceC5311 == null) {
                    c5272.ˏᵢ().f20571.m4533("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        interfaceC5311.mo11668(c5272.m11777(false));
                        c5272.m11776();
                        break;
                    } catch (RemoteException e) {
                        c5272.ˏᵢ().f20571.m4531(e, "Failed to send storage consent settings to the service");
                        return;
                    }
                }
            default:
                C5272 c52722 = this.f20379;
                InterfaceC5311 interfaceC53112 = c52722.f20411;
                if (interfaceC53112 == null) {
                    c52722.ˏᵢ().f20571.m4533("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        interfaceC53112.mo11672(c52722.m11777(false));
                        c52722.m11776();
                        break;
                    } catch (RemoteException e2) {
                        c52722.ˏᵢ().f20571.m4531(e2, "Failed to send Dma consent settings to the service");
                    }
                }
        }
    }
}
