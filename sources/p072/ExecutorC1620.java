package p072;

import java.util.concurrent.Executor;
import p330.C3749;

/* renamed from: ʿʽ.ᐧˋ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ExecutorC1620 implements Executor {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final AbstractC1636 f6397;

    public ExecutorC1620(AbstractC1636 abstractC1636) {
        this.f6397 = abstractC1636;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C3749 c3749 = C3749.f14510;
        AbstractC1636 abstractC1636 = this.f6397;
        if (abstractC1636.mo5276(c3749)) {
            abstractC1636.mo5198(c3749, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f6397.toString();
    }
}
