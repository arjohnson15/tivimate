package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class E2 extends A2 {
    private S2 c;

    @Override // j$.util.stream.InterfaceC5494m2, j$.util.stream.InterfaceC5509p2
    public final void accept(double d) {
        this.c.accept(d);
    }

    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final void k() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC5509p2 interfaceC5509p2 = this.a;
        interfaceC5509p2.l(length);
        int i = 0;
        if (this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (interfaceC5509p2.n()) {
                    break;
                }
                interfaceC5509p2.accept(d);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                interfaceC5509p2.accept(dArr[i]);
                i++;
            }
        }
        interfaceC5509p2.k();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.S2, j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Y2] */
    @Override // j$.util.stream.AbstractC5474i2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new S2((int) j) : new Y2();
    }
}
