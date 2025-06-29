package p031;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.leanback.widget.ʿˏ;
import j$.util.DesugarCollections;
import java.util.HashSet;
import p004.AbstractC0933;
import p119.C1863;
import p210.C2804;
import p292.InterfaceC3462;
import p333.C3780;
import p450.InterfaceC5190;

/* renamed from: ʼـ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1193 implements InterfaceC5190 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f4923;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f4924;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f4925;

    public /* synthetic */ C1193(Object obj, int i, Object obj2) {
        this.f4925 = i;
        this.f4923 = obj;
        this.f4924 = obj2;
    }

    @Override // p450.InterfaceC5190
    public final Object get() {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f4925) {
            case 0:
                C1204 c1204 = (C1204) this.f4923;
                c1204.getClass();
                C1194 c1194 = (C1194) this.f4924;
                InterfaceC1197 interfaceC1197 = c1194.f4930;
                ʿˏ r3 = new ʿˏ();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (C1188 c1188 : c1194.f4928) {
                    int i = c1188.f4915;
                    boolean z2 = i == 0;
                    int i2 = c1188.f4914;
                    C1200 c1200 = c1188.f4916;
                    if (z2) {
                        if (i2 == 2) {
                            hashSet4.add(c1200);
                        } else {
                            hashSet.add(c1200);
                        }
                    } else if (i == 2) {
                        hashSet3.add(c1200);
                    } else if (i2 == 2) {
                        hashSet5.add(c1200);
                    } else {
                        hashSet2.add(c1200);
                    }
                }
                if (!c1194.f4931.isEmpty()) {
                    hashSet.add(C1200.m4252(InterfaceC3462.class));
                }
                r3.ᐧⁱ = DesugarCollections.unmodifiableSet(hashSet);
                r3.ˆʿ = DesugarCollections.unmodifiableSet(hashSet2);
                r3.ˎˑ = DesugarCollections.unmodifiableSet(hashSet3);
                r3.ᐧˋ = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                r3.ˆᵔ = c1204;
                return interfaceC1197.mo4098(r3);
            case 1:
                return new C1863((Context) this.f4923, (String) this.f4924);
            default:
                C2804 c2804 = (C2804) this.f4923;
                String strM7086 = c2804.m7086();
                Context contextM3795 = (Context) this.f4924;
                C3780 c3780 = new C3780();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 24) {
                    contextM3795 = i3 >= 24 ? AbstractC0933.m3795(contextM3795) : null;
                }
                SharedPreferences sharedPreferences = contextM3795.getSharedPreferences("com.google.firebase.common.prefs:" + strM7086, 0);
                boolean z3 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextM3795.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM3795.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z3 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z = z3;
                }
                c3780.f14623 = z;
                return c3780;
        }
    }
}
