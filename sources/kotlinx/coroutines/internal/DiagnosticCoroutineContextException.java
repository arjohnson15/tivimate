package kotlinx.coroutines.internal;

import p330.InterfaceC3747;

/* loaded from: classes.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final transient InterfaceC3747 f3892;

    public DiagnosticCoroutineContextException(InterfaceC3747 interfaceC3747) {
        this.f3892 = interfaceC3747;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3892.toString();
    }
}
