package p414;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import p072.AbstractC1642;
import p072.C1592;
import p072.InterfaceC1594;
import p155.EnumC2332;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p457.C5391;
import ˈⁱ.ˉⁱ;

/* renamed from: ﹳـ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4739 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public int f18178;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C4715 f18179;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4739(C4715 c4715, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f18179 = c4715;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C4739) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    public final Object mo1055(Object obj) {
        final AbstractC4734 c4733;
        EnumC2332 enumC2332 = EnumC2332.f9250;
        int i = this.f18178;
        final C4715 c4715 = this.f18179;
        try {
            if (i == 0) {
                ˉⁱ.ˆʿ(obj);
                C1592 c1592 = c4715.f18093;
                C4718 c4718 = new C4718(c4715, null);
                this.f18178 = 1;
                obj = AbstractC1642.m5295(c1592, c4718, this);
                if (obj == enumC2332) {
                    return enumC2332;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ˉⁱ.ˆʿ(obj);
            }
            c4733 = (AbstractC4734) obj;
        } catch (WorkerStoppedException e) {
            c4733 = new C4732(e.f1769);
        } catch (CancellationException unused) {
            c4733 = new C4733();
        } catch (Throwable th) {
            C5391.m12163().m12170(AbstractC4730.f18154, "Unexpected error in WorkerWrapper", th);
            c4733 = new C4733();
        }
        return c4715.f18095.m5042(new Callable() { // from class: ﹳـ.ʿˏ
            /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 458
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p414.CallableC4714.call():java.lang.Object");
            }
        });
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C4739(this.f18179, interfaceC3746);
    }
}
