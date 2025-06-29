package androidx.media;

import p287.AbstractC3393;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC3393 abstractC3393) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1331 = abstractC3393.m8260(audioAttributesImplBase.f1331, 1);
        audioAttributesImplBase.f1329 = abstractC3393.m8260(audioAttributesImplBase.f1329, 2);
        audioAttributesImplBase.f1330 = abstractC3393.m8260(audioAttributesImplBase.f1330, 3);
        audioAttributesImplBase.f1332 = abstractC3393.m8260(audioAttributesImplBase.f1332, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC3393 abstractC3393) {
        abstractC3393.getClass();
        abstractC3393.m8255(audioAttributesImplBase.f1331, 1);
        abstractC3393.m8255(audioAttributesImplBase.f1329, 2);
        abstractC3393.m8255(audioAttributesImplBase.f1330, 3);
        abstractC3393.m8255(audioAttributesImplBase.f1332, 4);
    }
}
