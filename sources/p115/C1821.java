package p115;

import android.support.v4.media.session.AbstractC0002;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;
import p065.AbstractC1524;

/* renamed from: ˈʽ.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1821 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final Logger f7038 = Logger.getLogger(C1821.class.getName());

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final ConcurrentHashMap f7039;

    public C1821() {
        this.f7039 = new ConcurrentHashMap();
    }

    public C1821(C1821 c1821) {
        this.f7039 = new ConcurrentHashMap(c1821.f7039);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final synchronized void m5563(AbstractC1524 abstractC1524) {
        int iMo4109 = abstractC1524.mo4109();
        if (!(iMo4109 != 1 ? AbstractC0002.m45(iMo4109) : AbstractC0002.m34(iMo4109))) {
            throw new GeneralSecurityException("failed to register key manager " + abstractC1524.getClass() + " as it is not FIPS compatible.");
        }
        m5564(new C1834(abstractC1524));
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final synchronized void m5564(C1834 c1834) {
        try {
            AbstractC1524 abstractC1524 = c1834.f7062;
            Class cls = (Class) abstractC1524.f6194;
            if (!((Map) abstractC1524.f6193).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1524.toString() + " does not support primitive class " + cls.getName());
            }
            String strMo4113 = abstractC1524.mo4113();
            C1834 c18342 = (C1834) this.f7039.get(strMo4113);
            if (c18342 != null && !c18342.f7062.getClass().equals(c1834.f7062.getClass())) {
                f7038.warning("Attempted overwrite of a registered key manager for key type ".concat(strMo4113));
                throw new GeneralSecurityException("typeUrl (" + strMo4113 + ") is already registered with " + c18342.f7062.getClass().getName() + ", cannot be re-registered with " + c1834.f7062.getClass().getName());
            }
            this.f7039.putIfAbsent(strMo4113, c1834);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final synchronized C1834 m5565(String str) {
        if (!this.f7039.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (C1834) this.f7039.get(str);
    }
}
