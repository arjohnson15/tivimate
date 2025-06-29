package j$.util.stream;

import j$.util.AbstractC5414b;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class L2 extends D2 {
    private ArrayList d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void k() {
        AbstractC5414b.w(this.d, this.b);
        long size = this.d.size();
        InterfaceC5509p2 interfaceC5509p2 = this.a;
        interfaceC5509p2.l(size);
        if (this.c) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC5509p2.n()) {
                    break;
                } else {
                    interfaceC5509p2.p((InterfaceC5509p2) next);
                }
            }
        } else {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(interfaceC5509p2);
            AbstractC5414b.q(arrayList, new C5431a(1, interfaceC5509p2));
        }
        interfaceC5509p2.k();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
