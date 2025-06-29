package p456;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C0407;
import com.google.android.gms.internal.measurement.C0432;
import com.google.android.gms.internal.measurement.C0556;
import j$.util.Comparator;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p041.C1272;
import p101.C1778;
import p106.ExecutorC1797;
import p199.C2739;
import p251.RunnableC3129;
import p293.C3474;
import p331.C3758;
import p395.InterfaceFutureC4542;
import p395.RunnableC4533;
import p396.C4554;
import p417.AbstractC4753;
import p447.AbstractC5179;
import p453.AbstractC5200;
import ʽᵔ.ʽⁱ;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5244 extends AbstractC5257 {

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public boolean f20147;

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public PriorityQueue f20148;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f20149;

    /* renamed from: ˊᵔ, reason: contains not printable characters */
    public final C4554 f20150;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Object f20151;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C5337 f20152;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public long f20153;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public C5356 f20154;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public boolean f20155;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public boolean f20156;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C3758 f20157;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public int f20158;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public SharedPreferencesOnSharedPreferenceChangeListenerC5265 f20159;

    /* renamed from: ᵔٴ, reason: contains not printable characters */
    public C5312 f20160;

    /* renamed from: ᵔﹳ, reason: contains not printable characters */
    public final C5325 f20161;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public boolean f20162;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final AtomicLong f20163;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final AtomicReference f20164;

    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public C5312 f20165;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public C5312 f20166;

    public C5244(C5236 c5236) {
        super(c5236);
        this.f20149 = new CopyOnWriteArraySet();
        this.f20151 = new Object();
        this.f20156 = false;
        this.f20158 = 1;
        this.f20147 = true;
        this.f20150 = new C4554(this);
        this.f20164 = new AtomicReference();
        this.f20154 = C5356.f20781;
        this.f20153 = -1L;
        this.f20163 = new AtomicLong(0L);
        this.f20161 = new C5325(c5236, 2);
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public static void m11695(C5244 c5244, C5356 c5356, long j, boolean z, boolean z2) {
        c5244.m11846();
        c5244.m11757();
        C5356 c5356M11855 = c5244.ᐧᴵ().m11855();
        long j2 = c5244.f20153;
        int i = c5356.f20782;
        if (j <= j2 && C5356.m12137(c5356M11855.f20782, i)) {
            c5244.ˏᵢ().f20562.m4531(c5356, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C5280 c5280 = c5244.ᐧᴵ();
        c5280.ʼᵎ();
        if (!c5280.m11860(i)) {
            C5301 c5301 = c5244.ˏᵢ();
            c5301.f20562.m4531(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c5280.m11856().edit();
        editorEdit.putString("consent_settings", c5356.m12146());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        c5244.ˏᵢ().f20566.m4531(c5356, "Setting storage consent(FE)");
        c5244.f20153 = j;
        C5236 c5236 = (C5236) ((ﹳﹳ) c5244).ᐧⁱ;
        C5272 c5272M11549 = AbstractC5179.m11549(c5236);
        if (c5272M11549.m11784() && c5272M11549.ﹶﾞ().m11988() < 241200) {
            c5236.m11652().m11780(z);
        } else {
            C5272 c5272M11652 = c5236.m11652();
            c5272M11652.m11846();
            c5272M11652.m11757();
            C0432.m2206();
            C5236 c52362 = (C5236) ((ﹳﹳ) c5272M11652).ᐧⁱ;
            if (!c52362.f20123.m11727(null, AbstractC5248.f20287) && z) {
                c52362.m11656().m12033();
            }
            RunnableC5261 runnableC5261 = new RunnableC5261(0);
            runnableC5261.f20379 = c5272M11652;
            c5272M11652.m11785(runnableC5261);
        }
        if (z2) {
            c5236.m11652().m11786(new AtomicReference());
        }
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public static void m11696(C5244 c5244, C5356 c5356, C5356 c53562) {
        boolean z;
        C0432.m2206();
        if (((C5236) ((ﹳﹳ) c5244).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20287)) {
            return;
        }
        EnumC5341 enumC5341 = EnumC5341.f20711;
        EnumC5341 enumC53412 = EnumC5341.f20709;
        EnumC5341[] enumC5341Arr = {enumC5341, enumC53412};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            EnumC5341 enumC53413 = enumC5341Arr[i];
            if (!c53562.m12151(enumC53413) && c5356.m12151(enumC53413)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zM12145 = c5356.m12145(c53562, enumC5341, enumC53412);
        if (z || zM12145) {
            ((C5236) ((ﹳﹳ) c5244).ᐧⁱ).m11654().m11752();
        }
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final void m11697(boolean z, long j) throws IllegalAccessException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        m11846();
        m11757();
        ˏᵢ().f20567.m4533("Resetting analytics data (FE)");
        C5255 c5255M11848 = m11848();
        c5255M11848.m11846();
        C1778 c1778 = c5255M11848.f20363;
        ((C5235) c1778.f6898).m11844();
        C5255 c5255 = (C5255) c1778.f6899;
        if (((C5236) ((ﹳﹳ) c5255).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20282)) {
            ((C5236) ((ﹳﹳ) c5255).ᐧⁱ).f20107.getClass();
            c1778.f6900 = SystemClock.elapsedRealtime();
        } else {
            c1778.f6900 = 0L;
        }
        c1778.f6897 = c1778.f6900;
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        c5236.m11654().m11752();
        boolean zM11662 = c5236.m11662();
        C5280 c5280 = ᐧᴵ();
        c5280.f20483.m11314(j);
        if (!TextUtils.isEmpty(c5280.ᐧᴵ().f20469.m1603())) {
            c5280.f20469.m1604(null);
        }
        c5280.f20480.m11314(0L);
        c5280.f20462.m11314(0L);
        Boolean boolM11725 = ((C5236) ((ﹳﹳ) c5280).ᐧⁱ).f20123.m11725("firebase_analytics_collection_deactivated");
        if (boolM11725 == null || !boolM11725.booleanValue()) {
            c5280.m11858(!zM11662);
        }
        c5280.f20477.m1604(null);
        c5280.f20464.m11314(0L);
        c5280.f20466.ᵔٴ((Bundle) null);
        if (z) {
            C5272 c5272M11549 = AbstractC5179.m11549(c5236);
            C5253 c5253M11777 = c5272M11549.m11777(false);
            ((C5236) ((ﹳﹳ) c5272M11549).ᐧⁱ).m11656().m12033();
            c5272M11549.m11785(new RunnableC5300(c5272M11549, c5253M11777, 0));
        }
        m11848().f20360.m10428();
        this.f20147 = !zM11662;
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final void m11698() {
        m11846();
        String strM1603 = ᐧᴵ().f20472.m1603();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (strM1603 != null) {
            if ("unset".equals(strM1603)) {
                c5236.f20107.getClass();
                m11717(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf("true".equals(strM1603) ? 1L : 0L);
                c5236.f20107.getClass();
                m11717(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (c5236.m11662() && this.f20147) {
            ˏᵢ().f20567.m4533("Recording app launch after enabling measurement for the first time (FE)");
            m11712();
            m11848().f20360.m10428();
            ʽᐧ().m11743(new RunnableC5298(this));
            return;
        }
        ˏᵢ().f20567.m4533("Updating Scion state (FE)");
        C5272 c5272M11652 = c5236.m11652();
        c5272M11652.m11846();
        c5272M11652.m11757();
        c5272M11652.m11785(new RunnableC5300(c5272M11652, c5272M11652.m11777(true), 4));
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final void m11699(Boolean bool, boolean z) {
        m11846();
        m11757();
        ˏᵢ().f20567.m4531(bool, "Setting app measurement enabled (FE)");
        C5280 c5280 = ᐧᴵ();
        c5280.ʼᵎ();
        SharedPreferences.Editor editorEdit = c5280.m11856().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            C5280 c52802 = ᐧᴵ();
            c52802.ʼᵎ();
            SharedPreferences.Editor editorEdit2 = c52802.m11856().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        C5247 c5247 = c5236.f20115;
        C5236.m11647(c5247);
        c5247.m11740();
        if (c5236.f20093 || !(bool == null || bool.booleanValue())) {
            m11698();
        }
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final void m11700(C5356 c5356, long j, boolean z) {
        C5356 c53562;
        boolean z2;
        boolean zM12145;
        boolean z3;
        C5356 c5356M12142 = c5356;
        m11757();
        int i = c5356M12142.f20782;
        C0556.m2477();
        if (((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20186)) {
            if (i != -10) {
                EnumC5288 enumC5288 = (EnumC5288) c5356M12142.f20783.get(EnumC5341.f20709);
                if (enumC5288 == null) {
                    enumC5288 = EnumC5288.f20519;
                }
                EnumC5288 enumC52882 = EnumC5288.f20519;
                if (enumC5288 == enumC52882) {
                    EnumC5288 enumC52883 = (EnumC5288) c5356M12142.f20783.get(EnumC5341.f20711);
                    if (enumC52883 == null) {
                        enumC52883 = enumC52882;
                    }
                    if (enumC52883 == enumC52882) {
                        ˏᵢ().f20573.m4533("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i != -10 && c5356.m12143() == null && c5356.m12144() == null) {
            ˏᵢ().f20573.m4533("Discarding empty consent settings");
            return;
        }
        synchronized (this.f20151) {
            try {
                c53562 = this.f20154;
                z2 = false;
                if (C5356.m12137(i, c53562.f20782)) {
                    zM12145 = c5356.m12145(this.f20154, (EnumC5341[]) c5356M12142.f20783.keySet().toArray(new EnumC5341[0]));
                    EnumC5341 enumC5341 = EnumC5341.f20711;
                    if (c5356.m12151(enumC5341) && !this.f20154.m12151(enumC5341)) {
                        z2 = true;
                    }
                    c5356M12142 = c5356.m12142(this.f20154);
                    this.f20154 = c5356M12142;
                    z3 = z2;
                    z2 = true;
                } else {
                    zM12145 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            ˏᵢ().f20562.m4531(c5356M12142, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f20163.getAndIncrement();
        if (zM12145) {
            m11714(null);
            RunnableC5326 runnableC5326 = new RunnableC5326(this, c5356M12142, j, andIncrement, z3, c53562);
            if (!z) {
                ʽᐧ().m11739(runnableC5326);
                return;
            } else {
                m11846();
                runnableC5326.run();
                return;
            }
        }
        RunnableC5331 runnableC5331 = new RunnableC5331(this, c5356M12142, andIncrement, z3, c53562);
        if (z) {
            m11846();
            runnableC5331.run();
        } else if (i == 30 || i == -10) {
            ʽᐧ().m11739(runnableC5331);
        } else {
            ʽᐧ().m11743(runnableC5331);
        }
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final void m11701(C5356 c5356) {
        m11846();
        boolean z = (c5356.m12151(EnumC5341.f20711) && c5356.m12151(EnumC5341.f20709)) || ((C5236) ((ﹳﹳ) this).ᐧⁱ).m11652().m11787();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        C5247 c5247 = c5236.f20115;
        C5236.m11647(c5247);
        c5247.m11740();
        if (z != c5236.f20093) {
            C5236 c52362 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
            C5247 c52472 = c52362.f20115;
            C5236.m11647(c52472);
            c52472.m11740();
            c52362.f20093 = z;
            C5280 c5280 = ᐧᴵ();
            c5280.ʼᵎ();
            Boolean boolValueOf = c5280.m11856().contains("measurement_enabled_from_api") ? Boolean.valueOf(c5280.m11856().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m11699(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: ˆˋ, reason: contains not printable characters */
    public final void m11702() {
        C5307 c5307;
        C2739 c2739M11987;
        m11846();
        this.f20155 = false;
        if (m11709().isEmpty() || this.f20156 || (c5307 = (C5307) m11709().poll()) == null || (c2739M11987 = ﹶﾞ().m11987()) == null) {
            return;
        }
        this.f20156 = true;
        C1272 c1272 = ˏᵢ().f20566;
        String str = c5307.f20588;
        c1272.m4531(str, "Registering trigger URI");
        InterfaceFutureC4542 interfaceFutureC4542M6959 = c2739M11987.m6959(Uri.parse(str));
        if (interfaceFutureC4542M6959 == null) {
            this.f20156 = false;
            m11709().add(c5307);
            return;
        }
        if (!((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20190)) {
            SparseArray sparseArrayM11854 = ᐧᴵ().m11854();
            sparseArrayM11854.put(c5307.f20587, Long.valueOf(c5307.f20586));
            ᐧᴵ().m11861(sparseArrayM11854);
        }
        interfaceFutureC4542M6959.mo10415(new RunnableC4533(interfaceFutureC4542M6959, 0, new C5349(this, 0, c5307)), new ExecutorC1797(3, this));
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final void m11703() {
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (!(c5236.f20114.getApplicationContext() instanceof Application) || this.f20152 == null) {
            return;
        }
        ((Application) c5236.f20114.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f20152);
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final void m11704() {
        String string;
        int i;
        int i2;
        int i3;
        String string2;
        int i4;
        Bundle bundle;
        int i5;
        Bundle bundle2;
        m11846();
        ˏᵢ().f20567.m4533("Handle tcf update.");
        SharedPreferences sharedPreferencesM11859 = ᐧᴵ().m11859();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesM11859.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i = sharedPreferencesM11859.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i = -1;
        }
        if (i != -1) {
            map.put("gdprApplies", String.valueOf(i));
        }
        try {
            i2 = sharedPreferencesM11859.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i2 = -1;
        }
        if (i2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
        }
        try {
            i3 = sharedPreferencesM11859.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i3 = -1;
        }
        if (i3 != -1) {
            map.put("PolicyVersion", String.valueOf(i3));
        }
        try {
            string2 = sharedPreferencesM11859.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i4 = sharedPreferencesM11859.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i4 = -1;
        }
        if (i4 != -1) {
            map.put("CmpSdkID", String.valueOf(i4));
        }
        C5336 c5336 = new C5336(map);
        ˏᵢ().f20566.m4531(c5336, "Tcf preferences read");
        C5280 c5280 = ᐧᴵ();
        c5280.ʼᵎ();
        String string3 = c5280.m11856().getString("stored_tcf_param", "");
        String strM12017 = c5336.m12017();
        if (strM12017.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = c5280.m11856().edit();
        editorEdit.putString("stored_tcf_param", strM12017);
        editorEdit.apply();
        HashMap map2 = c5336.f20697;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iM12016 = c5336.m12016();
            if (iM12016 < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    Bundle bundle3 = new Bundle();
                    String str2 = "denied";
                    if (str.length() > 0) {
                        bundle3.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str.length() > 3) {
                        bundle3.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str.length() > 6 && iM12016 >= 4) {
                        if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                            str2 = "granted";
                        }
                        bundle3.putString("ad_user_data", str2);
                    }
                    bundle = bundle3;
                }
            }
            bundle = bundle2;
        } else {
            bundle = Bundle.EMPTY;
        }
        ˏᵢ().f20566.m4531(bundle, "Consent generated from Tcf");
        if (bundle != Bundle.EMPTY) {
            ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
            m11711(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle4 = new Bundle();
        StringBuilder sb = new StringBuilder("1");
        try {
            String str3 = (String) map2.get("CmpSdkID");
            i5 = !TextUtils.isEmpty(str3) ? Integer.parseInt(str3) : -1;
        } catch (NumberFormatException unused7) {
            i5 = -1;
        }
        if (i5 < 0 || i5 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i5 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 & 63));
        }
        int iM120162 = c5336.m12016();
        if (iM120162 < 0 || iM120162 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM120162));
        }
        int i6 = "1".equals(map2.get("gdprApplies")) ? 2 : 0;
        int i7 = i6 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i7 = i6 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7));
        bundle4.putString("_tcfd", sb.toString());
        m11705("auto", "_tcf", bundle4);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m11705(String str, String str2, Bundle bundle) {
        m11846();
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        m11716(System.currentTimeMillis(), bundle, str, str2);
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final void m11706(String str, String str2, Object obj, boolean z) {
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        m11718(str, str2, obj, z, System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* renamed from: ˉˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11707(java.lang.String r27, java.lang.String r28, long r29, android.os.Bundle r31, boolean r32, boolean r33, boolean r34) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5244.m11707(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final void m11708(String str, String str2, Bundle bundle) {
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC4753.m10688(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ʽᐧ().m11743(new RunnableC5229(this, bundle2, 2));
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final PriorityQueue m11709() {
        if (this.f20148 == null) {
            this.f20148 = AbstractC5200.m11589(Comparator.CC.comparing(new C5256(), new ʽⁱ(21)));
        }
        return this.f20148;
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final void m11710(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String strM12008;
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.f20157 == null || C5316.m11941(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            ʽᐧ().m11743(new RunnableC5321(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        C5328 c5328M11849 = m11849();
        synchronized (c5328M11849.f20659) {
            try {
                if (!c5328M11849.f20668) {
                    c5328M11849.ˏᵢ().f20573.m4533("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > ((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11737(null, false))) {
                    c5328M11849.ˏᵢ().f20573.m4531(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > ((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20123.m11737(null, false))) {
                    c5328M11849.ˏᵢ().f20573.m4531(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    Activity activity = c5328M11849.f20667;
                    strM12008 = activity != null ? c5328M11849.m12008(activity.getClass()) : "Activity";
                } else {
                    strM12008 = string2;
                }
                C5297 c5297 = c5328M11849.f20662;
                if (c5328M11849.f20661 && c5297 != null) {
                    c5328M11849.f20661 = false;
                    boolean zEquals = Objects.equals(c5297.f20548, strM12008);
                    boolean zEquals2 = Objects.equals(c5297.f20551, string);
                    if (zEquals && zEquals2) {
                        c5328M11849.ˏᵢ().f20573.m4533("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                c5328M11849.ˏᵢ().f20566.m4529(string == null ? "null" : string, strM12008 == null ? "null" : strM12008, "Logging screen view with name, class");
                C5297 c52972 = c5328M11849.f20662 == null ? c5328M11849.f20664 : c5328M11849.f20662;
                C5297 c52973 = new C5297(string, strM12008, c5328M11849.ﹶﾞ().m11962(), true, j);
                c5328M11849.f20662 = c52973;
                c5328M11849.f20664 = c52972;
                c5328M11849.f20663 = c52973;
                ((C5236) ((ﹳﹳ) c5328M11849).ᐧⁱ).f20107.getClass();
                c5328M11849.ʽᐧ().m11743(new RunnableC5308(c5328M11849, bundle2, c52973, c52972, SystemClock.elapsedRealtime(), 2));
            } finally {
            }
        }
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final void m11711(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        m11757();
        C5356 c5356 = C5356.f20781;
        EnumC5341[] enumC5341Arr = EnumC5230.STORAGE.f20035;
        int length = enumC5341Arr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            EnumC5341 enumC5341 = enumC5341Arr[i2];
            if (bundle.containsKey(enumC5341.f20714) && (string = bundle.getString(enumC5341.f20714)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            ˏᵢ().f20573.m4531(obj, "Ignoring invalid consent setting");
            ˏᵢ().f20573.m4533("Valid consent values are 'granted', 'denied'");
        }
        boolean zM11741 = ʽᐧ().m11741();
        C5356 c5356M12136 = C5356.m12136(i, bundle);
        if (c5356M12136.m12150()) {
            m11700(c5356M12136, j, zM11741);
        }
        C5285 c5285M11862 = C5285.m11862(i, bundle);
        Iterator it = c5285M11862.f20501.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((EnumC5288) it.next()) != EnumC5288.f20519) {
                m11713(c5285M11862, zM11741);
                break;
            }
        }
        Boolean boolM11864 = C5285.m11864(bundle);
        if (boolM11864 != null) {
            m11706(i == -30 ? "tcf" : "app", "allow_personalized_ads", boolM11864.toString(), false);
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public final void m11712() {
        m11846();
        m11757();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (c5236.m11649()) {
            Boolean boolM11725 = c5236.f20123.m11725("google_analytics_deferred_deep_link_enabled");
            if (boolM11725 != null && boolM11725.booleanValue()) {
                ˏᵢ().f20567.m4533("Deferred Deep Link feature enabled.");
                C5247 c5247 = ʽᐧ();
                RunnableC5298 runnableC5298 = new RunnableC5298(1);
                runnableC5298.f20554 = this;
                c5247.m11743(runnableC5298);
            }
            C5272 c5272M11549 = AbstractC5179.m11549(c5236);
            C5253 c5253M11777 = c5272M11549.m11777(true);
            ((C5236) ((ﹳﹳ) c5272M11549).ᐧⁱ).m11656().m12034(3, new byte[0]);
            c5272M11549.m11785(new RunnableC5300(c5272M11549, c5253M11777, 1));
            this.f20147 = false;
            C5280 c5280 = ᐧᴵ();
            c5280.ʼᵎ();
            String string = c5280.m11856().getString("previous_os_version", null);
            ((C5236) ((ﹳﹳ) c5280).ᐧⁱ).m11658().m11997();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c5280.m11856().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c5236.m11658().m11997();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m11705("auto", "_ou", bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: יᴵ, reason: contains not printable characters */
    public final void m11713(C5285 c5285, boolean z) {
        RunnableC5242 runnableC5242 = new RunnableC5242(4, (Object) c5285, (InterfaceC5281) this);
        if (!z) {
            ʽᐧ().m11743(runnableC5242);
        } else {
            m11846();
            runnableC5242.run();
        }
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public final void m11714(String str) {
        this.f20164.set(str);
    }

    @Override // p456.AbstractC5257
    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final boolean mo11715() {
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11716(long j, Bundle bundle, String str, String str2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m11846();
        m11707(str, str2, j, bundle, true, this.f20157 == null || C5316.m11941(str2), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11717(long r10, java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            p417.AbstractC4753.m10688(r13)
            p417.AbstractC4753.m10688(r14)
            r9.m11846()
            r9.m11757()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L67
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L4c
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4c
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.String r12 = r0.toLowerCase(r12)
            java.lang.String r14 = "false"
            boolean r12 = r14.equals(r12)
            r2 = 1
            if (r12 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            ﾞⁱ.ˎᵔ r0 = r9.ᐧᴵ()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L45
            java.lang.String r14 = "true"
        L45:
            com.bumptech.glide.ﹶˆ r0 = r0.f20472
            r0.m1604(r14)
        L4a:
            r14 = r1
            goto L5a
        L4c:
            if (r12 != 0) goto L5a
            ﾞⁱ.ˎᵔ r14 = r9.ᐧᴵ()
            com.bumptech.glide.ﹶˆ r14 = r14.f20472
            java.lang.String r0 = "unset"
            r14.m1604(r0)
            goto L4a
        L5a:
            ﾞⁱ.ـˆ r0 = r9.ˏᵢ()
            java.lang.String r1 = "non_personalized_ads(_npa)"
            ʽˉ.ʽᐧ r0 = r0.f20566
            java.lang.String r2 = "Setting user property(FE)"
            r0.m4529(r1, r12, r2)
        L67:
            r6 = r12
            r7 = r14
            java.lang.Object r12 = r9.ᐧⁱ
            ﾞⁱ.ʻﹳ r12 = (p456.C5236) r12
            boolean r14 = r12.m11662()
            if (r14 != 0) goto L7f
            ﾞⁱ.ـˆ r10 = r9.ˏᵢ()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            ʽˉ.ʽᐧ r10 = r10.f20566
            r10.m4533(r11)
            return
        L7f:
            boolean r14 = r12.m11649()
            if (r14 != 0) goto L86
            return
        L86:
            ﾞⁱ.ˑˉ r14 = new ﾞⁱ.ˑˉ
            r3 = r14
            r4 = r10
            r8 = r13
            r3.<init>(r4, r6, r7, r8)
            ﾞⁱ.ˋˏ r10 = p447.AbstractC5179.m11549(r12)
            java.lang.Object r11 = r10.ᐧⁱ
            ﾞⁱ.ʻﹳ r11 = (p456.C5236) r11
            ﾞⁱ.ﹳﹶ r11 = r11.m11656()
            r11.getClass()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r13 = 0
            r14.writeToParcel(r12, r13)
            byte[] r0 = r12.marshall()
            r12.recycle()
            int r12 = r0.length
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            if (r12 <= r1) goto Lbf
            ﾞⁱ.ـˆ r11 = r11.ˏᵢ()
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            ʽˉ.ʽᐧ r11 = r11.f20572
            r11.m4533(r12)
            r3 = 0
            goto Lc4
        Lbf:
            boolean r11 = r11.m12034(r2, r0)
            r3 = r11
        Lc4:
            ﾞⁱ.ˆˏ r2 = r10.m11777(r2)
            ﾞⁱ.ᵢˎ r11 = new ﾞⁱ.ᵢˎ
            r5 = 0
            r0 = r11
            r1 = r10
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r10.m11785(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5244.m11717(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final void m11718(String str, String str2, Object obj, boolean z, long j) {
        int iM11991;
        int length;
        String str3 = str == null ? "app" : str;
        if (z) {
            iM11991 = ﹶﾞ().m11991(str2);
        } else {
            C5316 c5316 = ﹶﾞ();
            iM11991 = 6;
            if (c5316.m11974("user property", str2)) {
                if (!c5316.m11952("user property", AbstractC5310.f20606, str2, null)) {
                    iM11991 = 15;
                } else if (c5316.m11982(24, "user property", str2)) {
                    iM11991 = 0;
                }
            }
        }
        C4554 c4554 = this.f20150;
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (iM11991 != 0) {
            ﹶﾞ();
            String strM11931 = C5316.m11931(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            c5236.m11659();
            C5316.m11943(c4554, null, iM11991, "_ev", strM11931, length);
            return;
        }
        if (obj == null) {
            ʽᐧ().m11743(new RunnableC5308(this, str3, str2, null, j, 1));
            return;
        }
        int iM11981 = ﹶﾞ().m11981(obj, str2);
        if (iM11981 == 0) {
            Object objM11990 = ﹶﾞ().m11990(obj, str2);
            if (objM11990 != null) {
                ʽᐧ().m11743(new RunnableC5308(this, str3, str2, objM11990, j, 1));
                return;
            }
            return;
        }
        ﹶﾞ();
        String strM119312 = C5316.m11931(str2, true, 24);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        c5236.m11659();
        C5316.m11943(c4554, null, iM11981, "_ev", strM119312, length);
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public final void m11719(Bundle bundle, long j) {
        AbstractC4753.m10683(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            ˏᵢ().f20568.m4533("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC5310.m11924(bundle2, "app_id", String.class, null);
        AbstractC5310.m11924(bundle2, "origin", String.class, null);
        AbstractC5310.m11924(bundle2, "name", String.class, null);
        AbstractC5310.m11924(bundle2, "value", Object.class, null);
        AbstractC5310.m11924(bundle2, "trigger_event_name", String.class, null);
        AbstractC5310.m11924(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC5310.m11924(bundle2, "timed_out_event_name", String.class, null);
        AbstractC5310.m11924(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC5310.m11924(bundle2, "triggered_event_name", String.class, null);
        AbstractC5310.m11924(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC5310.m11924(bundle2, "time_to_live", Long.class, 0L);
        AbstractC5310.m11924(bundle2, "expired_event_name", String.class, null);
        AbstractC5310.m11924(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC4753.m10688(bundle2.getString("name"));
        AbstractC4753.m10688(bundle2.getString("origin"));
        AbstractC4753.m10683(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int iM11991 = ﹶﾞ().m11991(string);
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (iM11991 != 0) {
            C5301 c5301 = ˏᵢ();
            c5301.f20571.m4531(c5236.f20108.m11773(string), "Invalid conditional user property name");
            return;
        }
        if (ﹶﾞ().m11981(obj, string) != 0) {
            C5301 c53012 = ˏᵢ();
            c53012.f20571.m4529(c5236.f20108.m11773(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objM11990 = ﹶﾞ().m11990(obj, string);
        if (objM11990 == null) {
            C5301 c53013 = ˏᵢ();
            c53013.f20571.m4529(c5236.f20108.m11773(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        AbstractC5310.m11922(bundle2, objM11990);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            C5301 c53014 = ˏᵢ();
            c53014.f20571.m4529(c5236.f20108.m11773(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 <= 15552000000L && j3 >= 1) {
            ʽᐧ().m11743(new RunnableC5229(this, bundle2, 3));
            return;
        }
        C5301 c53015 = ˏᵢ();
        c53015.f20571.m4529(c5236.f20108.m11773(string), Long.valueOf(j3), "Invalid conditional user property time to live");
    }

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final Bundle m11720(Bundle bundle) {
        int i;
        C5236 c5236;
        C4554 c4554;
        Bundle bundle2 = ᐧᴵ().f20466.ᵔﹳ();
        Iterator<String> it = bundle.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = 0;
            c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
            c4554 = this.f20150;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                ﹶﾞ();
                if (C5316.m11936(obj)) {
                    ﹶﾞ();
                    C5316.m11943(c4554, null, 27, null, null, 0);
                }
                ˏᵢ().f20573.m4529(next, obj, "Invalid default event parameter type. Name, value");
            } else if (C5316.m11941(next)) {
                ˏᵢ().f20573.m4531(next, "Invalid default event parameter name. Name");
            } else if (obj == null) {
                bundle2.remove(next);
            } else if (ﹶﾞ().m11966("param", next, c5236.f20123.m11737(null, false), obj)) {
                ﹶﾞ().m11957(bundle2, next, obj);
            }
        }
        ﹶﾞ();
        int i2 = c5236.f20123.ﹶﾞ().m11975(201500000) ? 100 : 25;
        if (bundle2.size() > i2) {
            Iterator it2 = new TreeSet(bundle2.keySet()).iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                i++;
                if (i > i2) {
                    bundle2.remove(str);
                }
            }
            ﹶﾞ();
            C5316.m11943(c4554, null, 26, null, null, 0);
            ˏᵢ().f20573.m4533("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        return bundle2;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final void m11721() {
        C0407.m2142();
        if (((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20277)) {
            if (ʽᐧ().m11741()) {
                ˏᵢ().f20571.m4533("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C3474.m8337()) {
                ˏᵢ().f20571.m4533("Cannot get trigger URIs from main thread");
                return;
            }
            m11757();
            ˏᵢ().f20566.m4533("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C5247 c5247 = ʽᐧ();
            RunnableC5335 runnableC5335 = new RunnableC5335();
            runnableC5335.f20694 = this;
            runnableC5335.f20693 = atomicReference;
            c5247.m11749(atomicReference, 5000L, "get trigger URIs", runnableC5335);
            List list = (List) atomicReference.get();
            if (list == null) {
                ˏᵢ().f20571.m4533("Timed out waiting for get trigger URIs");
                return;
            }
            C5247 c52472 = ʽᐧ();
            RunnableC3129 runnableC3129 = new RunnableC3129();
            runnableC3129.f12078 = this;
            runnableC3129.f12079 = list;
            c52472.m11743(runnableC3129);
        }
    }
}
