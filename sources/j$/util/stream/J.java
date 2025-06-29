package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class J extends L implements InterfaceC5504o2 {
    static final G c;
    static final G d;

    static {
        EnumC5455e3 enumC5455e3 = EnumC5455e3.LONG_VALUE;
        c = new G(true, enumC5455e3, j$.util.C.a(), new C5520s(3), new C5511q(6));
        d = new G(false, enumC5455e3, j$.util.C.a(), new C5520s(3), new C5511q(6));
    }

    @Override // j$.util.stream.L, j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        p(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.C.d(((Long) this.b).longValue());
        }
        return null;
    }
}
