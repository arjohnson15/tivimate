package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class e4 extends AbstractC5451e {
    private final AbstractC5436b h;
    private final IntFunction i;
    private final boolean j;
    private long k;
    private long l;

    e4(AbstractC5436b abstractC5436b, AbstractC5436b abstractC5436b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5436b2, spliterator);
        this.h = abstractC5436b;
        this.i = intFunction;
        this.j = EnumC5450d3.ORDERED.s(abstractC5436b2.K());
    }

    e4(e4 e4Var, Spliterator spliterator) {
        super(e4Var, spliterator);
        this.h = e4Var.h;
        this.i = e4Var.i;
        this.j = e4Var.j;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final Object a() {
        boolean zD = d();
        C0 c0N = this.a.N((!zD && this.j && EnumC5450d3.SIZED.v(this.h.c)) ? this.h.G(this.b) : -1L, this.i);
        d4 d4VarK = ((c4) this.h).k(c0N, this.j && !zD);
        this.a.V(this.b, d4VarK);
        K0 k0A = c0N.a();
        this.k = k0A.count();
        this.l = d4VarK.f();
        return k0A;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        return new e4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC5451e abstractC5451e = this.d;
        if (abstractC5451e != null) {
            if (this.j) {
                e4 e4Var = (e4) abstractC5451e;
                long j = e4Var.l;
                this.l = j;
                if (j == e4Var.k) {
                    this.l = j + ((e4) this.e).l;
                }
            }
            e4 e4Var2 = (e4) abstractC5451e;
            long j2 = e4Var2.k;
            e4 e4Var3 = (e4) this.e;
            this.k = j2 + e4Var3.k;
            K0 k0I = e4Var2.k == 0 ? (K0) e4Var3.c() : e4Var3.k == 0 ? (K0) e4Var2.c() : AbstractC5551y0.I(this.h.I(), (K0) ((e4) this.d).c(), (K0) ((e4) this.e).c());
            if (d() && this.j) {
                k0I = k0I.h(this.l, k0I.count(), this.i);
            }
            f(k0I);
        }
        super.onCompletion(countedCompleter);
    }
}
