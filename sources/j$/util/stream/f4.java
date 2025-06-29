package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class f4 extends AbstractC5441c {
    private final AbstractC5436b j;
    private final IntFunction k;
    private final boolean l;
    private long m;
    private boolean n;
    private volatile boolean o;

    f4(AbstractC5436b abstractC5436b, AbstractC5436b abstractC5436b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC5436b2, spliterator);
        this.j = abstractC5436b;
        this.k = intFunction;
        this.l = EnumC5450d3.ORDERED.s(abstractC5436b2.K());
    }

    f4(f4 f4Var, Spliterator spliterator) {
        super(f4Var, spliterator);
        this.j = f4Var.j;
        this.k = f4Var.k;
        this.l = f4Var.l;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final Object a() {
        C0 c0N = this.a.N(-1L, this.k);
        InterfaceC5509p2 interfaceC5509p2R = this.j.R(this.a.K(), c0N);
        AbstractC5436b abstractC5436b = this.a;
        boolean zB = abstractC5436b.B(this.b, abstractC5436b.W(interfaceC5509p2R));
        this.n = zB;
        if (zB) {
            i();
        }
        K0 k0A = c0N.a();
        this.m = k0A.count();
        return k0A;
    }

    @Override // j$.util.stream.AbstractC5451e
    protected final AbstractC5451e e(Spliterator spliterator) {
        return new f4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC5441c
    protected final void h() {
        this.i = true;
        if (this.l && this.o) {
            f(AbstractC5551y0.L(this.j.I()));
        }
    }

    @Override // j$.util.stream.AbstractC5441c
    protected final Object j() {
        return AbstractC5551y0.L(this.j.I());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // j$.util.stream.AbstractC5451e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r9) {
        /*
            r8 = this;
            j$.util.stream.e r0 = r8.d
            if (r0 != 0) goto L6
            goto L8b
        L6:
            j$.util.stream.f4 r0 = (j$.util.stream.f4) r0
            boolean r0 = r0.n
            j$.util.stream.e r1 = r8.e
            j$.util.stream.f4 r1 = (j$.util.stream.f4) r1
            boolean r1 = r1.n
            r0 = r0 | r1
            r8.n = r0
            boolean r0 = r8.l
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r8.i
            if (r0 == 0) goto L2a
            r8.m = r1
            j$.util.stream.b r0 = r8.j
            j$.util.stream.e3 r0 = r0.I()
            j$.util.stream.e1 r0 = j$.util.stream.AbstractC5551y0.L(r0)
            goto L88
        L2a:
            boolean r0 = r8.l
            if (r0 == 0) goto L41
            j$.util.stream.e r0 = r8.d
            j$.util.stream.f4 r0 = (j$.util.stream.f4) r0
            boolean r3 = r0.n
            if (r3 == 0) goto L41
            long r1 = r0.m
            r8.m = r1
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L41:
            j$.util.stream.e r0 = r8.d
            j$.util.stream.f4 r0 = (j$.util.stream.f4) r0
            long r3 = r0.m
            j$.util.stream.e r5 = r8.e
            j$.util.stream.f4 r5 = (j$.util.stream.f4) r5
            long r6 = r5.m
            long r3 = r3 + r6
            r8.m = r3
            long r3 = r0.m
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            java.lang.Object r0 = r5.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L5d:
            long r3 = r5.m
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L6a
            java.lang.Object r0 = r0.c()
            j$.util.stream.K0 r0 = (j$.util.stream.K0) r0
            goto L88
        L6a:
            j$.util.stream.b r0 = r8.j
            j$.util.stream.e3 r0 = r0.I()
            j$.util.stream.e r1 = r8.d
            j$.util.stream.f4 r1 = (j$.util.stream.f4) r1
            java.lang.Object r1 = r1.c()
            j$.util.stream.K0 r1 = (j$.util.stream.K0) r1
            j$.util.stream.e r2 = r8.e
            j$.util.stream.f4 r2 = (j$.util.stream.f4) r2
            java.lang.Object r2 = r2.c()
            j$.util.stream.K0 r2 = (j$.util.stream.K0) r2
            j$.util.stream.M0 r0 = j$.util.stream.AbstractC5551y0.I(r0, r1, r2)
        L88:
            r8.f(r0)
        L8b:
            r0 = 1
            r8.o = r0
            super.onCompletion(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.f4.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
