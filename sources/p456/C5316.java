package p456;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0472;
import com.google.android.gms.internal.measurement.InterfaceC0511;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p041.C1278;
import p116.C1838;
import p199.C2739;
import p305.AbstractC3537;
import p305.C3536;
import p394.C4527;
import p417.AbstractC4753;
import p436.C5068;
import p447.AbstractC5179;
import ʿﾞ.ﹳﹳ;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﾞⁱ.ᴵˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5316 extends AbstractC5324 {

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static final String[] f20610 = {"firebase_", "google_", "ga_"};

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public static final String[] f20611 = {"_err"};

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f20612;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public Integer f20613;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public SecureRandom f20614;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AtomicLong f20615;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C2739 f20616;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Boolean f20617;

    public C5316(C5236 c5236) {
        super(c5236);
        this.f20613 = null;
        this.f20615 = new AtomicLong(0L);
    }

    /* renamed from: ʾـ, reason: contains not printable characters */
    public static MessageDigest m11928() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: ˆˏ, reason: contains not printable characters */
    public static boolean m11929(Context context) {
        AbstractC4753.m10683(context);
        return Build.VERSION.SDK_INT >= 24 ? m11930(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m11930(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: ˉʽ, reason: contains not printable characters */
    public static boolean m11930(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public static String m11931(String str, boolean z, int i) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return ᐧʻ.ˉⁱ(str.substring(0, str.offsetByCodePoints(0, i)), "...");
        }
        return null;
    }

    /* renamed from: ˊˉ, reason: contains not printable characters */
    public static ArrayList m11932(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5345 c5345 = (C5345) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c5345.f20731);
            bundle.putString("origin", c5345.f20725);
            bundle.putLong("creation_timestamp", c5345.f20730);
            bundle.putString("name", c5345.f20728.f20532);
            Object objM11869 = c5345.f20728.m11869();
            AbstractC4753.m10683(objM11869);
            AbstractC5310.m11922(bundle, objM11869);
            bundle.putBoolean("active", c5345.f20726);
            String str = c5345.f20733;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C5343 c5343 = c5345.f20734;
            if (c5343 != null) {
                bundle.putString("timed_out_event_name", c5343.f20721);
                C5279 c5279 = c5343.f20718;
                if (c5279 != null) {
                    bundle.putBundle("timed_out_event_params", c5279.m11851());
                }
            }
            bundle.putLong("trigger_timeout", c5345.f20727);
            C5343 c53432 = c5345.f20729;
            if (c53432 != null) {
                bundle.putString("triggered_event_name", c53432.f20721);
                C5279 c52792 = c53432.f20718;
                if (c52792 != null) {
                    bundle.putBundle("triggered_event_params", c52792.m11851());
                }
            }
            bundle.putLong("triggered_timestamp", c5345.f20728.f20534);
            bundle.putLong("time_to_live", c5345.f20732);
            C5343 c53433 = c5345.f20735;
            if (c53433 != null) {
                bundle.putString("expired_event_name", c53433.f20721);
                C5279 c52793 = c53433.f20718;
                if (c52793 != null) {
                    bundle.putBundle("expired_event_params", c52793.m11851());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: ˋʽ, reason: contains not printable characters */
    public static byte[] m11933(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public static Bundle m11934(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5290 c5290 = (C5290) it.next();
            String str = c5290.f20533;
            String str2 = c5290.f20532;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l = c5290.f20535;
                if (l != null) {
                    bundle.putLong(str2, l.longValue());
                } else {
                    Double d = c5290.f20538;
                    if (d != null) {
                        bundle.putDouble(str2, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: ˎـ, reason: contains not printable characters */
    public static int m11935(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    /* renamed from: ˏʻ, reason: contains not printable characters */
    public static boolean m11936(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: ˑˉ, reason: contains not printable characters */
    public static boolean m11937(String str, String[] strArr) {
        AbstractC4753.m10683(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: יʾ, reason: contains not printable characters */
    public static boolean m11938(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: יᴵ, reason: contains not printable characters */
    public static void m11939(Bundle bundle, int i, String str, Object obj) {
        if (m11940(i, bundle)) {
            bundle.putString("_ev", m11931(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: יᵔ, reason: contains not printable characters */
    public static boolean m11940(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* renamed from: ـᐧ, reason: contains not printable characters */
    public static boolean m11941(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: ـᵢ, reason: contains not printable characters */
    public static boolean m11942(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC4753.m10683(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: ٴᵔ, reason: contains not printable characters */
    public static void m11943(InterfaceC5269 interfaceC5269, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m11940(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC5269.mo10434(str, "_err", bundle);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static long m11944(C5279 c5279) {
        long length = 0;
        if (c5279 == null) {
            return 0L;
        }
        Bundle bundle = c5279.f20460;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            if (bundle.get(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    /* renamed from: ᵔˊ, reason: contains not printable characters */
    public static boolean m11945(String str) {
        String str2 = (String) AbstractC5248.f20195.m11751(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public static long m11946(byte[] bArr) {
        AbstractC4753.m10683(bArr);
        if (bArr.length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: ᵢⁱ, reason: contains not printable characters */
    public static void m11947(C5297 c5297, Bundle bundle, boolean z) {
        if (bundle == null || c5297 == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && c5297 == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c5297.f20551;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c5297.f20548;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c5297.f20550);
    }

    /* renamed from: ⁱי, reason: contains not printable characters */
    public static boolean m11948(String str) {
        AbstractC4753.m10688(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: ﾞי, reason: contains not printable characters */
    public static boolean m11949(Context context) {
        ActivityInfo receiverInfo;
        AbstractC4753.m10683(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final void m11950(InterfaceC0511 interfaceC0511, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning long value to wrapper");
        }
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public final boolean m11951(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            ˏᵢ().f20571.m4531(e, "Failed to persist Deferred Deep Link. exception");
            return false;
        }
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public final boolean m11952(String str, String[] strArr, String str2, String[] strArr2) {
        if (str2 == null) {
            ˏᵢ().f20564.m4531(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f20610;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                ˏᵢ().f20564.m4529(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m11937(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m11937(str2, strArr2)) {
            return true;
        }
        ˏᵢ().f20564.m4529(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final void m11953(C1278 c1278, int i) {
        Iterator it = new TreeSet(((Bundle) c1278.f5258).keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m11948(str) && (i2 = i2 + 1) > i) {
                String strM11548 = AbstractC5179.m11548(i, "Event can't contain more than ", " params");
                C5301 c5301 = ˏᵢ();
                C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
                String strM11769 = c5236.f20108.m11769((String) c1278.f5259);
                Bundle bundle = (Bundle) c1278.f5258;
                c5301.f20564.m4529(strM11769, c5236.f20108.m11771(bundle), strM11548);
                m11940(5, bundle);
                bundle.remove(str);
            }
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final Bundle m11954(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM11983 = m11983(bundle.get(str), str);
                if (objM11983 == null) {
                    C5301 c5301 = ˏᵢ();
                    c5301.f20573.m4531(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11772(str), "Param value can't be null");
                } else {
                    m11957(bundle2, str, objM11983);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final void m11955(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                ﹶﾞ().m11957(bundle, str, bundle2.get(str));
            }
        }
    }

    /* renamed from: ʾᵔ, reason: contains not printable characters */
    public final SecureRandom m11956() {
        ʼᵎ();
        if (this.f20614 == null) {
            this.f20614 = new SecureRandom();
        }
        return this.f20614;
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final void m11957(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            ˏᵢ().f20573.m4529(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11772(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final void m11958(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            C5301 c5301 = ˏᵢ();
            c5301.f20568.m4531(Long.valueOf(j2), "Params already contained engagement");
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* renamed from: ˆˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11959(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5316.m11959(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final void m11960(InterfaceC0511 interfaceC0511, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning boolean value to wrapper");
        }
    }

    /* renamed from: ˆﹶ, reason: contains not printable characters */
    public final void m11961(String str, InterfaceC0511 interfaceC0511) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning string value to wrapper");
        }
    }

    /* renamed from: ˈʾ, reason: contains not printable characters */
    public final long m11962() {
        long andIncrement;
        long j;
        if (this.f20615.get() != 0) {
            synchronized (this.f20615) {
                this.f20615.compareAndSet(-1L, 1L);
                andIncrement = this.f20615.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f20615) {
            long jNanoTime = System.nanoTime();
            ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f20612 + 1;
            this.f20612 = i;
            j = jNextLong + i;
        }
        return j;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m11963(Parcelable[] parcelableArr, int i, boolean z) {
        AbstractC4753.m10683(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (m11948(str) && !m11937(str, AbstractC5310.f20605) && (i2 = i2 + 1) > i) {
                    C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
                    if (z) {
                        ˏᵢ().f20564.m4529(c5236.f20108.m11772(str), c5236.f20108.m11771(bundle), AbstractC5179.m11548(i, "Param can't contain more than ", " item-scoped custom parameters"));
                        m11940(28, bundle);
                    } else {
                        ˏᵢ().f20564.m4529(c5236.f20108.m11772(str), c5236.f20108.m11771(bundle), "Param cannot contain item-scoped custom parameters");
                        m11940(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* renamed from: ˉˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m11964(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5316.m11964(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: ˊʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m11965() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5316.m11965():long");
    }

    /* renamed from: ˋᴵ, reason: contains not printable characters */
    public final boolean m11966(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                C5301 c5301 = ˏᵢ();
                c5301.f20573.m4530("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final void m11967(InterfaceC0511 interfaceC0511, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning int value to wrapper");
        }
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final void m11968(InterfaceC0511 interfaceC0511, Bundle bundle) {
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning bundle value to wrapper");
        }
    }

    /* renamed from: ˑˊ, reason: contains not printable characters */
    public final String m11969() {
        byte[] bArr = new byte[16];
        m11956().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: ˑˏ, reason: contains not printable characters */
    public final boolean m11970(String str, String str2) {
        C0472.m2260();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (c5236.f20123.m11727(null, AbstractC5248.f20183) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c5236.f20123.m11733("debug.firebase.analytics.app").equals(str);
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final Object m11971(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m11931(String.valueOf(obj), z, i);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM11954 = m11954((Bundle) parcelable);
                if (!bundleM11954.isEmpty()) {
                    arrayList.add(bundleM11954);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final Bundle m11972(Uri uri, boolean z) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            ˏᵢ().f20568.m4531(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public final void m11973(InterfaceC0511 interfaceC0511, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning bundle list to wrapper");
        }
    }

    /* renamed from: יᵎ, reason: contains not printable characters */
    public final boolean m11974(String str, String str2) {
        if (str2 == null) {
            ˏᵢ().f20564.m4531(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            ˏᵢ().f20564.m4531(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            ˏᵢ().f20564.m4529(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                ˏᵢ().f20564.m4529(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* renamed from: ᴵˊ, reason: contains not printable characters */
    public final boolean m11975(int i) {
        Boolean bool = ((C5236) ((ﹳﹳ) this).ᐧⁱ).m11652().f20407;
        if (m11988() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* renamed from: ᴵˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m11976(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5316.m11976(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: ᵎˑ, reason: contains not printable characters */
    public final boolean m11977(String str) {
        ʼᵎ();
        if (C5068.m11225(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114).f4341.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ˏᵢ().f20567.m4531(str, "Permission not granted");
        return false;
    }

    @Override // p456.AbstractC5324
    /* renamed from: ᵔˋ */
    public final boolean mo11746() {
        return true;
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final int m11978(String str) {
        if (!m11984("event", str)) {
            return 2;
        }
        if (m11952("event", AbstractC5310.f20597, str, AbstractC5310.f20603)) {
            return !m11982(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final C5343 m11979(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m11978(str) != 0) {
            ˏᵢ().f20571.m4531(((C5236) ((ﹳﹳ) this).ᐧⁱ).f20108.m11773(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM11964 = m11964(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleM11964 = m11954(bundleM11964);
        }
        AbstractC4753.m10683(bundleM11964);
        return new C5343(str, new C5279(bundleM11964), str2, j);
    }

    /* renamed from: ᵢᴵ, reason: contains not printable characters */
    public final boolean m11980(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (!zIsEmpty) {
            AbstractC4753.m10683(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(c5236.f20097)) {
                C5301 c5301 = ˏᵢ();
                c5301.f20564.m4531(C5301.m11911(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(c5236.f20097)) {
                ˏᵢ().f20564.m4533("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        AbstractC4753.m10683(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        C5301 c53012 = ˏᵢ();
        c53012.f20564.m4531(C5301.m11911(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final int m11981(Object obj, String str) {
        return "_ldl".equals(str) ? m11966("user property referrer", str, m11935(str), obj) : m11966("user property", str, m11935(str), obj) ? 0 : 7;
    }

    /* renamed from: ⁱˏ, reason: contains not printable characters */
    public final boolean m11982(int i, String str, String str2) {
        if (str2 == null) {
            ˏᵢ().f20564.m4531(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        C5301 c5301 = ˏᵢ();
        c5301.f20564.m4530("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* renamed from: ⁱᵎ, reason: contains not printable characters */
    public final Object m11983(Object obj, String str) {
        boolean zEquals = "_ev".equals(str);
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        if (zEquals) {
            return m11971(Math.max(c5236.f20123.m11737(null, false), 256), obj, true, true);
        }
        return m11971(m11941(str) ? Math.max(c5236.f20123.m11737(null, false), 256) : c5236.f20123.m11737(null, false), obj, false, true);
    }

    /* renamed from: ⁱﹳ, reason: contains not printable characters */
    public final boolean m11984(String str, String str2) {
        if (str2 == null) {
            ˏᵢ().f20564.m4531(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            ˏᵢ().f20564.m4531(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            ˏᵢ().f20564.m4529(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                ˏᵢ().f20564.m4529(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* renamed from: ⁱﾞ, reason: contains not printable characters */
    public final boolean m11985(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM3955 = C5068.m11225(context).m3955(64, str);
            if (packageInfoM3955 == null || (signatureArr = packageInfoM3955.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            ˏᵢ().f20571.m4531(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            ˏᵢ().f20571.m4531(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final void m11986(InterfaceC0511 interfaceC0511, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC0511.mo2130(bundle);
        } catch (RemoteException e) {
            C5301 c5301 = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20110;
            C5236.m11647(c5301);
            c5301.f20568.m4531(e, "Error returning byte array to wrapper");
        }
    }

    /* renamed from: ﹳʻ, reason: contains not printable characters */
    public final C2739 m11987() {
        if (this.f20616 == null) {
            Context context = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114;
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            C4527 c4527 = C4527.f17406;
            sb.append(i >= 30 ? c4527.m10301() : 0);
            sb.toString();
            C1838 c1838 = (i >= 30 ? c4527.m10301() : 0) >= 5 ? new C1838(context) : null;
            this.f20616 = c1838 != null ? new C2739(c1838) : null;
        }
        return this.f20616;
    }

    /* renamed from: ﹳˋ, reason: contains not printable characters */
    public final int m11988() {
        if (this.f20613 == null) {
            C3536 c3536 = C3536.f13675;
            Context context = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114;
            c3536.getClass();
            int i = AbstractC3537.f13678;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            this.f20613 = Integer.valueOf(i2 / 1000);
        }
        return this.f20613.intValue();
    }

    /* renamed from: ﹳﾞ, reason: contains not printable characters */
    public final boolean m11989(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20114.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    /* renamed from: ﾞʾ, reason: contains not printable characters */
    public final Object m11990(Object obj, String str) {
        return "_ldl".equals(str) ? m11971(m11935(str), obj, true, false) : m11971(m11935(str), obj, false, false);
    }

    /* renamed from: ﾞﹳ, reason: contains not printable characters */
    public final int m11991(String str) {
        if (!m11984("user property", str)) {
            return 6;
        }
        if (m11952("user property", AbstractC5310.f20606, str, null)) {
            return !m11982(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }
}
