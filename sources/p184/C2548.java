package p184;

import p010.AbstractC1023;
import p185.AbstractC2567;
import p330.InterfaceC3747;
import p338.InterfaceC3864;

/* renamed from: ˎ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2548 extends AbstractC1023 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final AbstractC2567 f10107;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final AbstractC2567 f10108;

    /* JADX WARN: Multi-variable type inference failed */
    public C2548(InterfaceC3864 interfaceC3864, InterfaceC3747 interfaceC3747, int i, int i2) {
        super(interfaceC3747, i, i2);
        AbstractC2567 abstractC2567 = (AbstractC2567) interfaceC3864;
        this.f10108 = abstractC2567;
        this.f10107 = abstractC2567;
    }

    @Override // p010.AbstractC1023
    public final String toString() {
        return "block[" + this.f10108 + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ﹶʻ.ﹳˎ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7, types: [ﹶʻ.ﹳˎ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p010.AbstractC1023
    /* renamed from: ˑʽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3971(p423.InterfaceC4887 r6, p330.InterfaceC3746 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p184.C2537
            if (r0 == 0) goto L13
            r0 = r7
            ˎ.ʽᐧ r0 = (p184.C2537) r0
            int r1 = r0.f10079
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10079 = r1
            goto L1a
        L13:
            ˎ.ʽᐧ r0 = new ˎ.ʽᐧ
            ˎʻ.ˑʽ r7 = (p185.AbstractC2562) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f10076
            ˊˋ.ـﹶ r1 = p155.EnumC2332.f9250
            int r2 = r0.f10079
            ٴˑ.ˉⁱ r3 = p288.C3397.f13249
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            ﹶʻ.ﹳˎ r6 = r0.f10077
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            r0.f10077 = r6
            r0.f10079 = r4
            ˎʻ.ﹶˆ r7 = r5.f10108
            java.lang.Object r7 = r7.mo1054(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            ﹶʻ.ˉⁱ r6 = (p423.AbstractC4872) r6
            ﹶʻ.ᐧʻ r6 = r6.f18391
            boolean r6 = r6.m10986()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p184.C2548.mo3971(ﹶʻ.ﹳˎ, ᴵⁱ.ʿʼ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ˎʻ.ﹶˆ, ᵎˈ.ˑי] */
    @Override // p010.AbstractC1023
    /* renamed from: ﹳﹳ */
    public final AbstractC1023 mo3973(InterfaceC3747 interfaceC3747, int i, int i2) {
        return new C2548(this.f10107, interfaceC3747, i, i2);
    }
}
