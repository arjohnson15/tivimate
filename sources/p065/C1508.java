package p065;

import java.util.Set;
import p072.AbstractC1642;
import p288.C3397;
import p423.C4883;

/* renamed from: ʾᵔ.ـˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1508 extends AbstractC1487 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ int f6125;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ Object f6126;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1508(String[] strArr, Object obj, int i) {
        super(strArr);
        this.f6125 = i;
        this.f6126 = obj;
    }

    @Override // p065.AbstractC1487
    /* renamed from: ـﹶ */
    public final void mo5057(Set set) {
        switch (this.f6125) {
            case 0:
                C1505 c1505 = (C1505) this.f6126;
                AbstractC1642.m5294(c1505.f6108.m5043(), null, 0, new C1491(c1505, null), 3);
                break;
            default:
                ((C4883) this.f6126).mo10958(C3397.f13249);
                break;
        }
    }
}
