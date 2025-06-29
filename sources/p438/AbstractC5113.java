package p438;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import p033.AbstractC1211;
import p033.C1213;
import p033.C1215;
import p033.C1220;
import p383.AbstractC4464;

/* renamed from: ﹶﾞ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5113 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1215 m11334(Context context, C5118 c5118, boolean z, String str) {
        MediaMetricsManager mediaMetricsManagerM4281 = AbstractC1211.m4281(context.getSystemService("media_metrics"));
        C1213 c1213 = mediaMetricsManagerM4281 == null ? null : new C1213(context, mediaMetricsManagerM4281.createPlaybackSession());
        if (c1213 == null) {
            AbstractC4464.m10144("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new C1215(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            c5118.getClass();
            C1220 c1220 = c5118.f19567;
            c1220.getClass();
            c1220.f5018.ـﹶ(c1213);
        }
        return new C1215(c1213.f4973.getSessionId(), str);
    }
}
