package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class M2 extends A2 {
    private double[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC5494m2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
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

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }
}
