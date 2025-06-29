package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5541w0 implements J3 {
    final EnumC5536v0 a;
    final Supplier b;

    C5541w0(EnumC5455e3 enumC5455e3, EnumC5536v0 enumC5536v0, Supplier supplier) {
        this.a = enumC5536v0;
        this.b = supplier;
    }

    @Override // j$.util.stream.J3
    public final Object b(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        AbstractC5531u0 abstractC5531u0 = (AbstractC5531u0) this.b.get();
        abstractC5436b.V(spliterator, abstractC5531u0);
        return Boolean.valueOf(abstractC5531u0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.J3
    public final Object c(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return (Boolean) new C5546x0(this, abstractC5436b, spliterator).invoke();
    }

    @Override // j$.util.stream.J3
    public final int d() {
        return EnumC5450d3.u | EnumC5450d3.r;
    }
}
