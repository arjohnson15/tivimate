package p010;

import p155.EnumC2332;
import p184.InterfaceC2551;
import p288.C3397;
import p330.InterfaceC3746;
import p330.InterfaceC3747;
import p423.InterfaceC4887;

/* renamed from: ʻˎ.ٴˎ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1017 extends AbstractC1023 {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final InterfaceC2551 f4394;

    public C1017(InterfaceC2551 interfaceC2551, InterfaceC3747 interfaceC3747, int i, int i2) {
        super(interfaceC3747, i, i2);
        this.f4394 = interfaceC2551;
    }

    @Override // p010.AbstractC1023
    public final String toString() {
        return this.f4394 + " -> " + super.toString();
    }

    @Override // p010.AbstractC1023
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Object mo3971(InterfaceC4887 interfaceC4887, InterfaceC3746 interfaceC3746) {
        Object objMo3972 = this.f4394.mo3972(new C1007(interfaceC4887), interfaceC3746);
        EnumC2332 enumC2332 = EnumC2332.f9250;
        C3397 c3397 = C3397.f13249;
        if (objMo3972 != enumC2332) {
            objMo3972 = c3397;
        }
        return objMo3972 == enumC2332 ? objMo3972 : c3397;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    @Override // p010.AbstractC1023, p184.InterfaceC2551
    /* renamed from: ـﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3972(p184.InterfaceC2552 r8, p330.InterfaceC3746 r9) {
        /*
            r7 = this;
            ٴˑ.ˉⁱ r0 = p288.C3397.f13249
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r7.f4402
            r3 = -3
            if (r2 != r3) goto L7b
            ᴵⁱ.ˉי r2 = r9.mo3963()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            ʻˎ.ᵎـ r4 = new ʻˎ.ᵎـ
            r5 = 3
            r4.<init>(r5)
            ᴵⁱ.ˉי r5 = r7.f4404
            java.lang.Object r3 = r5.mo3968(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 != 0) goto L29
            ᴵⁱ.ˉי r3 = r2.mo3967(r5)
            goto L2d
        L29:
            ᴵⁱ.ˉי r3 = p072.AbstractC1642.m5292(r2, r5, r4)
        L2d:
            boolean r5 = p070.AbstractC1549.m5138(r3, r2)
            if (r5 == 0) goto L41
            ˎ.ٴˎ r2 = r7.f4394
            java.lang.Object r8 = r2.mo3972(r8, r9)
            if (r8 != r1) goto L3c
            goto L3d
        L3c:
            r8 = r0
        L3d:
            if (r8 != r1) goto L82
        L3f:
            r0 = r8
            goto L82
        L41:
            ᴵⁱ.ٴˎ r5 = p330.C3753.f14515
            ᴵⁱ.ˏᵢ r6 = r3.mo3966(r5)
            ᴵⁱ.ˏᵢ r2 = r2.mo3966(r5)
            boolean r2 = p070.AbstractC1549.m5138(r6, r2)
            if (r2 == 0) goto L7b
            ᴵⁱ.ˉי r2 = r9.mo3963()
            boolean r5 = r8 instanceof p010.C1007
            if (r5 != 0) goto L64
            boolean r5 = r8 instanceof p010.C1011
            if (r5 == 0) goto L5e
            goto L64
        L5e:
            ʻˎ.יʻ r5 = new ʻˎ.יʻ
            r5.<init>(r8, r2)
            r8 = r5
        L64:
            ʻˎ.ʿʼ r2 = new ʻˎ.ʿʼ
            r5 = 0
            r2.<init>(r7, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ʻˎ.ᵎـ r5 = p148.AbstractC2269.f9001
            java.lang.Object r4 = r3.mo3968(r4, r5)
            java.lang.Object r8 = p010.AbstractC1014.m3969(r3, r8, r4, r2, r9)
            if (r8 != r1) goto L82
            goto L3f
        L7b:
            java.lang.Object r8 = super.mo3972(r8, r9)
            if (r8 != r1) goto L82
            goto L3f
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.C1017.mo3972(ˎ.ᐧʻ, ᴵⁱ.ʿʼ):java.lang.Object");
    }

    @Override // p010.AbstractC1023
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final AbstractC1023 mo3973(InterfaceC3747 interfaceC3747, int i, int i2) {
        return new C1017(this.f4394, interfaceC3747, i, i2);
    }
}
