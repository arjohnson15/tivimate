package p456;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0307;
import com.google.android.gms.internal.measurement.C0355;
import com.google.android.gms.internal.measurement.C0380;
import com.google.android.gms.internal.measurement.C0397;
import com.google.android.gms.internal.measurement.C0442;
import com.google.android.gms.internal.measurement.C0493;
import com.google.android.gms.internal.measurement.C0497;
import com.google.android.gms.internal.measurement.C0514;
import com.google.android.gms.internal.measurement.C0518;
import com.google.android.gms.internal.measurement.C0525;
import com.google.android.gms.internal.measurement.C0533;
import com.google.android.gms.internal.measurement.C0540;
import com.google.android.gms.internal.measurement.C0582;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzlk;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p080.AbstractC1702;
import p181.CallableC2516;
import p200.C2741;
import p417.AbstractC4753;
import ᴵﹳ.ﹶˆ;
import ᵢ.ʿʼ;

/* renamed from: ﾞⁱ.ﾞˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5352 extends AbstractC5295 implements InterfaceC5305 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final C2741 f20761;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C2741 f20762;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C2741 f20763;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final C2741 f20764;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final C2741 f20765;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C2741 f20766;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final C2741 f20767;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C5275 f20768;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C2741 f20769;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C2741 f20770;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final ʿʼ f20771;

    public C5352(C5273 c5273) {
        super(c5273);
        this.f20767 = new C2741(0);
        this.f20762 = new C2741(0);
        this.f20769 = new C2741(0);
        this.f20770 = new C2741(0);
        this.f20763 = new C2741(0);
        this.f20761 = new C2741(0);
        this.f20765 = new C2741(0);
        this.f20764 = new C2741(0);
        this.f20766 = new C2741(0);
        this.f20768 = new C5275(this);
        this.f20771 = new ʿʼ(24, this);
    }

    /* renamed from: ˉˑ, reason: contains not printable characters */
    public static EnumC5341 m12113(int i) {
        int i2 = AbstractC5319.f20618[AbstractC1702.m5411(i)];
        if (i2 == 1) {
            return EnumC5341.f20709;
        }
        if (i2 == 2) {
            return EnumC5341.f20711;
        }
        if (i2 == 3) {
            return EnumC5341.f20712;
        }
        if (i2 != 4) {
            return null;
        }
        return EnumC5341.f20710;
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public static C2741 m12114(C0380 c0380) {
        C2741 c2741 = new C2741(0);
        for (C0525 c0525 : c0380.m2092()) {
            c2741.put(c0525.m2390(), c0525.m2389());
        }
        return c2741;
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public final boolean m12115(String str, String str2) {
        Boolean bool;
        ʼᵎ();
        m12131(str);
        if ("1".equals(mo8053(str, "measurement.upload.blacklist_internal")) && C5316.m11941(str2)) {
            return true;
        }
        if ("1".equals(mo8053(str, "measurement.upload.blacklist_public")) && C5316.m11948(str2)) {
            return true;
        }
        Map map = (Map) this.f20769.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final EnumC5288 m12116(String str, EnumC5341 enumC5341) {
        ʼᵎ();
        m12131(str);
        C0493 c0493M12127 = m12127(str);
        EnumC5288 enumC5288 = EnumC5288.f20519;
        if (c0493M12127 == null) {
            return enumC5288;
        }
        for (C0514 c0514 : c0493M12127.m2327()) {
            if (m12113(c0514.m2376()) == enumC5341) {
                int i = AbstractC5319.f20619[AbstractC1702.m5411(c0514.m2377())];
                return i != 1 ? i != 2 ? enumC5288 : EnumC5288.f20520 : EnumC5288.f20522;
            }
        }
        return enumC5288;
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public final C0380 m12117(String str) {
        m11909();
        ʼᵎ();
        AbstractC4753.m10688(str);
        m12131(str);
        return (C0380) this.f20763.get(str);
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    public final boolean m12118(String str, String str2) {
        Boolean bool;
        ʼᵎ();
        m12131(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f20770.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    public final EnumC5341 m12119(String str) {
        EnumC5341 enumC5341 = EnumC5341.f20712;
        ʼᵎ();
        m12131(str);
        C0493 c0493M12127 = m12127(str);
        if (c0493M12127 == null) {
            return null;
        }
        for (C0533 c0533 : c0493M12127.m2331()) {
            if (enumC5341 == m12113(c0533.m2432())) {
                return m12113(c0533.m2433());
            }
        }
        return null;
    }

    /* renamed from: ˆˎ, reason: contains not printable characters */
    public final boolean m12120(String str) {
        ʼᵎ();
        m12131(str);
        C2741 c2741 = this.f20762;
        if (c2741.get(str) != null) {
            return ((Set) c2741.get(str)).contains("os_version") || ((Set) c2741.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0394 A[Catch: SQLiteException -> 0x03a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x03a4, blocks: (B:94:0x037d, B:96:0x0394), top: B:104:0x037d }] */
    /* renamed from: ˉʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12121(java.lang.String r22, java.lang.String r23, java.lang.String r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5352.m12121(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final void m12122(String str, C0307 c0307) {
        HashSet hashSet = new HashSet();
        C2741 c2741 = new C2741(0);
        C2741 c27412 = new C2741(0);
        C2741 c27413 = new C2741(0);
        Iterator it = DesugarCollections.unmodifiableList(((C0380) c0307.f2428).m2096()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C0497) it.next()).m2333());
        }
        for (int i = 0; i < ((C0380) c0307.f2428).m2090(); i++) {
            C0518 c0518 = (C0518) ((C0380) c0307.f2428).m2097(i).m2541();
            if (c0518.m2378().isEmpty()) {
                ˏᵢ().f20568.m4533("EventConfig contained null event name");
            } else {
                String strM2378 = c0518.m2378();
                String strM11923 = AbstractC5310.m11923(c0518.m2378(), AbstractC5310.f20597, AbstractC5310.f20604);
                if (!TextUtils.isEmpty(strM11923)) {
                    c0518.m1820();
                    C0442.m2223((C0442) c0518.f2428, strM11923);
                    c0307.m1820();
                    C0380.m2088((C0380) c0307.f2428, i, (C0442) c0518.m1821());
                }
                if (((C0442) c0518.f2428).m2225() && ((C0442) c0518.f2428).m2228()) {
                    c2741.put(strM2378, Boolean.TRUE);
                }
                if (((C0442) c0518.f2428).m2230() && ((C0442) c0518.f2428).m2224()) {
                    c27412.put(c0518.m2378(), Boolean.TRUE);
                }
                if (((C0442) c0518.f2428).m2229()) {
                    if (((C0442) c0518.f2428).m2227() < 2 || ((C0442) c0518.f2428).m2227() > 65535) {
                        C5301 c5301 = ˏᵢ();
                        c5301.f20568.m4529(c0518.m2378(), Integer.valueOf(((C0442) c0518.f2428).m2227()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c27413.put(c0518.m2378(), Integer.valueOf(((C0442) c0518.f2428).m2227()));
                    }
                }
            }
        }
        this.f20762.put(str, hashSet);
        this.f20769.put(str, c2741);
        this.f20770.put(str, c27412);
        this.f20766.put(str, c27413);
    }

    /* renamed from: ˎי, reason: contains not printable characters */
    public final boolean m12123(String str, EnumC5341 enumC5341) {
        ʼᵎ();
        m12131(str);
        C0493 c0493M12127 = m12127(str);
        if (c0493M12127 == null) {
            return false;
        }
        Iterator it = c0493M12127.m2330().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0514 c0514 = (C0514) it.next();
            if (enumC5341 == m12113(c0514.m2376())) {
                if (c0514.m2377() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p456.InterfaceC5305
    /* renamed from: ˑʽ */
    public final String mo8053(String str, String str2) {
        ʼᵎ();
        m12131(str);
        Map map = (Map) this.f20767.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: ˑˈ, reason: contains not printable characters */
    public final String m12124(String str) {
        ʼᵎ();
        m12131(str);
        return (String) this.f20761.get(str);
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final void m12125(String str, C0380 c0380) {
        int iM2102 = c0380.m2102();
        C5275 c5275 = this.f20768;
        if (iM2102 == 0) {
            c5275.m4934(str);
            return;
        }
        C5301 c5301 = ˏᵢ();
        c5301.f20566.m4531(Integer.valueOf(c0380.m2102()), "EES programs found");
        C0540 c0540 = (C0540) c0380.m2099().get(0);
        try {
            C0397 c0397 = new C0397();
            ﹶˆ r2 = c0397.f2676;
            CallableC5267 callableC5267 = new CallableC5267(0);
            callableC5267.f20399 = this;
            callableC5267.f20400 = str;
            ((HashMap) ((C0355) r2.ᐧˋ).f2536).put("internal.remoteConfig", callableC5267);
            CallableC5267 callableC52672 = new CallableC5267(2);
            callableC52672.f20399 = this;
            callableC52672.f20400 = str;
            ((HashMap) ((C0355) r2.ᐧˋ).f2536).put("internal.appMetadata", callableC52672);
            CallableC2516 callableC2516 = new CallableC2516();
            callableC2516.f10001 = this;
            ((HashMap) ((C0355) r2.ᐧˋ).f2536).put("internal.logger", callableC2516);
            c0397.m2136(c0540);
            c5275.m4933(str, c0397);
            ˏᵢ().f20566.m4529(str, Integer.valueOf(c0540.m2435().m1966()), "EES program loaded for appId, activities");
            Iterator it = c0540.m2435().m1965().iterator();
            while (it.hasNext()) {
                ˏᵢ().f20566.m4531(((C0582) it.next()).m2530(), "EES program activity");
            }
        } catch (zzc unused) {
            ˏᵢ().f20571.m4531(str, "Failed to load EES program. appId");
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    public final boolean m12126(String str) {
        ʼᵎ();
        m12131(str);
        C2741 c2741 = this.f20762;
        return c2741.get(str) != null && ((Set) c2741.get(str)).contains("app_instance_id");
    }

    /* renamed from: יᴵ, reason: contains not printable characters */
    public final C0493 m12127(String str) {
        ʼᵎ();
        m12131(str);
        C0380 c0380M12117 = m12117(str);
        if (c0380M12117 == null || !c0380M12117.m2105()) {
            return null;
        }
        return c0380M12117.m2106();
    }

    @Override // p456.AbstractC5295
    /* renamed from: ᴵˋ */
    public final boolean mo11760() {
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final long m12128(String str) {
        String strMo8053 = mo8053(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strMo8053)) {
            return 0L;
        }
        try {
            return Long.parseLong(strMo8053);
        } catch (NumberFormatException e) {
            C5301 c5301 = ˏᵢ();
            c5301.f20568.m4529(C5301.m11911(str), e, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final C0380 m12129(byte[] bArr, String str) {
        if (bArr == null) {
            return C0380.m2086();
        }
        try {
            C0380 c0380 = (C0380) ((C0307) C5292.m11876(C0380.m2089(), bArr)).m1821();
            ˏᵢ().f20566.m4529(c0380.m2101() ? Long.valueOf(c0380.m2095()) : null, c0380.m2094() ? c0380.m2093() : null, "Parsed config. version, gmp_app_id");
            return c0380;
        } catch (zzlk e) {
            ˏᵢ().f20568.m4529(C5301.m11911(str), e, "Unable to merge remote config. appId");
            return C0380.m2086();
        } catch (RuntimeException e2) {
            ˏᵢ().f20568.m4529(C5301.m11911(str), e2, "Unable to merge remote config. appId");
            return C0380.m2086();
        }
    }

    /* renamed from: ᵢˎ, reason: contains not printable characters */
    public final int m12130(String str, String str2) {
        Integer num;
        ʼᵎ();
        m12131(str);
        Map map = (Map) this.f20766.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* renamed from: ﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12131(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5352.m12131(java.lang.String):void");
    }
}
