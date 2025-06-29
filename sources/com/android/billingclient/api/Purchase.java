package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2293;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final JSONObject f2294;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2295;

    public Purchase(String str, String str2) {
        this.f2295 = str;
        this.f2293 = str2;
        this.f2294 = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f2295, purchase.f2295) && TextUtils.equals(this.f2293, purchase.f2293);
    }

    public final int hashCode() {
        return this.f2295.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f2295));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ArrayList m1522() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f2294;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }
}
