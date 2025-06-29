package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class I extends L implements InterfaceC5499n2 {
    static final G c;
    static final G d;

    static {
        EnumC5455e3 enumC5455e3 = EnumC5455e3.INT_VALUE;
        c = new G(true, enumC5455e3, j$.util.B.a(), new C5520s(2), new C5511q(5));
        d = new G(false, enumC5455e3, j$.util.B.a(), new C5520s(2), new C5511q(5));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        p(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.B.d(((Integer) this.b).intValue());
        }
        return null;
    }
}
