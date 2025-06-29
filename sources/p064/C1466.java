package p064;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ʾᵎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1466 implements InterfaceC1474 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final InterfaceC1464 f5984;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f5985;

    public /* synthetic */ C1466(InterfaceC1464 interfaceC1464, int i) {
        this.f5985 = i;
        this.f5984 = interfaceC1464;
    }

    @Override // p064.InterfaceC1474
    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final Object mo5019(String str) throws GeneralSecurityException {
        switch (this.f5985) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 2; i++) {
                    Provider provider = Security.getProvider(strArr[i]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    InterfaceC1464 interfaceC1464 = this.f5984;
                    if (!zHasNext) {
                        return interfaceC1464.m5017(str, null);
                    }
                    try {
                        return interfaceC1464.m5017(str, (Provider) it.next());
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        }
                    }
                }
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < 3; i2++) {
                    Provider provider2 = Security.getProvider(strArr2[i2]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.f5984.m5017(str, (Provider) it2.next());
                    } catch (Exception e2) {
                        if (exc2 == null) {
                            exc2 = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}
