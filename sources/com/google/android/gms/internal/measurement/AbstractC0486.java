package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ᐧﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0486 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Unsafe f2821;

    public AbstractC0486(Unsafe unsafe) {
        this.f2821 = unsafe;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m2293(long j, Object obj, int i) {
        this.f2821.putInt(obj, j, i);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public abstract void mo2294(Object obj, long j, float f);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean m2295() {
        Field declaredField;
        Field declaredField2;
        Unsafe unsafe = this.f2821;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Unsafe unsafe2 = AbstractC0547.f2891;
            Field field = null;
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField2 = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused2) {
                    declaredField2 = null;
                }
                if (declaredField2 != null) {
                    if (declaredField2.getType() == Long.TYPE) {
                        field = declaredField2;
                    }
                }
            }
            return field != null;
        } catch (Throwable th) {
            Unsafe unsafe3 = AbstractC0547.f2891;
            Logger.getLogger(AbstractC0547.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final int m2296(long j, Object obj) {
        return this.f2821.getInt(obj, j);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final long m2297(long j, Object obj) {
        return this.f2821.getLong(obj, j);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public abstract boolean mo2298(long j, Object obj);

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final boolean m2299() {
        Unsafe unsafe = this.f2821;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            Unsafe unsafe2 = AbstractC0547.f2891;
            Logger.getLogger(AbstractC0547.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract void mo2300(Object obj, long j, byte b);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract double mo2301(long j, Object obj);

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final void m2302(Object obj, long j, long j2) {
        this.f2821.putLong(obj, j, j2);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public abstract void mo2303(Object obj, long j, boolean z);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public abstract void mo2304(Object obj, long j, double d);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public abstract float mo2305(long j, Object obj);
}
