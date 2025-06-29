package p004;

import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.Html;
import android.text.Spanned;
import java.util.Locale;

/* renamed from: ʻʿ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0933 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static LocaleList m3792(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static DecimalFormatSymbols m3793(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Spanned m3794(String str) {
        return Html.fromHtml(str, 0);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Context m3795(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static LocaleList m3796(Configuration configuration) {
        return configuration.getLocales();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static boolean m3797(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Spanned m3798(String str) {
        return Html.fromHtml(str, 0, null, null);
    }
}
