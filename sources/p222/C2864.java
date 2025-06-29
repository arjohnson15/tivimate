package p222;

import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;
import androidx.leanback.widget.ʿˏ;
import p320.C3658;
import יˏ.ʾˈ;
import ـˈ.ˆˉ;
import ـˈ.ﹳʻ;

/* renamed from: ˏᴵ.ʼʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2864 implements PopupWindow.OnDismissListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f11123;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11124;

    public /* synthetic */ C2864(int i, Object obj) {
        this.f11124 = i;
        this.f11123 = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f11124) {
            case 0:
                ﹳʻ r0 = (ﹳʻ) ((ʿˏ) this.f11123).ᐧˋ;
                if (r0 != null) {
                    ˆˉ r02 = r0.ˆʿ;
                    r02.ˆʿ = null;
                    Context context = r02.getContext();
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    if (activity != null) {
                        ʾˈ.ᵔ(activity, true);
                        break;
                    }
                }
                break;
            default:
                ((C3658) this.f11123).mo7281();
                break;
        }
    }
}
