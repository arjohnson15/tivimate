package p065;

import java.lang.ref.WeakReference;
import java.util.Set;
import p072.AbstractC1642;
import p072.InterfaceC1594;

/* renamed from: ʾᵔ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1489 extends AbstractC1487 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C1500 f6066;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final InterfaceC1594 f6067;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final WeakReference f6068;

    public C1489(C1500 c1500, InterfaceC1594 interfaceC1594, C1508 c1508) {
        super(c1508.f6064);
        this.f6066 = c1500;
        this.f6067 = interfaceC1594;
        this.f6068 = new WeakReference(c1508);
    }

    @Override // p065.AbstractC1487
    /* renamed from: ـﹶ */
    public final void mo5057(Set set) {
        AbstractC1487 abstractC1487 = (AbstractC1487) this.f6068.get();
        if (abstractC1487 != null) {
            abstractC1487.mo5057(set);
        } else {
            AbstractC1642.m5294(this.f6067, null, 0, new C1499(this, null), 3);
        }
    }
}
