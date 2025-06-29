package p307;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: ᐧˋ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3556 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Field f13724;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Method f13725;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final Field f13726;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Class f13727;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static final Method f13728;

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static final Handler f13729 = new Handler(Looper.getMainLooper());

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final Method f13730;

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f13727 = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f13724 = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f13726 = declaredField2;
        Class cls2 = f13727;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f13730 = declaredMethod;
        Class cls3 = f13727;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f13725 = declaredMethod2;
        Class cls4 = f13727;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f13728 = method;
    }
}
