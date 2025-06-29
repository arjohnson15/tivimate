package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class P2 extends D2 {
    private Object[] d;
    private int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void k() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC5509p2 interfaceC5509p2 = this.a;
        interfaceC5509p2.l(j);
        if (this.c) {
            while (i < this.e && !interfaceC5509p2.n()) {
                interfaceC5509p2.accept((InterfaceC5509p2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                interfaceC5509p2.accept((InterfaceC5509p2) this.d[i]);
                i++;
            }
        }
        interfaceC5509p2.k();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}
