package androidx.media;

import java.lang.reflect.InvocationTargetException;
import p287.AbstractC3393;
import p287.InterfaceC3392;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC3393 abstractC3393) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC3392 interfaceC3392M8258 = audioAttributesCompat.f1326;
        if (abstractC3393.mo8251(1)) {
            interfaceC3392M8258 = abstractC3393.m8258();
        }
        audioAttributesCompat.f1326 = (AudioAttributesImpl) interfaceC3392M8258;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC3393 abstractC3393) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC3393.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1326;
        abstractC3393.mo8253(1);
        abstractC3393.m8256(audioAttributesImpl);
    }
}
