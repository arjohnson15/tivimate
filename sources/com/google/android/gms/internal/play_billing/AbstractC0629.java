package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;
import p181.C2510;

/* renamed from: com.google.android.gms.internal.play_billing.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0629 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final int f3002 = Runtime.getRuntime().availableProcessors();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Bundle m2641(String str, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m2642(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static Purchase m2643(String str, String str2) {
        if (str == null || str2 == null) {
            m2642("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            m2646("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static C2510 m2644(Intent intent, String str) {
        if (intent != null) {
            C2510 c2510M6629 = C2510.m6629();
            c2510M6629.f9984 = m2645(str, intent.getExtras());
            c2510M6629.f9985 = m2648(str, intent.getExtras());
            return c2510M6629.m6630();
        }
        m2646("BillingHelper", "Got null intent!");
        C2510 c2510M66292 = C2510.m6629();
        c2510M66292.f9984 = 6;
        c2510M66292.f9985 = "An internal error occurred.";
        return c2510M66292.m6630();
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static int m2645(String str, Bundle bundle) {
        if (bundle == null) {
            m2646(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m2642(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m2646(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m2646(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m2647(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static String m2648(String str, Bundle bundle) {
        if (bundle == null) {
            m2646(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m2642(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m2646(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }
}
