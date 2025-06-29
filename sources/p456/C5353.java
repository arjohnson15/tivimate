package p456;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0380;
import com.google.android.gms.internal.measurement.C0472;
import java.util.HashMap;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ﾞי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5353 extends AbstractC5339 {
    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public static String m12132(C5231 c5231) {
        Uri.Builder builder = new Uri.Builder();
        String strM11603 = c5231.m11603();
        if (TextUtils.isEmpty(strM11603)) {
            strM11603 = c5231.m11636();
        }
        builder.scheme((String) AbstractC5248.f20252.m11751(null)).encodedAuthority((String) AbstractC5248.f20256.m11751(null)).path("config/app/" + strM11603).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "102001").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final String m12133(String str) {
        String strM12124 = m12022().m12124(str);
        if (TextUtils.isEmpty(strM12124)) {
            return (String) AbstractC5248.f20228.m11751(null);
        }
        Uri uri = Uri.parse((String) AbstractC5248.f20228.m11751(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strM12124 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final C5283 m12134(String str) {
        C5231 c5231M12069;
        C0472.m2260();
        C5283 c5283 = null;
        if (((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20231)) {
            ﹶﾞ();
            if (C5316.m11945(str)) {
                ˏᵢ().f20566.m4533("sgtm feature flag enabled.");
                C5231 c5231M120692 = m12023().m12069(str);
                if (c5231M120692 == null) {
                    return new C5283(m12133(str), 1);
                }
                String strM11622 = c5231M120692.m11622();
                C0380 c0380M12117 = m12022().m12117(str);
                if (c0380M12117 == null || (c5231M12069 = m12023().m12069(str)) == null || ((!c0380M12117.m2098() || c0380M12117.m2104().m2237() != 100) && !ﹶﾞ().m11970(str, c5231M12069.m11604()) && (TextUtils.isEmpty(strM11622) || strM11622.hashCode() % 100 >= c0380M12117.m2104().m2237()))) {
                    return new C5283(m12133(str), 1);
                }
                if (c5231M120692.m11615()) {
                    ˏᵢ().f20566.m4533("sgtm upload enabled in manifest.");
                    C0380 c0380M121172 = m12022().m12117(c5231M120692.m11621());
                    if (c0380M121172 != null && c0380M121172.m2098()) {
                        String strM2238 = c0380M121172.m2104().m2238();
                        if (!TextUtils.isEmpty(strM2238)) {
                            String strM2236 = c0380M121172.m2104().m2236();
                            ˏᵢ().f20566.m4529(strM2238, TextUtils.isEmpty(strM2236) ? "Y" : "N", "sgtm configured with upload_url, server_info");
                            if (TextUtils.isEmpty(strM2236)) {
                                c5283 = new C5283(strM2238, 3);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strM2236);
                                if (!TextUtils.isEmpty(c5231M120692.m11604())) {
                                    map.put("x-gtm-server-preview", c5231M120692.m11604());
                                }
                                c5283 = new C5283();
                                c5283.f20492 = strM2238;
                                c5283.f20490 = map;
                                c5283.f20491 = 3;
                            }
                        }
                    }
                }
                if (c5283 != null) {
                    return c5283;
                }
            }
        }
        return new C5283(m12133(str), 1);
    }
}
