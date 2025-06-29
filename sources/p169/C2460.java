package p169;

import p435.AbstractC5044;
import p435.AbstractC5048;
import p435.AbstractC5050;

/* renamed from: ˋʿ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2460 extends AbstractC5044 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final AbstractC5044 f9792;

    public C2460(AbstractC5044 abstractC5044) {
        this.f9792 = abstractC5044;
    }

    public final String toString() {
        return this.f9792 + ".nullSafe()";
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        if (abstractC5050.mo11199() != 9) {
            return this.f9792.mo1390(abstractC5050);
        }
        abstractC5050.mo11195();
        return null;
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        if (obj == null) {
            abstractC5048.mo11177();
        } else {
            this.f9792.mo1391(abstractC5048, obj);
        }
    }
}
