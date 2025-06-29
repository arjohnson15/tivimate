package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5449d2 extends AbstractC5489l2 {
    public final /* synthetic */ int b = 1;
    boolean c;
    Object d;
    final /* synthetic */ AbstractC5436b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5449d2(X x, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.e = x;
        InterfaceC5509p2 interfaceC5509p22 = this.a;
        Objects.requireNonNull(interfaceC5509p22);
        this.d = new V(interfaceC5509p22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5449d2(C5467h0 c5467h0, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.e = c5467h0;
        InterfaceC5509p2 interfaceC5509p22 = this.a;
        Objects.requireNonNull(interfaceC5509p22);
        this.d = new C5447d0(interfaceC5509p22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5449d2(C5555z c5555z, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.e = c5555z;
        InterfaceC5509p2 interfaceC5509p22 = this.a;
        Objects.requireNonNull(interfaceC5509p22);
        this.d = new C5506p(interfaceC5509p22);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                InterfaceC5497n0 interfaceC5497n0 = (InterfaceC5497n0) ((C5431a) ((C5467h0) this.e).n).apply((C5431a) obj);
                if (interfaceC5497n0 != null) {
                    try {
                        boolean z = this.c;
                        C5447d0 c5447d0 = (C5447d0) this.d;
                        if (z) {
                            j$.util.a0 a0VarSpliterator = interfaceC5497n0.sequential().spliterator();
                            while (!this.a.n() && a0VarSpliterator.tryAdvance((LongConsumer) c5447d0)) {
                            }
                        } else {
                            interfaceC5497n0.sequential().forEach(c5447d0);
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC5497n0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC5497n0 != null) {
                    interfaceC5497n0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((C5431a) ((X) this.e).n).apply((C5431a) obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        V v = (V) this.d;
                        if (z2) {
                            j$.util.X xSpliterator = intStream.sequential().spliterator();
                            while (!this.a.n() && xSpliterator.tryAdvance((IntConsumer) v)) {
                            }
                        } else {
                            intStream.sequential().forEach(v);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                F f = (F) ((C5431a) ((C5555z) this.e).n).apply((C5431a) obj);
                if (f != null) {
                    try {
                        boolean z3 = this.c;
                        C5506p c5506p = (C5506p) this.d;
                        if (z3) {
                            j$.util.U uSpliterator = f.sequential().spliterator();
                            while (!this.a.n() && uSpliterator.tryAdvance((DoubleConsumer) c5506p)) {
                            }
                        } else {
                            f.sequential().forEach(c5506p);
                        }
                    } catch (Throwable th5) {
                        try {
                            f.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (f != null) {
                    f.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.n();
    }
}
