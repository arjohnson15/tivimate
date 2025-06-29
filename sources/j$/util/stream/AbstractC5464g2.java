package j$.util.stream;

/* renamed from: j$.util.stream.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5464g2 extends AbstractC5469h2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5464g2(AbstractC5436b abstractC5436b, int i, int i2) {
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
        return new C5454e2(this, EnumC5450d3.r, 1);
    }
}
