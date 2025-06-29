package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5521s0 extends AbstractC5531u0 implements InterfaceC5504o2 {
    @Override // j$.util.stream.AbstractC5531u0, j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5504o2
    public final /* synthetic */ void j(Long l) {
        AbstractC5551y0.i(this, l);
    }
}
