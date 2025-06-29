package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5436b implements InterfaceC5466h {
    private final AbstractC5436b a;
    private final AbstractC5436b b;
    protected final int c;
    private AbstractC5436b d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    AbstractC5436b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = EnumC5450d3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & EnumC5450d3.l;
        this.e = 0;
        this.k = z;
    }

    AbstractC5436b(AbstractC5436b abstractC5436b, int i) {
        if (abstractC5436b.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC5436b.h = true;
        abstractC5436b.d = this;
        this.b = abstractC5436b;
        this.c = EnumC5450d3.h & i;
        this.f = EnumC5450d3.n(i, abstractC5436b.f);
        AbstractC5436b abstractC5436b2 = abstractC5436b.a;
        this.a = abstractC5436b2;
        if (Q()) {
            abstractC5436b2.i = true;
        }
        this.e = abstractC5436b.e + 1;
    }

    private Spliterator S(int i) {
        int i2;
        int i3;
        AbstractC5436b abstractC5436b = this.a;
        Spliterator spliteratorP = abstractC5436b.g;
        if (spliteratorP == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC5436b.g = null;
        if (abstractC5436b.k && abstractC5436b.i) {
            AbstractC5436b abstractC5436b2 = abstractC5436b.d;
            int i4 = 1;
            while (abstractC5436b != this) {
                int i5 = abstractC5436b2.c;
                if (abstractC5436b2.Q()) {
                    if (EnumC5450d3.SHORT_CIRCUIT.s(i5)) {
                        i5 &= ~EnumC5450d3.u;
                    }
                    spliteratorP = abstractC5436b2.P(abstractC5436b, spliteratorP);
                    if (spliteratorP.hasCharacteristics(64)) {
                        i2 = (~EnumC5450d3.t) & i5;
                        i3 = EnumC5450d3.s;
                    } else {
                        i2 = (~EnumC5450d3.s) & i5;
                        i3 = EnumC5450d3.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                abstractC5436b2.e = i4;
                abstractC5436b2.f = EnumC5450d3.n(i5, abstractC5436b.f);
                i4++;
                AbstractC5436b abstractC5436b3 = abstractC5436b2;
                abstractC5436b2 = abstractC5436b2.d;
                abstractC5436b = abstractC5436b3;
            }
        }
        if (i != 0) {
            this.f = EnumC5450d3.n(i, this.f);
        }
        return spliteratorP;
    }

    final void A(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        Objects.requireNonNull(interfaceC5509p2);
        if (EnumC5450d3.SHORT_CIRCUIT.s(this.f)) {
            B(spliterator, interfaceC5509p2);
            return;
        }
        interfaceC5509p2.l(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC5509p2);
        interfaceC5509p2.k();
    }

    final boolean B(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        AbstractC5436b abstractC5436b = this;
        while (abstractC5436b.e > 0) {
            abstractC5436b = abstractC5436b.b;
        }
        interfaceC5509p2.l(spliterator.getExactSizeIfKnown());
        boolean zH = abstractC5436b.H(spliterator, interfaceC5509p2);
        interfaceC5509p2.k();
        return zH;
    }

    final K0 C(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return F(this, spliterator, z, intFunction);
        }
        C0 c0N = N(G(spliterator), intFunction);
        V(spliterator, c0N);
        return c0N.a();
    }

    final Object D(J3 j3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? j3.c(this, S(j3.d())) : j3.b(this, S(j3.d()));
    }

    final K0 E(IntFunction intFunction) {
        AbstractC5436b abstractC5436b;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (abstractC5436b = this.b) == null || !Q()) {
            return C(S(0), true, intFunction);
        }
        this.e = 0;
        return O(abstractC5436b, abstractC5436b.S(0), intFunction);
    }

    abstract K0 F(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z, IntFunction intFunction);

    final long G(Spliterator spliterator) {
        if (EnumC5450d3.SIZED.s(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean H(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2);

    abstract EnumC5455e3 I();

    final EnumC5455e3 J() {
        AbstractC5436b abstractC5436b = this;
        while (abstractC5436b.e > 0) {
            abstractC5436b = abstractC5436b.b;
        }
        return abstractC5436b.I();
    }

    final int K() {
        return this.f;
    }

    final boolean L() {
        return EnumC5450d3.ORDERED.s(this.f);
    }

    final /* synthetic */ Spliterator M() {
        return S(0);
    }

    abstract C0 N(long j, IntFunction intFunction);

    K0 O(AbstractC5436b abstractC5436b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator P(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        return O(abstractC5436b, spliterator, new C5511q(15)).spliterator();
    }

    abstract boolean Q();

    abstract InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2);

    final Spliterator T() {
        AbstractC5436b abstractC5436b = this.a;
        if (this != abstractC5436b) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC5436b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC5436b.g = null;
        return spliterator;
    }

    abstract Spliterator U(AbstractC5436b abstractC5436b, Supplier supplier, boolean z);

    final InterfaceC5509p2 V(Spliterator spliterator, InterfaceC5509p2 interfaceC5509p2) {
        A(spliterator, W((InterfaceC5509p2) Objects.requireNonNull(interfaceC5509p2)));
        return interfaceC5509p2;
    }

    final InterfaceC5509p2 W(InterfaceC5509p2 interfaceC5509p2) {
        Objects.requireNonNull(interfaceC5509p2);
        AbstractC5436b abstractC5436b = this;
        while (abstractC5436b.e > 0) {
            AbstractC5436b abstractC5436b2 = abstractC5436b.b;
            interfaceC5509p2 = abstractC5436b.R(abstractC5436b2.f, interfaceC5509p2);
            abstractC5436b = abstractC5436b2;
        }
        return interfaceC5509p2;
    }

    final Spliterator X(Spliterator spliterator) {
        return this.e == 0 ? spliterator : U(this, new C5431a(6, spliterator), this.a.k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC5436b abstractC5436b = this.a;
        Runnable runnable = abstractC5436b.j;
        if (runnable != null) {
            abstractC5436b.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final boolean isParallel() {
        return this.a.k;
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final InterfaceC5466h onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC5436b abstractC5436b = this.a;
        Runnable runnable2 = abstractC5436b.j;
        if (runnable2 != null) {
            runnable = new I3(runnable2, runnable);
        }
        abstractC5436b.j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final InterfaceC5466h parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final InterfaceC5466h sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC5466h
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC5436b abstractC5436b = this.a;
        if (this != abstractC5436b) {
            return U(this, new C5431a(0, this), abstractC5436b.k);
        }
        Spliterator spliterator = abstractC5436b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC5436b.g = null;
        return spliterator;
    }
}
