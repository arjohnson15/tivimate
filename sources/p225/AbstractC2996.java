package p225;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: ˏᵢ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2996 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m7422(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static LocaleList m7423(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
