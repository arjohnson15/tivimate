package p337;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import p033.C1215;
import p033.C1221;

/* renamed from: ᵎˆ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3832 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m8947(AudioTrack audioTrack, C1215 c1215) {
        C1221 c1221 = c1215.f4988;
        c1221.getClass();
        LogSessionId logSessionId = c1221.f5021;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
