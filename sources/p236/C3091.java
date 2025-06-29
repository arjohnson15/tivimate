package p236;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p004.AbstractC0921;
import ʼˉ.ٴˎ;

/* renamed from: ˑי.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3091 extends ٴˎ {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final Object f11928 = new Object();

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final ExecutorService f11929 = Executors.newFixedThreadPool(4, new ThreadFactoryC3090());

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public volatile Handler f11930;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static Handler m7595(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0921.m3771(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
