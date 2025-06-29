package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p000.C0882;

/* loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {
    public MediaDrmCallbackException(C0882 c0882, Uri uri, Map map, long j, Exception exc) {
        super(exc);
    }
}
