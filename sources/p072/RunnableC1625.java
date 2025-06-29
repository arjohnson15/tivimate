package p072;

import android.support.v4.media.session.AbstractC0002;
import kotlinx.coroutines.TimeoutCancellationException;
import p148.C2274;
import p185.AbstractC2562;
import p447.AbstractC5179;

/* renamed from: ʿʽ.ᵎʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC1625 extends C2274 implements Runnable {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final long f6400;

    public RunnableC1625(long j, AbstractC2562 abstractC2562) {
        super(abstractC2562, abstractC2562.mo3963());
        this.f6400 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1642.m5285(this.f6391);
        m5254(new TimeoutCancellationException(AbstractC0002.m42(new StringBuilder("Timed out waiting for "), this.f6400, " ms"), this));
    }

    @Override // p072.C1634
    /* renamed from: ﾞˎ, reason: contains not printable characters */
    public final String mo5244() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo5244());
        sb.append("(timeMillis=");
        return AbstractC5179.m11554(sb, this.f6400, ')');
    }
}
