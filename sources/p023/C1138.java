package p023;

import p184.InterfaceC2551;
import p185.AbstractC2567;
import p338.InterfaceC3864;

/* renamed from: ʼʾ.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1138 implements InterfaceC2551 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final Object f4770;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f4771;

    public /* synthetic */ C1138(int i, Object obj) {
        this.f4771 = i;
        this.f4770 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1138(InterfaceC3864 interfaceC3864) {
        this.f4771 = 2;
        this.f4770 = (AbstractC2567) interfaceC3864;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r9v12, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p184.InterfaceC2551
    /* renamed from: ـﹶ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3972(p184.InterfaceC2552 r9, p330.InterfaceC3746 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.f4771
            switch(r0) {
                case 0: goto L7d;
                case 1: goto L67;
                default: goto L5;
            }
        L5:
            boolean r0 = r10 instanceof p184.C2550
            if (r0 == 0) goto L18
            r0 = r10
            ˎ.ـﹶ r0 = (p184.C2550) r0
            int r1 = r0.f10116
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f10116 = r1
            goto L1d
        L18:
            ˎ.ـﹶ r0 = new ˎ.ـﹶ
            r0.<init>(r8, r10)
        L1d:
            java.lang.Object r10 = r0.f10113
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f10116
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            ʻˎ.ˎٴ r9 = r0.f10114
            ˈⁱ.ˉⁱ.ˆʿ(r10)     // Catch: java.lang.Throwable -> L30
            goto L58
        L30:
            r10 = move-exception
            goto L63
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ˈⁱ.ˉⁱ.ˆʿ(r10)
            ʻˎ.ˎٴ r10 = new ʻˎ.ˎٴ
            ᴵⁱ.ˉי r2 = r0.f10143
            r10.<init>(r9, r2)
            r0.f10114 = r10     // Catch: java.lang.Throwable -> L61
            r0.f10116 = r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r8.f4770     // Catch: java.lang.Throwable -> L61
            ˎʻ.ﹶˆ r9 = (p185.AbstractC2567) r9     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r9.mo1054(r10, r0)     // Catch: java.lang.Throwable -> L61
            if (r9 != r1) goto L53
            goto L54
        L53:
            r9 = r3
        L54:
            if (r9 != r1) goto L57
            goto L5c
        L57:
            r9 = r10
        L58:
            r9.mo6677()
            r1 = r3
        L5c:
            return r1
        L5d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L63
        L61:
            r9 = move-exception
            goto L5d
        L63:
            r9.mo6677()
            throw r10
        L67:
            ʿᐧ.ﹶˆ r0 = new ʿᐧ.ﹶˆ
            r1 = 0
            r0.<init>(r9, r1)
            java.lang.Object r9 = r8.f4770
            ˎ.ˏʾ r9 = (p184.C2545) r9
            java.lang.Object r9 = r9.mo3972(r0, r10)
            ˊˋ.ـﹶ r10 = p155.EnumC2332.f9250
            if (r9 != r10) goto L7a
            goto L7c
        L7a:
            ٴˑ.ˉⁱ r9 = p288.C3397.f13249
        L7c:
            return r9
        L7d:
            androidx.lifecycle.ᵎʽ r2 = new androidx.lifecycle.ᵎʽ
            java.lang.Object r0 = r8.f4770
            r1 = r0
            ˎ.ٴˎ[] r1 = (p184.InterfaceC2551[]) r1
            r0 = 2
            r2.<init>(r0, r1)
            ʼʾ.ˉⁱ r3 = new ʼʾ.ˉⁱ
            r0 = 3
            r4 = 0
            r5 = 0
            r3.<init>(r0, r4, r5)
            ʻˎ.ˉי r6 = new ʻˎ.ˉי
            r5 = 0
            r0 = r6
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            ʻˎ.ˉⁱ r9 = new ʻˎ.ˉⁱ
            ᴵⁱ.ˉי r0 = r10.mo3963()
            r9.<init>(r10, r0)
            java.lang.Object r9 = ˏʼ.ʽᐧ.ᐧˋ(r9, r9, r6)
            ˊˋ.ـﹶ r10 = p155.EnumC2332.f9250
            ٴˑ.ˉⁱ r0 = p288.C3397.f13249
            if (r9 != r10) goto Lac
            goto Lad
        Lac:
            r9 = r0
        Lad:
            if (r9 != r10) goto Lb0
            r0 = r9
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p023.C1138.mo3972(ˎ.ᐧʻ, ᴵⁱ.ʿʼ):java.lang.Object");
    }
}
