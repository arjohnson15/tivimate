package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5437b0 extends AbstractC5442c0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5437b0(AbstractC5436b abstractC5436b, int i, int i2) {
        super(abstractC5436b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC5436b
    final boolean Q() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h, j$.util.stream.F
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC5436b, j$.util.stream.InterfaceC5466h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.l) {
        }
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC5466h
    public final InterfaceC5466h unordered() {
        switch (this.l) {
            case 0:
                if (!L()) {
                    break;
                } else {
                    break;
                }
            default:
                if (!L()) {
                    break;
                } else {
                    break;
                }
        }
        return new C5540w(this, EnumC5450d3.r, 2);
    }
}
