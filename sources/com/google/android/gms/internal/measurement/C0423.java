package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0002;
import java.util.HashMap;
import p345.AbstractC3985;

/* renamed from: com.google.android.gms.internal.measurement.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0423 {

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final AbstractC3985 f2717 = AbstractC3985.m9215(3, "_syn", "_err", "_el");

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final long f2718;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final HashMap f2719;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public String f2720;

    public C0423(String str, long j, HashMap map) {
        this.f2720 = str;
        this.f2718 = j;
        HashMap map2 = new HashMap();
        this.f2719 = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Object m2189(Object obj, Object obj2, String str) {
        return (f2717.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final /* synthetic */ Object clone() {
        return new C0423(this.f2720, this.f2718, new HashMap(this.f2719));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0423)) {
            return false;
        }
        C0423 c0423 = (C0423) obj;
        if (this.f2718 == c0423.f2718 && this.f2720.equals(c0423.f2720)) {
            return this.f2719.equals(c0423.f2719);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2720.hashCode() * 31;
        long j = this.f2718;
        return this.f2719.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f2720;
        String strValueOf = String.valueOf(this.f2719);
        StringBuilder sbM50 = AbstractC0002.m50("Event{name='", str, "', timestamp=");
        sbM50.append(this.f2718);
        sbM50.append(", params=");
        sbM50.append(strValueOf);
        sbM50.append("}");
        return sbM50.toString();
    }
}
