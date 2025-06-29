package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5474i2 implements InterfaceC5494m2 {
    protected final InterfaceC5509p2 a;

    public AbstractC5474i2(InterfaceC5509p2 interfaceC5509p2) {
        this.a = (InterfaceC5509p2) Objects.requireNonNull(interfaceC5509p2);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC5551y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public void k() {
        this.a.k();
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public void l(long j) {
        this.a.l(j);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public boolean n() {
        return this.a.n();
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }
}
