package p140;

import p013.C1056;
import p065.EnumC1475;
import p065.InterfaceC1521;
import p185.AbstractC2567;
import p262.InterfaceC3255;
import p280.C3375;
import p338.InterfaceC3864;
import ﹶⁱ.ـﹶ;

/* renamed from: ˉˏ.ﾞˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2185 implements InterfaceC1521, InterfaceC2184 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final boolean f8580;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final C1056 f8581 = new C1056();

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C2183 f8582;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C3375 f8583;

    public C2185(C2183 c2183, boolean z) {
        this.f8582 = c2183;
        this.f8580 = z;
        C3375 c3375 = new C3375();
        c3375.f13201 = 0;
        this.f8583 = c3375;
    }

    @Override // p065.InterfaceC1521
    /* renamed from: ʽᐧ */
    public final Object mo5097(EnumC1475 enumC1475, InterfaceC3864 interfaceC3864, AbstractC2567 abstractC2567) {
        if (this.f8583.m8229()) {
            ـﹶ.ﾞᐧ(21, "Connection is recycled");
            throw null;
        }
        C2175 c2175 = (C2175) abstractC2567.f10143.mo3966(C2175.f8547);
        if (c2175 != null && c2175.f8548 == this) {
            return m6111(enumC1475, interfaceC3864, abstractC2567);
        }
        ـﹶ.ﾞᐧ(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6109(p065.EnumC1475 r8, p185.AbstractC2562 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof p140.C2179
            if (r1 == 0) goto L15
            r1 = r9
            ˉˏ.ᵎˏ r1 = (p140.C2179) r1
            int r2 = r1.f8562
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f8562 = r2
            goto L1a
        L15:
            ˉˏ.ᵎˏ r1 = new ˉˏ.ᵎˏ
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f8565
            ˊˋ.ـﹶ r2 = p155.EnumC2332.f9250
            int r3 = r1.f8562
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            ˉˏ.ﹶˆ r8 = r1.f8564
            ʾᵔ.ʻʿ r2 = r1.f8560
            ˉˏ.ﾞˊ r1 = r1.f8563
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            r9 = r8
            r8 = r2
            goto L50
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            r1.f8563 = r7
            r1.f8560 = r8
            ˉˏ.ﹶˆ r9 = r7.f8582
            r1.f8564 = r9
            r1.f8562 = r4
            ˈˈ.ـﹶ r3 = r9.f8578
            java.lang.Object r1 = r3.mo5613(r1)
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            ʻי.ﹶˆ r3 = r1.f8581     // Catch: java.lang.Throwable -> L6f
            int r5 = r3.f4455     // Catch: java.lang.Throwable -> L6f
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6f
            ˉˏ.ﹶˆ r1 = r1.f8582
            if (r6 == 0) goto L7d
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6f
            if (r8 == 0) goto L77
            if (r8 == r4) goto L71
            r0 = 2
            if (r8 == r0) goto L69
            goto L91
        L69:
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            ﹶⁱ.ـﹶ.ﹳˎ(r1, r8)     // Catch: java.lang.Throwable -> L6f
            goto L91
        L6f:
            r8 = move-exception
            goto L9f
        L71:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            ﹶⁱ.ـﹶ.ﹳˎ(r1, r8)     // Catch: java.lang.Throwable -> L6f
            goto L91
        L77:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            ﹶⁱ.ـﹶ.ﹳˎ(r1, r8)     // Catch: java.lang.Throwable -> L6f
            goto L91
        L7d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            r8.append(r5)     // Catch: java.lang.Throwable -> L6f
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6f
            ﹶⁱ.ـﹶ.ﹳˎ(r1, r8)     // Catch: java.lang.Throwable -> L6f
        L91:
            ˉˏ.ˎٴ r8 = new ˉˏ.ˎٴ     // Catch: java.lang.Throwable -> L6f
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r3.addLast(r8)     // Catch: java.lang.Throwable -> L6f
            ٴˑ.ˉⁱ r8 = p288.C3397.f13249     // Catch: java.lang.Throwable -> L6f
            r9.mo5615(r2)
            return r8
        L9f:
            r9.mo5615(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2185.m6109(ʾᵔ.ʻʿ, ˎʻ.ˑʽ):java.lang.Object");
    }

    @Override // p140.InterfaceC2184
    /* renamed from: ˑʽ */
    public final InterfaceC3255 mo6107() {
        return this.f8582;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p065.InterfaceC1506
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5080(java.lang.String r7, p338.InterfaceC3856 r8, p185.AbstractC2562 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p140.C2167
            if (r0 == 0) goto L13
            r0 = r9
            ˉˏ.ˋˊ r0 = (p140.C2167) r0
            int r1 = r0.f8513
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8513 = r1
            goto L18
        L13:
            ˉˏ.ˋˊ r0 = new ˉˏ.ˋˊ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f8510
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f8513
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            ˉˏ.ﹶˆ r7 = r0.f8515
            ᵎˈ.ˉⁱ r8 = r0.f8514
            java.lang.String r1 = r0.f8509
            ˉˏ.ﾞˊ r0 = r0.f8512
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            r9 = r7
            r7 = r1
            goto L6d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            ٴʻ.ـﹶ r9 = r6.f8583
            boolean r9 = r9.m8229()
            r2 = 21
            if (r9 != 0) goto L96
            ﹳᴵ.ˉי r9 = p140.C2175.f8547
            ᴵⁱ.ˉי r5 = r0.f10143
            ᴵⁱ.ˏᵢ r9 = r5.mo3966(r9)
            ˉˏ.ـﹶ r9 = (p140.C2175) r9
            if (r9 == 0) goto L90
            ˉˏ.ﾞˊ r9 = r9.f8548
            if (r9 != r6) goto L90
            r0.f8512 = r6
            r0.f8509 = r7
            r0.f8514 = r8
            ˉˏ.ﹶˆ r9 = r6.f8582
            r0.f8515 = r9
            r0.f8513 = r4
            ˈˈ.ـﹶ r2 = r9.f8578
            java.lang.Object r0 = r2.mo5613(r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r0 = r6
        L6d:
            ˉˏ.ˑי r1 = new ˉˏ.ˑי     // Catch: java.lang.Throwable -> L85
            ˉˏ.ﹶˆ r2 = r0.f8582     // Catch: java.lang.Throwable -> L85
            ـʼ.ـﹶ r2 = r2.f8579     // Catch: java.lang.Throwable -> L85
            ـʼ.ˑʽ r7 = r2.mo6108(r7)     // Catch: java.lang.Throwable -> L85
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r7 = r8.mo4036(r1)     // Catch: java.lang.Throwable -> L87
            r1.close()     // Catch: java.lang.Throwable -> L85
            r9.mo5615(r3)
            return r7
        L85:
            r7 = move-exception
            goto L8c
        L87:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L85
            throw r7     // Catch: java.lang.Throwable -> L85
        L8c:
            r9.mo5615(r3)
            throw r7
        L90:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            ﹶⁱ.ـﹶ.ﾞᐧ(r2, r7)
            throw r3
        L96:
            java.lang.String r7 = "Connection is recycled"
            ﹶⁱ.ـﹶ.ﾞᐧ(r2, r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2185.mo5080(java.lang.String, ᵎˈ.ˉⁱ, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6110(boolean r8, p185.AbstractC2562 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof p140.C2181
            if (r2 == 0) goto L17
            r2 = r9
            ˉˏ.ﹳˎ r2 = (p140.C2181) r2
            int r3 = r2.f8570
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8570 = r3
            goto L1c
        L17:
            ˉˏ.ﹳˎ r2 = new ˉˏ.ﹳˎ
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f8573
            ˊˋ.ـﹶ r3 = p155.EnumC2332.f9250
            int r4 = r2.f8570
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            boolean r8 = r2.f8572
            ˉˏ.ﹶˆ r3 = r2.f8568
            ˉˏ.ﾞˊ r2 = r2.f8571
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            ˈⁱ.ˉⁱ.ˆʿ(r9)
            r2.f8571 = r7
            ˉˏ.ﹶˆ r9 = r7.f8582
            r2.f8568 = r9
            r2.f8572 = r8
            r2.f8570 = r5
            ˈˈ.ـﹶ r4 = r9.f8578
            java.lang.Object r2 = r4.mo5613(r2)
            if (r2 != r3) goto L4f
            return r3
        L4f:
            r2 = r7
            r3 = r9
        L51:
            r9 = 0
            ʻי.ﹶˆ r4 = r2.f8581     // Catch: java.lang.Throwable -> L75
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto Lb2
            java.lang.Object r5 = p013.AbstractC1052.m4040(r4)     // Catch: java.lang.Throwable -> L75
            ˉˏ.ˎٴ r5 = (p140.C2169) r5     // Catch: java.lang.Throwable -> L75
            r6 = 39
            ˉˏ.ﹶˆ r2 = r2.f8582
            if (r8 == 0) goto L8c
            r5.getClass()     // Catch: java.lang.Throwable -> L75
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L77
            java.lang.String r8 = "END TRANSACTION"
            ﹶⁱ.ـﹶ.ﹳˎ(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L75:
            r8 = move-exception
            goto Lba
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f8525     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            ﹶⁱ.ـﹶ.ﹳˎ(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L8c:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L98
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            ﹶⁱ.ـﹶ.ﹳˎ(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L98:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f8525     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            ﹶⁱ.ـﹶ.ﹳˎ(r2, r8)     // Catch: java.lang.Throwable -> L75
        Lac:
            ٴˑ.ˉⁱ r8 = p288.C3397.f13249     // Catch: java.lang.Throwable -> L75
            r3.mo5615(r9)
            return r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        Lba:
            r3.mo5615(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2185.m6110(boolean, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6111(p065.EnumC1475 r11, p338.InterfaceC3864 r12, p185.AbstractC2562 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p140.C2185.m6111(ʾᵔ.ʻʿ, ᵎˈ.ˑי, ˎʻ.ˑʽ):java.lang.Object");
    }

    @Override // p065.InterfaceC1521
    /* renamed from: ﹳﹳ */
    public final Object mo5098(AbstractC2567 abstractC2567) {
        if (this.f8583.m8229()) {
            ـﹶ.ﾞᐧ(21, "Connection is recycled");
            throw null;
        }
        C2175 c2175 = (C2175) abstractC2567.f10143.mo3966(C2175.f8547);
        if (c2175 != null && c2175.f8548 == this) {
            return Boolean.valueOf(!this.f8581.isEmpty());
        }
        ـﹶ.ﾞᐧ(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
}
