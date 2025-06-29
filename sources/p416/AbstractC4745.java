package p416;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import p016.C1078;
import p016.C1083;
import p068.AbstractC1540;
import p115.AbstractC1833;
import p115.InterfaceC1828;
import p418.C4824;

/* renamed from: ﹳᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4745 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final /* synthetic */ int f18200 = 0;

    static {
        C1083[] c1083Arr = {new C1083(11, InterfaceC1828.class)};
        HashMap map = new HashMap();
        C1083 c1083 = c1083Arr[0];
        boolean zContainsKey = map.containsKey(c1083.f4654);
        Class cls = c1083.f4654;
        if (zContainsKey) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
        }
        map.put(cls, c1083);
        Class cls2 = c1083Arr[0].f4654;
        DesugarCollections.unmodifiableMap(map);
        int i = C4824.CONFIG_NAME_FIELD_NUMBER;
        try {
            AbstractC1833.m5577(C4744.f18198);
            if (AbstractC1540.f6258.get()) {
                return;
            }
            AbstractC1833.m5580(new C1078(9), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
