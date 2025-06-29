package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.C0295;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p200.C2755;
import p353.AbstractC4020;
import p353.C4018;

/* renamed from: com.google.android.gms.internal.measurement.ˋˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0395 {

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static volatile C0428 f2664;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Object f2665 = new Object();

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static final AtomicInteger f2666;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2667;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public volatile Object f2668;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f2669;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0295 f2670;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ int f2671;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public volatile int f2672 = -1;

    static {
        new AtomicReference();
        f2666 = new AtomicInteger();
    }

    public C0395(C0295 c0295, String str, Object obj, int i) {
        this.f2671 = i;
        c0295.getClass();
        if (((Uri) c0295.f2402) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f2670 = c0295;
        this.f2667 = str;
        this.f2669 = obj;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m2131(C0428 c0428) {
        C0559 c0559;
        String str;
        if (!this.f2670.f2404) {
            Context context = c0428.f2727;
            synchronized (C0559.class) {
                try {
                    if (C0559.f2911 == null) {
                        C0559.f2911 = com.google.android.gms.internal.play_billing.ˎˑ.ﹳﹳ(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C0559(context) : new C0559(0);
                    }
                    c0559 = C0559.f2911;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0295 c0295 = this.f2670;
            if (c0295.f2404) {
                str = null;
            } else {
                String str2 = (String) c0295.f2403;
                str = this.f2667;
                if (str2 == null || !str2.isEmpty()) {
                    str = ᵎﹳ.ᐧʻ.ˉⁱ(str2, str);
                }
            }
            Object objMo2109 = c0559.mo2109(str);
            if (objMo2109 != null) {
                return m2132(objMo2109);
            }
        }
        return null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object m2132(Object obj) {
        switch (this.f2671) {
            case 0:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!AbstractC0573.f2935.matcher(str).matches()) {
                            if (AbstractC0573.f2937.matcher(str).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String str2 = (String) this.f2670.f2405;
                    String str3 = this.f2667;
                    if (str2 == null || !str2.isEmpty()) {
                        str3 = ᵎﹳ.ᐧʻ.ˉⁱ(str2, str3);
                    }
                    String str4 = "Invalid boolean value for " + str3 + ": " + String.valueOf(obj);
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String str5 = (String) this.f2670.f2405;
                    String str6 = this.f2667;
                    if (str5 == null || !str5.isEmpty()) {
                        str6 = ᵎﹳ.ᐧʻ.ˉⁱ(str5, str6);
                    }
                    String str7 = "Invalid long value for " + str6 + ": " + String.valueOf(obj);
                    break;
                } else {
                    break;
                }
                break;
            case 2:
                if (obj instanceof String) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String str8 = (String) this.f2670.f2405;
                        String str9 = this.f2667;
                        if (str8 == null || !str8.isEmpty()) {
                            str9 = ᵎﹳ.ᐧʻ.ˉⁱ(str8, str9);
                        }
                        String str10 = "Invalid double value for " + str9 + ": " + String.valueOf(obj);
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return null;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m2133() {
        int i = f2666.get();
        if (this.f2672 < i) {
            synchronized (this) {
                try {
                    if (this.f2672 < i) {
                        C0428 c0428 = f2664;
                        AbstractC4020 abstractC4020 = C4018.f15467;
                        String str = null;
                        if (c0428 != null) {
                            abstractC4020 = (AbstractC4020) c0428.f2726.get();
                            if (abstractC4020.mo9268()) {
                                C0539 c0539 = (C0539) abstractC4020.mo9269();
                                C0295 c0295 = this.f2670;
                                Uri uri = (Uri) c0295.f2402;
                                String str2 = (String) c0295.f2405;
                                String str3 = this.f2667;
                                c0539.getClass();
                                C2755 c2755 = uri != null ? (C2755) c0539.f2878.get(uri.toString()) : null;
                                if (c2755 != null) {
                                    if (str2 != null) {
                                        str3 = str2 + str3;
                                    }
                                    str = (String) c2755.get(str3);
                                }
                            }
                        }
                        ﹶⁱ.ـﹶ.ˉⁱ("Must call PhenotypeFlagInitializer.maybeInit() first", c0428 != null);
                        this.f2670.getClass();
                        Object objM2134 = m2134(c0428);
                        if (objM2134 == null && (objM2134 = m2131(c0428)) == null) {
                            objM2134 = this.f2669;
                        }
                        if (abstractC4020.mo9268()) {
                            objM2134 = str == null ? this.f2669 : m2132(str);
                        }
                        this.f2668 = objM2134;
                        this.f2672 = i;
                    }
                } finally {
                }
            }
        }
        return this.f2668;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:19|(1:21)(7:22|(1:24)(1:25)|26|(0)|35|36|37)|30|57|31|32|(1:34)|35|36|37) */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2134(com.google.android.gms.internal.measurement.C0428 r9) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0395.m2134(com.google.android.gms.internal.measurement.ˑˏ):java.lang.Object");
    }
}
