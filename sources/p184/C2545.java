package p184;

import p185.AbstractC2567;
import p338.InterfaceC3864;

/* renamed from: ˎ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2545 implements InterfaceC2551 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2551 f10096;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f10097;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f10098;

    public /* synthetic */ C2545(InterfaceC2551 interfaceC2551, Object obj, int i) {
        this.f10098 = i;
        this.f10096 = interfaceC2551;
        this.f10097 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2545(InterfaceC2551 interfaceC2551, InterfaceC3864 interfaceC3864) {
        this.f10098 = 1;
        this.f10096 = interfaceC2551;
        this.f10097 = (AbstractC2567) interfaceC3864;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Type inference failed for: r1v5, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p184.InterfaceC2551
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3972(p184.InterfaceC2552 r6, p330.InterfaceC3746 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f10098
            switch(r0) {
                case 0: goto L36;
                case 1: goto L1f;
                default: goto L5;
            }
        L5:
            ʼʾ.ˏᴵ r0 = new ʼʾ.ˏᴵ
            java.lang.Object r1 = r5.f10097
            ﹶˎ.ˆʿ r1 = (p429.C4949) r1
            r2 = 3
            r0.<init>(r6, r2, r1)
            ˎ.ٴˎ r6 = r5.f10096
            ˎ.ˏʾ r6 = (p184.C2545) r6
            java.lang.Object r6 = r6.mo3972(r0, r7)
            ˊˋ.ـﹶ r7 = p155.EnumC2332.f9250
            if (r6 != r7) goto L1c
            goto L1e
        L1c:
            ٴˑ.ˉⁱ r6 = p288.C3397.f13249
        L1e:
            return r6
        L1f:
            ʼʾ.ˏᴵ r0 = new ʼʾ.ˏᴵ
            java.lang.Object r1 = r5.f10097
            ˎʻ.ﹶˆ r1 = (p185.AbstractC2567) r1
            r0.<init>(r6, r1)
            ˎ.ٴˎ r6 = r5.f10096
            java.lang.Object r6 = r6.mo3972(r0, r7)
            ˊˋ.ـﹶ r7 = p155.EnumC2332.f9250
            if (r6 != r7) goto L33
            goto L35
        L33:
            ٴˑ.ˉⁱ r6 = p288.C3397.f13249
        L35:
            return r6
        L36:
            boolean r0 = r7 instanceof p184.C2540
            if (r0 == 0) goto L49
            r0 = r7
            ˎ.ˉי r0 = (p184.C2540) r0
            int r1 = r0.f10083
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L49
            int r1 = r1 - r2
            r0.f10083 = r1
            goto L4e
        L49:
            ˎ.ˉי r0 = new ˎ.ˉי
            r0.<init>(r5, r7)
        L4e:
            java.lang.Object r7 = r0.f10085
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f10083
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L70
            if (r2 == r4) goto L68
            if (r2 != r3) goto L60
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L99
        L60:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L68:
            ˎ.ᐧʻ r6 = r0.f10084
            ˎ.ˏʾ r2 = r0.f10087
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L83
        L70:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            r0.f10087 = r5
            r0.f10084 = r6
            r0.f10083 = r4
            ˎ.ٴˎ r7 = r5.f10096
            java.io.Serializable r7 = p184.AbstractC2539.m6673(r7, r6, r0)
            if (r7 != r1) goto L82
            goto L9b
        L82:
            r2 = r5
        L83:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L99
            java.lang.Object r2 = r2.f10097
            ʼʾ.ˉⁱ r2 = (p023.C1137) r2
            r4 = 0
            r0.f10087 = r4
            r0.f10084 = r4
            r0.f10083 = r3
            java.lang.Object r6 = r2.mo3975(r6, r7, r0)
            if (r6 != r1) goto L99
            goto L9b
        L99:
            ٴˑ.ˉⁱ r1 = p288.C3397.f13249
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p184.C2545.mo3972(ˎ.ᐧʻ, ᴵⁱ.ʿʼ):java.lang.Object");
    }
}
