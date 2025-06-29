package p115;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p313.C3591;
import ᵎﹳ.ᐧʻ;

/* renamed from: ˈʽ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1835 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final CopyOnWriteArrayList f7063 = new CopyOnWriteArrayList();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C3591 m5583(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        Iterator it = f7063.iterator();
        while (it.hasNext()) {
            C3591 c3591 = (C3591) it.next();
            synchronized (c3591) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return c3591;
            }
        }
        throw new GeneralSecurityException(ᐧʻ.ﾞˊ("No KMS client does support: ", str));
    }
}
