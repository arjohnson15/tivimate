package j$.util;

/* loaded from: classes2.dex */
public interface d0 extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    d0 trySplit();
}
