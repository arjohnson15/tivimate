package p417;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ﹳᴵ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC4762 implements ServiceConnection {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4747 f18261;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f18262;

    public ServiceConnectionC4762(AbstractC4747 abstractC4747, int i) {
        this.f18261 = abstractC4747;
        this.f18262 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC4747 abstractC4747 = this.f18261;
        if (iBinder == null) {
            AbstractC4747.m10656(abstractC4747);
            return;
        }
        synchronized (abstractC4747.f18212) {
            try {
                AbstractC4747 abstractC47472 = this.f18261;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC47472.f18223 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C4756)) ? new C4756(iBinder) : (C4756) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC4747 abstractC47473 = this.f18261;
        int i = this.f18262;
        abstractC47473.getClass();
        C4751 c4751 = new C4751(abstractC47473, 0);
        HandlerC4777 handlerC4777 = abstractC47473.f18216;
        handlerC4777.sendMessage(handlerC4777.obtainMessage(7, i, -1, c4751));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4747 abstractC4747;
        synchronized (this.f18261.f18212) {
            abstractC4747 = this.f18261;
            abstractC4747.f18223 = null;
        }
        int i = this.f18262;
        HandlerC4777 handlerC4777 = abstractC4747.f18216;
        handlerC4777.sendMessage(handlerC4777.obtainMessage(6, i, 1));
    }
}
