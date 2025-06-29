package androidx.media;

import android.media.AudioAttributes;
import p287.AbstractC3393;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC3393 abstractC3393) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1328 = (AudioAttributes) abstractC3393.m8261(audioAttributesImplApi21.f1328, 1);
        audioAttributesImplApi21.f1327 = abstractC3393.m8260(audioAttributesImplApi21.f1327, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC3393 abstractC3393) {
        abstractC3393.getClass();
        abstractC3393.m8257(audioAttributesImplApi21.f1328, 1);
        abstractC3393.m8255(audioAttributesImplApi21.f1327, 2);
    }
}
