package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5503o1 implements Spliterator {
    K0 a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    AbstractC5503o1(K0 k0) {
        this.a = k0;
    }

    protected static K0 a(ArrayDeque arrayDeque) {
        while (true) {
            K0 k0 = (K0) arrayDeque.pollFirst();
            if (k0 == null) {
                return null;
            }
            if (k0.q() != 0) {
                for (int iQ = k0.q() - 1; iQ >= 0; iQ--) {
                    arrayDeque.addFirst(k0.b(iQ));
                }
            } else if (k0.count() > 0) {
                return k0;
            }
        }
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iQ = this.a.q();
        while (true) {
            iQ--;
            if (iQ < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.b(iQ));
        }
    }

    protected final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            this.d = spliterator;
            return true;
        }
        ArrayDeque arrayDequeB = b();
        this.e = arrayDequeB;
        K0 k0A = a(arrayDequeB);
        if (k0A != null) {
            this.d = k0A.spliterator();
            return true;
        }
        this.a = null;
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.q(); i++) {
            jCount += this.a.b(i).count();
        }
        return jCount;
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

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        K0 k0 = this.a;
        if (k0 == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < k0.q() - 1) {
            K0 k02 = this.a;
            int i = this.b;
            this.b = i + 1;
            return k02.b(i).spliterator();
        }
        K0 k0B = this.a.b(this.b);
        this.a = k0B;
        if (k0B.q() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        K0 k03 = this.a;
        this.b = 1;
        return k03.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.U trySplit() {
        return (j$.util.U) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.X trySplit() {
        return (j$.util.X) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return (j$.util.a0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        return (j$.util.d0) trySplit();
    }
}
