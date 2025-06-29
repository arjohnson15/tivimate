package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5495m3 implements Spliterator, Consumer {
    private static final Object d = new Object();
    private final Spliterator a;
    private final ConcurrentHashMap b;
    private Object c;

    C5495m3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C5495m3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.a = spliterator;
        this.b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        this.c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    final void b(Consumer consumer, Object obj) {
        if (this.b.putIfAbsent(obj != null ? obj : d, Boolean.TRUE) == null) {
            consumer.p(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new C5507p0(1, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
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
        while (this.a.tryAdvance(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = d;
            }
            if (this.b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.p(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C5495m3(spliteratorTrySplit, this.b);
        }
        return null;
    }
}
