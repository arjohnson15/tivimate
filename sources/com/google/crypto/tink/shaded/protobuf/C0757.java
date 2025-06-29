package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ـᵎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0757 extends AbstractC0771 {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final double mo3154(long j, Object obj) {
        return this.f3630.getDouble(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo3155(Object obj, long j, byte b) {
        this.f3630.putByte(obj, j, b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void mo3156(Object obj, long j, double d) {
        this.f3630.putDouble(obj, j, d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final boolean mo3157() {
        if (!super.mo3157()) {
            return false;
        }
        try {
            Class<?> cls = this.f3630.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            AbstractC0768.m3193(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo3158(Object obj, long j, boolean z) {
        this.f3630.putBoolean(obj, j, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo3159(long j, Object obj) {
        return this.f3630.getBoolean(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final float mo3160(long j, Object obj) {
        return this.f3630.getFloat(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void mo3161(Object obj, long j, float f) {
        this.f3630.putFloat(obj, j, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final boolean mo3162() {
        Unsafe unsafe = this.f3630;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (AbstractC0768.m3181() != null) {
                    try {
                        Class<?> cls3 = this.f3630.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        AbstractC0768.m3193(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                AbstractC0768.m3193(th2);
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0771
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final byte mo3163(long j, Object obj) {
        return this.f3630.getByte(obj, j);
    }
}
