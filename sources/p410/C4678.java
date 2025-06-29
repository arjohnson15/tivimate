package p410;

/* renamed from: ﹳˎ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4678 extends AbstractC4686 {

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C4681 f17812;

    public C4678(C4681 c4681) {
        this.f17812 = c4681;
    }

    @Override // p410.AbstractC4686
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final String mo10582() {
        C4682 c4682 = (C4682) this.f17812.f17816.get();
        if (c4682 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c4682.f17819 + "]";
    }
}
