package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5555z extends B {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5555z(C c, DoubleConsumer doubleConsumer) {
        super(c, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5555z(AbstractC5436b abstractC5436b, int i, Object obj, int i2) {
        super(abstractC5436b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        switch (this.m) {
            case 0:
                return new C5550y(this, interfaceC5509p2);
            case 1:
                return new C5525t(this, interfaceC5509p2, 5);
            case 2:
                return new C5496n(this, interfaceC5509p2, 6);
            default:
                return new C5449d2(this, interfaceC5509p2);
        }
    }
}
