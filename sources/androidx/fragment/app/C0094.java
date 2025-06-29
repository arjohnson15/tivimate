package androidx.fragment.app;

import android.view.View;
import p291.AbstractC3416;

/* renamed from: androidx.fragment.app.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0094 extends AbstractC3416 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC0100 f577;

    public C0094(AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100) {
        this.f577 = abstractComponentCallbacksC0100;
    }

    @Override // p291.AbstractC3416
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final View mo605(int i) {
        AbstractComponentCallbacksC0100 abstractComponentCallbacksC0100 = this.f577;
        View view = abstractComponentCallbacksC0100.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0100 + " does not have a view");
    }

    @Override // p291.AbstractC3416
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final boolean mo606() {
        return this.f577.mView != null;
    }
}
