package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ﹳﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0079 implements InterfaceC0046 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public InterfaceC0046[] f506;

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0046
    /* renamed from: ʽᐧ */
    public final boolean mo473(Class cls) {
        for (InterfaceC0046 interfaceC0046 : this.f506) {
            if (interfaceC0046.mo473(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0046
    /* renamed from: ـﹶ */
    public final C0063 mo474(Class cls) {
        for (InterfaceC0046 interfaceC0046 : this.f506) {
            if (interfaceC0046.mo473(cls)) {
                return interfaceC0046.mo474(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
