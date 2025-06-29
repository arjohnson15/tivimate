package p369;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ᵢʽ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4194 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final int f16164;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f16165 = new HashMap();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int f16163 = 64;

    public C4194(int i) {
        this.f16164 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static String m9621(int i, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized boolean m9622(String str) {
        String strM9621 = m9621(this.f16164, "com.crashlytics.version-control-info");
        if (this.f16165.size() >= this.f16163 && !this.f16165.containsKey(strM9621)) {
            String str2 = "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f16163;
            return false;
        }
        String strM96212 = m9621(this.f16164, str);
        String str3 = (String) this.f16165.get(strM9621);
        if (str3 == null ? strM96212 == null : str3.equals(strM96212)) {
            return false;
        }
        this.f16165.put(strM9621, strM96212);
        return true;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized Map m9623() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f16165));
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final synchronized void m9624(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM9621 = m9621(this.f16164, str);
                if (this.f16165.size() < this.f16163 || this.f16165.containsKey(strM9621)) {
                    String str2 = (String) entry.getValue();
                    this.f16165.put(strM9621, str2 == null ? "" : m9621(this.f16164, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                String str3 = "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f16163;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
