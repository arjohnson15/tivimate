package p337;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* renamed from: ᵎˆ.ᵢʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3843 {

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ C3847 f14793;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Handler f14794 = new Handler(Looper.myLooper());

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C3816 f14792 = new C3816(this);

    public C3843(C3847 c3847) {
        this.f14793 = c3847;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public void m9022(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14792);
        this.f14794.removeCallbacksAndMessages(null);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m9023(AudioTrack audioTrack) {
        Handler handler = this.f14794;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC3837(handler), this.f14792);
    }
}
