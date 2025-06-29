package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5467h0 extends AbstractC5477j0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5467h0(AbstractC5436b abstractC5436b, int i, Object obj, int i2) {
        super(abstractC5436b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5467h0(AbstractC5482k0 abstractC5482k0, LongConsumer longConsumer) {
        super(abstractC5482k0, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        switch (this.m) {
            case 0:
                return new C5462g0(this, interfaceC5509p2);
            case 1:
                return new C5452e0(this, interfaceC5509p2, 5);
            case 2:
                return new C5449d2(this, interfaceC5509p2);
            default:
                return new C5496n(this, interfaceC5509p2, 5);
        }
    }
}
