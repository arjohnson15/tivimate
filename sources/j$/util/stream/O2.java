package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class O2 extends C2 {
    private long[] c;
    private int d;

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        long[] jArr = this.c;
        int i = this.d;
        this.d = i + 1;
        jArr[i] = j;
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
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

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[(int) j];
    }
}
