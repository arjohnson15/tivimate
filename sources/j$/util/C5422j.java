package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5422j extends C5420h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C5420h(this.c);
    }

    @Override // j$.util.C5420h, java.util.List
    public final java.util.List subList(int i, int i2) {
        C5422j c5422j;
        synchronized (this.b) {
            c5422j = new C5422j(this.c.subList(i, i2), this.b);
        }
        return c5422j;
    }
}
