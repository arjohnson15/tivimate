package p291;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;

/* renamed from: ٴᐧ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC3430 implements DialogInterface.OnDismissListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0116 f13312;

    public DialogInterfaceOnDismissListenerC3430(DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116) {
        this.f13312 = dialogInterfaceOnCancelListenerC0116;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116 = this.f13312;
        Dialog dialog = dialogInterfaceOnCancelListenerC0116.f694;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0116.onDismiss(dialog);
        }
    }
}
