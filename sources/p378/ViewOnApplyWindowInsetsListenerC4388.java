package p378;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: ᵢٴ.ﹳˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC4388 implements View.OnApplyWindowInsetsListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ View f16907;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4359 f16908;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public C4369 f16909 = null;

    public ViewOnApplyWindowInsetsListenerC4388(View view, InterfaceC4359 interfaceC4359) {
        this.f16907 = view;
        this.f16908 = interfaceC4359;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C4369 c4369M9950 = C4369.m9950(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC4359 interfaceC4359 = this.f16908;
        if (i < 30) {
            AbstractC4339.m9861(windowInsets, this.f16907);
            if (c4369M9950.equals(this.f16909)) {
                return interfaceC4359.mo2871(view, c4369M9950).m9954();
            }
        }
        this.f16909 = c4369M9950;
        C4369 c4369Mo2871 = interfaceC4359.mo2871(view, c4369M9950);
        if (i >= 30) {
            return c4369Mo2871.m9954();
        }
        WeakHashMap weakHashMap = AbstractC4345.f16838;
        AbstractC4362.m9944(view);
        return c4369Mo2871.m9954();
    }
}
