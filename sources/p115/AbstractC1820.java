package p115;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ˈʽ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1820 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final byte[] f7037 = new byte[0];

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static C1832 m5562(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = AbstractC1833.f7060;
        synchronized (AbstractC1833.class) {
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(AbstractC1833.f7061);
        }
        C1832 c1832 = (C1832) mapUnmodifiableMap.get(str);
        if (c1832 != null) {
            return c1832;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
