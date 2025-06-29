package p417;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC0413;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p063.C1458;
import p455.C5228;

/* renamed from: ﹳᴵ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4750 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static C4750 f18226;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Object f18227 = new Object();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static HandlerThread f18228;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Context f18229;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final long f18230;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public volatile HandlerC0413 f18231;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f18232 = new HashMap();

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final long f18233;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C5228 f18234;

    public C4750(Context context, Looper looper) {
        C1458 c1458 = new C1458(2, this);
        this.f18229 = context.getApplicationContext();
        HandlerC0413 handlerC0413 = new HandlerC0413(looper, c1458);
        Looper.getMainLooper();
        this.f18231 = handlerC0413;
        this.f18234 = C5228.m11592();
        this.f18230 = 5000L;
        this.f18233 = 300000L;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static HandlerThread m10673() {
        synchronized (f18227) {
            try {
                HandlerThread handlerThread = f18228;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f18228 = handlerThread2;
                handlerThread2.start();
                return f18228;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C4750 m10674(Context context) {
        synchronized (f18227) {
            try {
                if (f18226 == null) {
                    f18226 = new C4750(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18226;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m10675(String str, ServiceConnection serviceConnection, boolean z) {
        C4755 c4755 = new C4755(str, z);
        AbstractC4753.m10689(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f18232) {
            try {
                ServiceConnectionC4766 serviceConnectionC4766 = (ServiceConnectionC4766) this.f18232.get(c4755);
                if (serviceConnectionC4766 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(c4755.toString()));
                }
                if (!serviceConnectionC4766.f18290.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(c4755.toString()));
                }
                serviceConnectionC4766.f18290.remove(serviceConnection);
                if (serviceConnectionC4766.f18290.isEmpty()) {
                    this.f18231.sendMessageDelayed(this.f18231.obtainMessage(0, c4755), this.f18230);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final boolean m10676(C4755 c4755, ServiceConnectionC4762 serviceConnectionC4762, String str, Executor executor) {
        boolean z;
        synchronized (this.f18232) {
            try {
                ServiceConnectionC4766 serviceConnectionC4766 = (ServiceConnectionC4766) this.f18232.get(c4755);
                if (executor == null) {
                    executor = null;
                }
                if (serviceConnectionC4766 == null) {
                    serviceConnectionC4766 = new ServiceConnectionC4766(this, c4755);
                    serviceConnectionC4766.f18290.put(serviceConnectionC4762, serviceConnectionC4762);
                    serviceConnectionC4766.m10696(str, executor);
                    this.f18232.put(c4755, serviceConnectionC4766);
                } else {
                    this.f18231.removeMessages(0, c4755);
                    if (serviceConnectionC4766.f18290.containsKey(serviceConnectionC4762)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(c4755.toString()));
                    }
                    serviceConnectionC4766.f18290.put(serviceConnectionC4762, serviceConnectionC4762);
                    int i = serviceConnectionC4766.f18286;
                    if (i == 1) {
                        serviceConnectionC4762.onServiceConnected(serviceConnectionC4766.f18291, serviceConnectionC4766.f18289);
                    } else if (i == 2) {
                        serviceConnectionC4766.m10696(str, executor);
                    }
                }
                z = serviceConnectionC4766.f18288;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
