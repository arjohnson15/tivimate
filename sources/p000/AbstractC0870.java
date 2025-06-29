package p000;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: ʻ.ˏᴵ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0870 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static boolean m3684(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
