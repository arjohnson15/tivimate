package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;
import p287.AbstractC3393;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC3393 abstractC3393) {
        return androidx.media.AudioAttributesCompatParcelizer.read(abstractC3393);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC3393 abstractC3393) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, abstractC3393);
    }
}
