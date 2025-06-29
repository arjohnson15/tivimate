package androidx.media3.exoplayer.audio;

import p166.C2431;
import ᵎﹳ.ᐧʻ;

/* loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f1410;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2431 f1411;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1412;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, C2431 c2431, boolean z, RuntimeException runtimeException) {
        StringBuilder sb = ᐧʻ.ᵎـ("AudioTrack init failed ", i, " Config(", i2, ", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(c2431);
        sb.append(z ? " (recoverable)" : "");
        super(sb.toString(), runtimeException);
        this.f1412 = i;
        this.f1410 = z;
        this.f1411 = c2431;
    }
}
