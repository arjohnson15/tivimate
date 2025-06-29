package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5528t2 extends AbstractC5437b0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5528t2(AbstractC5442c0 abstractC5442c0, int i, long j, long j2) {
        super(abstractC5442c0, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC5436b
    final K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jG = abstractC5436b.G(spliterator);
        if (jG > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC5551y0.G(abstractC5436b, AbstractC5551y0.C(abstractC5436b.J(), spliterator, this.m, this.n), true);
        }
        if (EnumC5450d3.ORDERED.s(abstractC5436b.K())) {
            return (K0) new C5558z2(this, abstractC5436b, spliterator, intFunction, this.m, this.n).invoke();
        }
        j$.util.X x = (j$.util.X) abstractC5436b.X(spliterator);
        long j2 = this.m;
        long j3 = this.n;
        if (j2 <= jG) {
            jMin = j3 >= 0 ? Math.min(j3, jG - j2) : jG - j2;
            j = 0;
        } else {
            jMin = j3;
            j = j2;
        }
        return AbstractC5551y0.G(this, new A3(x, j, jMin), true);
    }

    @Override // j$.util.stream.AbstractC5436b
    final Spliterator P(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        long j;
        long j2;
        long jG = abstractC5436b.G(spliterator);
        long j3 = this.n;
        if (jG > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.X x = (j$.util.X) abstractC5436b.X(spliterator);
            long j4 = this.m;
            return new C5534u3(x, j4, AbstractC5551y0.B(j4, j3));
        }
        if (EnumC5450d3.ORDERED.s(abstractC5436b.K())) {
            return ((K0) new C5558z2(this, abstractC5436b, spliterator, new C5444c2(1), this.m, this.n).invoke()).spliterator();
        }
        j$.util.X x2 = (j$.util.X) abstractC5436b.X(spliterator);
        long j5 = this.m;
        if (j5 <= jG) {
            long jMin = jG - j5;
            if (j3 >= 0) {
                jMin = Math.min(j3, jMin);
            }
            j = jMin;
            j2 = 0;
        } else {
            j = j3;
            j2 = j5;
        }
        return new A3(x2, j2, j);
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        return new C5523s2(this, interfaceC5509p2);
    }
}
