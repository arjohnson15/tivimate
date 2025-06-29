package p072;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import p070.AbstractC1549;
import p080.AbstractC1702;
import p148.AbstractC2269;
import p155.EnumC2332;
import p185.AbstractC2563;
import p288.AbstractC3404;
import p288.C3397;
import p288.C3403;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p338.InterfaceC3864;
import ˎˊ.ˆʿ;
import ⁱـ.ˑי;

/* renamed from: ʿʽ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1614 extends C1634 implements InterfaceC3746, InterfaceC1594 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final InterfaceC3747 f6391;

    public AbstractC1614(InterfaceC3747 interfaceC3747, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m5258((InterfaceC1643) interfaceC3747.mo3966(C1584.f6341));
        }
        this.f6391 = interfaceC3747.mo3967(this);
    }

    @Override // p072.C1634
    /* renamed from: ʿˊ, reason: contains not printable characters */
    public final void mo5237(Object obj) {
        if (!(obj instanceof C1626)) {
            mo5241(obj);
            return;
        }
        C1626 c1626 = (C1626) obj;
        Throwable th = c1626.f6402;
        c1626.getClass();
        mo5240(th, C1626.f6401.get(c1626) != 0);
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ˉי */
    public final void mo3974(Object obj) {
        Throwable thM8265 = AbstractC3404.m8265(obj);
        if (thM8265 != null) {
            obj = new C1626(thM8265, false);
        }
        Object objM5263 = m5263(obj);
        if (objM5263 == AbstractC1642.f6416) {
            return;
        }
        mo5177(objM5263);
    }

    @Override // p072.InterfaceC1594
    /* renamed from: ˋⁱ */
    public final InterfaceC3747 mo1029() {
        return this.f6391;
    }

    @Override // p072.C1634
    /* renamed from: ˑﾞ, reason: contains not printable characters */
    public final void mo5238(CompletionHandlerException completionHandlerException) {
        AbstractC1642.m5288(completionHandlerException, this.f6391);
    }

    /* renamed from: ـᵎ, reason: contains not printable characters */
    public final void m5239(int i, AbstractC1614 abstractC1614, InterfaceC3864 interfaceC3864) {
        Object objMo1054;
        int iM5411 = AbstractC1702.m5411(i);
        C3397 c3397 = C3397.f13249;
        if (iM5411 == 0) {
            try {
                AbstractC2269.m6278(c3397, ˑי.ˏᴵ(ˑי.ᐧʻ(abstractC1614, this, interfaceC3864)));
                return;
            } catch (Throwable th) {
                ˆʿ.ˏᵢ(this, th);
                throw null;
            }
        }
        if (iM5411 != 1) {
            if (iM5411 == 2) {
                ˑי.ˏᴵ(ˑי.ᐧʻ(abstractC1614, this, interfaceC3864)).mo3974(c3397);
                return;
            }
            if (iM5411 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                InterfaceC3747 interfaceC3747 = this.f6391;
                Object objM6280 = AbstractC2269.m6280(interfaceC3747, null);
                try {
                    if (interfaceC3864 instanceof AbstractC2563) {
                        AbstractC1549.m5141(2, interfaceC3864);
                        objMo1054 = interfaceC3864.mo1054(abstractC1614, this);
                    } else {
                        objMo1054 = ˑי.ˈٴ(interfaceC3864, abstractC1614, this);
                    }
                    AbstractC2269.m6288(interfaceC3747, objM6280);
                    if (objMo1054 != EnumC2332.f9250) {
                        mo3974(objMo1054);
                    }
                } catch (Throwable th2) {
                    AbstractC2269.m6288(interfaceC3747, objM6280);
                    throw th2;
                }
            } catch (Throwable th3) {
                mo3974(new C3403(th3));
            }
        }
    }

    /* renamed from: ٴᐧ, reason: contains not printable characters */
    public void mo5240(Throwable th, boolean z) {
    }

    /* renamed from: ٴﹶ, reason: contains not printable characters */
    public void mo5241(Object obj) {
    }

    @Override // p330.InterfaceC3746
    /* renamed from: ᐧʻ */
    public final InterfaceC3747 mo3963() {
        return this.f6391;
    }

    @Override // p072.C1634
    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final String mo5242() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
