package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.ˊﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0029 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Unsafe f390;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final boolean f391;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AbstractC0057 f392;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Logger f393 = Logger.getLogger(AbstractC0029.class.getName());

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final long f394;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final boolean f395;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final boolean f396;

    /* JADX WARN: Removed duplicated region for block: B:70:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b  */
    static {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC0029.<clinit>():void");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m309(Class cls) {
        if (f391) {
            return f392.m491(cls);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static boolean m310(Class cls) {
        if (!AbstractC0043.m472()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0043.f449;
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

    /* renamed from: ˉי, reason: contains not printable characters */
    public static long m311(AbstractC0052 abstractC0052, long j) {
        return f392.m489(j, abstractC0052);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static Unsafe m312() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0075());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public static void m313(byte[] bArr, long j, byte b) {
        f392.mo225(bArr, f394 + j, b);
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public static void m314(long j, Object obj, Object obj2) {
        f392.m493(j, obj, obj2);
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public static Object m315(long j, Object obj) {
        return f392.m494(j, obj);
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public static void m316(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m319(j2, obj, ((255 & b) << i) | (f392.m492(j2, obj) & (~(255 << i))));
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static byte m317(long j, Object obj) {
        return (byte) ((f392.m492((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m318(Class cls) {
        if (f391) {
            f392.m486(cls);
        }
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public static void m319(long j, Object obj, int i) {
        f392.m488(j, obj, i);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Object m320(Class cls) {
        try {
            return f390.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static byte m321(long j, byte[] bArr) {
        return f392.mo231(f394 + j, bArr);
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static byte m322(long j, Object obj) {
        return (byte) ((f392.m492((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public static void m323(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM492 = f392.m492(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m319(j2, obj, ((255 & b) << i) | (iM492 & (~(255 << i))));
    }

    /* renamed from: ᵎـ, reason: contains not printable characters */
    public static void m324(Object obj, long j, long j2) {
        f392.m490(obj, j, j2);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Field m325() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0043.m472()) {
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

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public static int m326(AbstractC0052 abstractC0052, long j) {
        return f392.m492(j, abstractC0052);
    }
}
