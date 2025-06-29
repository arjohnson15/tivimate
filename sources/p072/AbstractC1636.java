package p072;

import p148.AbstractC2269;
import p148.C2270;
import p330.AbstractC3745;
import p330.AbstractC3752;
import p330.C3749;
import p330.C3753;
import p330.InterfaceC3747;
import p330.InterfaceC3750;
import p330.InterfaceC3754;
import p330.InterfaceC3756;

/* renamed from: ʿʽ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1636 extends AbstractC3752 implements InterfaceC3754 {
    public AbstractC1636() {
        super(C3753.f14515);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1642.m5290(this);
    }

    @Override // p330.AbstractC3752, p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public final InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        boolean z;
        boolean z2 = interfaceC3756 instanceof AbstractC3745;
        C3749 c3749 = C3749.f14510;
        if (z2) {
            AbstractC3745 abstractC3745 = (AbstractC3745) interfaceC3756;
            if (this.f14514 != abstractC3745) {
                abstractC3745.getClass();
                z = false;
            } else {
                abstractC3745.getClass();
                z = true;
            }
            if (z) {
                abstractC3745.getClass();
                throw null;
            }
        } else if (C3753.f14515 == interfaceC3756) {
            return c3749;
        }
        return this;
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public void mo5275(InterfaceC3747 interfaceC3747, Runnable runnable) {
        mo5198(interfaceC3747, runnable);
    }

    /* renamed from: ˈﹳ */
    public abstract void mo5198(InterfaceC3747 interfaceC3747, Runnable runnable);

    @Override // p330.AbstractC3752, p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public final InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        boolean z;
        if (!(interfaceC3756 instanceof AbstractC3745)) {
            if (C3753.f14515 == interfaceC3756) {
                return this;
            }
            return null;
        }
        AbstractC3745 abstractC3745 = (AbstractC3745) interfaceC3756;
        if (this.f14514 != abstractC3745) {
            abstractC3745.getClass();
            z = false;
        } else {
            abstractC3745.getClass();
            z = true;
        }
        if (!z) {
            return null;
        }
        abstractC3745.getClass();
        throw null;
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public boolean mo5276(InterfaceC3747 interfaceC3747) {
        return !(this instanceof C1606);
    }

    /* renamed from: ٴﹶ */
    public AbstractC1636 mo5222(int i, String str) {
        AbstractC2269.m6283(i);
        return new C2270(this, i, str);
    }
}
