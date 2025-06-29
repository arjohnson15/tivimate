package p065;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import p072.AbstractC1642;
import p330.InterfaceC3747;
import p429.C4982;
import ﹶˋ.ـﹶ;

/* renamed from: ʾᵔ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC1518 implements ServiceConnection {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f6179;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6180;

    public /* synthetic */ ServiceConnectionC1518(int i, Object obj) {
        this.f6180 = i;
        this.f6179 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [ʾᵔ.ᐧʻ] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1510 c1510;
        Object obj = this.f6179;
        switch (this.f6180) {
            case 0:
                int i = BinderC1482.f6028;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1513.f6163);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1513)) {
                    C1510 c15102 = new C1510();
                    c15102.f6148 = iBinder;
                    c1510 = c15102;
                } else {
                    c1510 = (InterfaceC1513) iInterfaceQueryLocalInterface;
                }
                C1526 c1526 = (C1526) obj;
                c1526.f6206 = c1510;
                try {
                    c1526.f6205 = c1510.mo5034(c1526.f6208, c1526.f6204);
                    break;
                } catch (RemoteException e) {
                    return;
                }
                break;
            default:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                ـﹶ r4 = (ـﹶ) obj;
                sb.append(((LinkedBlockingDeque) r4.ᐧˋ).size());
                sb.toString();
                r4.ˎˑ = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) r4.ᐧˋ).drainTo(arrayList);
                AbstractC1642.m5294(AbstractC1642.m5296((InterfaceC3747) r4.ˆʿ), null, 0, new C4982(r4, arrayList, null), 3);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f6180) {
            case 0:
                ((C1526) this.f6179).f6206 = null;
                break;
            default:
                ـﹶ r2 = (ـﹶ) this.f6179;
                r2.ˎˑ = null;
                r2.getClass();
                break;
        }
    }
}
