package p127;

import org.conscrypt.Conscrypt;

/* renamed from: ˈⁱ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2032 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m5682() {
        return C2029.f7691;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m5683() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }
}
