package j$.util.stream;

/* loaded from: classes2.dex */
final class Z1 extends AbstractC5434a2 {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b++;
    }

    @Override // j$.util.stream.U1
    public final void g(U1 u1) {
        this.b += ((AbstractC5434a2) u1).b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }
}
