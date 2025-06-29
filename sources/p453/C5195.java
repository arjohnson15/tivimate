package p453;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import p447.AbstractC5179;

/* renamed from: ﾞᐧ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5195 implements InterfaceC5199 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Locale[] f20018 = new Locale[0];

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f20019;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Locale[] f20020;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C5195(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f20020 = f20018;
            this.f20019 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(AbstractC5179.m11548(i, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f20020 = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f20019 = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5195)) {
            return false;
        }
        Locale[] localeArr = ((C5195) obj).f20020;
        Locale[] localeArr2 = this.f20020;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p453.InterfaceC5199
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f20020;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f20020) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p453.InterfaceC5199
    public final boolean isEmpty() {
        return this.f20020.length == 0;
    }

    @Override // p453.InterfaceC5199
    public final int size() {
        return this.f20020.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f20020;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < localeArr.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    @Override // p453.InterfaceC5199
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object mo11583() {
        return null;
    }

    @Override // p453.InterfaceC5199
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String mo11584() {
        return this.f20019;
    }
}
