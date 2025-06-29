package p051;

import androidx.datastore.preferences.protobuf.AbstractC0080;
import com.hierynomus.spnego.SpnegoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p075.C1651;
import p087.C1737;
import p087.C1738;
import p091.C1751;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p201.C2760;
import p332.AbstractC3777;
import p332.C3776;
import p332.C3778;
import p332.C3779;
import p419.C4852;
import p419.C4853;
import p447.AbstractC5179;

/* renamed from: ʽﾞ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1314 extends AbstractC0080 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public Object f5359;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final /* synthetic */ int f5360 = 0;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public byte[] f5361;

    public C1314() {
        super(0, "NegTokenInit");
        this.f5359 = new ArrayList();
    }

    public /* synthetic */ C1314(int i, String str) {
        super(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˋˉ */
    public void mo570(AbstractC3777 abstractC3777, AbstractC1841 abstractC1841) throws IOException {
        switch (this.f5360) {
            case 1:
                throw null;
            default:
                super.mo570(abstractC3777, abstractC1841);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0080
    /* renamed from: ˏʾ */
    public void mo572(C4852 c4852) throws SpnegoException {
        switch (this.f5360) {
            case 0:
                if (c4852.m10915().toString().contains("not_defined_in_RFC4178@please_ignore")) {
                    return;
                }
                AbstractC1845 abstractC1845 = c4852.f7065;
                int i = abstractC1845.f7081;
                if (i == 0) {
                    m4619(c4852.m10915());
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        m4618(c4852.m10915());
                        return;
                    } else {
                        if (i != 3) {
                            throw new SpnegoException(AbstractC5179.m11550(new StringBuilder("Unknown Object Tag "), abstractC1845.f7081, " encountered."));
                        }
                        return;
                    }
                }
                return;
            default:
                int i2 = c4852.f7065.f7081;
                if (i2 == 0) {
                    AbstractC1841 abstractC1841M10915 = c4852.m10915();
                    if (abstractC1841M10915 instanceof C1738) {
                        return;
                    } else {
                        throw new SpnegoException("Expected the negResult (ENUMERATED) contents, not: " + ((C1737) this.f5359));
                    }
                }
                if (i2 == 1) {
                    AbstractC1841 abstractC1841M109152 = c4852.m10915();
                    if (abstractC1841M109152 instanceof C1737) {
                        this.f5359 = (C1737) abstractC1841M109152;
                        return;
                    } else {
                        throw new SpnegoException("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + abstractC1841M109152);
                    }
                }
                if (i2 == 2) {
                    AbstractC1841 abstractC1841M109153 = c4852.m10915();
                    if (abstractC1841M109153 instanceof C2760) {
                        byte[] bArr = ((C2760) abstractC1841M109153).f10792;
                        this.f5361 = Arrays.copyOf(bArr, bArr.length);
                        return;
                    } else {
                        throw new SpnegoException("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC1841M109153);
                    }
                }
                if (i2 != 3) {
                    throw new SpnegoException(AbstractC5179.m11550(new StringBuilder("Unknown Object Tag "), c4852.f7065.f7081, " encountered."));
                }
                AbstractC1841 abstractC1841M109154 = c4852.m10915();
                if (abstractC1841M109154 instanceof C2760) {
                    byte[] bArr2 = ((C2760) abstractC1841M109154).f10792;
                    Arrays.copyOf(bArr2, bArr2.length);
                    return;
                } else {
                    throw new SpnegoException("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC1841M109154);
                }
        }
    }

    /* renamed from: ـˆ, reason: contains not printable characters */
    public void m4617(byte[] bArr) throws IOException, SpnegoException {
        try {
            C1751 c1751 = new C1751(new C1651(9), new C3778(0, new C3776(bArr, true, C3779.f14620)));
            try {
                m569(c1751.m5467());
                c1751.close();
            } finally {
            }
        } catch (IOException e) {
            throw new SpnegoException("Could not read NegTokenTarg from buffer", e);
        }
    }

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public void m4618(AbstractC1841 abstractC1841) throws SpnegoException {
        if (abstractC1841 instanceof C2760) {
            byte[] bArr = ((C2760) abstractC1841).f10792;
            this.f5361 = Arrays.copyOf(bArr, bArr.length);
        } else {
            throw new SpnegoException("Expected the MechToken (OCTET_STRING) contents, not: " + abstractC1841);
        }
    }

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public void m4619(AbstractC1841 abstractC1841) throws SpnegoException {
        if (!(abstractC1841 instanceof C4853)) {
            throw new SpnegoException("Expected the MechTypeList (SEQUENCE) contents, not: " + abstractC1841);
        }
        Iterator it = ((C4853) abstractC1841).iterator();
        while (it.hasNext()) {
            AbstractC1841 abstractC18412 = (AbstractC1841) it.next();
            if (!(abstractC18412 instanceof C1737)) {
                throw new SpnegoException("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: " + abstractC18412);
            }
            ((ArrayList) this.f5359).add((C1737) abstractC18412);
        }
    }
}
