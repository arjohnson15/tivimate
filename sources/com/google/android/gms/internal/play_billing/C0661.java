package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᵔﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0661 extends AbstractC0587 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0587
    /* renamed from: ʽᐧ */
    public final void mo2551(long j, Object obj, Object obj2) {
        InterfaceC0680 interfaceC0680Mo2653 = (InterfaceC0680) AbstractC0603.m2601(j, obj);
        InterfaceC0680 interfaceC0680 = (InterfaceC0680) AbstractC0603.m2601(j, obj2);
        int size = interfaceC0680Mo2653.size();
        int size2 = interfaceC0680.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0655) interfaceC0680Mo2653).f3062) {
                interfaceC0680Mo2653 = interfaceC0680Mo2653.mo2653(size2 + size);
            }
            interfaceC0680Mo2653.addAll(interfaceC0680);
        }
        if (size > 0) {
            interfaceC0680 = interfaceC0680Mo2653;
        }
        AbstractC0603.m2592(j, obj, interfaceC0680);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0587
    /* renamed from: ـﹶ */
    public final void mo2552(long j, Object obj) {
        AbstractC0655 abstractC0655 = (AbstractC0655) ((InterfaceC0680) AbstractC0603.m2601(j, obj));
        if (abstractC0655.f3062) {
            abstractC0655.f3062 = false;
        }
    }
}
