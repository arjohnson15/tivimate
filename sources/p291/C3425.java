package p291;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0116;

/* renamed from: ٴᐧ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3425 extends AbstractC3416 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0116 f13303;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3416 f13304;

    public C3425(DialogInterfaceOnCancelListenerC0116 dialogInterfaceOnCancelListenerC0116, AbstractC3416 abstractC3416) {
        this.f13303 = dialogInterfaceOnCancelListenerC0116;
        this.f13304 = abstractC3416;
    }

    @Override // p291.AbstractC3416
    /* renamed from: ʽᐧ */
    public final View mo605(int i) {
        AbstractC3416 abstractC3416 = this.f13304;
        if (abstractC3416.mo606()) {
            return abstractC3416.mo605(i);
        }
        Dialog dialog = this.f13303.f694;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p291.AbstractC3416
    /* renamed from: ˑʽ */
    public final boolean mo606() {
        return this.f13304.mo606() || this.f13303.f699;
    }
}
