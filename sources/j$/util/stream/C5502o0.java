package j$.util.stream;

import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5502o0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC5536v0 b;

    public /* synthetic */ C5502o0(EnumC5536v0 enumC5536v0, int i) {
        this.a = i;
        this.b = enumC5536v0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C5521s0(this.b);
            case 1:
                return new C5516r0(this.b);
            default:
                return new C5526t0(this.b);
        }
    }
}
