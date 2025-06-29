package p225;

import android.view.Window;
import p222.InterfaceC2925;
import p320.InterfaceC3660;
import p320.MenuC3643;

/* renamed from: ˏᵢ.ˋˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2993 implements InterfaceC2925, InterfaceC3660 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C3017 f11514;

    public /* synthetic */ C2993(LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017) {
        this.f11514 = layoutInflaterFactory2C3017;
    }

    @Override // p320.InterfaceC3660
    /* renamed from: ˉⁱ */
    public boolean mo7407(MenuC3643 menuC3643) {
        Window.Callback callback;
        if (menuC3643 != menuC3643.mo8580()) {
            return true;
        }
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11514;
        if (!layoutInflaterFactory2C3017.f11614 || (callback = layoutInflaterFactory2C3017.f11616.getCallback()) == null || layoutInflaterFactory2C3017.f11637) {
            return true;
        }
        callback.onMenuOpened(108, menuC3643);
        return true;
    }

    @Override // p320.InterfaceC3660
    /* renamed from: ـﹶ */
    public void mo7408(MenuC3643 menuC3643, boolean z) {
        C2988 c2988;
        MenuC3643 menuC3643Mo8580 = menuC3643.mo8580();
        int i = 0;
        boolean z2 = menuC3643Mo8580 != menuC3643;
        if (z2) {
            menuC3643 = menuC3643Mo8580;
        }
        LayoutInflaterFactory2C3017 layoutInflaterFactory2C3017 = this.f11514;
        C2988[] c2988Arr = layoutInflaterFactory2C3017.f11628;
        int length = c2988Arr != null ? c2988Arr.length : 0;
        while (true) {
            if (i < length) {
                c2988 = c2988Arr[i];
                if (c2988 != null && c2988.f11497 == menuC3643) {
                    break;
                } else {
                    i++;
                }
            } else {
                c2988 = null;
                break;
            }
        }
        if (c2988 != null) {
            if (!z2) {
                layoutInflaterFactory2C3017.m7471(c2988, z);
            } else {
                layoutInflaterFactory2C3017.m7472(c2988.f11500, c2988, menuC3643Mo8580);
                layoutInflaterFactory2C3017.m7471(c2988, true);
            }
        }
    }
}
