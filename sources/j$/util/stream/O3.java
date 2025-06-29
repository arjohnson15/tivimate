package j$.util.stream;

/* loaded from: classes2.dex */
final class O3 extends AbstractC5489l2 implements d4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ P3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O3(P3 p3, InterfaceC5509p2 interfaceC5509p2, boolean z) {
        super(interfaceC5509p2);
        this.e = p3;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.c
            if (r0 != 0) goto L15
            j$.util.stream.P3 r0 = r6.e
            java.util.function.Predicate r0 = r0.m
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.b
            r4 = 1
            long r2 = r2 + r4
            r6.b = r2
        L23:
            if (r1 != 0) goto L27
            if (r0 == 0) goto L2c
        L27:
            j$.util.stream.p2 r0 = r6.a
            r0.accept(r7)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.O3.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.d4
    public final long f() {
        return this.b;
    }
}
