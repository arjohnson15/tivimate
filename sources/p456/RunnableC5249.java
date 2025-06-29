package p456;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: ﾞⁱ.ˆʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC5249 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C5253 f20301;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f20302;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20303;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20304;

    public /* synthetic */ RunnableC5249(C5272 c5272, C5253 c5253, Bundle bundle, int i) {
        this.f20304 = i;
        this.f20301 = c5253;
        this.f20302 = bundle;
        this.f20303 = c5272;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20304) {
            case 0:
                C5253 c5253 = this.f20301;
                C5272 c5272 = this.f20303;
                InterfaceC5311 interfaceC5311 = c5272.f20411;
                if (interfaceC5311 == null) {
                    c5272.ˏᵢ().f20571.m4533("Failed to send default event parameters to service");
                    break;
                } else {
                    try {
                        interfaceC5311.mo11678(this.f20302, c5253);
                        break;
                    } catch (RemoteException e) {
                        c5272.ˏᵢ().f20571.m4531(e, "Failed to send default event parameters to service");
                        return;
                    }
                }
            default:
                C5253 c52532 = this.f20301;
                C5272 c52722 = this.f20303;
                InterfaceC5311 interfaceC53112 = c52722.f20411;
                if (interfaceC53112 == null) {
                    c52722.ˏᵢ().f20571.m4533("Failed to send default event parameters to service");
                    break;
                } else {
                    try {
                        interfaceC53112.mo11688(this.f20302, c52532);
                        break;
                    } catch (RemoteException e2) {
                        c52722.ˏᵢ().f20571.m4531(e2, "Failed to send default event parameters to service");
                    }
                }
        }
    }
}
