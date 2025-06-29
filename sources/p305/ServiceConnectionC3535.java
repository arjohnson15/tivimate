package p305;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p417.AbstractC4753;

/* renamed from: ᐧˆ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC3535 implements ServiceConnection {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public boolean f13674 = false;

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final LinkedBlockingQueue f13673 = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13673.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final IBinder m8425(TimeUnit timeUnit) throws TimeoutException {
        AbstractC4753.m10687("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f13674) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f13674 = true;
        IBinder iBinder = (IBinder) this.f13673.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
}
