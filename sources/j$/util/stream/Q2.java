package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class Q2 implements Spliterator {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final /* synthetic */ Z2 f;

    Q2(Z2 z2, int i, int i2, int i3, int i4) {
        this.f = z2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr = z2.f;
        this.e = objArr == null ? z2.e : objArr[i];
    }

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

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Z2 z2;
        Objects.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                z2 = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = z2.f[i];
                while (i4 < objArr.length) {
                    consumer.p(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.a == i3 ? this.e : z2.f[i3];
            while (i4 < i2) {
                consumer.p(objArr2[i4]);
                i4++;
            }
            this.a = i3;
            this.c = i2;
        }
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
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.p(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            Z2 z2 = this.f;
            Q2 q2 = new Q2(z2, i, i3, i4, z2.f[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = z2.f[i2];
            return q2;
        }
        if (i != i2) {
            return null;
        }
        int i5 = this.c;
        int i6 = (this.d - i5) / 2;
        if (i6 == 0) {
            return null;
        }
        Spliterator spliteratorM = Spliterators.m(this.e, i5, i5 + i6);
        this.c += i6;
        return spliteratorM;
    }
}
