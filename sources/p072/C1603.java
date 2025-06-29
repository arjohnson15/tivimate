package p072;

/* renamed from: ʿʽ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1603 extends AbstractC1596 implements InterfaceC1623 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1634 f6373;

    public C1603(C1634 c1634) {
        this.f6373 = c1634;
    }

    @Override // p072.InterfaceC1623
    public final InterfaceC1643 getParent() {
        C1634 c1634 = this.f6356;
        if (c1634 != null) {
            return c1634;
        }
        return null;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˉי */
    public final boolean mo5174() {
        return true;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˏʾ */
    public final void mo5175(Throwable th) {
        C1634 c1634 = this.f6356;
        if (c1634 == null) {
            c1634 = null;
        }
        this.f6373.m5254(c1634);
    }

    @Override // p072.InterfaceC1623
    /* renamed from: ˑʽ */
    public final boolean mo5178(Throwable th) {
        C1634 c1634 = this.f6356;
        if (c1634 == null) {
            c1634 = null;
        }
        return c1634.mo3958(th);
    }
}
