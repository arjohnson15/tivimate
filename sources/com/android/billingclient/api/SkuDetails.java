package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SkuDetails {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final JSONObject f2299;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2300;

    public SkuDetails(String str) {
        this.f2300 = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f2299 = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f2300, ((SkuDetails) obj).f2300);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2300.hashCode();
    }

    public final String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f2300));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m1523() {
        return this.f2299.optString("type");
    }
}
