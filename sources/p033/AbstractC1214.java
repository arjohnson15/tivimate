package p033;

import android.media.AudioProfile;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* renamed from: ʼᵎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1214 {
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static /* synthetic */ NetworkEvent.Builder m4302() {
        return new NetworkEvent.Builder();
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public static /* synthetic */ TrackChangeEvent.Builder m4307(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static /* synthetic */ PlaybackStateEvent.Builder m4314() {
        return new PlaybackStateEvent.Builder();
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static /* bridge */ /* synthetic */ AudioProfile m4315(Object obj) {
        return (AudioProfile) obj;
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static /* synthetic */ PlaybackErrorEvent.Builder m4319() {
        return new PlaybackErrorEvent.Builder();
    }
}
