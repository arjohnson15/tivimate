package p222;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;
import p225.LayoutInflaterFactory2C3017;
import p338.InterfaceC3865;

/* renamed from: ˏᴵ.ˆˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C2879 implements OnBackInvokedCallback {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ Object f11143;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f11144;

    public /* synthetic */ C2879(int i, Object obj) {
        this.f11144 = i;
        this.f11143 = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f11144) {
            case 0:
                ((Runnable) this.f11143).run();
                break;
            case 1:
                ((LayoutInflaterFactory2C3017) this.f11143).m7470();
                break;
            default:
                ((InterfaceC3865) this.f11143).mo1053();
                break;
        }
    }
}
