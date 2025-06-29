package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class N2 extends B2 {
    private int[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void k() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC5509p2 interfaceC5509p2 = this.a;
        interfaceC5509p2.l(j);
        if (this.b) {
            while (i < this.d && !interfaceC5509p2.n()) {
                interfaceC5509p2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d) {
                interfaceC5509p2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC5509p2.k();
        this.c = null;
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }
}
