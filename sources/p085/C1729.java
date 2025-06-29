package p085;

import p184.InterfaceC2552;

/* renamed from: ʿᐧ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1729 implements InterfaceC2552 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2552 f6725;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f6726;

    public /* synthetic */ C1729(InterfaceC2552 interfaceC2552, int i) {
        this.f6726 = i;
        this.f6725 = interfaceC2552;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // p184.InterfaceC2552
    /* renamed from: ˏʾ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3959(java.lang.Object r5, p330.InterfaceC3746 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.f6726
            switch(r0) {
                case 0: goto L73;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof p164.C2383
            if (r0 == 0) goto L18
            r0 = r6
            ˊᵔ.ᵎˏ r0 = (p164.C2383) r0
            int r1 = r0.f9417
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f9417 = r1
            goto L1d
        L18:
            ˊᵔ.ᵎˏ r0 = new ˊᵔ.ᵎˏ
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f9418
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f9417
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto L54
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            ˊᵔ.ᵢʿ r5 = (p164.AbstractC2385) r5
            boolean r6 = r5 instanceof p164.C2390
            if (r6 != 0) goto L6e
            boolean r6 = r5 instanceof p164.C2373
            if (r6 != 0) goto L69
            boolean r6 = r5 instanceof p164.C2359
            if (r6 == 0) goto L57
            ˊᵔ.ʽᐧ r5 = (p164.C2359) r5
            java.lang.Object r5 = r5.f9334
            r0.f9417 = r3
            ˎ.ᐧʻ r6 = r4.f6725
            java.lang.Object r5 = r6.mo3959(r5, r0)
            if (r5 != r1) goto L54
            goto L56
        L54:
            ٴˑ.ˉⁱ r1 = p288.C3397.f13249
        L56:
            return r1
        L57:
            boolean r5 = r5 instanceof p164.C2389
            if (r5 == 0) goto L63
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L63:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L69:
            ˊᵔ.ˏᵢ r5 = (p164.C2373) r5
            java.lang.Throwable r5 = r5.f9390
            throw r5
        L6e:
            ˊᵔ.ﹶˆ r5 = (p164.C2390) r5
            java.lang.Throwable r5 = r5.f9435
            throw r5
        L73:
            boolean r0 = r6 instanceof p085.C1723
            if (r0 == 0) goto L86
            r0 = r6
            ʿᐧ.ˏᵢ r0 = (p085.C1723) r0
            int r1 = r0.f6703
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L86
            int r1 = r1 - r2
            r0.f6703 = r1
            goto L8b
        L86:
            ʿᐧ.ˏᵢ r0 = new ʿᐧ.ˏᵢ
            r0.<init>(r4, r6)
        L8b:
            java.lang.Object r6 = r0.f6704
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f6703
            r3 = 1
            if (r2 == 0) goto La2
            if (r2 != r3) goto L9a
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            goto Lb4
        L9a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        La2:
            ˈⁱ.ˉⁱ.ˆʿ(r6)
            boolean r6 = r5 instanceof p023.C1134
            if (r6 == 0) goto Lb4
            r0.f6703 = r3
            ˎ.ᐧʻ r6 = r4.f6725
            java.lang.Object r5 = r6.mo3959(r5, r0)
            if (r5 != r1) goto Lb4
            goto Lb6
        Lb4:
            ٴˑ.ˉⁱ r1 = p288.C3397.f13249
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p085.C1729.mo3959(java.lang.Object, ᴵⁱ.ʿʼ):java.lang.Object");
    }
}
