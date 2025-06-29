package p456;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p305.C3524;
import p417.AbstractC4753;
import p417.InterfaceC4746;
import p417.InterfaceC4760;
import p455.C5228;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC5246 implements ServiceConnection, InterfaceC4746, InterfaceC4760 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public volatile C5314 f20171;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C5272 f20172;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public volatile boolean f20173;

    public ServiceConnectionC5246(C5272 c5272) {
        this.f20172 = c5272;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC4753.m10684("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f20173 = false;
                this.f20172.ˏᵢ().f20571.m4533("Service connected with null binder");
                return;
            }
            InterfaceC5311 c5330 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c5330 = iInterfaceQueryLocalInterface instanceof InterfaceC5311 ? (InterfaceC5311) iInterfaceQueryLocalInterface : new C5330(iBinder);
                    this.f20172.ˏᵢ().f20566.m4533("Bound to IMeasurementService interface");
                } else {
                    this.f20172.ˏᵢ().f20571.m4531(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f20172.ˏᵢ().f20571.m4533("Service connect failed to get IMeasurementService");
            }
            if (c5330 == null) {
                this.f20173 = false;
                try {
                    C5228 c5228M11592 = C5228.m11592();
                    C5272 c5272 = this.f20172;
                    c5228M11592.m11593(((C5236) ((ﹳﹳ) c5272).ᐧⁱ).f20114, c5272.f20409);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f20172.ʽᐧ().m11743(new RunnableC5278(this, c5330, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4753.m10684("MeasurementServiceConnection.onServiceDisconnected");
        C5272 c5272 = this.f20172;
        c5272.ˏᵢ().f20567.m4533("Service disconnected");
        c5272.ʽᐧ().m11743(new RunnableC5242(this, 6, componentName));
    }

    @Override // p417.InterfaceC4746
    /* renamed from: ʽᐧ */
    public final void mo10426(int i) {
        AbstractC4753.m10684("MeasurementServiceConnection.onConnectionSuspended");
        C5272 c5272 = this.f20172;
        c5272.ˏᵢ().f20567.m4533("Service connection suspended");
        c5272.ʽᐧ().m11743(new RunnableC5232(this, 0));
    }

    @Override // p417.InterfaceC4746
    /* renamed from: ˑʽ */
    public final void mo10430() {
        AbstractC4753.m10684("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC4753.m10683(this.f20171);
                this.f20172.ʽᐧ().m11743(new RunnableC5278(this, (InterfaceC5311) this.f20171.m10660(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f20171 = null;
                this.f20173 = false;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m11738(Intent intent) {
        this.f20172.m11846();
        Context context = ((C5236) ((ﹳﹳ) this.f20172).ᐧⁱ).f20114;
        C5228 c5228M11592 = C5228.m11592();
        synchronized (this) {
            try {
                if (this.f20173) {
                    this.f20172.ˏᵢ().f20566.m4533("Connection attempt already in progress");
                    return;
                }
                this.f20172.ˏᵢ().f20566.m4533("Using local app measurement service");
                this.f20173 = true;
                c5228M11592.m11594(context, context.getClass().getName(), intent, this.f20172.f20409, 129, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p417.InterfaceC4760
    /* renamed from: ٴˎ */
    public final void mo10693(C3524 c3524) {
        AbstractC4753.m10684("MeasurementServiceConnection.onConnectionFailed");
        C5301 c5301 = ((C5236) ((ﹳﹳ) this.f20172).ᐧⁱ).f20110;
        if (c5301 == null || !c5301.f20648) {
            c5301 = null;
        }
        if (c5301 != null) {
            c5301.f20568.m4531(c3524, "Service connection failed");
        }
        synchronized (this) {
            this.f20173 = false;
            this.f20171 = null;
        }
        this.f20172.ʽᐧ().m11743(new RunnableC5232(this, 1));
    }
}
