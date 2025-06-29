package p427;

import p065.EnumC1475;
import p065.InterfaceC1521;
import p140.InterfaceC2184;
import p185.AbstractC2562;
import p185.AbstractC2567;
import p262.InterfaceC3255;
import p338.InterfaceC3856;
import p338.InterfaceC3864;

/* renamed from: ﹶˉ.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4917 implements InterfaceC1521, InterfaceC2184 {

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final C4914 f18592;

    public C4917(C4914 c4914) {
        this.f18592 = c4914;
    }

    @Override // p065.InterfaceC1521
    /* renamed from: ʽᐧ */
    public final Object mo5097(EnumC1475 enumC1475, InterfaceC3864 interfaceC3864, AbstractC2567 abstractC2567) {
        return m11034(enumC1475, interfaceC3864, abstractC2567);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: ʿʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m11034(p065.EnumC1475 r6, p338.InterfaceC3864 r7, p185.AbstractC2562 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p427.C4913
            if (r0 == 0) goto L13
            r0 = r8
            ﹶˉ.ˑʽ r0 = (p427.C4913) r0
            int r1 = r0.f18583
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18583 = r1
            goto L18
        L13:
            ﹶˉ.ˑʽ r0 = new ﹶˉ.ˑʽ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f18585
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f18583
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ʼᵔ.ʽᐧ r6 = r0.f18582
            ﹶˉ.ﹳﹳ r7 = r0.f18584
            ˈⁱ.ˉⁱ.ˆʿ(r8)     // Catch: java.lang.Throwable -> L2b
            goto L6d
        L2b:
            r8 = move-exception
            goto L82
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ˈⁱ.ˉⁱ.ˆʿ(r8)
            ﹶˉ.ـﹶ r8 = r5.f18592
            ʼᵔ.ʽᐧ r8 = r8.f18587
            r8.mo4382()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L53
            if (r6 == r3) goto L4f
            r2 = 2
            if (r6 == r2) goto L4b
            goto L56
        L4b:
            r8.mo4386()
            goto L56
        L4f:
            r8.mo4384()
            goto L56
        L53:
            r8.mo4381()
        L56:
            ˉˏ.ᵎـ r6 = new ˉˏ.ᵎـ     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            r6.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7d
            r0.f18584 = r5     // Catch: java.lang.Throwable -> L7d
            r0.f18582 = r8     // Catch: java.lang.Throwable -> L7d
            r0.f18583 = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r6 = r7.mo1054(r6, r0)     // Catch: java.lang.Throwable -> L7d
            if (r6 != r1) goto L69
            return r1
        L69:
            r7 = r5
            r4 = r8
            r8 = r6
            r6 = r4
        L6d:
            r6.mo4390()     // Catch: java.lang.Throwable -> L2b
            r6.mo4385()
            boolean r6 = r6.mo4382()
            if (r6 != 0) goto L7c
            r7.getClass()
        L7c:
            return r8
        L7d:
            r6 = move-exception
            r7 = r5
            r4 = r8
            r8 = r6
            r6 = r4
        L82:
            r6.mo4385()
            boolean r6 = r6.mo4382()
            if (r6 != 0) goto L8e
            r7.getClass()
        L8e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p427.C4917.m11034(ʾᵔ.ʻʿ, ᵎˈ.ˑי, ˎʻ.ˑʽ):java.lang.Object");
    }

    @Override // p140.InterfaceC2184
    /* renamed from: ˑʽ */
    public final InterfaceC3255 mo6107() {
        return this.f18592;
    }

    @Override // p065.InterfaceC1506
    /* renamed from: ـﹶ */
    public final Object mo5080(String str, InterfaceC3856 interfaceC3856, AbstractC2562 abstractC2562) {
        AbstractC4916 abstractC4916Mo6108 = this.f18592.mo6108(str);
        try {
            return interfaceC3856.mo4036(abstractC4916Mo6108);
        } finally {
            abstractC4916Mo6108.close();
        }
    }

    @Override // p065.InterfaceC1521
    /* renamed from: ﹳﹳ */
    public final Object mo5098(AbstractC2567 abstractC2567) {
        return Boolean.valueOf(this.f18592.f18587.mo4382());
    }
}
