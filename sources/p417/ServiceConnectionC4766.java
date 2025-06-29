package p417;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p455.C5228;

/* renamed from: ﹳᴵ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC4766 implements ServiceConnection {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C4755 f18287;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f18288;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public IBinder f18289;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public ComponentName f18291;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ C4750 f18292;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final HashMap f18290 = new HashMap();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f18286 = 2;

    public ServiceConnectionC4766(C4750 c4750, C4755 c4755) {
        this.f18292 = c4750;
        this.f18287 = c4755;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f18292.f18232) {
            try {
                this.f18292.f18231.removeMessages(1, this.f18287);
                this.f18289 = iBinder;
                this.f18291 = componentName;
                Iterator it = this.f18290.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f18286 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f18292.f18232) {
            try {
                this.f18292.f18231.removeMessages(1, this.f18287);
                this.f18289 = null;
                this.f18291 = componentName;
                Iterator it = this.f18290.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f18286 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m10696(String str, Executor executor) {
        this.f18286 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C4750 c4750 = this.f18292;
            C5228 c5228 = c4750.f18234;
            Context context = c4750.f18229;
            boolean zM11594 = c5228.m11594(context, str, this.f18287.m10690(context), this, 4225, executor);
            this.f18288 = zM11594;
            if (zM11594) {
                this.f18292.f18231.sendMessageDelayed(this.f18292.f18231.obtainMessage(1, this.f18287), this.f18292.f18233);
            } else {
                this.f18286 = 2;
                try {
                    C4750 c47502 = this.f18292;
                    c47502.f18234.m11593(c47502.f18229, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }
}
