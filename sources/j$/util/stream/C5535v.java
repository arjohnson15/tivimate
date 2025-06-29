package j$.util.stream;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5535v extends B {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5535v(AbstractC5436b abstractC5436b, int i, int i2) {
        super(abstractC5436b, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        switch (this.m) {
            case 0:
                return new C5525t(this, interfaceC5509p2, 1);
            case 1:
                return interfaceC5509p2;
            case 2:
                return new C5525t(this, interfaceC5509p2, 4);
            case 3:
                return new Y(1, interfaceC5509p2);
            case 4:
                return new W(this, interfaceC5509p2, 4);
            case 5:
                return new C5457f0(interfaceC5509p2);
            default:
                return new C5452e0(this, interfaceC5509p2, 3);
        }
    }
}
