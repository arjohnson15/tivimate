package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5547x1 extends Z2 implements K0, C0 {
    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
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

    @Override // j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC5551y0.l();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC5551y0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }
}
