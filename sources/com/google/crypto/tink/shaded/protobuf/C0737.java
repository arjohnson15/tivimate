package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0737 implements InterfaceC0753 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public InterfaceC0753[] f3554;

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0753
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean mo3050(Class cls) {
        for (InterfaceC0753 interfaceC0753 : this.f3554) {
            if (interfaceC0753.mo3050(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0753
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C0767 mo3051(Class cls) {
        for (InterfaceC0753 interfaceC0753 : this.f3554) {
            if (interfaceC0753.mo3050(cls)) {
                return interfaceC0753.mo3051(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
