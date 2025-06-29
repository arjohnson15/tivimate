package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.ˆﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0603 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Class f2968;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final boolean f2969;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AbstractC0596 f2970;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Unsafe f2971;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final long f2972;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final boolean f2973;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f2974;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0180 A[PHI: r0
  0x0180: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x016d, B:49:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC0603.<clinit>():void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m2581(Object obj, long j, byte b) {
        AbstractC0596 abstractC0596 = f2970;
        long j2 = (-4) & j;
        int i = abstractC0596.f2963.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        abstractC0596.f2963.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static float m2582(long j, Object obj) {
        return f2970.mo2562(j, obj);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static int m2583(Class cls) {
        if (f2969) {
            return f2970.f2963.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static Unsafe m2584() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0586());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m2585(Object obj, long j, double d) {
        f2970.mo2563(obj, j, d);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m2586(Object obj, long j, float f) {
        f2970.mo2566(obj, j, f);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m2587(long j, Object obj) {
        return ((byte) ((f2970.f2963.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m2588(Object obj, long j, boolean z) {
        f2970.mo2564(obj, j, z);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m2589(Object obj, long j, long j2) {
        f2970.f2963.putLong(obj, j, j2);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static Object m2590(Class cls) {
        try {
            return f2971.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m2591(Object obj, long j, byte b) {
        AbstractC0596 abstractC0596 = f2970;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        abstractC0596.f2963.putInt(obj, j2, ((255 & b) << i) | (abstractC0596.f2963.getInt(obj, j2) & (~(255 << i))));
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m2592(long j, Object obj, Object obj2) {
        f2970.f2963.putObject(obj, j, obj2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m2593(Class cls) {
        if (f2969) {
            f2970.f2963.arrayIndexScale(cls);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static int m2594(long j, Object obj) {
        return f2970.f2963.getInt(obj, j);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static long m2595(long j, Object obj) {
        return f2970.f2963.getLong(obj, j);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m2596(long j, Object obj, int i) {
        f2970.f2963.putInt(obj, j, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static boolean m2597(Class cls) {
        int i = AbstractC0620.f2992;
        try {
            Class cls2 = f2968;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m2598(long j, Object obj) {
        return ((byte) ((f2970.f2963.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static boolean m2599(long j, Object obj) {
        return f2970.mo2567(j, obj);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static double m2600(long j, Object obj) {
        return f2970.mo2565(j, obj);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static Object m2601(long j, Object obj) {
        return f2970.f2963.getObject(obj, j);
    }
}
