package p147;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p069.C1541;
import ﹳᴵ.ˉי;

/* renamed from: ˊ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2255 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final long f8971 = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Pattern f8972 = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static C2255 f8973;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ˉי f8974;

    public C2255(ˉי r1) {
        this.f8974 = r1;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final boolean m6255(C1541 c1541) {
        if (TextUtils.isEmpty(c1541.f6262)) {
            return true;
        }
        long j = c1541.f6264 + c1541.f6261;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f8974.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f8971;
    }
}
