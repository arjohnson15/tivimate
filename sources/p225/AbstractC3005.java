package p225;

import android.content.res.Configuration;
import android.os.LocaleList;
import p453.C5201;

/* renamed from: ˏᵢ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3005 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C5201 m7431(Configuration configuration) {
        return C5201.m11590(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7432(C5201 c5201) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c5201.f20024.mo11584()));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m7433(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m7434(Configuration configuration, C5201 c5201) {
        configuration.setLocales(LocaleList.forLanguageTags(c5201.f20024.mo11584()));
    }
}
