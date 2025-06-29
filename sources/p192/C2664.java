package p192;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import ᵔᵔ.ٴˎ;

/* renamed from: ˎˉ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2664 extends ٴˎ {
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Signature[] m6842(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
