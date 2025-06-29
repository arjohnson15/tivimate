package p421;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p052.C1319;
import p371.C4206;
import p371.C4214;
import ʼˉ.ٴˎ;
import ˆˑ.ﹳﹳ;

/* renamed from: ﹳﹶ.ᐧʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4864 extends ٴˎ {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public static Class f18371;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public static Method f18372;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public static boolean f18373;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static Constructor f18374;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public static Method f18375;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static boolean m10945(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m10946();
        try {
            return ((Boolean) f18375.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public static void m10946() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f18373) {
            return;
        }
        f18373 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f18374 = constructor;
        f18371 = cls;
        f18375 = method2;
        f18372 = method;
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Typeface mo10947(Context context, C4206 c4206, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m10946();
        try {
            Object objNewInstance = f18374.newInstance(null);
            for (C4214 c4214 : c4206.f16221) {
                File file = ﹳﹳ.ˑי(context);
                if (file == null) {
                    return null;
                }
                try {
                    if (!ﹳﹳ.ʿʼ(file, resources, c4214.f16249)) {
                        return null;
                    }
                    if (!m10945(objNewInstance, file.getPath(), c4214.f16245, c4214.f16247)) {
                        return null;
                    }
                    file.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    file.delete();
                }
            }
            m10946();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f18371, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f18372.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public Typeface mo10948(Context context, C1319[] c1319Arr, int i) throws IOException {
        String str;
        if (c1319Arr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(ˉⁱ(c1319Arr, i).f5374, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typeface = ˏᵢ(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typeface;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
