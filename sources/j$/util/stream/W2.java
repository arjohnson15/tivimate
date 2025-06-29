package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
class W2 extends Y2 implements LongConsumer {
    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        x();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.Y2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            e((LongConsumer) consumer);
        } else {
            if (M3.a) {
                M3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC5414b.c((V2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.Y2
    protected final void s(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Y2
    protected final int t(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.Y2
    protected final Object[] w() {
        return new long[8][];
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.a0 spliterator() {
        return new V2(this, 0, this.c, 0, this.b);
    }
}
