package p320;

import android.view.ActionProvider;
import ˏᵢ.ᵢٴ;

/* renamed from: ᴵʿ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC3646 implements ActionProvider.VisibilityListener {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final ActionProvider f13954;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC3659 f13955;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public ᵢٴ f13956;

    public ActionProviderVisibilityListenerC3646(MenuItemC3659 menuItemC3659, ActionProvider actionProvider) {
        this.f13955 = menuItemC3659;
        this.f13954 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ᵢٴ r2 = this.f13956;
        if (r2 != null) {
            MenuC3643 menuC3643 = ((C3644) r2.ˆʿ).f13945;
            menuC3643.f13911 = true;
            menuC3643.m8592(true);
        }
    }
}
