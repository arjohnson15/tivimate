package p140;

import androidx.work.impl.WorkDatabase_Impl;
import p013.C1047;
import p065.C1508;
import p072.InterfaceC1594;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import p423.InterfaceC4876;

/* renamed from: ˉˏ.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2166 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public Object f8502;

    /* renamed from: ˋˉ, reason: contains not printable characters */
    public final /* synthetic */ C1508 f8503;

    /* renamed from: ـˆ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4876 f8504;

    /* renamed from: ᴵʼ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4876 f8505;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f8506;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ WorkDatabase_Impl f8507;

    /* renamed from: ﾞᐧ, reason: contains not printable characters */
    public final /* synthetic */ C1047 f8508;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166(WorkDatabase_Impl workDatabase_Impl, C1508 c1508, InterfaceC4876 interfaceC4876, InterfaceC4876 interfaceC48762, C1047 c1047, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f8507 = workDatabase_Impl;
        this.f8503 = c1508;
        this.f8504 = interfaceC4876;
        this.f8505 = interfaceC48762;
        this.f8508 = c1047;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2166) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:9:0x0028, B:27:0x0062, B:30:0x006e, B:32:0x0077, B:35:0x008d, B:14:0x0033, B:17:0x003b, B:26:0x005b), top: B:52:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0098 -> B:27:0x0062). Please report as a decompilation issue!!! */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1055(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            ˊˋ.ـﹶ r0 = p155.EnumC2332.f9250
            int r1 = r8.f8506
            androidx.work.impl.WorkDatabase_Impl r2 = r8.f8507
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 1
            ʾᵔ.ـˆ r5 = r8.f8503
            switch(r1) {
                case 0: goto L43;
                case 1: goto L3f;
                case 2: goto L37;
                case 3: goto L2f;
                case 4: goto L24;
                case 5: goto L1f;
                case 6: goto L16;
                default: goto Le;
            }
        Le:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L16:
            java.lang.Object r0 = r8.f8502
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            goto Lcc
        L1f:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            goto Lb3
        L24:
            java.lang.Object r1 = r8.f8502
            ﹶʻ.ˑʽ r1 = (p423.C4879) r1
            ˈⁱ.ˉⁱ.ˆʿ(r9)     // Catch: java.lang.Throwable -> L2c
            goto L62
        L2c:
            r9 = move-exception
            goto Lb4
        L2f:
            java.lang.Object r1 = r8.f8502
            ﹶʻ.ˑʽ r1 = (p423.C4879) r1
            ˈⁱ.ˉⁱ.ˆʿ(r9)     // Catch: java.lang.Throwable -> L2c
            goto L8d
        L37:
            java.lang.Object r1 = r8.f8502
            ﹶʻ.ˑʽ r1 = (p423.C4879) r1
            ˈⁱ.ˉⁱ.ˆʿ(r9)     // Catch: java.lang.Throwable -> L2c
            goto L6e
        L3f:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            goto L5b
        L43:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            ʾᵔ.ˏᴵ r9 = r2.m5047()
            r8.f8506 = r4
            java.lang.Object r9 = r9.f6096
            ʾᵔ.ٴﹶ r9 = (p065.C1512) r9
            java.lang.Object r9 = r9.m5086(r5, r8)
            if (r9 != r0) goto L57
            goto L58
        L57:
            r9 = r3
        L58:
            if (r9 != r0) goto L5b
            return r0
        L5b:
            ﹶʻ.ˏʾ r9 = r8.f8504     // Catch: java.lang.Throwable -> L2c
            ﹶʻ.ˑʽ r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2c
            r1 = r9
        L62:
            r8.f8502 = r1     // Catch: java.lang.Throwable -> L2c
            r9 = 2
            r8.f8506 = r9     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r1.m10962(r8)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L6e
            return r0
        L6e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            if (r9 == 0) goto L9b
            r1.m10963()     // Catch: java.lang.Throwable -> L2c
            ʻי.ـﹶ r9 = r8.f8508     // Catch: java.lang.Throwable -> L2c
            ˉˏ.ˏʾ r7 = new ˉˏ.ˏʾ     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r2, r6, r9)     // Catch: java.lang.Throwable -> L2c
            r8.f8502 = r1     // Catch: java.lang.Throwable -> L2c
            r9 = 3
            r8.f8506 = r9     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r2.m5054(r4, r7, r8)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L8d
            return r0
        L8d:
            ﹶʻ.ˏʾ r6 = r8.f8505     // Catch: java.lang.Throwable -> L2c
            r8.f8502 = r1     // Catch: java.lang.Throwable -> L2c
            r7 = 4
            r8.f8506 = r7     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r6.mo10956(r9, r8)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r0) goto L62
            return r0
        L9b:
            ʾᵔ.ˏᴵ r9 = r2.m5047()
            r8.f8502 = r6
            r1 = 5
            r8.f8506 = r1
            java.lang.Object r9 = r9.f6096
            ʾᵔ.ٴﹶ r9 = (p065.C1512) r9
            java.lang.Object r9 = r9.m5088(r5, r8)
            if (r9 != r0) goto Laf
            goto Lb0
        Laf:
            r9 = r3
        Lb0:
            if (r9 != r0) goto Lb3
            return r0
        Lb3:
            return r3
        Lb4:
            ʾᵔ.ˏᴵ r1 = r2.m5047()
            r8.f8502 = r9
            r2 = 6
            r8.f8506 = r2
            java.lang.Object r1 = r1.f6096
            ʾᵔ.ٴﹶ r1 = (p065.C1512) r1
            java.lang.Object r1 = r1.m5088(r5, r8)
            if (r1 != r0) goto Lc8
            r3 = r1
        Lc8:
            if (r3 != r0) goto Lcb
            return r0
        Lcb:
            r0 = r9
        Lcc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2166.mo1055(java.lang.Object):java.lang.Object");
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C2166(this.f8507, this.f8503, this.f8504, this.f8505, this.f8508, interfaceC3746);
    }
}
