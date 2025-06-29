package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public int f1327 = -1;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AudioAttributes f1328;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1328.equals(((AudioAttributesImplApi21) obj).f1328);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1328.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1328;
    }
}
