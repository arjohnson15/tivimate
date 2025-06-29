package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5434a2 extends V1 implements U1 {
    long b;

    public /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC5551y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
