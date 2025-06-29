package p164;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;
import p013.C1047;
import p070.AbstractC1547;
import p072.C1587;
import p288.C3397;
import p338.InterfaceC3856;
import p395.InterfaceFutureC4542;
import p410.C4681;
import p410.C4682;
import p423.C4883;
import p423.C4884;
import p457.AbstractC5366;
import ᴵﹳ.ﹶˆ;

/* renamed from: ˊᵔ.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2365 extends AbstractC1547 implements InterfaceC3856 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f9363;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9364;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f9365;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2365(Object obj, int i, Object obj2) {
        super(1);
        this.f9363 = i;
        this.f9364 = obj;
        this.f9365 = obj2;
    }

    @Override // p338.InterfaceC3856
    /* renamed from: ʽᐧ */
    public final Object mo4036(Object obj) {
        C3397 c3397;
        switch (this.f9363) {
            case 0:
                Throwable th = (Throwable) obj;
                ((C1047) this.f9364).mo4036(th);
                ﹶˆ r0 = (ﹶˆ) this.f9365;
                ((C4883) r0.ˎˑ).m10979(th, false);
                do {
                    Object objMo10957 = ((C4883) r0.ˎˑ).mo10957();
                    c3397 = null;
                    if (objMo10957 instanceof C4884) {
                        objMo10957 = null;
                    }
                    C3397 c33972 = C3397.f13249;
                    if (objMo10957 != null) {
                        C2375.f9394.mo1054(objMo10957, th);
                        c3397 = c33972;
                    }
                } while (c3397 != null);
            case 1:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof WorkerStoppedException) {
                    ((AbstractC5366) this.f9364).f20827.compareAndSet(-256, ((WorkerStoppedException) th2).f1769);
                }
                ((InterfaceFutureC4542) this.f9365).cancel(false);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                C4682 c4682 = (C4682) this.f9364;
                if (th3 == null) {
                    c4682.m10585(((C1587) this.f9365).m5270());
                } else if (th3 instanceof CancellationException) {
                    c4682.f17820 = true;
                    C4681 c4681 = c4682.f17817;
                    if (c4681 != null && c4681.f17815.cancel(true)) {
                        c4682.f17819 = null;
                        c4682.f17817 = null;
                        c4682.f17818 = null;
                    }
                } else {
                    c4682.m10584(th3);
                }
                break;
        }
        return C3397.f13249;
    }
}
