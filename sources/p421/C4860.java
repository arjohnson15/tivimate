package p421;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p052.C1319;
import p200.C2755;
import ʼˉ.ٴˎ;
import ˆˑ.ﹳﹳ;

/* renamed from: ﹳﹶ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4860 extends ٴˎ {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static final Class f18359;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static final Method f18360;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final Constructor f18361;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static final Method f18362;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f18361 = constructor;
        f18359 = cls;
        f18362 = method2;
        f18360 = method;
    }

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static boolean m10931(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f18362.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static Typeface m10932(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f18359, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f18360.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface m10933(android.content.Context r17, p371.C4206 r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = p421.C4860.f18361     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto Lb
        L9:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = r18
            ᵢʿ.ٴˎ[] r3 = r0.f16221
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L15:
            if (r5 >= r4) goto L72
            r6 = r3[r5]
            int r0 = r6.f16249
            java.io.File r7 = ˆˑ.ﹳﹳ.ˑי(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L5a
        L25:
            r8 = r19
            boolean r0 = ˆˑ.ﹳﹳ.ʿʼ(r7, r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            r9.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            goto L57
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L55:
            throw r10     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L56:
            r0 = r1
        L57:
            r7.delete()
        L5a:
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r7 = r6.f16245
            boolean r9 = r6.f16247
            int r6 = r6.f16246
            boolean r0 = m10931(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6a
            return r1
        L6a:
            int r5 = r5 + 1
            goto L15
        L6d:
            r0 = move-exception
            r7.delete()
            throw r0
        L72:
            android.graphics.Typeface r0 = m10932(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421.C4860.m10933(android.content.Context, ᵢʿ.ʿʼ, android.content.res.Resources, int):android.graphics.Typeface");
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final Typeface m10934(Context context, C1319[] c1319Arr, int i) throws IllegalAccessException, InstantiationException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f18361.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C2755 c2755 = new C2755(0);
        for (C1319 c1319 : c1319Arr) {
            Uri uri = c1319.f5374;
            ByteBuffer byteBuffer = (ByteBuffer) c2755.get(uri);
            if (byteBuffer == null) {
                byteBuffer = ﹳﹳ.ﹳˎ(context, uri);
                c2755.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!m10931(objNewInstance, byteBuffer, c1319.f5371, c1319.f5373, c1319.f5375)) {
                return null;
            }
        }
        Typeface typefaceM10932 = m10932(objNewInstance);
        if (typefaceM10932 == null) {
            return null;
        }
        return Typeface.create(typefaceM10932, i);
    }
}
