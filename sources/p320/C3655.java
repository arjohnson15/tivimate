package p320;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p225.C2990;
import p225.C3009;
import p225.DialogInterfaceC2998;

/* renamed from: ᴵʿ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3655 implements InterfaceC3641, AdapterView.OnItemClickListener {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public LayoutInflater f13984;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC3660 f13985;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public MenuC3643 f13986;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public ExpandedMenuView f13987;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Context f13988;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public C3640 f13989;

    public C3655(Context context) {
        this.f13988 = context;
        this.f13984 = LayoutInflater.from(context);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f13986.m8596(this.f13989.getItem(i), this, 0);
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ʿʼ */
    public final void mo7195(Context context, MenuC3643 menuC3643) {
        if (this.f13988 != null) {
            this.f13988 = context;
            if (this.f13984 == null) {
                this.f13984 = LayoutInflater.from(context);
            }
        }
        this.f13986 = menuC3643;
        C3640 c3640 = this.f13989;
        if (c3640 != null) {
            c3640.notifyDataSetChanged();
        }
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˉי */
    public final boolean mo7196() {
        return false;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏʾ */
    public final boolean mo7197(C3644 c3644) {
        return false;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˏᵢ */
    public final boolean mo7198(SubMenuC3642 subMenuC3642) {
        if (!subMenuC3642.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC3648 dialogInterfaceOnKeyListenerC3648 = new DialogInterfaceOnKeyListenerC3648();
        dialogInterfaceOnKeyListenerC3648.f13960 = subMenuC3642;
        Context context = subMenuC3642.f13914;
        C2990 c2990 = new C2990(context);
        C3655 c3655 = new C3655(c2990.getContext());
        dialogInterfaceOnKeyListenerC3648.f13959 = c3655;
        c3655.f13985 = dialogInterfaceOnKeyListenerC3648;
        subMenuC3642.m8585(c3655, context);
        C3655 c36552 = dialogInterfaceOnKeyListenerC3648.f13959;
        if (c36552.f13989 == null) {
            c36552.f13989 = new C3640(c36552);
        }
        C3640 c3640 = c36552.f13989;
        C3009 c3009 = c2990.f11507;
        c3009.f11549 = c3640;
        c3009.f11559 = dialogInterfaceOnKeyListenerC3648;
        View view = subMenuC3642.f13910;
        if (view != null) {
            c3009.f11546 = view;
        } else {
            c3009.f11554 = subMenuC3642.f13917;
            c2990.setTitle(subMenuC3642.f13907);
        }
        c3009.f11551 = dialogInterfaceOnKeyListenerC3648;
        DialogInterfaceC2998 dialogInterfaceC2998Create = c2990.create();
        dialogInterfaceOnKeyListenerC3648.f13958 = dialogInterfaceC2998Create;
        dialogInterfaceC2998Create.setOnDismissListener(dialogInterfaceOnKeyListenerC3648);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC3648.f13958.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC3648.f13958.show();
        InterfaceC3660 interfaceC3660 = this.f13985;
        if (interfaceC3660 == null) {
            return true;
        }
        interfaceC3660.mo7407(subMenuC3642);
        return true;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ˑʽ */
    public final void mo7255(InterfaceC3660 interfaceC3660) {
        throw null;
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ـﹶ */
    public final void mo7199(MenuC3643 menuC3643, boolean z) {
        InterfaceC3660 interfaceC3660 = this.f13985;
        if (interfaceC3660 != null) {
            interfaceC3660.mo7408(menuC3643, z);
        }
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ٴˎ */
    public final void mo7200() {
        C3640 c3640 = this.f13989;
        if (c3640 != null) {
            c3640.notifyDataSetChanged();
        }
    }

    @Override // p320.InterfaceC3641
    /* renamed from: ﹶˆ */
    public final boolean mo7201(C3644 c3644) {
        return false;
    }
}
