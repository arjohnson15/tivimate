package p457;

import androidx.work.Worker;
import p070.AbstractC1547;
import p338.InterfaceC3865;

/* renamed from: ﾞﹶ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5365 extends AbstractC1547 implements InterfaceC3865 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f20824;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Worker f20825;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5365(Worker worker, int i) {
        super(0);
        this.f20824 = i;
        this.f20825 = worker;
    }

    @Override // p338.InterfaceC3865
    /* renamed from: ـﹶ */
    public final Object mo1053() {
        switch (this.f20824) {
            case 0:
                this.f20825.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            default:
                return this.f20825.mo1371();
        }
    }
}
