package p291;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;

/* renamed from: ٴᐧ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC3420 implements DialogInterface.OnCancelListener {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0116 f13291;

    public DialogInterfaceOnCancelListenerC3420(DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116) {
        this.f13291 = dialogInterfaceOnCancelListenerC0116;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116 = this.f13291;
        Dialog dialog = dialogInterfaceOnCancelListenerC0116.f694;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0116.onCancel(dialog);
        }
    }
}
