package p456;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: ﾞⁱ.ˎˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5276 extends FutureTask implements Comparable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f20453;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final String f20454;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5247 f20455;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f20456;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5276(C5247 c5247, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f20455 = c5247;
        long andIncrement = C5247.f20174.getAndIncrement();
        this.f20456 = andIncrement;
        this.f20454 = str;
        this.f20453 = z;
        if (andIncrement == Long.MAX_VALUE) {
            c5247.ˏᵢ().f20571.m4533("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5276(C5247 c5247, Callable callable, boolean z) {
        super(callable);
        this.f20455 = c5247;
        long andIncrement = C5247.f20174.getAndIncrement();
        this.f20456 = andIncrement;
        this.f20454 = "Task exception on worker thread";
        this.f20453 = z;
        if (andIncrement == Long.MAX_VALUE) {
            c5247.ˏᵢ().f20571.m4533("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5276 c5276 = (C5276) obj;
        boolean z = c5276.f20453;
        boolean z2 = this.f20453;
        if (z2 != z) {
            return z2 ? -1 : 1;
        }
        long j = c5276.f20456;
        long j2 = this.f20456;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        this.f20455.ˏᵢ().f20572.m4531(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        C5301 c5301 = this.f20455.ˏᵢ();
        c5301.f20571.m4531(th, this.f20454);
        super.setException(th);
    }
}
