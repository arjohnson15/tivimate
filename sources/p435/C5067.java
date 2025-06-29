package p435;

import java.lang.reflect.Type;

/* renamed from: ﹶᵔ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5067 extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final String f19217;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object f19218;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Type f19219;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public AbstractC5044 f19220;

    public C5067(Type type, String str, Object obj) {
        this.f19219 = type;
        this.f19217 = str;
        this.f19218 = obj;
    }

    public final String toString() {
        AbstractC5044 abstractC5044 = this.f19220;
        return abstractC5044 != null ? abstractC5044.toString() : super.toString();
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        AbstractC5044 abstractC5044 = this.f19220;
        if (abstractC5044 != null) {
            return abstractC5044.mo1390(abstractC5050);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    public final void mo1391(AbstractC5048 abstractC5048, Object obj) {
        AbstractC5044 abstractC5044 = this.f19220;
        if (abstractC5044 == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        abstractC5044.mo1391(abstractC5048, obj);
    }
}
