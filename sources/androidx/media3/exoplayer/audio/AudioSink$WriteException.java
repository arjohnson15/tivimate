package androidx.media3.exoplayer.audio;

import p166.C2431;
import ـˈ.ˉᵎ;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final boolean f1413;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final C2431 f1414;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f1415;

    public AudioSink$WriteException(int i, C2431 c2431, boolean z) {
        super(ˉᵎ.ˉⁱ("AudioTrack write failed: ", i));
        this.f1413 = z;
        this.f1415 = i;
        this.f1414 = c2431;
    }
}
