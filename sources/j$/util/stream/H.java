package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class H extends L implements InterfaceC5494m2 {
    static final G c;
    static final G d;

    static {
        EnumC5455e3 enumC5455e3 = EnumC5455e3.DOUBLE_VALUE;
        c = new G(true, enumC5455e3, j$.util.A.a(), new C5520s(1), new C5511q(4));
        d = new G(false, enumC5455e3, j$.util.A.a(), new C5520s(1), new C5511q(4));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC5509p2
    public final void accept(double d2) {
        p(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.A.d(((Double) this.b).doubleValue());
        }
        return null;
    }
}
