package p362;

import android.media.metrics.LogSessionId;
import p033.C1215;
import p033.C1221;

/* renamed from: ᵔᵢ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4124 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m9442(C4123 c4123, C1215 c1215) {
        C1221 c1221 = c1215.f4988;
        c1221.getClass();
        LogSessionId logSessionId = c1221.f5021;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c4123.f15923.setString("log-session-id", logSessionId.getStringId());
    }
}
