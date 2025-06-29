package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0768 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AbstractC0771 f3622;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final long f3623;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final boolean f3624;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Unsafe f3625;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final boolean f3626;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f3627;

    static {
        byte b = 0;
        int i = 1;
        Unsafe unsafeM3186 = m3186();
        f3625 = unsafeM3186;
        Class cls = AbstractC0749.f3596;
        boolean zM3194 = m3194(Long.TYPE);
        boolean zM31942 = m3194(Integer.TYPE);
        AbstractC0771 c0757 = null;
        if (unsafeM3186 != null) {
            if (!AbstractC0749.m3133()) {
                c0757 = new C0757(unsafeM3186);
            } else if (zM3194) {
                c0757 = new C0761(unsafeM3186, i);
            } else if (zM31942) {
                c0757 = new C0761(unsafeM3186, b == true ? 1 : 0);
            }
        }
        f3622 = c0757;
        f3624 = c0757 == null ? false : c0757.mo3162();
        f3627 = c0757 == null ? false : c0757.mo3157();
        f3623 = m3191(byte[].class);
        m3191(boolean[].class);
        m3200(boolean[].class);
        m3191(int[].class);
        m3200(int[].class);
        m3191(long[].class);
        m3200(long[].class);
        m3191(float[].class);
        m3200(float[].class);
        m3191(double[].class);
        m3200(double[].class);
        m3191(Object[].class);
        m3200(Object[].class);
        Field fieldM3181 = m3181();
        if (fieldM3181 != null && c0757 != null) {
            c0757.m3204(fieldM3181);
        }
        f3626 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Object m3180(Class cls) {
        try {
            return f3625.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Field m3181() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0749.m3133()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static void m3182(Object obj, long j, long j2) {
        f3622.m3207(obj, j, j2);
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public static int m3183(AbstractC0785 abstractC0785, long j) {
        return f3622.m3209(j, abstractC0785);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static Object m3184(AbstractC0785 abstractC0785, long j) {
        return f3622.m3211(j, abstractC0785);
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public static void m3185(long j, Object obj, Object obj2) {
        f3622.m3210(j, obj, obj2);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static Unsafe m3186() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0760());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static void m3187(Object obj, long j, double d) {
        f3622.mo3156(obj, j, d);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static long m3188(AbstractC0785 abstractC0785, long j) {
        return f3622.m3206(j, abstractC0785);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m3189(byte[] bArr, long j, byte b) {
        f3622.mo3155(bArr, f3623 + j, b);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static byte m3190(long j, Object obj) {
        return (byte) ((f3622.m3209((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static int m3191(Class cls) {
        if (f3627) {
            return f3622.m3208(cls);
        }
        return -1;
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m3192(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM3209 = f3622.m3209(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m3199(j2, obj, ((255 & b) << i) | (iM3209 & (~(255 << i))));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m3193(Throwable th) {
        Logger.getLogger(AbstractC0768.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static boolean m3194(Class cls) {
        if (!AbstractC0749.m3133()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0749.f3596;
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

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static byte m3195(long j, byte[] bArr) {
        return f3622.mo3163(f3623 + j, bArr);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m3196(Object obj, long j, boolean z) {
        f3622.mo3158(obj, j, z);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public static void m3197(Object obj, long j, float f) {
        f3622.mo3161(obj, j, f);
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m3198(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m3199(j2, obj, ((255 & b) << i) | (f3622.m3209(j2, obj) & (~(255 << i))));
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public static void m3199(long j, Object obj, int i) {
        f3622.m3205(j, obj, i);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m3200(Class cls) {
        if (f3627) {
            f3622.m3203(cls);
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static byte m3201(long j, Object obj) {
        return (byte) ((f3622.m3209((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }
}
