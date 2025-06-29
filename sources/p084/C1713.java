package p084;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import p015.C1067;
import p031.C1201;
import p122.C1968;
import ᵎﹳ.ᐧʻ;

/* renamed from: ʿٴ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1713 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final C1714 f6681 = new C1714();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AtomicReference f6682 = new AtomicReference(null);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1201 f6683;

    public C1713(C1201 c1201) {
        this.f6683 = c1201;
        c1201.m4253(new C1067(5, this));
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean m5429() {
        C1713 c1713 = (C1713) this.f6682.get();
        return c1713 != null && c1713.m5429();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean m5430(String str) {
        C1713 c1713 = (C1713) this.f6682.get();
        return c1713 != null && c1713.m5430(str);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C1714 m5431(String str) {
        C1713 c1713 = (C1713) this.f6682.get();
        return c1713 == null ? f6681 : c1713.m5431(str);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final void m5432(String str, long j, C1968 c1968) {
        ᐧʻ.ﾞˊ("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        this.f6683.m4253(new C1715(str, j, c1968));
    }
}
