package p456;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import p417.AbstractC4753;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ᵔᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5328 extends AbstractC5257 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Object f20659;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public C5297 f20660;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public volatile boolean f20661;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public volatile C5297 f20662;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public volatile C5297 f20663;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public volatile C5297 f20664;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public C5297 f20665;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ConcurrentHashMap f20666;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public Activity f20667;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public boolean f20668;

    public C5328(C5236 c5236) {
        super(c5236);
        this.f20659 = new Object();
        this.f20666 = new ConcurrentHashMap();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final void m12003(Activity activity, C5297 c5297, boolean z) {
        C5297 c52972;
        C5297 c52973 = this.f20662 == null ? this.f20664 : this.f20662;
        if (c5297.f20548 == null) {
            c52972 = new C5297(c5297.f20551, activity != null ? m12008(activity.getClass()) : null, c5297.f20550, c5297.f20549, c5297.f20552);
        } else {
            c52972 = c5297;
        }
        this.f20664 = this.f20662;
        this.f20662 = c52972;
        ((C5236) ((ﹳﹳ) this).ᐧⁱ).f20107.getClass();
        ʽᐧ().m11743(new RunnableC5331(this, c52972, c52973, SystemClock.elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* renamed from: ˉˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12004(p456.C5297 r18, p456.C5297 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p456.C5328.m12004(ﾞⁱ.יˊ, ﾞⁱ.יˊ, long, boolean, android.os.Bundle):void");
    }

    /* renamed from: ˋˏ, reason: contains not printable characters */
    public final void m12005(C5297 c5297, boolean z, long j) {
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        C5241 c5241M11651 = c5236.m11651();
        c5236.f20107.getClass();
        c5241M11651.m11694(SystemClock.elapsedRealtime());
        if (!m11848().f20363.m5501(j, c5297 != null && c5297.f20553, z) || c5297 == null) {
            return;
        }
        c5297.f20553 = false;
    }

    /* renamed from: יˆ, reason: contains not printable characters */
    public final C5297 m12006(Activity activity) {
        AbstractC4753.m10683(activity);
        C5297 c5297 = (C5297) this.f20666.get(activity);
        if (c5297 == null) {
            C5297 c52972 = new C5297(ﹶﾞ().m11962(), null, m12008(activity.getClass()));
            this.f20666.put(activity, c52972);
            c5297 = c52972;
        }
        return this.f20663 != null ? this.f20663 : c5297;
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final void m12007(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((C5236) ((ﹳﹳ) this).ᐧⁱ).f20123.m11729() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f20666.put(activity, new C5297(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    @Override // p456.AbstractC5257
    /* renamed from: ᴵˋ */
    public final boolean mo11715() {
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final String m12008(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        int length = str.length();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        return length > c5236.f20123.m11737(null, false) ? str.substring(0, c5236.f20123.m11737(null, false)) : str;
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final C5297 m12009(boolean z) {
        m11757();
        m11846();
        if (!z) {
            return this.f20660;
        }
        C5297 c5297 = this.f20660;
        return c5297 != null ? c5297 : this.f20665;
    }
}
