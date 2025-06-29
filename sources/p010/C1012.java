package p010;

import p184.InterfaceC2552;
import p423.C4883;

/* renamed from: ʻˎ.ˏᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1012 implements InterfaceC2552 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ int f4380;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ C4883 f4381;

    public C1012(C4883 c4883, int i) {
        this.f4381 = c4883;
        this.f4380 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p184.InterfaceC2552
    /* renamed from: ˏʾ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3959(java.lang.Object r7, p330.InterfaceC3746 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p010.C1018
            if (r0 == 0) goto L13
            r0 = r8
            ʻˎ.ᐧʻ r0 = (p010.C1018) r0
            int r1 = r0.f4397
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4397 = r1
            goto L18
        L13:
            ʻˎ.ᐧʻ r0 = new ʻˎ.ᐧʻ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4396
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f4397
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r5) goto L2d
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            goto Lcc
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            goto L4e
        L39:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            ʻי.ﾞˊ r8 = new ʻי.ﾞˊ
            int r2 = r6.f4380
            r8.<init>(r2, r7)
            r0.f4397 = r4
            ﹶʻ.ᐧʻ r7 = r6.f4381
            java.lang.Object r7 = r7.mo10956(r8, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r0.f4397 = r5
            ᴵⁱ.ˉי r7 = r0.f10143
            p072.AbstractC1642.m5298(r7)
            ᴵⁱ.ʿʼ r8 = ⁱـ.ˑי.ˏᴵ(r0)
            boolean r0 = r8 instanceof p148.C2257
            if (r0 == 0) goto L60
            ˊʻ.ʿʼ r8 = (p148.C2257) r8
            goto L61
        L60:
            r8 = 0
        L61:
            if (r8 != 0) goto L65
        L63:
            r7 = r3
            goto Lc5
        L65:
            ʿʽ.ﹳˎ r0 = r8.f8979
            boolean r2 = r0.mo5276(r7)
            if (r2 == 0) goto L75
            r8.f8980 = r3
            r8.f6358 = r4
            r0.mo5275(r7, r8)
            goto La9
        L75:
            ʿʽ.ᐧʼ r2 = new ʿʽ.ᐧʼ
            ʿʽ.ʿˏ r5 = p072.C1619.f6395
            r2.<init>(r5)
            ᴵⁱ.ˉי r7 = r7.mo3967(r2)
            r8.f8980 = r3
            r8.f6358 = r4
            r0.mo5275(r7, r8)
            boolean r7 = r2.f6396
            if (r7 == 0) goto La9
            ʿʽ.ˑⁱ r7 = p072.AbstractC1628.m5245()
            ʻי.ﹶˆ r0 = r7.f6384
            if (r0 == 0) goto L98
            boolean r0 = r0.isEmpty()
            goto L99
        L98:
            r0 = 1
        L99:
            if (r0 == 0) goto L9c
            goto L63
        L9c:
            boolean r0 = r7.m5225()
            if (r0 == 0) goto Lab
            r8.f8980 = r3
            r8.f6358 = r4
            r7.m5228(r8)
        La9:
            r7 = r1
            goto Lc5
        Lab:
            r7.m5224(r4)
            r8.run()     // Catch: java.lang.Throwable -> Lbb
        Lb1:
            boolean r0 = r7.m5230()     // Catch: java.lang.Throwable -> Lbb
            if (r0 != 0) goto Lb1
        Lb7:
            r7.m5226(r4)
            goto L63
        Lbb:
            r0 = move-exception
            r8.m5193(r0)     // Catch: java.lang.Throwable -> Lc0
            goto Lb7
        Lc0:
            r8 = move-exception
            r7.m5226(r4)
            throw r8
        Lc5:
            if (r7 != r1) goto Lc8
            goto Lc9
        Lc8:
            r7 = r3
        Lc9:
            if (r7 != r1) goto Lcc
            return r1
        Lcc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p010.C1012.mo3959(java.lang.Object, ᴵⁱ.ʿʼ):java.lang.Object");
    }
}
