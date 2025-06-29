package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5456f implements InterfaceC5466h {
    public final /* synthetic */ BaseStream a;

    private /* synthetic */ C5456f(BaseStream baseStream) {
        this.a = baseStream;
    }

    public static /* synthetic */ InterfaceC5466h k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C5461g ? ((C5461g) baseStream).a : baseStream instanceof DoubleStream ? D.k((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C5487l0.k((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C5435a3.k((java.util.stream.Stream) baseStream) : new C5456f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.a;
        if (obj instanceof C5456f) {
            obj = ((C5456f) obj).a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ InterfaceC5466h onClose(Runnable runnable) {
        return k(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5466h parallel() {
        return k(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* synthetic */ InterfaceC5466h sequential() {
        return k(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final /* synthetic */ InterfaceC5466h unordered() {
        return k(this.a.unordered());
    }
}
