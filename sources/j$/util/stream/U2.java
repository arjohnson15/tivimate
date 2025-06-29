package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
class U2 extends Y2 implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        x();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.Y2
    public final Object c(int i) {
        return new int[i];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e((IntConsumer) consumer);
        } else {
            if (M3.a) {
                M3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC5414b.b((T2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.Y2
    protected final void s(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Y2
    protected final int t(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.Y2
    protected final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.X spliterator() {
        return new T2(this, 0, this.c, 0, this.b);
    }
}
