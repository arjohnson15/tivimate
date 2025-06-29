package p187;

import p079.C1697;
import p088.C1739;
import p120.C1865;
import p180.InterfaceC2498;
import p224.C2981;
import p224.C2982;
import p432.C5024;
import p432.C5025;
import p432.C5027;

/* renamed from: ˎʽ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2608 implements InterfaceC2498 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f10383;

    @Override // p180.InterfaceC2498
    /* renamed from: ʽᐧ */
    public final Object mo6608() {
        switch (this.f10383) {
            case 0:
                C2982 c2982 = new C2982();
                c2982.f11475 = null;
                C1865 c1865 = new C1865();
                c1865.f7123 = c2982;
                c1865.f7126 = new byte[8];
                c1865.f7122 = 0;
                c1865.f7124 = false;
                C1739 c1739 = new C1739(1);
                c1739.f6747 = c1865;
                return c1739;
            case 1:
                C2981 c2981 = new C2981();
                c2981.f11460 = null;
                c2981.f11458 = 0;
                c2981.f11459 = 0;
                c2981.f11461 = null;
                C1739 c17392 = new C1739(2);
                c17392.f6747 = c2981;
                return c17392;
            case 2:
                return new C1697(new C5027());
            case 3:
                C5025 c5025 = new C5025();
                c5025.f19070 = new int[16];
                c5025.mo11124();
                return new C1697(c5025);
            case 4:
                return new C5027();
            default:
                C5024 c5024 = new C5024();
                c5024.f19064 = new int[16];
                c5024.mo11124();
                return c5024;
        }
    }
}
