package p456;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import p049.C1308;
import p049.C1310;
import p438.C5105;
import ʿﾞ.ﹳﹳ;

/* renamed from: ﾞⁱ.ˑˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5289 extends AbstractC5295 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C5105 f20525;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final C5105 f20526;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final C5105 f20527;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final HashMap f20528;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final C5105 f20529;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C5105 f20530;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C5105 f20531;

    public C5289(C5273 c5273) {
        super(c5273);
        this.f20528 = new HashMap();
        this.f20525 = new C5105(ᐧᴵ(), "last_delete_stale", 0L);
        this.f20530 = new C5105(ᐧᴵ(), "last_delete_stale_batch", 0L);
        this.f20531 = new C5105(ᐧᴵ(), "backoff", 0L);
        this.f20526 = new C5105(ᐧᴵ(), "last_upload", 0L);
        this.f20527 = new C5105(ᐧᴵ(), "last_upload_attempt", 0L);
        this.f20529 = new C5105(ᐧᴵ(), "midnight_offset", 0L);
    }

    @Override // p456.AbstractC5295
    /* renamed from: ᴵˋ */
    public final boolean mo11760() {
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final String m11867(String str, boolean z) {
        ʼᵎ();
        String str2 = z ? (String) m11868(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM11928 = C5316.m11928();
        if (messageDigestM11928 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM11928.digest(str2.getBytes())));
    }

    /* renamed from: ᵔᵢ, reason: contains not printable characters */
    public final Pair m11868(String str) {
        C5299 c5299;
        C1310 c1310M4611;
        ʼᵎ();
        C5236 c5236 = (C5236) ((ﹳﹳ) this).ᐧⁱ;
        c5236.f20107.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f20528;
        C5299 c52992 = (C5299) map.get(str);
        if (c52992 != null && jElapsedRealtime < c52992.f20557) {
            return new Pair(c52992.f20558, Boolean.valueOf(c52992.f20556));
        }
        C5245 c5245 = c5236.f20123;
        c5245.getClass();
        long jM11734 = c5245.m11734(str, AbstractC5248.f20194) + jElapsedRealtime;
        try {
            try {
                c1310M4611 = C1308.m4611(c5236.f20114);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c52992 != null && jElapsedRealtime < c52992.f20557 + c5245.m11734(str, AbstractC5248.f20236)) {
                    return new Pair(c52992.f20558, Boolean.valueOf(c52992.f20556));
                }
                c1310M4611 = null;
            }
        } catch (Exception e) {
            ˏᵢ().f20567.m4531(e, "Unable to get advertising id");
            c5299 = new C5299(jM11734, "", false);
        }
        if (c1310M4611 == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = c1310M4611.f5353;
        boolean z = c1310M4611.f5352;
        c5299 = str2 != null ? new C5299(jM11734, str2, z) : new C5299(jM11734, "", z);
        map.put(str, c5299);
        return new Pair(c5299.f20558, Boolean.valueOf(c5299.f20556));
    }
}
