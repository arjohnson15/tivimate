package androidx.media;

import android.util.SparseIntArray;
import p287.InterfaceC3392;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC3392 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final /* synthetic */ int f1325 = 0;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public AudioAttributesImpl f1326;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f1326;
        return audioAttributesImpl == null ? audioAttributesCompat.f1326 == null : audioAttributesImpl.equals(audioAttributesCompat.f1326);
    }

    public final int hashCode() {
        return this.f1326.hashCode();
    }

    public final String toString() {
        return this.f1326.toString();
    }
}
