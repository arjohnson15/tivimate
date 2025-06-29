package p226;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p222.C2879;
import p338.InterfaceC3865;

/* renamed from: ˑʽ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3044 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C3044 f11741 = new C3044();

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final void m7537(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m7538(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final OnBackInvokedCallback m7539(InterfaceC3865 interfaceC3865) {
        return new C2879(2, interfaceC3865);
    }
}
