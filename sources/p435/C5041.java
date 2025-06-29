package p435;

import java.util.List;
import java.util.Map;
import p080.AbstractC1702;
import ᵎﹳ.ᐧʻ;

/* renamed from: ﹶᵔ.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5041 extends AbstractC5044 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final AbstractC5044 f19130;

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final AbstractC5044 f19131;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final AbstractC5044 f19132;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C5054 f19133;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final AbstractC5044 f19134;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC5044 f19135;

    public C5041(C5054 c5054) {
        this.f19133 = c5054;
        this.f19130 = c5054.m11214(List.class);
        this.f19132 = c5054.m11214(Map.class);
        this.f19135 = c5054.m11214(String.class);
        this.f19131 = c5054.m11214(Double.class);
        this.f19134 = c5054.m11214(Boolean.class);
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }

    @Override // p435.AbstractC5044
    /* renamed from: ʽᐧ */
    public final Object mo1390(AbstractC5050 abstractC5050) {
        int iM5411 = AbstractC1702.m5411(abstractC5050.mo11199());
        if (iM5411 == 0) {
            return this.f19130.mo1390(abstractC5050);
        }
        if (iM5411 == 2) {
            return this.f19132.mo1390(abstractC5050);
        }
        if (iM5411 == 5) {
            return this.f19135.mo1390(abstractC5050);
        }
        if (iM5411 == 6) {
            return this.f19131.mo1390(abstractC5050);
        }
        if (iM5411 == 7) {
            return this.f19134.mo1390(abstractC5050);
        }
        if (iM5411 == 8) {
            abstractC5050.mo11195();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + ᐧʻ.ˈٴ(abstractC5050.mo11199()) + " at path " + abstractC5050.m11186());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[PHI: r1
  0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:6:0x0015, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p435.AbstractC5044
    /* renamed from: ʿʼ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1391(p435.AbstractC5048 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.mo11173()
            r5.mo11178()
            goto L2e
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = p169.AbstractC2458.f9787
            r2 = 0
            ﹶᵔ.יʻ r3 = r4.f19133
            ﹶᵔ.ˉⁱ r0 = r3.m11213(r0, r1, r2)
            r0.mo1391(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p435.C5041.mo1391(ﹶᵔ.ˎٴ, java.lang.Object):void");
    }
}
