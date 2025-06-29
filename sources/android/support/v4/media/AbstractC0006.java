package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0006 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static void m102(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static Uri m103(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }
}
