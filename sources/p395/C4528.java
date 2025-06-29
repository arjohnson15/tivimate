package p395;

/* renamed from: ⁱـ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4528 extends Throwable {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f17407;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4528(String str, int i) {
        super(str);
        this.f17407 = i;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private final synchronized Throwable m10302() {
        return this;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    private final synchronized Throwable m10303() {
        return this;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    private final synchronized Throwable m10304() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f17407) {
            case 0:
                m10304();
                break;
            case 1:
                m10302();
                break;
            default:
                m10303();
                break;
        }
        return this;
    }
}
