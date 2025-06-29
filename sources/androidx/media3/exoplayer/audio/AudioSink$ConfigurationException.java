package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import p166.C2431;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C2431 f1409;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, C2431 c2431) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.f1409 = c2431;
    }

    public AudioSink$ConfigurationException(String str, C2431 c2431) {
        super(str);
        this.f1409 = c2431;
    }
}
