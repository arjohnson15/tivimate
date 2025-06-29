package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0224;
import p291.AbstractC3428;

/* renamed from: androidx.fragment.app.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0099 extends AbstractC3428 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f587;

    public C0099(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f587 = abstractComponentCallbacksC0100;
    }

    @Override // p291.AbstractC3428
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo611() {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f587;
        abstractComponentCallbacksC0100.mSavedStateRegistryController.m8247();
        AbstractC0224.m1024(abstractComponentCallbacksC0100);
        Bundle bundle = abstractComponentCallbacksC0100.mSavedFragmentState;
        abstractComponentCallbacksC0100.mSavedStateRegistryController.m8245(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
