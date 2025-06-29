package p428;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: ﹶˊ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC4935 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ C4927 f18670;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ long f18671;

    public CallableC4935(C4927 c4927, long j) {
        this.f18670 = c4927;
        this.f18671 = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f18671);
        this.f18670.f18638.mo3704(bundle);
        return null;
    }
}
