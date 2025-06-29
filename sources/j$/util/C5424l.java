package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5424l implements Iterator, InterfaceC5565y {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    public C5424l(C5425m c5425m) {
        this.b = c5425m.a.iterator();
    }

    public C5424l(C5430s c5430s) {
        this.b = c5430s.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC5565y
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                AbstractC5414b.s(this.b, consumer);
                break;
            default:
                AbstractC5414b.s(this.b, new C5428p(consumer));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C5429q((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
