package p072;

import p070.AbstractC1549;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p330.InterfaceC3756;
import p338.InterfaceC3864;
import p395.AbstractC4535;
import ᴵﹳ.ٴˎ;

/* renamed from: ʿʽ.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1645 implements InterfaceC3750, InterfaceC3756 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final C1645 f6427 = new C1645();

    @Override // p330.InterfaceC3750
    public final InterfaceC3756 getKey() {
        return this;
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public final InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        return AbstractC4535.m10363(this, interfaceC3756);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public final InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        if (AbstractC1549.m5138(this, interfaceC3756)) {
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
