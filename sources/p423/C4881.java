package p423;

import java.util.concurrent.CancellationException;
import p072.AbstractC1642;

/* renamed from: ﹶʻ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C4881 extends AbstractC4872 implements InterfaceC4868 {
    @Override // p072.C1634
    /* renamed from: ʾʼ */
    public final boolean mo5243(Throwable th) {
        AbstractC1642.m5288(th, this.f6391);
        return true;
    }

    @Override // p072.C1634
    /* renamed from: ᵎʽ */
    public final void mo5262(Throwable th) {
        if (th != null) {
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationException == null) {
                CancellationException cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
                cancellationException.initCause(th);
                cancellationException = cancellationException;
            }
        }
        this.f18391.mo10961(cancellationException);
    }
}
