package p456;

import android.os.Bundle;
import p417.AbstractC4753;
import p447.AbstractC5179;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5229 implements Runnable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public /* synthetic */ C5244 f20029;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public /* synthetic */ Bundle f20030;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f20031;

    public /* synthetic */ RunnableC5229(int i) {
        this.f20031 = i;
    }

    public /* synthetic */ RunnableC5229(C5244 c5244, Bundle bundle, int i) {
        this.f20031 = i;
        this.f20030 = bundle;
        this.f20029 = c5244;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20031) {
            case 0:
                C5244 c5244 = this.f20029;
                c5244.getClass();
                Bundle bundle = this.f20030;
                Bundle bundleM11720 = bundle.isEmpty() ? bundle : c5244.m11720(bundle);
                c5244.ᐧᴵ().f20466.ᵔٴ(bundleM11720);
                boolean zIsEmpty = bundle.isEmpty();
                C5236 c5236 = (C5236) ((ﹳﹳ) c5244).ᐧⁱ;
                if (!zIsEmpty || c5236.f20123.m11727(null, AbstractC5248.f20298)) {
                    C5272 c5272M11549 = AbstractC5179.m11549(c5236);
                    c5272M11549.m11785(new RunnableC5249(c5272M11549, c5272M11549.m11777(false), bundleM11720, 0));
                    break;
                }
                break;
            case 1:
                C5244 c52442 = this.f20029;
                c52442.getClass();
                Bundle bundleM117202 = this.f20030;
                if (!bundleM117202.isEmpty()) {
                    bundleM117202 = c52442.m11720(bundleM117202);
                }
                c52442.ᐧᴵ().f20466.ᵔٴ(bundleM117202);
                C5236 c52362 = (C5236) ((ﹳﹳ) c52442).ᐧⁱ;
                C5272 c5272M115492 = AbstractC5179.m11549(c52362);
                if (!c5272M115492.m11784() || c5272M115492.ﹶﾞ().m11988() >= 243100) {
                    C5272 c5272M115493 = AbstractC5179.m11549(c52362);
                    if (((C5236) ((ﹳﹳ) c5272M115493).ᐧⁱ).f20123.m11727(null, AbstractC5248.f20232)) {
                        c5272M115493.m11785(new RunnableC5249(c5272M115493, c5272M115493.m11777(false), bundleM117202, 1));
                        break;
                    }
                }
                break;
            case 2:
                C5244 c52443 = this.f20029;
                c52443.m11846();
                c52443.m11757();
                Bundle bundle2 = this.f20030;
                String string = bundle2.getString("name");
                AbstractC4753.m10688(string);
                C5236 c52363 = (C5236) ((ﹳﹳ) c52443).ᐧⁱ;
                if (!c52363.m11662()) {
                    c52443.ˏᵢ().f20566.m4533("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    C5290 c5290 = new C5290(0L, null, string, "");
                    try {
                        C5316 c5316 = c52443.ﹶﾞ();
                        bundle2.getString("app_id");
                        c52363.m11652().m11783(new C5345(bundle2.getString("app_id"), "", c5290, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), c5316.m11979(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                C5244 c52444 = this.f20029;
                c52444.m11846();
                c52444.m11757();
                Bundle bundle3 = this.f20030;
                String string2 = bundle3.getString("name");
                String string3 = bundle3.getString("origin");
                AbstractC4753.m10688(string2);
                AbstractC4753.m10688(string3);
                AbstractC4753.m10683(bundle3.get("value"));
                C5236 c52364 = (C5236) ((ﹳﹳ) c52444).ᐧⁱ;
                if (!c52364.m11662()) {
                    c52444.ˏᵢ().f20566.m4533("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    C5290 c52902 = new C5290(bundle3.getLong("triggered_timestamp"), bundle3.get("value"), string2, string3);
                    try {
                        C5316 c53162 = c52444.ﹶﾞ();
                        bundle3.getString("app_id");
                        C5343 c5343M11979 = c53162.m11979(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string3, 0L, true);
                        C5316 c53163 = c52444.ﹶﾞ();
                        bundle3.getString("app_id");
                        C5343 c5343M119792 = c53163.m11979(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string3, 0L, true);
                        C5316 c53164 = c52444.ﹶﾞ();
                        bundle3.getString("app_id");
                        c52364.m11652().m11783(new C5345(bundle3.getString("app_id"), string3, c52902, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), c5343M119792, bundle3.getLong("trigger_timeout"), c5343M11979, bundle3.getLong("time_to_live"), c53164.m11979(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string3, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
        }
    }
}
