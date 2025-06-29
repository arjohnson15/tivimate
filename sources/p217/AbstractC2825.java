package p217;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import p288.C3403;

/* renamed from: ˏˏ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2825 {
    private static volatile Choreographer choreographer;

    static {
        Object c3403;
        try {
            c3403 = new C2828(m7101(Looper.getMainLooper()));
        } catch (Throwable th) {
            c3403 = new C3403(th);
        }
        if (c3403 instanceof C3403) {
            c3403 = null;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final Handler m7101(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
