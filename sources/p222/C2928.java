package p222;

import android.content.Context;
import android.view.View;
import org.lsposed.hiddenapibypass.library.R;
import p320.AbstractC3647;
import p320.C3658;
import p320.InterfaceC3660;
import p320.MenuC3643;
import p320.SubMenuC3642;

/* renamed from: ˏᴵ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2928 extends C3658 {

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f11337 = 0;

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final /* synthetic */ C2908 f11338;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928(C2908 c2908, Context context, SubMenuC3642 subMenuC3642, View view) {
        super(R.attr._2_res_0x7f040022, context, view, subMenuC3642, false);
        this.f11338 = c2908;
        if (!subMenuC3642.f13898.m8602()) {
            View view2 = c2908.f11273;
            this.f13998 = view2 == null ? (View) c2908.f11267 : view2;
        }
        InterfaceC3660 interfaceC3660 = c2908.f11268;
        this.f14001 = interfaceC3660;
        AbstractC3647 abstractC3647 = this.f14007;
        if (abstractC3647 != null) {
            abstractC3647.mo7255(interfaceC3660);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928(C2908 c2908, Context context, MenuC3643 menuC3643, View view) {
        super(R.attr._2_res_0x7f040022, context, view, menuC3643, true);
        this.f11338 = c2908;
        this.f14004 = 8388613;
        InterfaceC3660 interfaceC3660 = c2908.f11268;
        this.f14001 = interfaceC3660;
        AbstractC3647 abstractC3647 = this.f14007;
        if (abstractC3647 != null) {
            abstractC3647.mo7255(interfaceC3660);
        }
    }

    @Override // p320.C3658
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void mo7281() {
        switch (this.f11337) {
            case 0:
                C2908 c2908 = this.f11338;
                c2908.f11277 = null;
                c2908.getClass();
                super.mo7281();
                break;
            default:
                C2908 c29082 = this.f11338;
                MenuC3643 menuC3643 = c29082.f11269;
                if (menuC3643 != null) {
                    menuC3643.m8591(true);
                }
                c29082.f11278 = null;
                super.mo7281();
                break;
        }
    }
}
