package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5516r0 extends AbstractC5531u0 implements InterfaceC5499n2 {
    @Override // j$.util.stream.AbstractC5531u0, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5499n2
    public final /* synthetic */ void m(Integer num) {
        AbstractC5551y0.g(this, num);
    }
}
