package j$.util.stream;

import j$.util.AbstractC5414b;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5483k1 extends AbstractC5493m1 implements j$.util.X {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5414b.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5414b.g(this, consumer);
    }
}
