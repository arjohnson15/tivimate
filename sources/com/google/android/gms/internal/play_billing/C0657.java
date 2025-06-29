package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0657 implements InterfaceC0598 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final InterfaceC0598[] f3066;

    public C0657(InterfaceC0598... interfaceC0598Arr) {
        this.f3066 = interfaceC0598Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0598
    /* renamed from: ʽᐧ */
    public final boolean mo2571(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f3066[i].mo2571(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0598
    /* renamed from: ـﹶ */
    public final C0642 mo2572(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC0598 interfaceC0598 = this.f3066[i];
            if (interfaceC0598.mo2571(cls)) {
                return interfaceC0598.mo2572(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
