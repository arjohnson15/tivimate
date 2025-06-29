package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class S implements J3, K3 {
    private final boolean a;

    protected S(boolean z) {
        this.a = z;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC5551y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC5551y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC5551y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.J3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return EnumC5450d3.r;
    }

    public final void e(AbstractC5436b abstractC5436b, Spliterator spliterator) {
        if (this.a) {
            new T(abstractC5436b, spliterator, this).invoke();
        } else {
            new U(abstractC5436b, spliterator, abstractC5436b.W(this)).invoke();
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
