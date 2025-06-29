package p181;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.leanback.widget.RunnableC0183;
import com.google.android.gms.internal.play_billing.AbstractBinderC0636;
import com.google.android.gms.internal.play_billing.AbstractC0629;
import com.google.android.gms.internal.play_billing.C0589;
import com.google.android.gms.internal.play_billing.C0607;
import com.google.android.gms.internal.play_billing.C0633;
import com.google.android.gms.internal.play_billing.C0650;
import com.google.android.gms.internal.play_billing.C0664;
import com.google.android.gms.internal.play_billing.InterfaceC0600;
import p166.C2428;
import p331.C3767;

/* renamed from: ˋᵔ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC2505 implements ServiceConnection {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2428 f9956;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C2503 f9957;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f9958 = new Object();

    public /* synthetic */ ServiceConnectionC2505(C2503 c2503, C2428 c2428) {
        this.f9957 = c2503;
        this.f9956 = c2428;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0600 c0664;
        AbstractC0629.m2642("BillingClient", "Billing service connected.");
        C2503 c2503 = this.f9957;
        int i = AbstractBinderC0636.f3016;
        if (iBinder == null) {
            c0664 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            c0664 = iInterfaceQueryLocalInterface instanceof InterfaceC0600 ? (InterfaceC0600) iInterfaceQueryLocalInterface : new C0664(iBinder);
        }
        c2503.f9949 = c0664;
        CallableC2516 callableC2516 = new CallableC2516(0, this);
        RunnableC0183 runnableC0183 = new RunnableC0183(13, this);
        C2503 c25032 = this.f9957;
        if (c25032.m6622(callableC2516, 30000L, runnableC0183, c25032.m6623()) == null) {
            C2503 c25033 = this.f9957;
            C2510 c2510M6621 = c25033.m6621();
            c25033.m6618(AbstractC2508.m6628(25, 6, c2510M6621));
            m6625(c2510M6621);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0629.m2646("BillingClient", "Billing service disconnected.");
        C3767 c3767 = this.f9957.f9948;
        C0633 c0633M2654 = C0633.m2654();
        c3767.getClass();
        if (c0633M2654 != null) {
            try {
                C0589 c0589M2605 = C0607.m2605();
                C0650 c0650 = (C0650) c3767.f14557;
                c0589M2605.m2578();
                C0607.m2603((C0607) c0589M2605.f2966, c0650);
                c0589M2605.m2578();
                C0607.m2602((C0607) c0589M2605.f2966, c0633M2654);
                ((C2428) c3767.f14558).m6530((C0607) c0589M2605.m2577());
            } catch (Throwable th) {
                AbstractC0629.m2647("BillingLogger", "Unable to log.", th);
            }
        }
        this.f9957.f9949 = null;
        this.f9957.f9947 = 0;
        synchronized (this.f9958) {
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6625(C2510 c2510) {
        synchronized (this.f9958) {
            try {
                C2428 c2428 = this.f9956;
                if (c2428 != null) {
                    c2428.m6533(c2510);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
