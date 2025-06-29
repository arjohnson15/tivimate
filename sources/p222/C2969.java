package p222;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p320.AbstractC3639;
import p320.InterfaceC3653;
import p320.InterfaceC3663;

/* renamed from: ˏᴵ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2969 extends AbstractViewOnTouchListenerC2857 {

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ int f11441 = 1;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final /* synthetic */ View f11442;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f11442 = actionMenuItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969(C2888 c2888, C2888 c28882) {
        super(c28882);
        this.f11442 = c2888;
    }

    @Override // p222.AbstractViewOnTouchListenerC2857
    /* renamed from: ʽᐧ */
    public final InterfaceC3653 mo7172() {
        C2928 c2928;
        switch (this.f11441) {
            case 0:
                C2928 c29282 = ((C2888) this.f11442).f11195.f11278;
                if (c29282 == null) {
                    return null;
                }
                return c29282.m8619();
            default:
                AbstractC3639 abstractC3639 = ((ActionMenuItemView) this.f11442).f49;
                if (abstractC3639 == null || (c2928 = ((C2932) abstractC3639).f11357.f11277) == null) {
                    return null;
                }
                return c2928.m8619();
        }
    }

    @Override // p222.AbstractViewOnTouchListenerC2857
    /* renamed from: ˑʽ */
    public final boolean mo7173() {
        InterfaceC3653 interfaceC3653Mo7172;
        switch (this.f11441) {
            case 0:
                ((C2888) this.f11442).f11195.m7254();
                return true;
            default:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f11442;
                InterfaceC3663 interfaceC3663 = actionMenuItemView.f54;
                return interfaceC3663 != null && interfaceC3663.mo109(actionMenuItemView.f46) && (interfaceC3653Mo7172 = mo7172()) != null && interfaceC3653Mo7172.mo7318();
        }
    }

    @Override // p222.AbstractViewOnTouchListenerC2857
    /* renamed from: ﹳﹳ */
    public boolean mo7175() {
        switch (this.f11441) {
            case 0:
                C2908 c2908 = ((C2888) this.f11442).f11195;
                if (c2908.f11283 != null) {
                    return false;
                }
                c2908.m7257();
                return true;
            default:
                return super.mo7175();
        }
    }
}
