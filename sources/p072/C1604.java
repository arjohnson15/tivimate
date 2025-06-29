package p072;

import java.util.concurrent.ScheduledFuture;
import p338.InterfaceC3856;

/* renamed from: ʿʽ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1604 implements InterfaceC1640 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object f6374;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ int f6375;

    public /* synthetic */ C1604(int i, Object obj) {
        this.f6375 = i;
        this.f6374 = obj;
    }

    public final String toString() {
        switch (this.f6375) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f6374) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC3856) this.f6374).getClass().getSimpleName() + '@' + AbstractC1642.m5290(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC1639) this.f6374) + ']';
        }
    }

    @Override // p072.InterfaceC1640
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final void mo5221(Throwable th) {
        switch (this.f6375) {
            case 0:
                ((ScheduledFuture) this.f6374).cancel(false);
                break;
            case 1:
                ((InterfaceC3856) this.f6374).mo4036(th);
                break;
            default:
                ((InterfaceC1639) this.f6374).mo5179();
                break;
        }
    }
}
