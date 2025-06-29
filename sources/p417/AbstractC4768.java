package p417;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import org.lsposed.hiddenapibypass.library.R;
import p004.AbstractC0933;
import p200.C2755;
import p238.AbstractC3095;
import p305.AbstractC3537;
import p334.C3789;
import p436.C5068;
import p453.C5196;
import p453.C5201;

/* renamed from: ﹳᴵ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4768 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Locale f18297;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2755 f18298 = new C2755(0);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m10697(Context context, int i) {
        Resources resources = context.getResources();
        String strM10700 = m10700(context);
        if (i == 1) {
            return resources.getString(R.string._2_res_0x7f130073, strM10700);
        }
        if (i == 2) {
            return AbstractC3095.m7614(context) ? resources.getString(R.string._2_res_0x7f13007d) : resources.getString(R.string._2_res_0x7f13007a, strM10700);
        }
        if (i == 3) {
            return resources.getString(R.string._2_res_0x7f130070, strM10700);
        }
        if (i == 5) {
            return m10701(context, "common_google_play_services_invalid_account_text", strM10700);
        }
        if (i == 7) {
            return m10701(context, "common_google_play_services_network_error_text", strM10700);
        }
        if (i == 9) {
            return resources.getString(R.string._2_res_0x7f130078, strM10700);
        }
        if (i == 20) {
            return m10701(context, "common_google_play_services_restricted_profile_text", strM10700);
        }
        switch (i) {
            case 16:
                return m10701(context, "common_google_play_services_api_unavailable_text", strM10700);
            case 17:
                return m10701(context, "common_google_play_services_sign_in_failed_text", strM10700);
            case 18:
                return resources.getString(R.string._2_res_0x7f13007c, strM10700);
            default:
                return resources.getString(R.string._2_res_0x7f130077, strM10700);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static String m10698(Context context, String str) {
        Resources resourcesForApplication;
        C2755 c2755 = f18298;
        synchronized (c2755) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new C5201(new C5196(AbstractC0933.m3796(configuration))) : C5201.m11591(configuration.locale)).f20024.get(0);
                if (!locale.equals(f18297)) {
                    c2755.clear();
                    f18297 = locale;
                }
                String str2 = (String) c2755.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = AbstractC3537.f13678;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    "Missing resource: ".concat(str);
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    "Got empty resource: ".concat(str);
                    return null;
                }
                f18298.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static String m10699(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string._2_res_0x7f130074);
            case 2:
                return resources.getString(R.string._2_res_0x7f13007b);
            case 3:
                return resources.getString(R.string._2_res_0x7f130071);
            case 4:
            case C3789.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case 5:
                return m10698(context, "common_google_play_services_invalid_account_title");
            case C3789.DOUBLE_FIELD_NUMBER /* 7 */:
                return m10698(context, "common_google_play_services_network_error_title");
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                String str = "Unexpected error code " + i;
                return null;
            case 16:
                return null;
            case 17:
                return m10698(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return m10698(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static String m10700(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C5068.m11225(context).f4341;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m10701(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strM10698 = m10698(context, str);
        if (strM10698 == null) {
            strM10698 = resources.getString(R.string._2_res_0x7f130077);
        }
        return String.format(resources.getConfiguration().locale, strM10698, str2);
    }
}
