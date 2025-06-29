package p337;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import p261.C3250;

/* renamed from: ᵎˆ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3844 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3825 m9024(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C3825.f14706;
        }
        C3250 c3250 = new C3250();
        c3250.f12701 = true;
        c3250.f12700 = z;
        return c3250.m8009();
    }
}
