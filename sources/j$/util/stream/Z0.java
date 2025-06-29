package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class Z0 extends S2 implements E0, InterfaceC5556z0 {
    @Override // j$.util.stream.InterfaceC5556z0, j$.util.stream.C0
    public final E0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
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
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i) {
        b(i);
        throw null;
    }

    @Override // j$.util.stream.Y2, j$.util.stream.J0
    public final Object d() {
        return (double[]) super.d();
    }

    @Override // j$.util.stream.Y2, j$.util.stream.J0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC5551y0.t(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC5551y0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        clear();
        v(j);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC5551y0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.Y2, j$.util.stream.J0
    public final void r(int i, Object obj) {
        super.r(i, (double[]) obj);
    }

    @Override // j$.util.stream.S2, j$.util.stream.Y2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.S2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.d0 spliterator() {
        return super.spliterator();
    }
}
