package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.EnumC0247;
import androidx.lifecycle.InterfaceC0213;
import androidx.lifecycle.InterfaceC0262;

/* renamed from: androidx.fragment.app.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0096 implements InterfaceC0213 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f579;

    public C0096(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f579 = abstractComponentCallbacksC0100;
    }

    @Override // androidx.lifecycle.InterfaceC0213
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo607(InterfaceC0262 interfaceC0262, EnumC0247 enumC0247) {
        View view;
        if (enumC0247 != EnumC0247.ON_STOP || (view = this.f579.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
