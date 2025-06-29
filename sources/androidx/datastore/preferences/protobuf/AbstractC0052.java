package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0052 {
    protected int memoizedHashCode;

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final int m479(InterfaceC0025 interfaceC0025) {
        AbstractC0083 abstractC0083 = (AbstractC0083) this;
        int i = abstractC0083.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iMo301 = interfaceC0025.mo301(this);
        abstractC0083.memoizedSerializedSize = iMo301;
        return iMo301;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract void mo480(C0040 c0040);

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public abstract int mo481();
}
