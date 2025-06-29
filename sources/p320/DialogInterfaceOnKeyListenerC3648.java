package p320;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p225.DialogInterfaceC2998;

/* renamed from: ᴵʿ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC3648 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC3660 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public DialogInterfaceC2998 f13958;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public C3655 f13959;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public SubMenuC3642 f13960;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3655 c3655 = this.f13959;
        if (c3655.f13989 == null) {
            c3655.f13989 = new C3640(c3655);
        }
        this.f13960.m8596(c3655.f13989.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13959.mo7199(this.f13960, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC3642 subMenuC3642 = this.f13960;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13958.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13958.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC3642.m8591(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC3642.performShortcut(i, keyEvent, 0);
    }

    @Override // p320.InterfaceC3660
    /* renamed from: ˉⁱ */
    public final boolean mo7407(MenuC3643 menuC3643) {
        return false;
    }

    @Override // p320.InterfaceC3660
    /* renamed from: ـﹶ */
    public final void mo7408(MenuC3643 menuC3643, boolean z) {
        DialogInterfaceC2998 dialogInterfaceC2998;
        if ((z || menuC3643 == this.f13960) && (dialogInterfaceC2998 = this.f13958) != null) {
            dialogInterfaceC2998.dismiss();
        }
    }
}
