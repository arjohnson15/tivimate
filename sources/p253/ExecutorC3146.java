package p253;

import java.util.concurrent.Executor;
import p072.AbstractC1633;
import p072.AbstractC1636;
import p148.AbstractC2269;
import p148.AbstractC2275;
import p330.C3749;
import p330.InterfaceC3747;

/* renamed from: יˑ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC3146 extends AbstractC1633 implements Executor {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final ExecutorC3146 f12150 = new ExecutorC3146();

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final AbstractC1636 f12151;

    static {
        C3144 c3144 = C3144.f12147;
        int i = AbstractC2275.f9020;
        if (64 >= i) {
            i = 64;
        }
        f12151 = c3144.mo5222(AbstractC2269.m6279("kotlinx.coroutines.io.parallelism", i, 0, 0, 12), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo5198(C3749.f14510, runnable);
    }

    @Override // p072.AbstractC1636
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p072.AbstractC1636
    /* renamed from: ʽˆ */
    public final void mo5275(InterfaceC3747 interfaceC3747, Runnable runnable) {
        f12151.mo5275(interfaceC3747, runnable);
    }

    @Override // p072.AbstractC1636
    /* renamed from: ˈﹳ */
    public final void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable) {
        f12151.mo5198(interfaceC3747, runnable);
    }

    @Override // p072.AbstractC1633
    /* renamed from: ـᵎ */
    public final Executor mo5199() {
        return this;
    }

    @Override // p072.AbstractC1636
    /* renamed from: ٴﹶ */
    public final AbstractC1636 mo5222(int i, String str) {
        return C3144.f12147.mo5222(1, str);
    }
}
