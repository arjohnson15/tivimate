package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5484k2 implements InterfaceC5504o2 {
    protected final InterfaceC5509p2 a;

    public AbstractC5484k2(InterfaceC5509p2 interfaceC5509p2) {
        this.a = (InterfaceC5509p2) Objects.requireNonNull(interfaceC5509p2);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5504o2
    public final /* synthetic */ void j(Long l) {
        AbstractC5551y0.i(this, l);
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
}
