package p091;

import com.hierynomus.asn1.ASN1ParseException;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.util.Iterator;
import p075.C1651;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p332.C3778;
import p344.AbstractC3917;
import p344.InterfaceC3918;
import ﹳᴵ.ˉי;

/* renamed from: ʿﾞ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1751 extends FilterInputStream implements Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final InterfaceC3918 f6782 = AbstractC3917.m9105(C1751.class);

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final ˉי f6783;

    public C1751(C1651 c1651, C3778 c3778) {
        super(c3778);
        this.f6783 = c1651;
    }

    public C1751(ˉי r2, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.f6783 = r2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1753(this);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC1841 m5467() {
        ˉי r0 = this.f6783;
        try {
            r0.getClass();
            AbstractC1845 abstractC1845 = ˉי.ˎˑ(this);
            InterfaceC3918 interfaceC3918 = f6782;
            interfaceC3918.mo5516(abstractC1845, "Read ASN.1 tag {}");
            int i = ˉי.ˆʿ(this);
            interfaceC3918.mo5516(Integer.valueOf(i), "Read ASN.1 object length: {}");
            AbstractC1841 abstractC1841 = abstractC1845.mo5604(r0).ˑʾ(abstractC1845, ˉי.ᐧˋ(i, this));
            interfaceC3918.mo5517(abstractC1841, "Read ASN.1 object: {}");
            return abstractC1841;
        } catch (ASN1ParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new ASN1ParseException(e2, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
    }
}
