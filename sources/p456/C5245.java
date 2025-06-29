package p456;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0316;
import java.lang.reflect.InvocationTargetException;
import p009.C0995;
import p417.AbstractC4753;
import p436.C5068;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5245 extends ﹳﹳ {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public Boolean f20167;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Boolean f20168;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public String f20169;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public InterfaceC5305 f20170;

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public static long m11722() {
        return ((Long) AbstractC5248.f20206.m11751(null)).longValue();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final String m11723(String str, C5250 c5250) {
        return TextUtils.isEmpty(str) ? (String) c5250.m11751(null) : (String) c5250.m11751(this.f20170.mo8053(str, c5250.f20309));
    }

    /* renamed from: ˉʾ, reason: contains not printable characters */
    public final boolean m11724(String str) {
        return "1".equals(this.f20170.mo8053(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public final Boolean m11725(String str) {
        AbstractC4753.m10688(str);
        Bundle bundleM11730 = m11730();
        if (bundleM11730 == null) {
            ˏᵢ().f20571.m4533("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM11730.containsKey(str)) {
            return Boolean.valueOf(bundleM11730.getBoolean(str));
        }
        return null;
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final boolean m11726(String str, C5250 c5250) {
        return m11727(str, c5250);
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final boolean m11727(String str, C5250 c5250) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c5250.m11751(null)).booleanValue();
        }
        String strMo8053 = this.f20170.mo8053(str, c5250.f20309);
        return TextUtils.isEmpty(strMo8053) ? ((Boolean) c5250.m11751(null)).booleanValue() : ((Boolean) c5250.m11751(Boolean.valueOf("1".equals(strMo8053)))).booleanValue();
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final EnumC5288 m11728(String str, boolean z) {
        Object obj;
        AbstractC4753.m10688(str);
        Bundle bundleM11730 = m11730();
        if (bundleM11730 == null) {
            ˏᵢ().f20571.m4533("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM11730.get(str);
        }
        EnumC5288 enumC5288 = EnumC5288.f20519;
        if (obj == null) {
            return enumC5288;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC5288.f20520;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC5288.f20522;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC5288.f20521;
        }
        ˏᵢ().f20568.m4531(str, "Invalid manifest metadata for");
        return enumC5288;
    }

    /* renamed from: יᴵ, reason: contains not printable characters */
    public final boolean m11729() {
        Boolean boolM11725 = m11725("google_analytics_automatic_screen_reporting_enabled");
        return boolM11725 == null || boolM11725.booleanValue();
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final Bundle m11730() {
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        try {
            Context context = c5236.f20114;
            Context context2 = c5236.f20114;
            if (context.getPackageManager() == null) {
                ˏᵢ().f20571.m4533("Failed to load metadata: PackageManager is null");
                return null;
            }
            C0995 c0995M11225 = C5068.m11225(context2);
            ApplicationInfo applicationInfo = c0995M11225.f4341.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            ˏᵢ().f20571.m4533("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            ˏᵢ().f20571.m4531(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final int m11731(String str, C5250 c5250) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c5250.m11751(null)).intValue();
        }
        String strMo8053 = this.f20170.mo8053(str, c5250.f20309);
        if (TextUtils.isEmpty(strMo8053)) {
            return ((Integer) c5250.m11751(null)).intValue();
        }
        try {
            return ((Integer) c5250.m11751(Integer.valueOf(Integer.parseInt(strMo8053)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c5250.m11751(null)).intValue();
        }
    }

    /* renamed from: ᵎˆ, reason: contains not printable characters */
    public final double m11732(String str, C5250 c5250) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c5250.m11751(null)).doubleValue();
        }
        String strMo8053 = this.f20170.mo8053(str, c5250.f20309);
        if (TextUtils.isEmpty(strMo8053)) {
            return ((Double) c5250.m11751(null)).doubleValue();
        }
        try {
            return ((Double) c5250.m11751(Double.valueOf(Double.parseDouble(strMo8053)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c5250.m11751(null)).doubleValue();
        }
    }

    /* renamed from: ᵔˋ, reason: contains not printable characters */
    public final String m11733(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC4753.m10683(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            ˏᵢ().f20571.m4531(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            ˏᵢ().f20571.m4531(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            ˏᵢ().f20571.m4531(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            ˏᵢ().f20571.m4531(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final long m11734(String str, C5250 c5250) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c5250.m11751(null)).longValue();
        }
        String strMo8053 = this.f20170.mo8053(str, c5250.f20309);
        if (TextUtils.isEmpty(strMo8053)) {
            return ((Long) c5250.m11751(null)).longValue();
        }
        try {
            return ((Long) c5250.m11751(Long.valueOf(Long.parseLong(strMo8053)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c5250.m11751(null)).longValue();
        }
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final boolean m11735() {
        if (this.f20167 == null) {
            Boolean boolM11725 = m11725("app_measurement_lite");
            this.f20167 = boolM11725;
            if (boolM11725 == null) {
                this.f20167 = Boolean.FALSE;
            }
        }
        return this.f20167.booleanValue() || !((C5236) ((ﹳﹳ) this).ᐧⁱ).f20098;
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final boolean m11736(C5250 c5250) {
        return m11727(null, c5250);
    }

    /* renamed from: ﹶʾ, reason: contains not printable characters */
    public final int m11737(String str, boolean z) {
        C0316.f2434.get();
        if (!((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20192)) {
            return 100;
        }
        if (z) {
            return Math.max(Math.min(m11731(str, AbstractC5248.f20271), 500), 100);
        }
        return 500;
    }
}
