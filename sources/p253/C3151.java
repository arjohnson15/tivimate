package p253;

import p072.AbstractC1642;
import ـˈ.ˉᵎ;

/* renamed from: יˑ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3151 extends AbstractRunnableC3145 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final Runnable f12164;

    public C3151(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.f12164 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12164.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f12164;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1642.m5290(runnable));
        sb.append(", ");
        sb.append(this.f12149);
        sb.append(", ");
        return ˉᵎ.ˑי(sb, this.f12148 ? "Blocking" : "Non-blocking", ']');
    }
}
