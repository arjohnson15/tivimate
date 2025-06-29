package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5558z2 extends AbstractC5441c {
    private final AbstractC5436b j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    C5558z2(AbstractC5436b abstractC5436b, AbstractC5436b abstractC5436b2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC5436b2, spliterator);
        this.j = abstractC5436b;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    C5558z2(C5558z2 c5558z2, Spliterator spliterator) {
        super(c5558z2, spliterator);
        this.j = c5558z2.j;
        this.k = c5558z2.k;
        this.l = c5558z2.l;
        this.m = c5558z2.m;
    }

    private long k(long j) {
        if (this.o) {
            return this.n;
        }
        C5558z2 c5558z2 = (C5558z2) this.d;
        C5558z2 c5558z22 = (C5558z2) this.e;
        if (c5558z2 == null || c5558z22 == null) {
            return this.n;
        }
        long jK = c5558z2.k(j);
        return jK >= j ? jK : jK + c5558z22.k(j);
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final Object a() {
        if (d()) {
            C0 c0N = this.j.N(EnumC5450d3.SIZED.v(this.j.c) ? this.j.G(this.b) : -1L, this.k);
            InterfaceC5509p2 interfaceC5509p2R = this.j.R(this.a.K(), c0N);
            AbstractC5436b abstractC5436b = this.a;
            abstractC5436b.B(this.b, abstractC5436b.W(interfaceC5509p2R));
            return c0N.a();
        }
        C0 c0N2 = this.j.N(-1L, this.k);
        if (this.l == 0) {
            InterfaceC5509p2 interfaceC5509p2R2 = this.j.R(this.a.K(), c0N2);
            AbstractC5436b abstractC5436b2 = this.a;
            abstractC5436b2.B(this.b, abstractC5436b2.W(interfaceC5509p2R2));
        } else {
            this.a.V(this.b, c0N2);
        }
        K0 k0A = c0N2.a();
        this.n = k0A.count();
        this.o = true;
        this.b = null;
        return k0A;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        return new C5558z2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5441c
    protected final void h() {
        this.i = true;
        if (this.o) {
            f(AbstractC5551y0.L(this.j.I()));
        }
    }

    @Override // j$.util.stream.AbstractC5441c
    protected final Object j() {
        return AbstractC5551y0.L(this.j.I());
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C5558z2 c5558z2;
        K0 k0L;
        AbstractC5451e abstractC5451e = this.d;
        if (!(abstractC5451e == null)) {
            this.n = ((C5558z2) abstractC5451e).n + ((C5558z2) this.e).n;
            if (this.i) {
                this.n = 0L;
                k0L = AbstractC5551y0.L(this.j.I());
            } else {
                k0L = this.n == 0 ? AbstractC5551y0.L(this.j.I()) : ((C5558z2) this.d).n == 0 ? (K0) ((C5558z2) this.e).c() : AbstractC5551y0.I(this.j.I(), (K0) ((C5558z2) this.d).c(), (K0) ((C5558z2) this.e).c());
            }
            K0 k0H = k0L;
            if (d()) {
                k0H = k0H.h(this.l, this.m >= 0 ? Math.min(k0H.count(), this.l + this.m) : this.n, this.k);
            }
            f(k0H);
            this.o = true;
        }
        if (this.m >= 0 && !d()) {
            long j = this.l + this.m;
            long jK = this.o ? this.n : k(j);
            if (jK >= j) {
                i();
            } else {
                C5558z2 c5558z22 = (C5558z2) ((AbstractC5451e) getCompleter());
                C5558z2 c5558z23 = this;
                while (true) {
                    if (c5558z22 == null) {
                        if (jK >= j) {
                            break;
                        }
                    } else {
                        if (c5558z23 == c5558z22.e && (c5558z2 = (C5558z2) c5558z22.d) != null) {
                            jK += c5558z2.k(j);
                            if (jK >= j) {
                                break;
                            }
                        }
                        c5558z23 = c5558z22;
                        c5558z22 = (C5558z2) ((AbstractC5451e) c5558z22.getCompleter());
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }
}
