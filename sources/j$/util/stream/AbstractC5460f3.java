package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5460f3 implements Spliterator {
    final boolean a;
    final AbstractC5436b b;
    private Supplier c;
    Spliterator d;
    InterfaceC5509p2 e;
    BooleanSupplier f;
    long g;
    AbstractC5446d h;
    boolean i;

    AbstractC5460f3(AbstractC5436b abstractC5436b, Spliterator spliterator, boolean z) {
        this.b = abstractC5436b;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }

    AbstractC5460f3(AbstractC5436b abstractC5436b, Supplier supplier, boolean z) {
        this.b = abstractC5436b;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    private boolean b() {
        while (this.h.count() == 0) {
            if (this.e.n() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.k();
                this.i = true;
            }
        }
        return true;
    }

    final boolean a() {
        AbstractC5446d abstractC5446d = this.h;
        if (abstractC5446d == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.l(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC5446d.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int iC = EnumC5450d3.C(this.b.K()) & EnumC5450d3.f;
        return (iC & 64) != 0 ? (iC & (-16449)) | (this.d.characteristics() & 16448) : iC;
    }

    abstract void d();

    abstract AbstractC5460f3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC5414b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC5450d3.SIZED.s(this.b.K())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC5414b.e(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }
}
