package androidx.media;

import android.media.AudioAttributes;
import p287.AbstractC3393;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC3393 abstractC3393) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1328 = (AudioAttributes) abstractC3393.m8261(audioAttributesImplApi26.f1328, 1);
        audioAttributesImplApi26.f1327 = abstractC3393.m8260(audioAttributesImplApi26.f1327, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC3393 abstractC3393) {
        abstractC3393.getClass();
        abstractC3393.m8257(audioAttributesImplApi26.f1328, 1);
        abstractC3393.m8255(audioAttributesImplApi26.f1327, 2);
    }
}
