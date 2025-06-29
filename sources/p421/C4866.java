package p421;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p052.C1319;
import p371.C4206;
import p371.C4214;
import ˆˑ.ﹳﹳ;

/* renamed from: ﹳﹶ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4866 extends C4864 {

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Method f18377;

    /* renamed from: ˎᵔ, reason: contains not printable characters */
    public final Method f18378;

    /* renamed from: ˑⁱ, reason: contains not printable characters */
    public final Method f18379;

    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final Method f18380;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Class f18381;

    /* renamed from: ᵢٴ, reason: contains not printable characters */
    public final Method f18382;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final Constructor f18383;

    public C4866() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodMo10920;
        Constructor<?> constructor;
        Method methodM10949;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM10949 = m10949(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo10920 = mo10920(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            "Unable to collect necessary methods for class ".concat(e.getClass().getName());
            methodMo10920 = null;
            constructor = null;
            methodM10949 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f18381 = cls;
        this.f18383 = constructor;
        this.f18377 = methodM10949;
        this.f18380 = method;
        this.f18379 = method2;
        this.f18382 = method3;
        this.f18378 = methodMo10920;
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public static Method m10949(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: ʾʼ */
    public Method mo10920(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p421.C4864
    /* renamed from: ʿʼ */
    public final Typeface mo10947(Context context, C4206 c4206, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m10952()) {
            return super.mo10947(context, c4206, resources, i);
        }
        Object objM10953 = m10953();
        if (objM10953 == null) {
            return null;
        }
        for (C4214 c4214 : c4206.f16221) {
            if (!m10954(context, objM10953, c4214.f16248, c4214.f16246, c4214.f16245, c4214.f16247 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c4214.f16250))) {
                m10950(objM10953);
                return null;
            }
        }
        if (m10951(objM10953)) {
            return mo10921(objM10953);
        }
        return null;
    }

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final void m10950(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f18382.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final boolean m10951(Object obj) {
        try {
            return ((Boolean) this.f18379.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final boolean m10952() {
        Method method = this.f18377;
        if (method == null) {
        }
        return method != null;
    }

    @Override // p421.C4864
    /* renamed from: ٴˎ */
    public final Typeface mo10948(Context context, C1319[] c1319Arr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo10921;
        boolean zBooleanValue;
        if (c1319Arr.length < 1) {
            return null;
        }
        if (!m10952()) {
            C1319 c1319 = ˉⁱ(c1319Arr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c1319.f5374, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c1319.f5373).setItalic(c1319.f5375).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C1319 c13192 : c1319Arr) {
            if (c13192.f5372 == 0) {
                Uri uri = c13192.f5374;
                if (!map.containsKey(uri)) {
                    map.put(uri, ﹳﹳ.ﹳˎ(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map);
        Object objM10953 = m10953();
        if (objM10953 == null) {
            return null;
        }
        boolean z = false;
        for (C1319 c13193 : c1319Arr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c13193.f5374);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f18380.invoke(objM10953, byteBuffer, Integer.valueOf(c13193.f5371), null, Integer.valueOf(c13193.f5373), Integer.valueOf(c13193.f5375 ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m10950(objM10953);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m10950(objM10953);
            return null;
        }
        if (m10951(objM10953) && (typefaceMo10921 = mo10921(objM10953)) != null) {
            return Typeface.create(typefaceMo10921, i);
        }
        return null;
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final Object m10953() {
        try {
            return this.f18383.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final boolean m10954(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18377.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: ﹳﹶ */
    public Typeface mo10921(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f18381, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f18378.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final Typeface m10955(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m10952()) {
            return super.ﹶˆ(context, resources, i, str, i2);
        }
        Object objM10953 = m10953();
        if (objM10953 == null) {
            return null;
        }
        if (!m10954(context, objM10953, str, 0, -1, -1, null)) {
            m10950(objM10953);
            return null;
        }
        if (m10951(objM10953)) {
            return mo10921(objM10953);
        }
        return null;
    }
}
