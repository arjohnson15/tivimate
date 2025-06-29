package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5458f1 extends N0 implements C0 {
    @Override // j$.util.stream.C0
    public final K0 a() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(objArr.length)));
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.b = 1 + i;
        objArr[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void k() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        Object[] objArr = this.a;
        if (j != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
        }
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.N0
    public final String toString() {
        Object[] objArr = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
