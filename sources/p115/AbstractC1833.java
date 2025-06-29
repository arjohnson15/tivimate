package p115;

import android.support.v4.media.session.AbstractC0002;
import com.google.crypto.tink.shaded.protobuf.AbstractC0748;
import com.google.crypto.tink.shaded.protobuf.AbstractC0758;
import com.google.crypto.tink.shaded.protobuf.C0762;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p065.AbstractC1524;
import p080.AbstractC1702;
import p339.C3875;
import p375.C4301;
import p375.C4302;
import p375.C4306;
import p375.C4312;
import p375.C4316;
import p418.C4786;
import p418.C4794;
import p418.C4801;
import p418.EnumC4778;

/* renamed from: ˈʽ.ᴵʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC1833 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final ConcurrentHashMap f7058;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final ConcurrentHashMap f7059;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final AtomicReference f7060;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final ConcurrentHashMap f7061;

    static {
        Logger.getLogger(AbstractC1833.class.getName());
        f7060 = new AtomicReference(new C1821());
        f7058 = new ConcurrentHashMap();
        f7059 = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f7061 = new ConcurrentHashMap();
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static Object m5575(AbstractC1820 abstractC1820, Class cls) throws GeneralSecurityException {
        C3875 c3875;
        C4312 c4312 = (C4312) C4306.f16751.f16752.get();
        c4312.getClass();
        C4302 c4302 = new C4302(abstractC1820.getClass(), cls);
        HashMap map = c4312.f16761;
        if (!map.containsKey(c4302)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + c4302 + " available");
        }
        switch (((C4301) map.get(c4302)).f16738.f5010) {
            case 24:
                c3875 = new C3875();
                if (!AbstractC0002.m34(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return c3875;
            default:
                c3875 = new C3875();
                if (!AbstractC0002.m45(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return c3875;
        }
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static synchronized C4801 m5576(C4794 c4794) {
        C1831 c1831;
        AbstractC1524 abstractC1524 = ((C1821) f7060.get()).m5565(c4794.m10765()).f7062;
        c1831 = new C1831(abstractC1524, (Class) abstractC1524.f6194);
        if (!((Boolean) f7059.get(c4794.m10765())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + c4794.m10765());
        }
        return c1831.m5572(c4794.m10766());
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public static synchronized void m5577(InterfaceC1824 interfaceC1824) {
        C4306.f16751.m9799(interfaceC1824);
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static Object m5578(String str, AbstractC0748 abstractC0748, Class cls) throws GeneralSecurityException {
        C1821 c1821 = (C1821) f7060.get();
        c1821.getClass();
        C1834 c1834M5565 = c1821.m5565(str);
        boolean zContains = ((Map) c1834M5565.f7062.f6193).keySet().contains(cls);
        AbstractC1524 abstractC1524 = c1834M5565.f7062;
        if (!zContains) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(abstractC1524.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet = ((Map) abstractC1524.f6193).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) abstractC1524.f6193).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1524.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC0758 abstractC0758Mo4112 = abstractC1524.mo4112(abstractC0748);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                abstractC1524.mo4111(abstractC0758Mo4112);
                return abstractC1524.m5109(abstractC0758Mo4112, cls);
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC1524.f6195).getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static synchronized void m5579(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = f7059;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z) {
            if (((C1821) f7060.get()).f7039.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f7061.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f7061.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public static synchronized void m5580(AbstractC1524 abstractC1524, boolean z) {
        try {
            AtomicReference atomicReference = f7060;
            C1821 c1821 = new C1821((C1821) atomicReference.get());
            c1821.m5563(abstractC1524);
            String strMo4113 = abstractC1524.mo4113();
            m5579(strMo4113, z ? abstractC1524.mo4114().ᵎʾ() : Collections.emptyMap(), z);
            if (!((C1821) atomicReference.get()).f7039.containsKey(strMo4113)) {
                f7058.put(strMo4113, new C1826());
                if (z) {
                    m5581(strMo4113, abstractC1524.mo4114().ᵎʾ());
                }
            }
            f7059.put(strMo4113, Boolean.valueOf(z));
            atomicReference.set(c1821);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public static void m5581(String str, Map map) {
        EnumC4778 enumC4778;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f7061;
            String str2 = (String) entry.getKey();
            byte[] bArrM3165 = ((C4316) entry.getValue()).f16770.m3165();
            int i = ((C4316) entry.getValue()).f16769;
            C4786 c4786M10759 = C4794.m10759();
            c4786M10759.m2948();
            C4794.m10761((C4794) c4786M10759.f3527, str);
            C0762 c0762M3129 = AbstractC0748.m3129(bArrM3165, 0, bArrM3165.length);
            c4786M10759.m2948();
            C4794.m10763((C4794) c4786M10759.f3527, c0762M3129);
            int iM5411 = AbstractC1702.m5411(i);
            if (iM5411 == 0) {
                enumC4778 = EnumC4778.f18317;
            } else if (iM5411 == 1) {
                enumC4778 = EnumC4778.f18318;
            } else if (iM5411 == 2) {
                enumC4778 = EnumC4778.f18315;
            } else {
                if (iM5411 != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                enumC4778 = EnumC4778.f18319;
            }
            c4786M10759.m2948();
            C4794.m10760((C4794) c4786M10759.f3527, enumC4778);
            concurrentHashMap.put(str2, new C1832((C4794) c4786M10759.m2947()));
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static Object m5582(byte[] bArr, String str) {
        C0762 c0762 = AbstractC0748.f3592;
        return m5578(str, AbstractC0748.m3129(bArr, 0, bArr.length), InterfaceC1830.class);
    }
}
