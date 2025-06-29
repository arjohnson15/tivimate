package p064;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p383.C4456;

/* renamed from: ʾᵎ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1463 extends ThreadLocal {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final /* synthetic */ C4456 f5982;

    public C1463(C4456 c4456) {
        this.f5982 = c4456;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        C4456 c4456 = this.f5982;
        try {
            C1461 c1461 = C1461.f5980;
            Mac mac = (Mac) c1461.f5981.mo5019((String) c4456.f17164);
            mac.init((SecretKeySpec) c4456.f17162);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
