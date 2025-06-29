package p374;

import p166.AbstractC2394;
import p166.C2412;
import p166.C2434;
import p383.AbstractC4470;

/* renamed from: ᵢˎ.ﹳˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4289 extends AbstractC4267 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static final Object f16687 = new Object();

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f16688;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Object f16689;

    public C4289(AbstractC2394 abstractC2394, Object obj, Object obj2) {
        super(abstractC2394);
        this.f16688 = obj;
        this.f16689 = obj2;
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ʽᐧ */
    public final int mo6469(Object obj) {
        Object obj2;
        if (f16687.equals(obj) && (obj2 = this.f16689) != null) {
            obj = obj2;
        }
        return this.f16576.mo6469(obj);
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ˉⁱ */
    public final Object mo6472(int i) {
        Object objMo6472 = this.f16576.mo6472(i);
        return AbstractC4470.m10194(objMo6472, this.f16689) ? f16687 : objMo6472;
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ˋⁱ */
    public final C2434 mo6179(int i, C2434 c2434, long j) {
        this.f16576.mo6179(i, c2434, j);
        if (AbstractC4470.m10194(c2434.f9713, this.f16688)) {
            c2434.f9713 = C2434.f9702;
        }
        return c2434;
    }

    @Override // p374.AbstractC4267, p166.AbstractC2394
    /* renamed from: ٴˎ */
    public final C2412 mo6180(int i, C2412 c2412, boolean z) {
        this.f16576.mo6180(i, c2412, z);
        if (AbstractC4470.m10194(c2412.f9574, this.f16689) && z) {
            c2412.f9574 = f16687;
        }
        return c2412;
    }
}
