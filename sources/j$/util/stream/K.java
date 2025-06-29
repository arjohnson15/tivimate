package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
final class K extends L {
    static final G c;
    static final G d;

    static {
        EnumC5455e3 enumC5455e3 = EnumC5455e3.REFERENCE;
        c = new G(true, enumC5455e3, Optional.a(), new C5520s(4), new C5511q(7));
        d = new G(false, enumC5455e3, Optional.a(), new C5520s(4), new C5511q(7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.d(this.b);
        }
        return null;
    }
}
