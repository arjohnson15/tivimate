package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class G2 extends C2 {
    private W2 c;

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(j);
    }

    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final void k() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC5509p2 interfaceC5509p2 = this.a;
        interfaceC5509p2.l(length);
        int i = 0;
        if (this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (interfaceC5509p2.n()) {
                    break;
                }
                interfaceC5509p2.accept(j);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                interfaceC5509p2.accept(jArr[i]);
                i++;
            }
        }
        interfaceC5509p2.k();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.W2, j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Y2] */
    @Override // j$.util.stream.AbstractC5484k2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new W2((int) j) : new Y2();
    }
}
