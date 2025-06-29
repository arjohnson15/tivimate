package p222;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p320.C3651;
import p320.ViewOnKeyListenerC3661;
import p320.ViewOnKeyListenerC3662;

/* renamed from: ˏᴵ.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2967 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f11438;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11439;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2967(int i, Object obj) {
        this.f11439 = i;
        this.f11438 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f11439) {
            case 0:
                C2904 c2904 = (C2904) this.f11438;
                if (!c2904.getInternalPopup().mo7274()) {
                    c2904.f11245.mo7260(c2904.getTextDirection(), c2904.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c2904.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                C2916 c2916 = (C2916) this.f11438;
                C2904 c29042 = c2916.f11299;
                c2916.getClass();
                if (!c29042.isAttachedToWindow() || !c29042.getGlobalVisibleRect(c2916.f11296)) {
                    c2916.dismiss();
                    break;
                } else {
                    c2916.m7264();
                    c2916.mo7326();
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC3662 viewOnKeyListenerC3662 = (ViewOnKeyListenerC3662) this.f11438;
                if (viewOnKeyListenerC3662.mo7318()) {
                    ArrayList arrayList = viewOnKeyListenerC3662.f14036;
                    if (arrayList.size() > 0 && !((C3651) arrayList.get(0)).f13965.f11407) {
                        View view = viewOnKeyListenerC3662.f14050;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C3651) it.next()).f13965.mo7326();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC3662.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC3661 viewOnKeyListenerC3661 = (ViewOnKeyListenerC3661) this.f11438;
                if (viewOnKeyListenerC3661.mo7318()) {
                    C2920 c2920 = viewOnKeyListenerC3661.f14014;
                    if (!c2920.f11407) {
                        View view2 = viewOnKeyListenerC3661.f14018;
                        if (view2 != null && view2.isShown()) {
                            c2920.mo7326();
                            break;
                        } else {
                            viewOnKeyListenerC3661.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
