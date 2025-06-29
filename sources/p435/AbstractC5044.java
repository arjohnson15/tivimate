package p435;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import p169.C2460;
import p366.C4143;

/* renamed from: ﹶᵔ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC5044 {
    /* renamed from: ʽᐧ */
    public abstract Object mo1390(AbstractC5050 abstractC5050);

    /* renamed from: ʿʼ */
    public abstract void mo1391(AbstractC5048 abstractC5048, Object obj);

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C2460 m11157() {
        return this instanceof C2460 ? (C2460) this : new C2460(this);
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m11158(String str) {
        C4143 c4143 = new C4143();
        c4143.m9496(str);
        C5053 c5053 = new C5053(c4143);
        Object objMo1390 = mo1390(c5053);
        if ((this instanceof AbstractC5043) || c5053.mo11199() == 10) {
            return objMo1390;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final String m11159(Object obj) {
        C4143 c4143 = new C4143();
        try {
            mo1391(new C5061(c4143), obj);
            return c4143.m9515();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
