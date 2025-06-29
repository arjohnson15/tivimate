package p421;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ﹳﹶ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4858 extends C4866 {
    @Override // p421.C4866
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public final Method mo10920(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p421.C4866
    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final Typeface mo10921(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f18381, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f18378.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
