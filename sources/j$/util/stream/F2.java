package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class F2 extends B2 {
    private U2 c;

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        this.c.accept(i);
    }

    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void k() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC5509p2 interfaceC5509p2 = this.a;
        interfaceC5509p2.l(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (interfaceC5509p2.n()) {
                    break;
                }
                interfaceC5509p2.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                interfaceC5509p2.accept(iArr[i]);
                i++;
            }
        }
        interfaceC5509p2.k();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.U2, j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.Y2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.Y2] */
    @Override // j$.util.stream.AbstractC5479j2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = j > 0 ? new U2((int) j) : new Y2();
    }
}
