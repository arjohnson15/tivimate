package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0644 implements InterfaceC0598 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0644 f3031 = new C0644(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3032;

    public /* synthetic */ C0644(int i) {
        this.f3032 = i;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0598
    /* renamed from: ʽᐧ */
    public final boolean mo2571(Class cls) {
        switch (this.f3032) {
            case 0:
                return AbstractC0662.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0598
    /* renamed from: ـﹶ */
    public final C0642 mo2572(Class cls) {
        switch (this.f3032) {
            case 0:
                if (!AbstractC0662.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0642) AbstractC0662.m2705(cls.asSubclass(AbstractC0662.class)).mo2555(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
