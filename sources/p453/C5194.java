package p453;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import p072.C1602;
import p288.C3403;

/* renamed from: ﾞᐧ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5194 extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C1602 f20017;

    public C5194(C1602 c1602) {
        super(false);
        this.f20017 = c1602;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f20017.mo3974(new C3403(th));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f20017.mo3974(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
