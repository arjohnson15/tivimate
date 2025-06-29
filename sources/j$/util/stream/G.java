package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class G implements J3 {
    final int a;
    final Object b;
    final Predicate c;
    final Supplier d;

    G(boolean z, EnumC5455e3 enumC5455e3, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC5450d3.r) | EnumC5450d3.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        K3 k3 = (K3) this.d.get();
        abstractC5436b.V(spliterator, k3);
        Object obj = k3.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.J3
    public final Object c(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return new M(this, EnumC5450d3.ORDERED.s(abstractC5436b.K()), abstractC5436b, spliterator).invoke();
    }

    @Override // j$.util.stream.J3
    public final int d() {
        return this.a;
    }
}
