package p330;

import p070.AbstractC1549;
import p338.InterfaceC3864;
import p395.AbstractC4535;
import ᴵﹳ.ٴˎ;

/* renamed from: ᴵⁱ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3752 implements InterfaceC3750 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3756 f14514;

    public AbstractC3752(InterfaceC3756 interfaceC3756) {
        this.f14514 = interfaceC3756;
    }

    @Override // p330.InterfaceC3750
    public final InterfaceC3756 getKey() {
        return this.f14514;
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        return AbstractC4535.m10363(this, interfaceC3756);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        if (AbstractC1549.m5138(getKey(), interfaceC3756)) {
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
