package com.google.android.gms.internal.measurement;

import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ﹳʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0547 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Class f2888;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final boolean f2889;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AbstractC0486 f2890;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Unsafe f2891;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final long f2892;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final boolean f2893;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f2894;

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    static {
        /*
            sun.misc.Unsafe r0 = m2467()
            com.google.android.gms.internal.measurement.AbstractC0547.f2891 = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.AbstractC0459.f2772
            com.google.android.gms.internal.measurement.AbstractC0547.f2888 = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = m2465(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = m2465(r2)
            r3 = 0
            if (r0 == 0) goto L2b
            if (r1 == 0) goto L22
            com.google.android.gms.internal.measurement.ᵢˈ r1 = new com.google.android.gms.internal.measurement.ᵢˈ
            r2 = 1
            r1.<init>(r0, r2)
            goto L2c
        L22:
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.measurement.ᵢˈ r1 = new com.google.android.gms.internal.measurement.ᵢˈ
            r2 = 0
            r1.<init>(r0, r2)
            goto L2c
        L2b:
            r1 = r3
        L2c:
            com.google.android.gms.internal.measurement.AbstractC0547.f2890 = r1
            r0 = 0
            if (r1 != 0) goto L33
            r2 = 0
            goto L37
        L33:
            boolean r2 = r1.m2295()
        L37:
            com.google.android.gms.internal.measurement.AbstractC0547.f2894 = r2
            if (r1 != 0) goto L3d
            r2 = 0
            goto L41
        L3d:
            boolean r2 = r1.m2299()
        L41:
            com.google.android.gms.internal.measurement.AbstractC0547.f2889 = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = m2459(r2)
            long r4 = (long) r2
            com.google.android.gms.internal.measurement.AbstractC0547.f2892 = r4
            java.lang.Class<boolean[]> r2 = boolean[].class
            m2459(r2)
            m2454(r2)
            java.lang.Class<int[]> r2 = int[].class
            m2459(r2)
            m2454(r2)
            java.lang.Class<long[]> r2 = long[].class
            m2459(r2)
            m2454(r2)
            java.lang.Class<float[]> r2 = float[].class
            m2459(r2)
            m2454(r2)
            java.lang.Class<double[]> r2 = double[].class
            m2459(r2)
            m2454(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            m2459(r2)
            m2454(r2)
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r4 = r3
        L87:
            if (r4 == 0) goto L8b
            r3 = r4
            goto L9f
        L8b:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L92
            goto L94
        L92:
            r2 = r3
        L94:
            if (r2 == 0) goto L9f
            java.lang.Class r4 = r2.getType()
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r4 != r5) goto L9f
            r3 = r2
        L9f:
            if (r3 == 0) goto La9
            if (r1 != 0) goto La4
            goto La9
        La4:
            sun.misc.Unsafe r1 = r1.f2821
            r1.objectFieldOffset(r3)
        La9:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Lb2
            r0 = 1
        Lb2:
            com.google.android.gms.internal.measurement.AbstractC0547.f2893 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0547.<clinit>():void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Object m2452(Class cls) {
        try {
            return f2891.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static void m2453(Object obj, long j, double d) {
        f2890.mo2304(obj, j, d);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static void m2454(Class cls) {
        if (f2889) {
            f2890.f2821.arrayIndexScale(cls);
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static void m2455(Object obj, long j, boolean z) {
        f2890.mo2303(obj, j, z);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m2456(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m2460(j2, obj, ((255 & b) << i) | (f2890.m2296(j2, obj) & (~(255 << i))));
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static void m2457(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM2296 = f2890.m2296(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m2460(j2, obj, ((255 & b) << i) | (iM2296 & (~(255 << i))));
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static Object m2458(long j, Object obj) {
        return f2890.f2821.getObject(obj, j);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static int m2459(Class cls) {
        if (f2889) {
            return f2890.f2821.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m2460(long j, Object obj, int i) {
        f2890.m2293(j, obj, i);
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static boolean m2461(long j, Object obj) {
        return f2890.mo2298(j, obj);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static double m2462(long j, Object obj) {
        return f2890.mo2301(j, obj);
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static void m2463(Object obj, long j, float f) {
        f2890.mo2294(obj, j, f);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static float m2464(long j, Object obj) {
        return f2890.mo2305(j, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static boolean m2465(Class cls) {
        try {
            Class cls2 = f2888;
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

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m2466(long j, Object obj, Object obj2) {
        f2890.f2821.putObject(obj, j, obj2);
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static Unsafe m2467() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0444());
        } catch (Throwable unused) {
            return null;
        }
    }
}
