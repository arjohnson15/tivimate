package p222;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p320.C3654;

/* renamed from: ˏᴵ.ٴᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2930 implements View.OnClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ C2885 f11352;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C3654 f11353;

    public ViewOnClickListenerC2930(C2885 c2885) {
        this.f11352 = c2885;
        Context context = c2885.f11179.getContext();
        CharSequence charSequence = c2885.f11177;
        C3654 c3654 = new C3654();
        c3654.f13969 = 4096;
        c3654.f13980 = 4096;
        c3654.f13971 = null;
        c3654.f13972 = null;
        c3654.f13981 = false;
        c3654.f13974 = false;
        c3654.f13977 = 16;
        c3654.f13983 = context;
        c3654.f13978 = charSequence;
        this.f11353 = c3654;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2885 c2885 = this.f11352;
        Window.Callback callback = c2885.f11175;
        if (callback == null || !c2885.f11173) {
            return;
        }
        callback.onMenuItemSelected(0, this.f11353);
    }
}
