package p007;

import android.view.Surface;
import p383.AbstractC4464;

/* renamed from: ʻˉ.יʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0954 {
    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m3884(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC4464.m10147("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
