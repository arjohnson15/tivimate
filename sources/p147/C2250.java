package p147;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.ᐧʻ;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p031.C1186;
import p031.C1199;
import p066.C1535;
import p066.C1536;
import p066.C1537;
import p066.C1538;
import p069.C1541;
import p069.C1542;
import p069.C1543;
import p080.AbstractC1702;
import p210.C2804;
import p251.C3130;
import p251.C3136;
import p331.C3761;
import p381.ExecutorC4440;
import p417.AbstractC4753;
import p450.InterfaceC5190;
import p456.C5349;
import ˎˊ.ˏʾ;
import ﹳᴵ.ˉי;

/* renamed from: ˊ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2250 implements InterfaceC2254 {

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static final Object f8952 = new Object();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1536 f8953;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C1199 f8954;

    /* renamed from: ˉי, reason: contains not printable characters */
    public String f8955;

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final ArrayList f8956;

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final HashSet f8957;

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final ExecutorService f8958;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C5349 f8959;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2804 f8960;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final C2253 f8961;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final Object f8962;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2255 f8963;

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final ExecutorC4440 f8964;

    static {
        new AtomicInteger(1);
    }

    public C2250(C2804 c2804, InterfaceC5190 interfaceC5190, ExecutorService executorService, ExecutorC4440 executorC4440) {
        c2804.m7085();
        C1536 c1536 = new C1536(c2804.f10936, interfaceC5190);
        C5349 c5349 = new C5349(c2804);
        if (ˉי.ˎˑ == null) {
            ˉי.ˎˑ = new ˉי(16);
        }
        ˉי r1 = ˉי.ˎˑ;
        if (C2255.f8973 == null) {
            C2255.f8973 = new C2255(r1);
        }
        C2255 c2255 = C2255.f8973;
        C1199 c1199 = new C1199(new C1186(2, c2804));
        C2253 c2253 = new C2253();
        this.f8962 = new Object();
        this.f8957 = new HashSet();
        this.f8956 = new ArrayList();
        this.f8960 = c2804;
        this.f8953 = c1536;
        this.f8959 = c5349;
        this.f8963 = c2255;
        this.f8954 = c1199;
        this.f8961 = c2253;
        this.f8958 = executorService;
        this.f8964 = executorC4440;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m6241() {
        C1541 c1541M12109;
        synchronized (f8952) {
            try {
                C2804 c2804 = this.f8960;
                c2804.m7085();
                C3761 c3761M8761 = C3761.m8761(c2804.f10936);
                try {
                    c1541M12109 = this.f8959.m12109();
                    int i = c1541M12109.f6260;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strM6247 = m6247(c1541M12109);
                        C5349 c5349 = this.f8959;
                        C1543 c1543M5128 = c1541M12109.m5128();
                        c1543M5128.f6273 = strM6247;
                        c1543M5128.f6270 = 3;
                        c1541M12109 = c1543M5128.m5131();
                        c5349.m12105(c1541M12109);
                    }
                    if (c3761M8761 != null) {
                        c3761M8761.m8771();
                    }
                } catch (Throwable th) {
                    if (c3761M8761 != null) {
                        c3761M8761.m8771();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m6246(c1541M12109);
        this.f8964.execute(new RunnableC2247(this, 2));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C3130 m6242() {
        m6251();
        C3136 c3136 = new C3136();
        m6249(new C2248(this.f8963, c3136));
        this.f8958.execute(new RunnableC2247(this, 1));
        return c3136.f12093;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final void m6243(Exception exc) {
        synchronized (this.f8962) {
            try {
                Iterator it = this.f8956.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2249) it.next()).mo6239(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final synchronized void m6244(String str) {
        this.f8955 = str;
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final synchronized void m6245(C1541 c1541, C1541 c15412) {
        try {
            if (this.f8957.size() != 0 && !TextUtils.equals(c1541.f6263, c15412.f6263)) {
                Iterator it = this.f8957.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void m6246(C1541 c1541) {
        synchronized (this.f8962) {
            try {
                Iterator it = this.f8956.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2249) it.next()).mo6240(c1541)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m6247(p069.C1541 r3) {
        /*
            r2 = this;
            ˏʼ.ٴˎ r0 = r2.f8960
            r0.m7085()
            java.lang.String r0 = r0.f10931
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            ˏʼ.ٴˎ r0 = r2.f8960
            r0.m7085()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f10931
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
        L1e:
            r0 = 1
            int r3 = r3.f6260
            if (r3 != r0) goto L4f
            ʼـ.ᴵʿ r3 = r2.f8954
            java.lang.Object r3 = r3.get()
            ʾﾞ.ˑʽ r3 = (p069.C1542) r3
            android.content.SharedPreferences r0 = r3.f6269
            monitor-enter(r0)
            java.lang.String r1 = r3.m5130()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4d
        L38:
            java.lang.String r1 = r3.m5129()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4c
            ˊ.ᐧʻ r3 = r2.f8961
            r3.getClass()
            java.lang.String r1 = p147.C2253.m6254()
        L4c:
            return r1
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L4f:
            ˊ.ᐧʻ r3 = r2.f8961
            r3.getClass()
            java.lang.String r3 = p147.C2253.m6254()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p147.C2250.m6247(ʾﾞ.ʽᐧ):java.lang.String");
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1541 m6248(C1541 c1541) throws FirebaseInstallationsException {
        int responseCode;
        C1535 c1535M5119;
        C2804 c2804 = this.f8960;
        c2804.m7085();
        String str = c2804.f10935.f10921;
        c2804.m7085();
        String str2 = c2804.f10935.f10923;
        String str3 = c1541.f6266;
        C1536 c1536 = this.f8953;
        C1538 c1538 = c1536.f6245;
        if (!c1538.m5124()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM5118 = C1536.m5118("projects/" + str2 + "/installations/" + c1541.f6263 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM5123 = c1536.m5123(urlM5118, str);
            try {
                try {
                    httpURLConnectionM5123.setRequestMethod("POST");
                    httpURLConnectionM5123.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionM5123.setDoOutput(true);
                    C1536.m5117(httpURLConnectionM5123);
                    responseCode = httpURLConnectionM5123.getResponseCode();
                    c1538.m5127(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    c1535M5119 = C1536.m5119(httpURLConnectionM5123);
                } else {
                    C1536.m5115(httpURLConnectionM5123, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        ᐧʻ r13 = C1535.m5114();
                        r13.ˆʿ = 3;
                        c1535M5119 = r13.ˑʽ();
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            ᐧʻ r132 = C1535.m5114();
                            r132.ˆʿ = 2;
                            c1535M5119 = r132.ˑʽ();
                        }
                        httpURLConnectionM5123.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                httpURLConnectionM5123.disconnect();
                TrafficStats.clearThreadStatsTag();
                int iM5411 = AbstractC1702.m5411(c1535M5119.f6240);
                if (iM5411 == 0) {
                    C2255 c2255 = this.f8963;
                    c2255.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c2255.f8974.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    C1543 c1543M5128 = c1541.m5128();
                    c1543M5128.f6272 = c1535M5119.f6241;
                    c1543M5128.f6271 = Long.valueOf(c1535M5119.f6239);
                    c1543M5128.f6274 = Long.valueOf(seconds);
                    return c1543M5128.m5131();
                }
                if (iM5411 == 1) {
                    C1543 c1543M51282 = c1541.m5128();
                    c1543M51282.f6275 = "BAD CONFIG";
                    c1543M51282.f6270 = 5;
                    return c1543M51282.m5131();
                }
                if (iM5411 != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                m6244(null);
                C1543 c1543M51283 = c1541.m5128();
                c1543M51283.f6270 = 2;
                return c1543M51283.m5131();
            } catch (Throwable th) {
                httpURLConnectionM5123.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void m6249(InterfaceC2249 interfaceC2249) {
        synchronized (this.f8962) {
            this.f8956.add(interfaceC2249);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m6250(C1541 c1541) {
        synchronized (f8952) {
            try {
                C2804 c2804 = this.f8960;
                c2804.m7085();
                C3761 c3761M8761 = C3761.m8761(c2804.f10936);
                try {
                    this.f8959.m12105(c1541);
                    if (c3761M8761 != null) {
                        c3761M8761.m8771();
                    }
                } catch (Throwable th) {
                    if (c3761M8761 != null) {
                        c3761M8761.m8771();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m6251() {
        C2804 c2804 = this.f8960;
        c2804.m7085();
        AbstractC4753.m10680(c2804.f10935.f10918, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2804.m7085();
        AbstractC4753.m10680(c2804.f10935.f10923, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2804.m7085();
        AbstractC4753.m10680(c2804.f10935.f10921, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c2804.m7085();
        String str = c2804.f10935.f10918;
        Pattern pattern = C2255.f8972;
        if (!str.contains(":")) {
            throw new IllegalArgumentException("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
        c2804.m7085();
        if (!C2255.f8972.matcher(c2804.f10935.f10921).matches()) {
            throw new IllegalArgumentException("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3130 m6252() {
        String str;
        m6251();
        synchronized (this) {
            str = this.f8955;
        }
        if (str != null) {
            return ˏʾ.ˏᴵ(str);
        }
        C3136 c3136 = new C3136();
        m6249(new C2252(c3136));
        C3130 c3130 = c3136.f12093;
        this.f8958.execute(new RunnableC2247(this, 0));
        return c3130;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ʾᵢ.ˑʽ] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ʾᵢ.ـﹶ] */
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final C1541 m6253(C1541 c1541) throws FirebaseInstallationsException {
        int responseCode;
        String str = c1541.f6263;
        String string = null;
        if (str != null && str.length() == 11) {
            C1542 c1542 = (C1542) this.f8954.get();
            synchronized (c1542.f6269) {
                try {
                    String[] strArr = C1542.f6267;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = c1542.f6269.getString("|T|" + c1542.f6268 + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C1536 c1536 = this.f8953;
        C2804 c2804 = this.f8960;
        c2804.m7085();
        String str3 = c2804.f10935.f10921;
        String str4 = c1541.f6263;
        C2804 c28042 = this.f8960;
        c28042.m7085();
        String str5 = c28042.f10935.f10923;
        C2804 c28043 = this.f8960;
        c28043.m7085();
        String str6 = c28043.f10935.f10918;
        C1538 c1538 = c1536.f6245;
        if (!c1538.m5124()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM5118 = C1536.m5118("projects/" + str5 + "/installations");
        int i2 = 0;
        C1537 c1537 = c1536;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM5123 = c1537.m5123(urlM5118, str3);
            try {
                try {
                    httpURLConnectionM5123.setRequestMethod("POST");
                    httpURLConnectionM5123.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM5123.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C1536.m5120(httpURLConnectionM5123, str4, str6);
                    responseCode = httpURLConnectionM5123.getResponseCode();
                    c1538.m5127(responseCode);
                } finally {
                    httpURLConnectionM5123.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                C1537 c1537M5116 = C1536.m5116(httpURLConnectionM5123);
                httpURLConnectionM5123.disconnect();
                TrafficStats.clearThreadStatsTag();
                c1537 = c1537M5116;
            } else {
                try {
                    C1536.m5115(httpURLConnectionM5123, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionM5123.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    c1537 = c1537;
                }
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    C1537 c15372 = new C1537(null, null, null, null, 2);
                    httpURLConnectionM5123.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c1537 = c15372;
                } else {
                    httpURLConnectionM5123.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                    c1537 = c1537;
                }
            }
            int iM5411 = AbstractC1702.m5411(c1537.f6248);
            if (iM5411 != 0) {
                if (iM5411 != 1) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                C1543 c1543M5128 = c1541.m5128();
                c1543M5128.f6275 = "BAD CONFIG";
                c1543M5128.f6270 = 5;
                return c1543M5128.m5131();
            }
            String str7 = c1537.f6247;
            String str8 = c1537.f6249;
            C2255 c2255 = this.f8963;
            c2255.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c2255.f8974.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C1535 c1535 = c1537.f6251;
            String str9 = c1535.f6241;
            long j = c1535.f6239;
            C1543 c1543M51282 = c1541.m5128();
            c1543M51282.f6273 = str7;
            c1543M51282.f6270 = 4;
            c1543M51282.f6272 = str9;
            c1543M51282.f6276 = str8;
            c1543M51282.f6271 = Long.valueOf(j);
            c1543M51282.f6274 = Long.valueOf(seconds);
            return c1543M51282.m5131();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }
}
