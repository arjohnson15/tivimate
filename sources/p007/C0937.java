package p007;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import p056.InterfaceC1335;
import p181.C2514;
import p186.C2586;
import p210.C2804;
import p251.C3136;
import p251.RunnableC3129;
import p260.C3222;
import p293.C3463;
import p293.C3464;
import p293.C3469;
import p305.C3524;
import p331.C3767;
import p337.C3820;
import p337.C3835;
import p337.C3847;
import p349.InterfaceC4000;
import p383.AbstractC4464;
import p383.C4460;
import p417.AbstractC4753;
import p417.InterfaceC4774;

/* renamed from: ʻˉ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0937 implements InterfaceC4774 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public boolean f4124;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f4125;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public Object f4126;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public Object f4127;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Object f4128;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public Object f4129;

    public C0937() {
        this.f4128 = null;
        this.f4126 = C3835.f14733;
        this.f4125 = C3820.f14700;
    }

    public C0937(Context context) {
        this.f4128 = context;
        this.f4126 = C3835.f14733;
        this.f4125 = C3820.f14700;
    }

    public C0937(Context context, C0969 c0969) {
        this.f4128 = context.getApplicationContext();
        this.f4126 = c0969;
        this.f4129 = C4460.f17177;
    }

    public C0937(Context context, C2586 c2586, C3767 c3767) {
        this.f4128 = context;
        this.f4126 = c2586;
        this.f4127 = c3767;
        this.f4125 = new C2514(this, true);
        this.f4129 = new C2514(this, false);
    }

    public C0937(C2804 c2804) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f4126 = new Object();
        this.f4127 = new C3136();
        this.f4124 = false;
        this.f4129 = new C3136();
        c2804.m7085();
        Context context = c2804.f10936;
        this.f4128 = c2804;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f4124 = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f4124 = false;
                boolValueOf = null;
            } else {
                this.f4124 = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f4125 = boolValueOf;
        synchronized (this.f4126) {
            try {
                if (m3801()) {
                    ((C3136) this.f4127).m7702(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0937(C3464 c3464, InterfaceC4000 interfaceC4000, C3463 c3463) {
        this.f4129 = c3464;
        this.f4127 = null;
        this.f4125 = null;
        this.f4124 = false;
        this.f4128 = interfaceC4000;
        this.f4126 = c3463;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public synchronized boolean m3801() {
        boolean zM7084;
        Boolean bool = (Boolean) this.f4125;
        if (bool != null) {
            zM7084 = bool.booleanValue();
        } else {
            try {
                zM7084 = ((C2804) this.f4128).m7084();
            } catch (IllegalStateException unused) {
                zM7084 = false;
            }
        }
        m3803(zM7084);
        return zM7084;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m3802(C3524 c3524) {
        C3469 c3469 = (C3469) ((C3464) this.f4129).f13410.get((C3463) this.f4126);
        if (c3469 != null) {
            AbstractC4753.m10679(c3469.f13426.f13406);
            InterfaceC4000 interfaceC4000 = c3469.f13418;
            interfaceC4000.m9265("onSignInFailed for " + interfaceC4000.getClass().getName() + " with " + String.valueOf(c3524));
            c3469.m8320(c3524, null);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public void m3803(boolean z) {
        String str = "Crashlytics automatic data collection " + (z ? "ENABLED" : "DISABLED") + " by " + (((Boolean) this.f4125) == null ? "global Firebase setting" : this.f4124 ? "firebase_crashlytics_collection_enabled manifest flag" : "API") + ".";
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C3847 m3804() {
        AbstractC4464.m10132(!this.f4124);
        this.f4124 = true;
        if (((C3222) this.f4127) == null) {
            this.f4127 = new C3222(new InterfaceC1335[0]);
        }
        if (((C3767) this.f4129) == null) {
            this.f4129 = new C3767((Context) this.f4128, 14);
        }
        return new C3847(this);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public void m3805(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f4124 = z;
        ((C2514) this.f4129).m6638((Context) this.f4128, intentFilter2);
        if (!this.f4124) {
            ((C2514) this.f4125).m6638((Context) this.f4128, intentFilter);
            return;
        }
        C2514 c2514 = (C2514) this.f4125;
        Context context = (Context) this.f4128;
        synchronized (c2514) {
            try {
                if (!c2514.f9997) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(c2514, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != c2514.f9998 ? 4 : 2);
                    } else {
                        context.registerReceiver(c2514, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    c2514.f9997 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p417.InterfaceC4774
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void mo3806(C3524 c3524) {
        ((C3464) this.f4129).f13406.post(new RunnableC3129(this, 12, c3524));
    }
}
