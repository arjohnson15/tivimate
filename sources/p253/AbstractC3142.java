package p253;

import java.util.concurrent.TimeUnit;
import p148.AbstractC2269;
import p148.AbstractC2275;

/* renamed from: יˑ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3142 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final long f12136;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final long f12137;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final int f12138;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final String f12139;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final C3148 f12140;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final int f12141;

    static {
        String property;
        int i = AbstractC2275.f9020;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f12139 = property;
        f12136 = AbstractC2269.m6281(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = AbstractC2275.f9020;
        if (i2 < 2) {
            i2 = 2;
        }
        f12138 = AbstractC2269.m6279("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        f12141 = AbstractC2269.m6279("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f12137 = TimeUnit.SECONDS.toNanos(AbstractC2269.m6281(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f12140 = C3148.f12161;
    }
}
