package p438;

import p072.AbstractC1642;
import p072.C1584;
import p072.InterfaceC1643;
import p123.C1995;
import p166.C2396;
import p166.InterfaceC2446;
import p185.AbstractC2567;
import p330.InterfaceC3747;
import p338.InterfaceC3864;
import p383.InterfaceC4461;
import p385.RunnableC4478;
import p410.C4680;
import p410.C4682;
import p410.InterfaceC4689;
import p439.InterfaceC5123;
import p444.C5152;
import p457.C5384;
import p457.EnumC5364;

/* renamed from: ﹶﾞ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C5087 implements InterfaceC4461, InterfaceC5123, InterfaceC4689 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f19331;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19332;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f19333;

    public /* synthetic */ C5087(int i, C2396 c2396, C2396 c23962) {
        this.f19333 = i;
        this.f19331 = c2396;
        this.f19332 = c23962;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C5087(InterfaceC3747 interfaceC3747, int i, InterfaceC3864 interfaceC3864) {
        this.f19331 = interfaceC3747;
        this.f19333 = i;
        this.f19332 = (AbstractC2567) interfaceC3864;
    }

    public /* synthetic */ C5087(C5152 c5152, C1995 c1995, int i) {
        this.f19331 = c5152;
        this.f19332 = c1995;
        this.f19333 = i;
    }

    @Override // p383.InterfaceC4461
    /* renamed from: ʽᐧ */
    public void mo4092(Object obj) {
        InterfaceC2446 interfaceC2446 = (InterfaceC2446) obj;
        interfaceC2446.getClass();
        interfaceC2446.mo4349(this.f19333, (C2396) this.f19331, (C2396) this.f19332);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p410.InterfaceC4689
    /* renamed from: ˑʽ */
    public Object mo4248(C4682 c4682) {
        C1584 c1584 = C1584.f6341;
        InterfaceC3747 interfaceC3747 = (InterfaceC3747) this.f19331;
        RunnableC4478 runnableC4478 = new RunnableC4478(3, (InterfaceC1643) interfaceC3747.mo3966(c1584));
        EnumC5364 enumC5364 = EnumC5364.f20823;
        C4680 c4680 = c4682.f17818;
        if (c4680 != null) {
            c4680.mo10415(runnableC4478, enumC5364);
        }
        return AbstractC1642.m5294(AbstractC1642.m5296(interfaceC3747), null, this.f19333, new C5384((AbstractC2567) this.f19332, c4682, null), 1);
    }

    @Override // p439.InterfaceC5123
    /* renamed from: ـﹶ */
    public Object mo4249() {
        ((C5152) this.f19331).f19696.m11453((C1995) this.f19332, this.f19333 + 1, false);
        return null;
    }
}
