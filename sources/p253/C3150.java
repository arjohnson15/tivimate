package p253;

import p072.AbstractC1636;
import p148.AbstractC2269;
import p148.C2272;

/* renamed from: יˑ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3150 extends AbstractC3149 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final C3150 f12163 = new C3150(AbstractC3142.f12138, AbstractC3142.f12141, AbstractC3142.f12137, AbstractC3142.f12139);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ */
    public final AbstractC1636 mo5222(int i, String str) {
        AbstractC2269.m6283(1);
        return 1 >= AbstractC3142.f12138 ? str != null ? new C2272(this, str) : this : super.mo5222(1, str);
    }
}
