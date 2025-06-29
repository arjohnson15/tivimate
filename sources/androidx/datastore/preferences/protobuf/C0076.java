package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0076 implements InterfaceC0046 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C0076 f502 = new C0076(0);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f503;

    public /* synthetic */ C0076(int i) {
        this.f503 = i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0046
    /* renamed from: ʽᐧ */
    public final boolean mo473(Class cls) {
        switch (this.f503) {
            case 0:
                return AbstractC0083.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0046
    /* renamed from: ـﹶ */
    public final C0063 mo474(Class cls) {
        switch (this.f503) {
            case 0:
                if (!AbstractC0083.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0063) AbstractC0083.m577(cls.asSubclass(AbstractC0083.class)).mo581(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
