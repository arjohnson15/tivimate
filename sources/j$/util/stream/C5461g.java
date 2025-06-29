package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5461g implements BaseStream {
    public final /* synthetic */ InterfaceC5466h a;

    private /* synthetic */ C5461g(InterfaceC5466h interfaceC5466h) {
        this.a = interfaceC5466h;
    }

    public static /* synthetic */ BaseStream k(InterfaceC5466h interfaceC5466h) {
        if (interfaceC5466h == null) {
            return null;
        }
        return interfaceC5466h instanceof C5456f ? ((C5456f) interfaceC5466h).a : interfaceC5466h instanceof F ? E.k((F) interfaceC5466h) : interfaceC5466h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC5466h) : interfaceC5466h instanceof InterfaceC5497n0 ? C5492m0.k((InterfaceC5497n0) interfaceC5466h) : interfaceC5466h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC5466h) : new C5461g(interfaceC5466h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5466h interfaceC5466h = this.a;
        if (obj instanceof C5461g) {
            obj = ((C5461g) obj).a;
        }
        return interfaceC5466h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return k(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return k(this.a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return k(this.a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return k(this.a.unordered());
    }
}
