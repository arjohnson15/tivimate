package p385;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import p033.C1215;
import p033.C1221;
import p337.AbstractC3834;

/* renamed from: ᵢﹶ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4501 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m10263(MediaDrm mediaDrm, byte[] bArr, C1215 c1215) {
        C1221 c1221 = c1215.f4988;
        c1221.getClass();
        LogSessionId logSessionId = c1221.f5021;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        AbstractC3834.m8962(playbackComponent).setLogSessionId(logSessionId);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m10264(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }
}
