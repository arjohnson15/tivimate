package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f2296;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final JSONObject f2297;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String f2298;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f2298 = str;
        this.f2296 = str2;
        this.f2297 = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f2298, purchaseHistoryRecord.f2298) && TextUtils.equals(this.f2296, purchaseHistoryRecord.f2296);
    }

    public final int hashCode() {
        return this.f2298.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f2298));
    }
}
