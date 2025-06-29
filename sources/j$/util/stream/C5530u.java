package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5530u extends AbstractC5464g2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5530u(AbstractC5436b abstractC5436b, int i, Object obj, int i2) {
        super(abstractC5436b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5530u(AbstractC5469h2 abstractC5469h2, Consumer consumer) {
        super(abstractC5469h2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }

    @Override // j$.util.stream.AbstractC5436b
    final InterfaceC5509p2 R(int i, InterfaceC5509p2 interfaceC5509p2) {
        switch (this.m) {
            case 0:
                return new C5525t(this, interfaceC5509p2, 0);
            case 1:
                return new W(this, interfaceC5509p2, 0);
            case 2:
                return new C5452e0(this, interfaceC5509p2, 0);
            case 3:
                return new C5496n(this, interfaceC5509p2, 1);
            case 4:
                return new C5496n(this, interfaceC5509p2, 2);
            case 5:
                return new C5496n(this, interfaceC5509p2, 3);
            default:
                return new C5491m(this, interfaceC5509p2);
        }
    }
}
