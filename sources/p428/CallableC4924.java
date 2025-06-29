package p428;

import java.util.concurrent.Callable;
import p369.InterfaceC4189;

/* renamed from: ﹶˊ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC4924 implements Callable {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final /* synthetic */ String f18608;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C4927 f18609;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ long f18610;

    public CallableC4924(C4927 c4927, long j, String str) {
        this.f18609 = c4927;
        this.f18610 = j;
        this.f18608 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C4927 c4927 = this.f18609;
        C4938 c4938 = c4927.f18646;
        if (c4938 != null && c4938.f18682.get()) {
            return null;
        }
        ((InterfaceC4189) c4927.f18649.f16137).mo9593(this.f18608, this.f18610);
        return null;
    }
}
