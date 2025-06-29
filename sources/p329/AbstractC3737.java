package p329;

import android.os.SystemClock;

/* renamed from: ᴵᵢ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3737 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ int f14494 = 0;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final double f14495 = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static double m8704(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f14495;
    }
}
