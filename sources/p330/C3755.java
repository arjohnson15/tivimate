package p330;

import java.io.Serializable;
import p070.AbstractC1549;
import p338.InterfaceC3864;
import ـˈ.ˉᵎ;
import ᴵﹳ.ٴˎ;

/* renamed from: ᴵⁱ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3755 implements InterfaceC3747, Serializable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC3750 f14516;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final InterfaceC3747 f14517;

    public C3755(InterfaceC3747 interfaceC3747, InterfaceC3750 interfaceC3750) {
        this.f14517 = interfaceC3747;
        this.f14516 = interfaceC3750;
    }

    public final boolean equals(Object obj) {
        boolean zM5138;
        if (this != obj) {
            if (!(obj instanceof C3755)) {
                return false;
            }
            C3755 c3755 = (C3755) obj;
            c3755.getClass();
            int i = 2;
            C3755 c37552 = c3755;
            int i2 = 2;
            while (true) {
                InterfaceC3747 interfaceC3747 = c37552.f14517;
                c37552 = interfaceC3747 instanceof C3755 ? (C3755) interfaceC3747 : null;
                if (c37552 == null) {
                    break;
                }
                i2++;
            }
            C3755 c37553 = this;
            while (true) {
                InterfaceC3747 interfaceC37472 = c37553.f14517;
                c37553 = interfaceC37472 instanceof C3755 ? (C3755) interfaceC37472 : null;
                if (c37553 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C3755 c37554 = this;
            while (true) {
                InterfaceC3750 interfaceC3750 = c37554.f14516;
                if (!AbstractC1549.m5138(c3755.mo3966(interfaceC3750.getKey()), interfaceC3750)) {
                    zM5138 = false;
                    break;
                }
                InterfaceC3747 interfaceC37473 = c37554.f14517;
                if (!(interfaceC37473 instanceof C3755)) {
                    InterfaceC3750 interfaceC37502 = (InterfaceC3750) interfaceC37473;
                    zM5138 = AbstractC1549.m5138(c3755.mo3966(interfaceC37502.getKey()), interfaceC37502);
                    break;
                }
                c37554 = (C3755) interfaceC37473;
            }
            if (!zM5138) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f14516.hashCode() + this.f14517.hashCode();
    }

    public final String toString() {
        return ˉᵎ.ˑי(new StringBuilder("["), (String) mo3968("", C3751.f14511), ']');
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ʻʿ */
    public final InterfaceC3747 mo3965(InterfaceC3756 interfaceC3756) {
        InterfaceC3750 interfaceC3750 = this.f14516;
        InterfaceC3750 interfaceC3750Mo3966 = interfaceC3750.mo3966(interfaceC3756);
        InterfaceC3747 interfaceC3747 = this.f14517;
        if (interfaceC3750Mo3966 != null) {
            return interfaceC3747;
        }
        InterfaceC3747 interfaceC3747Mo3965 = interfaceC3747.mo3965(interfaceC3756);
        return interfaceC3747Mo3965 == interfaceC3747 ? this : interfaceC3747Mo3965 == C3749.f14510 ? interfaceC3750 : new C3755(interfaceC3747Mo3965, interfaceC3750);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ˏᵢ */
    public final InterfaceC3750 mo3966(InterfaceC3756 interfaceC3756) {
        C3755 c3755 = this;
        while (true) {
            InterfaceC3750 interfaceC3750Mo3966 = c3755.f14516.mo3966(interfaceC3756);
            if (interfaceC3750Mo3966 != null) {
                return interfaceC3750Mo3966;
            }
            InterfaceC3747 interfaceC3747 = c3755.f14517;
            if (!(interfaceC3747 instanceof C3755)) {
                return interfaceC3747.mo3966(interfaceC3756);
            }
            c3755 = (C3755) interfaceC3747;
        }
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ᐧˋ */
    public final InterfaceC3747 mo3967(InterfaceC3747 interfaceC3747) {
        return ٴˎ.ˋⁱ(this, interfaceC3747);
    }

    @Override // p330.InterfaceC3747
    /* renamed from: ﾞʽ */
    public final Object mo3968(Object obj, InterfaceC3864 interfaceC3864) {
        return interfaceC3864.mo1054(this.f14517.mo3968(obj, interfaceC3864), this.f14516);
    }
}
