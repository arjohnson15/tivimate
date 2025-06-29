package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5531u0 implements InterfaceC5509p2 {
    boolean a;
    boolean b;

    AbstractC5531u0(EnumC5536v0 enumC5536v0) {
        this.b = !enumC5536v0.b;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
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
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        return this.a;
    }
}
