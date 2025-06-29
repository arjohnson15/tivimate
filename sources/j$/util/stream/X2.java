package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
abstract class X2 implements j$.util.d0 {
    int a;
    final int b;
    int c;
    final int d;
    Object e;
    final /* synthetic */ Y2 f;

    X2(Y2 y2, int i, int i2, int i3, int i4) {
        this.f = y2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[] objArr = y2.f;
        this.e = objArr == null ? y2.e : objArr[i];
    }

    abstract void a(int i, Object obj, Object obj2);

    abstract j$.util.d0 b(Object obj, int i, int i2);

    abstract j$.util.d0 c(int i, int i2, int i3, int i4);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return i2 - this.c;
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + i2) - jArr[i]) - this.c;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        Y2 y2;
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                y2 = this.f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = y2.f[i];
                y2.s(obj2, i4, y2.t(obj2), obj);
                i++;
                i4 = 0;
            }
            y2.s(this.a == i3 ? this.e : y2.f[i3], i4, i2, obj);
            this.a = i3;
            this.c = i2;
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

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC5414b.e(this, i);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object obj2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        a(i3, obj2, obj);
        int i4 = this.c;
        Object obj3 = this.e;
        Y2 y2 = this.f;
        if (i4 == y2.t(obj3)) {
            this.c = 0;
            int i5 = this.a + 1;
            this.a = i5;
            Object[] objArr = y2.f;
            if (objArr != null && i5 <= i2) {
                this.e = objArr[i5];
            }
        }
        return true;
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

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.U trySplit() {
        return (j$.util.U) trySplit();
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.X trySplit() {
        return (j$.util.X) trySplit();
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return (j$.util.a0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            Y2 y2 = this.f;
            j$.util.d0 d0VarC = c(i, i3, i4, y2.t(y2.f[i3]));
            this.a = i2;
            this.c = 0;
            this.e = y2.f[i2];
            return d0VarC;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        j$.util.d0 d0VarB = b(this.e, i5, i6);
        this.c += i6;
        return d0VarB;
    }
}
