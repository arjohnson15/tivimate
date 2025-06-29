package p456;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.AbstractBinderC0396;
import com.google.android.gms.internal.measurement.C0487;
import com.google.android.gms.internal.measurement.InterfaceC0455;
import p251.RunnableC3129;

/* renamed from: ﾞⁱ.ᵔٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC5327 implements ServiceConnection {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C5325 f20657;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f20658;

    public ServiceConnectionC5327(C5325 c5325, String str) {
        this.f20657 = c5325;
        this.f20658 = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C5325 c5325 = this.f20657;
        if (iBinder == null) {
            C5301 c5301 = c5325.f20649.f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4533("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC0396.f2673;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            InterfaceC0455 c0487 = iInterfaceQueryLocalInterface instanceof InterfaceC0455 ? (InterfaceC0455) iInterfaceQueryLocalInterface : new C0487(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            if (c0487 == null) {
                C5301 c53012 = c5325.f20649.f20110;
                C5236.m11647(c53012);
                c53012.f20568.m4533("Install Referrer Service implementation was not found");
            } else {
                C5301 c53013 = c5325.f20649.f20110;
                C5236.m11647(c53013);
                c53013.f20566.m4533("Install Referrer Service connected");
                C5247 c5247 = c5325.f20649.f20115;
                C5236.m11647(c5247);
                c5247.m11743(new RunnableC3129(this, c0487, this));
            }
        } catch (RuntimeException e) {
            C5301 c53014 = c5325.f20649.f20110;
            C5236.m11647(c53014);
            c53014.f20568.m4531(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5301 c5301 = this.f20657.f20649.f20110;
        C5236.m11647(c5301);
        c5301.f20566.m4533("Install Referrer Service disconnected");
    }
}
