package p453;

import android.os.Build;
import java.util.Locale;
import p171.AbstractC2466;

/* renamed from: ﾞᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5198 {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2466.m6582(30);
        }
        if (i >= 30) {
            AbstractC2466.m6582(31);
        }
        if (i >= 30) {
            AbstractC2466.m6582(33);
        }
        if (i >= 30) {
            AbstractC2466.m6582(1000000);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final boolean m11585() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    if (str.toUpperCase(locale).compareTo("VanillaIceCream".toUpperCase(locale)) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
