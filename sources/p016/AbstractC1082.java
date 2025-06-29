package p016;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p068.AbstractC1540;
import p115.AbstractC1833;
import p115.InterfaceC1830;
import p267.AbstractC3269;
import p375.C4304;
import p375.C4317;
import p418.C4824;

/* renamed from: ʻᐧ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1082 {
    static {
        C1083[] c1083Arr = {new C1083(0, InterfaceC1830.class)};
        HashMap map = new HashMap();
        for (int i = 0; i < 1; i++) {
            C1083 c1083 = c1083Arr[i];
            boolean zContainsKey = map.containsKey(c1083.f4654);
            Class cls = c1083.f4654;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
            }
            map.put(cls, c1083);
        }
        Class cls2 = c1083Arr[0].f4654;
        DesugarCollections.unmodifiableMap(map);
        C1083[] c1083Arr2 = {new C1083(3, InterfaceC1830.class)};
        HashMap map2 = new HashMap();
        C1083 c10832 = c1083Arr2[0];
        boolean zContainsKey2 = map2.containsKey(c10832.f4654);
        Class cls3 = c10832.f4654;
        if (zContainsKey2) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
        }
        map2.put(cls3, c10832);
        Class cls4 = c1083Arr2[0].f4654;
        DesugarCollections.unmodifiableMap(map2);
        C1083[] c1083Arr3 = {new C1083(4, InterfaceC1830.class)};
        HashMap map3 = new HashMap();
        C1083 c10833 = c1083Arr3[0];
        boolean zContainsKey3 = map3.containsKey(c10833.f4654);
        Class cls5 = c10833.f4654;
        if (zContainsKey3) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls5.getCanonicalName());
        }
        map3.put(cls5, c10833);
        Class cls6 = c1083Arr3[0].f4654;
        DesugarCollections.unmodifiableMap(map3);
        C1083[] c1083Arr4 = {new C1083(2, InterfaceC1830.class)};
        HashMap map4 = new HashMap();
        C1083 c10834 = c1083Arr4[0];
        boolean zContainsKey4 = map4.containsKey(c10834.f4654);
        Class cls7 = c10834.f4654;
        if (zContainsKey4) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls7.getCanonicalName());
        }
        map4.put(cls7, c10834);
        Class cls8 = c1083Arr4[0].f4654;
        DesugarCollections.unmodifiableMap(map4);
        C1083[] c1083Arr5 = {new C1083(6, InterfaceC1830.class)};
        HashMap map5 = new HashMap();
        C1083 c10835 = c1083Arr5[0];
        boolean zContainsKey5 = map5.containsKey(c10835.f4654);
        Class cls9 = c10835.f4654;
        if (zContainsKey5) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls9.getCanonicalName());
        }
        map5.put(cls9, c10835);
        Class cls10 = c1083Arr5[0].f4654;
        DesugarCollections.unmodifiableMap(map5);
        C1083[] c1083Arr6 = {new C1083(7, InterfaceC1830.class)};
        HashMap map6 = new HashMap();
        C1083 c10836 = c1083Arr6[0];
        boolean zContainsKey6 = map6.containsKey(c10836.f4654);
        Class cls11 = c10836.f4654;
        if (zContainsKey6) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls11.getCanonicalName());
        }
        map6.put(cls11, c10836);
        Class cls12 = c1083Arr6[0].f4654;
        DesugarCollections.unmodifiableMap(map6);
        C1083[] c1083Arr7 = {new C1083(5, InterfaceC1830.class)};
        HashMap map7 = new HashMap();
        C1083 c10837 = c1083Arr7[0];
        boolean zContainsKey7 = map7.containsKey(c10837.f4654);
        Class cls13 = c10837.f4654;
        if (zContainsKey7) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls13.getCanonicalName());
        }
        map7.put(cls13, c10837);
        Class cls14 = c1083Arr7[0].f4654;
        DesugarCollections.unmodifiableMap(map7);
        C1083[] c1083Arr8 = {new C1083(8, InterfaceC1830.class)};
        HashMap map8 = new HashMap();
        C1083 c10838 = c1083Arr8[0];
        boolean zContainsKey8 = map8.containsKey(c10838.f4654);
        Class cls15 = c10838.f4654;
        if (zContainsKey8) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls15.getCanonicalName());
        }
        map8.put(cls15, c10838);
        Class cls16 = c1083Arr8[0].f4654;
        DesugarCollections.unmodifiableMap(map8);
        int i2 = C4824.CONFIG_NAME_FIELD_NUMBER;
        try {
            m4115();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static void m4115() throws NoSuchPaddingException, NoSuchAlgorithmException {
        AbstractC1833.m5577(C1069.f4610);
        AbstractC3269.m8069();
        AbstractC1833.m5580(new C1078(0), true);
        AbstractC1833.m5580(new C1078(3), true);
        C4304 c4304 = AbstractC1080.f4651;
        C4317 c4317 = C4317.f16771;
        c4317.m9805(AbstractC1080.f4651);
        c4317.m9808(AbstractC1080.f4649);
        c4317.m9806(AbstractC1080.f4650);
        c4317.m9804(AbstractC1080.f4652);
        if (AbstractC1540.f6258.get()) {
            return;
        }
        AbstractC1833.m5580(new C1078(2), true);
        c4317.m9805(AbstractC1074.f4636);
        c4317.m9808(AbstractC1074.f4634);
        c4317.m9806(AbstractC1074.f4635);
        c4317.m9804(AbstractC1074.f4637);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            AbstractC1833.m5580(new C1078(4), true);
            c4317.m9805(AbstractC1086.f4659);
            c4317.m9808(AbstractC1086.f4657);
            c4317.m9806(AbstractC1086.f4658);
            c4317.m9804(AbstractC1086.f4660);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        AbstractC1833.m5580(new C1078(5), true);
        C4304 c43042 = AbstractC1073.f4632;
        C4317 c43172 = C4317.f16771;
        c43172.m9805(AbstractC1073.f4632);
        c43172.m9808(AbstractC1073.f4630);
        c43172.m9806(AbstractC1073.f4631);
        c43172.m9804(AbstractC1073.f4633);
        AbstractC1833.m5580(new C1078(6), true);
        AbstractC1833.m5580(new C1078(7), true);
        AbstractC1833.m5580(new C1078(8), true);
        c43172.m9805(AbstractC1089.f4663);
        c43172.m9808(AbstractC1089.f4661);
        c43172.m9806(AbstractC1089.f4662);
        c43172.m9804(AbstractC1089.f4664);
    }
}
