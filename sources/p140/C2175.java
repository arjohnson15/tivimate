package p140;

import p070.AbstractC1549;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p330.InterfaceC3756;
import p338.InterfaceC3864;
import p395.AbstractC4535;
import ᴵﹳ.ٴˎ;
import ﹳᴵ.ˉי;

/* renamed from: ˉˏ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2175 implements InterfaceC3750 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final ˉי f8547 = new ˉי(18);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2185 f8548;

    public C2175(C2185 c2185) {
        this.f8548 = c2185;
    }

    @Override // p330.InterfaceC3750
    public final InterfaceC3756 getKey() {
        return f8547;
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public final InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        return AbstractC4535.m10363(this, interfaceC3756);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public final InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        if (AbstractC1549.m5138(f8547, interfaceC3756)) {
            return this;
        }
        return null;
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ᐧˋ */
    public final InterfaceC3747 mo3967(InterfaceC3747 interfaceC3747) {
        return ٴˎ.ˋⁱ(this, interfaceC3747);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ﾞʽ */
    public final Object mo3968(Object obj, InterfaceC3864 interfaceC3864) {
        return interfaceC3864.mo1054(obj, this);
    }
}
