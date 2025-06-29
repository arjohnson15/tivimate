package p140;

import androidx.work.impl.WorkDatabase_Impl;
import p013.C1047;
import p065.EnumC1475;
import p065.InterfaceC1521;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;

/* renamed from: ˉˏ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2170 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public EnumC1475 f8526;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ WorkDatabase_Impl f8527;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ C1047 f8528;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f8529;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public /* synthetic */ Object f8530;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170(WorkDatabase_Impl workDatabase_Impl, InterfaceC3746 interfaceC3746, C1047 c1047) {
        super(2, interfaceC3746);
        this.f8527 = workDatabase_Impl;
        this.f8528 = c1047;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2170) mo1056((InterfaceC1521) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[RETURN] */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1055(java.lang.Object r8) {
        /*
            r7 = this;
            ˊˋ.ـﹶ r0 = p155.EnumC2332.f9250
            int r1 = r7.f8529
            ʻי.ـﹶ r2 = r7.f8528
            androidx.work.impl.WorkDatabase_Impl r3 = r7.f8527
            if (r1 == 0) goto L8a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == r6) goto L51
            if (r1 == r5) goto L47
            if (r1 == r4) goto L3f
            r0 = 4
            if (r1 != r0) goto L37
            java.lang.Object r0 = r7.f8530
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L9e
            ʾᵔ.ˏᴵ r8 = r3.m5047()
            java.lang.Object r1 = r8.f6094
            ʾᵔ.ˏᵢ r1 = (p065.C1501) r1
            java.lang.Object r2 = r8.f6096
            ʾᵔ.ٴﹶ r2 = (p065.C1512) r2
            java.lang.Object r8 = r8.f6100
            ʾᵔ.ˏᵢ r8 = (p065.C1501) r8
            r2.m5090(r8, r1)
            goto L9e
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r0 = r7.f8530
            ʾᵔ.ᵔٴ r0 = (p065.InterfaceC1521) r0
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            goto L88
        L47:
            ʾᵔ.ʻʿ r1 = r7.f8526
            java.lang.Object r3 = r7.f8530
            ʾᵔ.ᵔٴ r3 = (p065.InterfaceC1521) r3
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            goto L74
        L51:
            ʾᵔ.ʻʿ r1 = r7.f8526
            java.lang.Object r6 = r7.f8530
            ʾᵔ.ᵔٴ r6 = (p065.InterfaceC1521) r6
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L75
            ʾᵔ.ˏᴵ r8 = r3.m5047()
            r7.f8530 = r6
            r7.f8526 = r1
            r7.f8529 = r5
            java.lang.Object r8 = r8.m5067(r7)
            if (r8 != r0) goto L73
            return r0
        L73:
            r3 = r6
        L74:
            r6 = r3
        L75:
            ˉˏ.ˉי r8 = new ˉˏ.ˉי
            r3 = 0
            r8.<init>(r3, r2)
            r7.f8530 = r6
            r7.f8526 = r3
            r7.f8529 = r4
            java.lang.Object r8 = r6.mo5097(r1, r8, r7)
            if (r8 != r0) goto L88
            return r0
        L88:
            r0 = r8
            goto L9e
        L8a:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            java.lang.Object r8 = r7.f8530
            ʾᵔ.ᵔٴ r8 = (p065.InterfaceC1521) r8
            ˉˏ.ﾞʽ r8 = (p140.InterfaceC2184) r8
            r8.mo6107()
            java.lang.Object r8 = r2.f4447
            ᴵﹳ.ˎٴ r8 = (p331.CallableC3763) r8
            java.lang.Object r0 = r8.call()
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2170.mo1055(java.lang.Object):java.lang.Object");
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        C2170 c2170 = new C2170(this.f8527, interfaceC3746, this.f8528);
        c2170.f8530 = obj;
        return c2170;
    }
}
