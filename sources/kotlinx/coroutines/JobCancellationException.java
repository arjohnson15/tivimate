package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p070.AbstractC1549;
import p072.C1634;

/* loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final transient C1634 f3889;

    public JobCancellationException(String str, Throwable th, C1634 c1634) {
        super(str);
        this.f3889 = c1634;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!AbstractC1549.m5138(jobCancellationException.getMessage(), getMessage()) || !AbstractC1549.m5138(jobCancellationException.f3889, this.f3889) || !AbstractC1549.m5138(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = (this.f3889.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f3889;
    }
}
