package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class D2 extends AbstractC5489l2 {
    protected final Comparator b;
    protected boolean c;

    D2(InterfaceC5509p2 interfaceC5509p2, Comparator comparator) {
        super(interfaceC5509p2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final boolean n() {
        this.c = true;
        return false;
    }
}
