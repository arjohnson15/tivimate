package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import p184.C2546;

/* loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final transient C2546 f3891;

    public AbortFlowException(C2546 c2546) {
        super("Flow was aborted, no more elements needed");
        this.f3891 = c2546;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
