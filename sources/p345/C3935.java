package p345;

import java.io.Serializable;

/* renamed from: ᵎᴵ.ˋˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C3935 extends AbstractC3945 implements Serializable {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient C3930 f15286;

    public C3935(C3930 c3930, int i) {
        this.f15286 = c3930;
    }

    @Override // com.google.common.collect.AbstractC0720
    /* renamed from: ʽᐧ */
    public final boolean mo2919(Object obj) {
        return obj != null && super.mo2919(obj);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC3985 m9150() {
        return this.f15286.keySet();
    }

    @Override // com.google.common.collect.AbstractC0720
    /* renamed from: ˑʽ, reason: merged with bridge method [inline-methods] */
    public C3930 mo2920() {
        return this.f15286;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC3980 m9151(String str) {
        AbstractC3980 abstractC3980 = (AbstractC3980) this.f15286.get(str);
        if (abstractC3980 != null) {
            return abstractC3980;
        }
        C3928 c3928 = AbstractC3980.f15360;
        return C3932.f15274;
    }
}
