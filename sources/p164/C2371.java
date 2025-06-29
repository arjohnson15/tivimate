package p164;

import p072.InterfaceC1594;
import p185.AbstractC2567;
import p288.C3397;
import p330.InterfaceC3746;
import p338.InterfaceC3864;
import ᴵﹳ.ﹶˆ;

/* renamed from: ˊᵔ.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2371 extends AbstractC2567 implements InterfaceC3864 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public InterfaceC3864 f9385;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public int f9386;

    /* renamed from: ﹳﹶ, reason: contains not printable characters */
    public final /* synthetic */ ﹶˆ f9387;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2371(ﹶˆ r1, InterfaceC3746 interfaceC3746) {
        super(2, interfaceC3746);
        this.f9387 = r1;
    }

    @Override // p338.InterfaceC3864
    /* renamed from: ʿʼ */
    public final Object mo1054(Object obj, Object obj2) {
        return ((C2371) mo1056((InterfaceC1594) obj, (InterfaceC3746) obj2)).mo1055(C3397.f13249);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please report as a decompilation issue!!! */
    @Override // p185.AbstractC2563
    /* renamed from: ˑי */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1055(java.lang.Object r7) {
        /*
            r6 = this;
            ˊˋ.ـﹶ r0 = p155.EnumC2332.f9250
            int r1 = r6.f9386
            r2 = 2
            r3 = 1
            ᴵﹳ.ﹶˆ r4 = r6.f9387
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L58
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            ᵎˈ.ˑי r1 = r6.f9385
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            goto L4c
        L20:
            ˈⁱ.ˉⁱ.ˆʿ(r7)
            java.lang.Object r7 = r4.ᐧˋ
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L65
        L2d:
            java.lang.Object r7 = r4.ᐧⁱ
            ʿʽ.ˋˊ r7 = (p072.InterfaceC1594) r7
            ᴵⁱ.ˉי r7 = r7.mo1029()
            p072.AbstractC1642.m5298(r7)
            java.lang.Object r7 = r4.ˆʿ
            r1 = r7
            ˊᵔ.ᵎـ r1 = (p164.C2384) r1
            r6.f9385 = r1
            r6.f9386 = r3
            java.lang.Object r7 = r4.ˎˑ
            ﹶʻ.ᐧʻ r7 = (p423.C4883) r7
            java.lang.Object r7 = r7.m10982(r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r5 = 0
            r6.f9385 = r5
            r6.f9386 = r2
            java.lang.Object r7 = r1.mo1054(r7, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            java.lang.Object r7 = r4.ᐧˋ
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            ٴˑ.ˉⁱ r7 = p288.C3397.f13249
            return r7
        L65:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p164.C2371.mo1055(java.lang.Object):java.lang.Object");
    }

    @Override // p185.AbstractC2563
    /* renamed from: ᴵʿ */
    public final InterfaceC3746 mo1056(Object obj, InterfaceC3746 interfaceC3746) {
        return new C2371(this.f9387, interfaceC3746);
    }
}
