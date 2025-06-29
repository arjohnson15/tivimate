package p362;

import android.os.HandlerThread;
import p076.C1665;
import p353.InterfaceC4012;

/* renamed from: ᵔᵢ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C4108 implements InterfaceC4012 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f15880;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f15881;

    public /* synthetic */ C4108(int i, int i2) {
        this.f15881 = i2;
        this.f15880 = i;
    }

    @Override // p353.InterfaceC4012
    public final Object get() {
        switch (this.f15881) {
            case 0:
                return new HandlerThread(C1665.m5341(this.f15880, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C1665.m5341(this.f15880, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
