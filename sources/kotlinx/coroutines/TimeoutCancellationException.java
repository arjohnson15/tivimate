package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p072.RunnableC1625;

/* loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final transient RunnableC1625 f3890;

    public TimeoutCancellationException(String str, RunnableC1625 runnableC1625) {
        super(str);
        this.f3890 = runnableC1625;
    }
}
