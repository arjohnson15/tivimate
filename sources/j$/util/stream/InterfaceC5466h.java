package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5466h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC5466h onClose(Runnable runnable);

    InterfaceC5466h parallel();

    InterfaceC5466h sequential();

    Spliterator spliterator();

    InterfaceC5466h unordered();
}
