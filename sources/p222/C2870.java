package p222;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: ˏᴵ.ʾʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2870 implements PopupWindow.OnDismissListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2916 f11129;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2967 f11130;

    public C2870(C2916 c2916, ViewTreeObserverOnGlobalLayoutListenerC2967 viewTreeObserverOnGlobalLayoutListenerC2967) {
        this.f11129 = c2916;
        this.f11130 = viewTreeObserverOnGlobalLayoutListenerC2967;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f11129.f11299.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f11130);
        }
    }
}
