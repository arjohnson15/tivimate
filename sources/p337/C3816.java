package p337;

import android.media.AudioTrack;
import ˊﹶ.ˋˉ;

/* renamed from: ᵎˆ.ˆᵔ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3816 extends AudioTrack.StreamEventCallback {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C3843 f14684;

    public C3816(C3843 c3843) {
        this.f14684 = c3843;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C3847 c3847;
        ˋˉ r2;
        if (audioTrack.equals(this.f14684.f14793.f14859) && (r2 = (c3847 = this.f14684.f14793).f14844) != null && c3847.f14842) {
            r2.ﹳﹶ();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f14684.f14793.f14859)) {
            this.f14684.f14793.f14817 = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        C3847 c3847;
        ˋˉ r0;
        if (audioTrack.equals(this.f14684.f14793.f14859) && (r0 = (c3847 = this.f14684.f14793).f14844) != null && c3847.f14842) {
            r0.ﹳﹶ();
        }
    }
}
