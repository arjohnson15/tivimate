package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p013.AbstractC1036;
import p013.AbstractC1037;

/* renamed from: androidx.lifecycle.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0225 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final List f1243 = AbstractC1037.m4011(Application.class, C0251.class);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final List f1242 = Collections.singletonList(C0251.class);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final AbstractC0207 m1026(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC0207) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Constructor m1027(Class cls, List list) throws SecurityException {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listM3993 = AbstractC1036.m3993(constructor.getParameterTypes());
            if (list.equals(listM3993)) {
                return constructor;
            }
            if (list.size() == listM3993.size() && listM3993.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
