package p072;

import p148.C2271;

/* renamed from: ʿʽ.ʿˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1583 extends AbstractC1596 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final C1634 f6337;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final Object f6338;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final C1590 f6339;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final C1603 f6340;

    public C1583(C1634 c1634, C1590 c1590, C1603 c1603, Object obj) {
        this.f6337 = c1634;
        this.f6339 = c1590;
        this.f6340 = c1603;
        this.f6338 = obj;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˉי, reason: contains not printable characters */
    public final boolean mo5174() {
        return false;
    }

    @Override // p072.AbstractC1596
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final void mo5175(Throwable th) {
        C1603 c1603 = this.f6340;
        C1634 c1634 = this.f6337;
        c1634.getClass();
        C1603 c1603M5247 = C1634.m5247(c1603);
        C1590 c1590 = this.f6339;
        Object obj = this.f6338;
        if (c1603M5247 == null || !c1634.m5248(c1590, c1603M5247, obj)) {
            c1590.f6350.m6291(new C2271(2), 2);
            C1603 c1603M52472 = C1634.m5247(c1603);
            if (c1603M52472 == null || !c1634.m5248(c1590, c1603M52472, obj)) {
                c1634.mo5176(c1634.m5251(c1590, obj));
            }
        }
    }
}
