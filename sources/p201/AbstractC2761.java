package p201;

import java.util.Collections;
import java.util.Iterator;
import p087.C1735;
import p117.AbstractC1841;
import p117.AbstractC1845;
import p117.C1842;
import p117.EnumC1844;
import p419.C4853;
import ﹳᴵ.ˉי;

/* renamed from: ˎᐧ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC2761 extends AbstractC1841 implements Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final byte[] f10792;

    public AbstractC2761(AbstractC1845 abstractC1845, byte[] bArr) {
        super(abstractC1845);
        this.f10792 = bArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        if (this.f7065.f7084 != EnumC1844.f7069) {
            return Collections.singletonList(this).iterator();
        }
        C1842 c1842 = AbstractC1845.f7075;
        ˉי r1 = new ˉי(9);
        c1842.getClass();
        return ((C4853) new C1735(r1, 7).m5458(c1842, this.f10792)).iterator();
    }
}
