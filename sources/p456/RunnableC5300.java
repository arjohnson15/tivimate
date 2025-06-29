package p456;

import android.os.RemoteException;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.יᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5300 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C5253 f20559;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20560;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20561;

    public /* synthetic */ RunnableC5300(C5272 c5272, C5253 c5253, int i) {
        this.f20561 = i;
        this.f20559 = c5253;
        this.f20560 = c5272;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f20561) {
            case 0:
                C5253 c5253 = this.f20559;
                C5272 c5272 = this.f20560;
                InterfaceC5311 interfaceC5311 = c5272.f20411;
                if (interfaceC5311 != null) {
                    try {
                        interfaceC5311.mo11679(c5253);
                    } catch (RemoteException e) {
                        c5272.ˏᵢ().f20571.m4531(e, "Failed to reset data on the service: remote exception");
                    }
                    c5272.m11776();
                    break;
                } else {
                    c5272.ˏᵢ().f20571.m4533("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                C5253 c52532 = this.f20559;
                C5272 c52722 = this.f20560;
                InterfaceC5311 interfaceC53112 = c52722.f20411;
                if (interfaceC53112 == null) {
                    c52722.ˏᵢ().f20571.m4533("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        interfaceC53112.mo11687(c52532);
                        ((C5236) ((ﹳﹳ) c52722).ᐧⁱ).m11656().m12031();
                        c52722.m11775(interfaceC53112, null, c52532);
                        c52722.m11776();
                        break;
                    } catch (RemoteException e2) {
                        c52722.ˏᵢ().f20571.m4531(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                C5253 c52533 = this.f20559;
                C5272 c52723 = this.f20560;
                InterfaceC5311 interfaceC53113 = c52723.f20411;
                if (interfaceC53113 == null) {
                    c52723.ˏᵢ().f20568.m4533("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        interfaceC53113.mo11682(c52533);
                        c52723.m11776();
                        break;
                    } catch (RemoteException e3) {
                        c52723.ˏᵢ().f20571.m4531(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                C5253 c52534 = this.f20559;
                C5272 c52724 = this.f20560;
                InterfaceC5311 interfaceC53114 = c52724.f20411;
                if (interfaceC53114 == null) {
                    c52724.ˏᵢ().f20571.m4533("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        interfaceC53114.mo11680(c52534);
                        c52724.m11776();
                        break;
                    } catch (RemoteException e4) {
                        c52724.ˏᵢ().f20571.m4531(e4, "Failed to send consent settings to the service");
                        return;
                    }
                }
            default:
                C5253 c52535 = this.f20559;
                C5272 c52725 = this.f20560;
                InterfaceC5311 interfaceC53115 = c52725.f20411;
                if (interfaceC53115 == null) {
                    c52725.ˏᵢ().f20571.m4533("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        interfaceC53115.mo11674(c52535);
                        c52725.m11776();
                        break;
                    } catch (RemoteException e5) {
                        c52725.ˏᵢ().f20571.m4531(e5, "Failed to send measurementEnabled to the service");
                    }
                }
        }
    }
}
