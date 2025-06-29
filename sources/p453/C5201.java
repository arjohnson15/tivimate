package p453;

import android.os.Build;
import java.util.Locale;
import p004.AbstractC0933;

/* renamed from: ﾞᐧ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5201 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C5201 f20023 = m11591(new Locale[0]);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC5199 f20024;

    public C5201(InterfaceC5199 interfaceC5199) {
        this.f20024 = interfaceC5199;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static C5201 m11590(String str) {
        if (str == null || str.isEmpty()) {
            return f20023;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = AbstractC5197.f20022;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return m11591(localeArr);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C5201 m11591(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C5201(new C5196(AbstractC0933.m3792(localeArr))) : new C5201(new C5195(localeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5201) {
            if (this.f20024.equals(((C5201) obj).f20024)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20024.hashCode();
    }

    public final String toString() {
        return this.f20024.toString();
    }
}
