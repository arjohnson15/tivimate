package p222;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p320.C3644;
import p320.MenuC3643;
import ˊﹶ.ˋˉ;

/* renamed from: ˏᴵ.יˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2920 extends C2959 implements InterfaceC2953 {

    /* renamed from: ˈﹳ, reason: contains not printable characters */
    public static final Method f11317;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public ˋˉ f11318;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f11317 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p222.InterfaceC2953
    /* renamed from: יʻ, reason: contains not printable characters */
    public final void mo7269(MenuC3643 menuC3643, C3644 c3644) {
        ˋˉ r0 = this.f11318;
        if (r0 != null) {
            r0.יʻ(menuC3643, c3644);
        }
    }

    @Override // p222.C2959
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2882 mo7270(Context context, boolean z) {
        C2950 c2950 = new C2950(context, z);
        c2950.setHoverListener(this);
        return c2950;
    }

    @Override // p222.InterfaceC2953
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final void mo7271(MenuC3643 menuC3643, C3644 c3644) {
        ˋˉ r0 = this.f11318;
        if (r0 != null) {
            r0.ﹳˑ(menuC3643, c3644);
        }
    }
}
