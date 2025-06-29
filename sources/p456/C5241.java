package p456;

import android.os.Bundle;
import java.util.Iterator;
import p200.C2740;
import p200.C2741;

/* renamed from: ﾞⁱ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5241 extends AbstractC5277 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final C2741 f20140;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2741 f20141;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public long f20142;

    public C5241(C5236 c5236) {
        super(c5236);
        this.f20141 = new C2741(0);
        this.f20140 = new C2741(0);
    }

    /* renamed from: יˊ, reason: contains not printable characters */
    public final void m11689(String str, long j) {
        if (str == null || str.length() == 0) {
            ˏᵢ().f20571.m4533("Ad unit id must be a non-empty string");
        } else {
            ʽᐧ().m11743(new RunnableC5291(this, str, j, 0));
        }
    }

    /* renamed from: ᴵˋ, reason: contains not printable characters */
    public final void m11690(String str, long j) {
        if (str == null || str.length() == 0) {
            ˏᵢ().f20571.m4533("Ad unit id must be a non-empty string");
        } else {
            ʽᐧ().m11743(new RunnableC5291(this, str, j, 1));
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m11691(String str, long j, C5297 c5297) {
        if (c5297 == null) {
            ˏᵢ().f20566.m4533("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            C5301 c5301 = ˏᵢ();
            c5301.f20566.m4531(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C5316.m11947(c5297, bundle, true);
            m11847().m11705("am", "_xu", bundle);
        }
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final void m11692(long j) {
        C2741 c2741 = this.f20140;
        Iterator it = ((C2740) c2741.keySet()).iterator();
        while (it.hasNext()) {
            c2741.put((String) it.next(), Long.valueOf(j));
        }
        if (c2741.isEmpty()) {
            return;
        }
        this.f20142 = j;
    }

    /* renamed from: ᵢˆ, reason: contains not printable characters */
    public final void m11693(long j, C5297 c5297) {
        if (c5297 == null) {
            ˏᵢ().f20566.m4533("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            C5301 c5301 = ˏᵢ();
            c5301.f20566.m4531(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C5316.m11947(c5297, bundle, true);
            m11847().m11705("am", "_xa", bundle);
        }
    }

    /* renamed from: ᵢﹶ, reason: contains not printable characters */
    public final void m11694(long j) {
        C5297 c5297M12009 = m11849().m12009(false);
        C2741 c2741 = this.f20140;
        Iterator it = ((C2740) c2741.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m11691(str, j - ((Long) c2741.get(str)).longValue(), c5297M12009);
        }
        if (!c2741.isEmpty()) {
            m11693(j - this.f20142, c5297M12009);
        }
        m11692(j);
    }
}
