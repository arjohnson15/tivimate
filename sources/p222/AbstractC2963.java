package p222;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* renamed from: ˏᴵ.ﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2963 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static OnBackInvokedCallback m7333(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C2879(0, runnable);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static void m7334(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static OnBackInvokedDispatcher m7335(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static void m7336(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
