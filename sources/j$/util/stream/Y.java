package j$.util.stream;

/* loaded from: classes2.dex */
final class Y extends AbstractC5479j2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
