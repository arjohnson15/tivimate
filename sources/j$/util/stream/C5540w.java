package j$.util.stream;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5540w extends AbstractC5437b0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5540w(AbstractC5436b abstractC5436b, int i, int i2) {
        super(abstractC5436b, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        switch (this.m) {
            case 0:
                return new C5525t(this, interfaceC5509p2, 2);
            case 1:
                return new W(this, interfaceC5509p2, 2);
            case 2:
                return interfaceC5509p2;
            case 3:
                return new W(this, interfaceC5509p2, 5);
            default:
                return new C5452e0(this, interfaceC5509p2, 2);
        }
    }
}
