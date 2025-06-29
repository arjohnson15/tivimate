package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᵎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0771 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Unsafe f3630;

    public AbstractC0771(Unsafe unsafe) {
        this.f3630 = unsafe;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m3203(Class cls) {
        return this.f3630.arrayIndexScale(cls);
    }

    /* renamed from: ʿʼ */
    public abstract double mo3154(long j, Object obj);

    /* renamed from: ˉי, reason: contains not printable characters */
    public final long m3204(Field field) {
        return this.f3630.objectFieldOffset(field);
    }

    /* renamed from: ˉⁱ */
    public abstract void mo3155(Object obj, long j, byte b);

    /* renamed from: ˋⁱ */
    public abstract void mo3156(Object obj, long j, double d);

    /* renamed from: ˎٴ */
    public boolean mo3157() {
        Unsafe unsafe = this.f3630;
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
            AbstractC0768.m3193(th);
            return false;
        }
    }

    /* renamed from: ˏʾ */
    public abstract void mo3158(Object obj, long j, boolean z);

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m3205(long j, Object obj, int i) {
        this.f3630.putInt(obj, j, i);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final long m3206(long j, Object obj) {
        return this.f3630.getLong(obj, j);
    }

    /* renamed from: ˑʽ */
    public abstract boolean mo3159(long j, Object obj);

    /* renamed from: ˑי, reason: contains not printable characters */
    public final void m3207(Object obj, long j, long j2) {
        this.f3630.putLong(obj, j, j2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m3208(Class cls) {
        return this.f3630.arrayBaseOffset(cls);
    }

    /* renamed from: ٴˎ */
    public abstract float mo3160(long j, Object obj);

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final int m3209(long j, Object obj) {
        return this.f3630.getInt(obj, j);
    }

    /* renamed from: ᴵʿ */
    public abstract void mo3161(Object obj, long j, float f);

    /* renamed from: ᵎˏ */
    public abstract boolean mo3162();

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final void m3210(long j, Object obj, Object obj2) {
        this.f3630.putObject(obj, j, obj2);
    }

    /* renamed from: ﹳﹳ */
    public abstract byte mo3163(long j, Object obj);

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Object m3211(long j, Object obj) {
        return this.f3630.getObject(obj, j);
    }
}
