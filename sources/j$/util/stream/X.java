package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class X extends AbstractC5437b0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC5436b abstractC5436b, int i, Object obj, int i2) {
        super(abstractC5436b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AbstractC5442c0 abstractC5442c0, IntConsumer intConsumer) {
        super(abstractC5442c0, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        switch (this.m) {
            case 0:
                return new W(this, interfaceC5509p2, 1);
            case 1:
                return new Z(this, interfaceC5509p2);
            case 2:
                return new C5496n(this, interfaceC5509p2, 4);
            default:
                return new C5449d2(this, interfaceC5509p2);
        }
    }
}
