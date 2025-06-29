package p072;

import java.util.concurrent.CancellationException;
import p024.C1151;
import p148.AbstractC2269;
import p148.C2257;
import p185.AbstractC2562;
import p253.AbstractRunnableC3145;
import p288.C3403;
import p330.InterfaceC3746;
import p330.InterfaceC3747;

/* renamed from: ʿʽ.ˎˑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1598 extends AbstractRunnableC3145 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f6358;

    public AbstractC1598(int i) {
        super(false, 0L);
        this.f6358 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2257 c2257 = (C2257) mo5194();
            AbstractC2562 abstractC2562 = c2257.f8978;
            Object obj = c2257.f8981;
            InterfaceC3747 interfaceC3747Mo3963 = abstractC2562.mo3963();
            Object objM6280 = AbstractC2269.m6280(interfaceC3747Mo3963, obj);
            InterfaceC1643 interfaceC1643 = null;
            C1635 c1635M5306 = objM6280 != AbstractC2269.f9006 ? AbstractC1642.m5306(abstractC2562, interfaceC3747Mo3963, objM6280) : null;
            try {
                InterfaceC3747 interfaceC3747Mo39632 = abstractC2562.mo3963();
                Object objMo5192 = mo5192();
                Throwable thMo5195 = mo5195(objMo5192);
                if (thMo5195 == null && AbstractC1642.m5291(this.f6358)) {
                    interfaceC1643 = (InterfaceC1643) interfaceC3747Mo39632.mo3966(C1584.f6341);
                }
                if (interfaceC1643 != null && !interfaceC1643.mo5168()) {
                    CancellationException cancellationExceptionMo5169 = interfaceC1643.mo5169();
                    mo5190(cancellationExceptionMo5169);
                    abstractC2562.mo3974(new C3403(cancellationExceptionMo5169));
                } else if (thMo5195 != null) {
                    abstractC2562.mo3974(new C3403(thMo5195));
                } else {
                    abstractC2562.mo3974(mo5191(objMo5192));
                }
                if (c1635M5306 == null || c1635M5306.m5274()) {
                    AbstractC2269.m6288(interfaceC3747Mo3963, objM6280);
                }
            } catch (Throwable th) {
                if (c1635M5306 == null || c1635M5306.m5274()) {
                    AbstractC2269.m6288(interfaceC3747Mo3963, objM6280);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m5193(th2);
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void mo5190(CancellationException cancellationException) {
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object mo5191(Object obj) {
        return obj;
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public abstract Object mo5192();

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final void m5193(Throwable th) {
        AbstractC1642.m5288(new C1151("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo5194().mo3963());
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public abstract InterfaceC3746 mo5194();

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public Throwable mo5195(Object obj) {
        C1626 c1626 = obj instanceof C1626 ? (C1626) obj : null;
        if (c1626 != null) {
            return c1626.f6402;
        }
        return null;
    }
}
