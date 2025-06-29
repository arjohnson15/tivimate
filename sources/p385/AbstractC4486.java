package p385;

import android.media.MediaDrm;
import p383.AbstractC4470;

/* renamed from: ᵢﹶ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4486 {
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static int m10236(Throwable th) {
        return AbstractC4470.m10215(AbstractC4470.m10191(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static boolean m10237(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }
}
