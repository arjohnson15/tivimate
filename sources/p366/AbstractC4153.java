package p366;

import java.io.IOException;

/* renamed from: ᵔﾞ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4153 implements InterfaceC4163 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC4163 f16062;

    public AbstractC4153(InterfaceC4163 interfaceC4163) {
        this.f16062 = interfaceC4163;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16062.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f16062 + ')';
    }

    @Override // p366.InterfaceC4163
    /* renamed from: ˉי */
    public final C4151 mo8177() {
        return this.f16062.mo8177();
    }
}
