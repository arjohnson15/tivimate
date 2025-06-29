package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5526t0 extends AbstractC5531u0 implements InterfaceC5494m2 {
    @Override // j$.util.stream.AbstractC5531u0, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        if (this.a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC5494m2
    public final /* synthetic */ void p(Double d) {
        AbstractC5551y0.e(this, d);
    }
}
