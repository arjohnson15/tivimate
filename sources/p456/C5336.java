package p456;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: ﾞⁱ.ᵢⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5336 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final String[] f20696 = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final HashMap f20697;

    public C5336(HashMap map) {
        HashMap map2 = new HashMap();
        this.f20697 = map2;
        map2.putAll(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5336) {
            return m12017().equalsIgnoreCase(((C5336) obj).m12017());
        }
        return false;
    }

    public final int hashCode() {
        return m12017().hashCode();
    }

    public final String toString() {
        return m12017();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m12016() {
        try {
            String str = (String) this.f20697.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final String m12017() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = f20696;
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            HashMap map = this.f20697;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }
}
