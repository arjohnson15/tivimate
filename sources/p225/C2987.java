package p225;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import com.google.android.gms.internal.play_billing.ˎˑ;
import java.util.Calendar;
import p266.C3262;

/* renamed from: ˏᵢ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2987 extends AbstractC2995 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Object f11487;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f11488 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C3017 f11489;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017, Context context) {
        super(layoutInflaterFactory2C3017);
        this.f11489 = layoutInflaterFactory2C3017;
        this.f11487 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017, C3262 c3262) {
        super(layoutInflaterFactory2C3017);
        this.f11489 = layoutInflaterFactory2C3017;
        this.f11487 = c3262;
    }

    @Override // p225.AbstractC2995
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo7409() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f11488) {
            case 0:
                this.f11489.m7469(true, true);
                break;
            default:
                this.f11489.m7469(true, true);
                break;
        }
    }

    @Override // p225.AbstractC2995
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int mo7410() {
        Location location;
        boolean z;
        long j;
        switch (this.f11488) {
            case 0:
                return AbstractC3023.m7518((PowerManager) this.f11487) ? 2 : 1;
            default:
                C3262 c3262 = (C3262) this.f11487;
                C3004 c3004 = (C3004) c3262.f12725;
                if (c3004.f11532 > System.currentTimeMillis()) {
                    z = c3004.f11533;
                } else {
                    Context context = (Context) c3262.f12726;
                    int i = ˎˑ.ﹳﹳ(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) c3262.f12724;
                    if (i == 0) {
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (ˎˑ.ﹳﹳ(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e) {
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C2984.f11480 == null) {
                            C2984.f11480 = new C2984();
                        }
                        C2984 c2984 = C2984.f11480;
                        c2984.m7406(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c2984.m7406(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = c2984.f11482 == 1;
                        long j2 = c2984.f11481;
                        long j3 = c2984.f11483;
                        c2984.m7406(location.getLatitude(), location.getLongitude(), 86400000 + jCurrentTimeMillis);
                        long j4 = c2984.f11481;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j3) {
                                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        c3004.f11533 = z;
                        c3004.f11532 = j;
                    } else {
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // p225.AbstractC2995
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final IntentFilter mo7411() {
        switch (this.f11488) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }
}
