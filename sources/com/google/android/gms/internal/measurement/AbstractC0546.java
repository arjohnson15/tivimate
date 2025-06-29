package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p200.C2741;

/* renamed from: com.google.android.gms.internal.measurement.ﹳʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0546 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C2741 f2887 = new C2741(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static synchronized Uri m2451(String str) {
        Uri uri;
        C2741 c2741 = f2887;
        uri = (Uri) c2741.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c2741.put(str, uri);
        }
        return uri;
    }
}
