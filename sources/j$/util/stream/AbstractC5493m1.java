package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5493m1 extends AbstractC5503o1 implements j$.util.d0 {
    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((j$.util.d0) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            J0 j0 = (J0) AbstractC5503o1.a(arrayDequeB);
            if (j0 == null) {
                this.a = null;
                return;
            }
            j0.e(obj);
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        J0 j0;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.d0) this.d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.c == null && (j0 = (J0) AbstractC5503o1.a(this.e)) != null) {
                j$.util.d0 d0VarSpliterator = j0.spliterator();
                this.d = d0VarSpliterator;
                return d0VarSpliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
