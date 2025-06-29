package p225;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import p084.AbstractC1716;
import p222.C2879;

/* renamed from: ˏᵢ.ˈٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2989 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static OnBackInvokedCallback m7412(Object obj, LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017) {
        Objects.requireNonNull(layoutInflaterFactory2C3017);
        C2879 c2879 = new C2879(1, layoutInflaterFactory2C3017);
        AbstractC1716.m5449(obj).registerOnBackInvokedCallback(1000000, c2879);
        return c2879;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7413(Object obj, Object obj2) {
        AbstractC1716.m5449(obj).unregisterOnBackInvokedCallback(AbstractC1716.m5440(obj2));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static OnBackInvokedDispatcher m7414(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
