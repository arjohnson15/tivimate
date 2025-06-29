package p337;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import p261.C3250;
import p383.AbstractC4470;

/* renamed from: ᵎˆ.ʿˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3814 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3825 m8904(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C3825.f14706;
        }
        C3250 c3250 = new C3250();
        boolean z2 = AbstractC4470.f17202 > 32 && playbackOffloadSupport == 2;
        c3250.f12701 = true;
        c3250.f12699 = z2;
        c3250.f12700 = z;
        return c3250.m8009();
    }
}
