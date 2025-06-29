package p049;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p305.C3536;
import p305.ServiceConnectionC3535;
import p382.AbstractBinderC4450;
import p382.AbstractC4451;
import p382.C4449;
import p382.InterfaceC4452;
import p417.AbstractC4753;
import p455.C5228;

/* renamed from: ʽﹳ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1308 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public InterfaceC4452 f5343;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public C1311 f5344;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public boolean f5345;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ServiceConnectionC3535 f5346;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Context f5347;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final long f5348;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f5349 = new Object();

    public C1308(Context context) {
        AbstractC4753.m10683(context);
        Context applicationContext = context.getApplicationContext();
        this.f5347 = applicationContext != null ? applicationContext : context;
        this.f5345 = false;
        this.f5348 = -1L;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1310 m4611(Context context) {
        C1308 c1308 = new C1308(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c1308.m4615();
            C1310 c1310M4614 = c1308.m4614();
            m4612(c1310M4614, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return c1310M4614;
        } finally {
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m4612(C1310 c1310, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c1310 != null) {
                map.put("limit_ad_tracking", true != c1310.f5352 ? "0" : "1");
                String str = c1310.f5353;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new C1309(map).start();
        }
    }

    public final void finalize() throws Throwable {
        m4613();
        super.finalize();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m4613() {
        AbstractC4753.m10687("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f5347 == null || this.f5346 == null) {
                    return;
                }
                try {
                    if (this.f5345) {
                        C5228.m11592().m11593(this.f5347, this.f5346);
                    }
                } catch (Throwable th) {
                }
                this.f5345 = false;
                this.f5343 = null;
                this.f5346 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1310 m4614() {
        C1310 c1310;
        AbstractC4753.m10687("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f5345) {
                    synchronized (this.f5349) {
                        C1311 c1311 = this.f5344;
                        if (c1311 == null || !c1311.f5357) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m4615();
                        if (!this.f5345) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                AbstractC4753.m10683(this.f5346);
                AbstractC4753.m10683(this.f5343);
                try {
                    C4449 c4449 = (C4449) this.f5343;
                    c4449.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelM10065 = c4449.m10065(parcelObtain, 1);
                    String string = parcelM10065.readString();
                    parcelM10065.recycle();
                    C4449 c44492 = (C4449) this.f5343;
                    c44492.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = AbstractC4451.f17144;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM100652 = c44492.m10065(parcelObtain2, 2);
                    if (parcelM100652.readInt() == 0) {
                        z = false;
                    }
                    parcelM100652.recycle();
                    c1310 = new C1310(string, z, 0);
                } catch (RemoteException e2) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m4616();
        return c1310;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m4615() {
        AbstractC4753.m10687("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f5345) {
                    m4613();
                }
                Context context = this.f5347;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM8426 = C3536.f13675.m8426(context, 12451000);
                    if (iM8426 != 0 && iM8426 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC3535 serviceConnectionC3535 = new ServiceConnectionC3535();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C5228.m11592().m11594(context, context.getClass().getName(), intent, serviceConnectionC3535, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f5346 = serviceConnectionC3535;
                        try {
                            IBinder iBinderM8425 = serviceConnectionC3535.m8425(TimeUnit.MILLISECONDS);
                            int i = AbstractBinderC4450.f17143;
                            IInterface iInterfaceQueryLocalInterface = iBinderM8425.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f5343 = iInterfaceQueryLocalInterface instanceof InterfaceC4452 ? (InterfaceC4452) iInterfaceQueryLocalInterface : new C4449(iBinderM8425);
                            this.f5345 = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m4616() {
        synchronized (this.f5349) {
            C1311 c1311 = this.f5344;
            if (c1311 != null) {
                c1311.f5356.countDown();
                try {
                    this.f5344.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f5348;
            if (j > 0) {
                this.f5344 = new C1311(this, j);
            }
        }
    }
}
