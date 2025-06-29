package p419;

import com.hierynomus.asn1.ASN1ParseException;
import java.io.IOException;
import java.util.Iterator;
import p087.C1735;
import p091.C1751;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p117.C1842;
import p117.EnumC1844;
import ﹳᴵ.ˉי;

/* renamed from: ﹳᵢ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4852 extends AbstractC1841 implements Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final AbstractC1841 f18349;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final boolean f18350;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public byte[] f18351;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final ˉי f18352;

    public C4852(AbstractC1845 abstractC1845, AbstractC1841 abstractC1841, boolean z) {
        super(z ? abstractC1845.m5607(EnumC1844.f7069) : abstractC1845.m5607(abstractC1841.f7065.f7084));
        this.f18349 = abstractC1841;
        this.f18350 = z;
        this.f18351 = null;
    }

    public C4852(AbstractC1845 abstractC1845, byte[] bArr, ˉי r3) {
        super(abstractC1845);
        this.f18350 = true;
        this.f18351 = bArr;
        this.f18352 = r3;
        this.f18349 = null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((C4853) m10916(AbstractC1845.f7075)).iterator();
    }

    @Override // p117.AbstractC1841
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4852.class.getSimpleName());
        sb.append("[");
        sb.append(this.f7065);
        AbstractC1841 abstractC1841 = this.f18349;
        if (abstractC1841 != null) {
            sb.append(",");
            sb.append(abstractC1841);
        } else {
            sb.append(",<unknown>");
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final AbstractC1841 m10915() {
        AbstractC1841 abstractC1841 = this.f18349;
        if (abstractC1841 != null) {
            return abstractC1841;
        }
        try {
            C1751 c1751 = new C1751(this.f18352, this.f18351);
            try {
                AbstractC1841 abstractC1841M5467 = c1751.m5467();
                c1751.close();
                return abstractC1841M5467;
            } finally {
            }
        } catch (ASN1ParseException e) {
            throw new ASN1ParseException(e, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.f7065);
        } catch (IOException e2) {
            throw new ASN1ParseException(e2, "Could not parse the inputstream", new Object[0]);
        }
    }

    @Override // p117.AbstractC1841
    /* renamed from: ﹳﹳ */
    public final Object mo5457() {
        return m10915();
    }

    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final AbstractC1841 m10916(C1842 c1842) {
        AbstractC1841 abstractC1841 = this.f18349;
        if (abstractC1841 != null && abstractC1841.f7065.equals(c1842)) {
            return abstractC1841;
        }
        if (abstractC1841 != null || this.f18351 == null) {
            throw new ASN1ParseException("Unable to parse the implicit Tagged Object with %s, it is explicit", c1842);
        }
        ˉי r0 = this.f18352;
        c1842.getClass();
        return new C1735(r0, 7).m5458(c1842, this.f18351);
    }
}
