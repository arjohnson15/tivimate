package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
abstract class C3 extends F3 implements j$.util.d0 {
    protected abstract void e(Object obj);

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC5480j3 abstractC5480j3H = null;
        while (true) {
            E3 e3D = d();
            if (e3D == E3.NO_MORE) {
                return;
            }
            E3 e3 = E3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (e3D != e3) {
                ((j$.util.d0) spliterator).forEachRemaining(obj);
                return;
            }
            int i = this.c;
            if (abstractC5480j3H == null) {
                abstractC5480j3H = h(i);
            } else {
                abstractC5480j3H.b = 0;
            }
            long j = 0;
            while (((j$.util.d0) spliterator).tryAdvance(abstractC5480j3H)) {
                j++;
                if (j >= i) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                abstractC5480j3H.b(obj, b(j));
            }
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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC5414b.d(this);
    }

    protected abstract AbstractC5480j3 h(int i);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC5414b.e(this, i);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != E3.NO_MORE && ((j$.util.d0) this.a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
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
