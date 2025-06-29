package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5512q0 extends AbstractC5531u0 {
    final /* synthetic */ EnumC5536v0 c;
    final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5512q0(EnumC5536v0 enumC5536v0, Predicate predicate) {
        super(enumC5536v0);
        this.c = enumC5536v0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC5536v0 enumC5536v0 = this.c;
        if (zTest == enumC5536v0.a) {
            this.a = true;
            this.b = enumC5536v0.b;
        }
    }
}
