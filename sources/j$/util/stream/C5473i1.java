package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5473i1 extends U2 implements G0, A0 {
    @Override // j$.util.stream.A0, j$.util.stream.C0
    public final G0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
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
        m((Integer) obj);
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
        return (int[]) super.d();
    }

    @Override // j$.util.stream.Y2, j$.util.stream.J0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC5551y0.u(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i) {
        AbstractC5551y0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        clear();
        v(j);
    }

    @Override // j$.util.stream.InterfaceC5499n2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5551y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC5551y0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.Y2, j$.util.stream.J0
    public final void r(int i, Object obj) {
        super.r(i, (int[]) obj);
    }

    @Override // j$.util.stream.U2, j$.util.stream.Y2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.U2, j$.util.stream.Y2, java.lang.Iterable
    public final j$.util.d0 spliterator() {
        return super.spliterator();
    }
}
