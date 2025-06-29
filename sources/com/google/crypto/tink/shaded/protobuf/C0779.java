package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0779 implements InterfaceC0753 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0779 f3640 = new C0779(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f3641;

    public /* synthetic */ C0779(int i) {
        this.f3641 = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0753
    /* renamed from: ʽᐧ */
    public final boolean mo3050(Class cls) {
        switch (this.f3641) {
            case 0:
                return AbstractC0785.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0753
    /* renamed from: ـﹶ */
    public final C0767 mo3051(Class cls) {
        switch (this.f3641) {
            case 0:
                if (!AbstractC0785.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0767) AbstractC0785.m3233(cls.asSubclass(AbstractC0785.class)).mo3242(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
