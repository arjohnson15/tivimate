package p291;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;
import androidx.lifecycle.InterfaceC0221;
import androidx.lifecycle.InterfaceC0262;

/* renamed from: ٴᐧ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3421 implements InterfaceC0221 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0116 f13292;

    public C3421(DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116) {
        this.f13292 = dialogInterfaceOnCancelListenerC0116;
    }

    @Override // androidx.lifecycle.InterfaceC0221
    /* renamed from: ʽᐧ */
    public final void mo1011(Object obj) {
        if (((InterfaceC0262) obj) != null) {
            DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116 = this.f13292;
            if (dialogInterfaceOnCancelListenerC0116.f697) {
                View viewRequireView = dialogInterfaceOnCancelListenerC0116.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0116.f694 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        String str = "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0116.f694;
                    }
                    dialogInterfaceOnCancelListenerC0116.f694.setContentView(viewRequireView);
                }
            }
        }
    }
}
