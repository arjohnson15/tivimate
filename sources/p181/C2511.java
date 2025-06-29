package p181;

import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import org.json.JSONObject;
import p084.C1714;
import p331.C3762;
import p337.AbstractC3845;
import p383.C4457;
import p415.C4741;
import ᵔʼ.ˑʽ;

/* renamed from: ˋᵔ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2511 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public String f9987;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f9988;

    public /* synthetic */ C2511(int i) {
        this.f9988 = i;
    }

    public C2511(Object obj, String str) {
        this.f9988 = 4;
        this.f9987 = str;
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC3845.m9051(obj);
        }
    }

    public C2511(String str) {
        this.f9988 = 1;
        this.f9987 = str;
    }

    public C2511(String str, ˑʽ r2) {
        this.f9988 = 2;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f9987 = str;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m6631(C3762 c3762, String str, String str2) {
        if (str2 != null) {
            ((HashMap) c3762.f14532).put(str, str2);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static C2511 m6632(C4457 c4457) {
        String str;
        c4457.m10085(2);
        int iM10086 = c4457.m10086();
        int i = iM10086 >> 1;
        int iM100862 = ((c4457.m10086() >> 3) & 31) | ((iM10086 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iM100862 >= 10 ? "." : ".0");
        sb.append(iM100862);
        return new C2511(sb.toString());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static HashMap m6633(C4741 c4741) {
        HashMap map = new HashMap();
        map.put("build_version", c4741.f18182);
        map.put("display_version", c4741.f18186);
        map.put("source", Integer.toString(c4741.f18188));
        String str = c4741.f18185;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m6634(C3762 c3762, C4741 c4741) {
        m6631(c3762, "X-CRASHLYTICS-GOOGLE-APP-ID", c4741.f18184);
        m6631(c3762, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m6631(c3762, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.3");
        m6631(c3762, "Accept", "application/json");
        m6631(c3762, "X-CRASHLYTICS-DEVICE-MODEL", c4741.f18180);
        m6631(c3762, "X-CRASHLYTICS-OS-BUILD-VERSION", c4741.f18183);
        m6631(c3762, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c4741.f18187);
        m6631(c3762, "X-CRASHLYTICS-INSTALLATION-ID", c4741.f18181.m11067().f18653);
    }

    public String toString() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (this.f9988) {
            case 4:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f9987;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                boolean zContainsAlias = false;
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        zContainsAlias = keyStore.containsAlias(str);
                    } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    }
                }
                sb.append(zContainsAlias);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public JSONObject m6635(C2510 c2510) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i = c2510.f9984;
        sb.append(i);
        String string = sb.toString();
        C1714 c1714 = C1714.f6685;
        c1714.m5438(string);
        String str = this.f9987;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            return c1714.m5435(6) ? null : null;
        }
        String str3 = c2510.f9985;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            c1714.m5439("Failed to parse settings JSON from " + str, e);
            c1714.m5439("Settings response " + str3, null);
            return null;
        }
    }
}
