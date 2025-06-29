package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import p072.AbstractC1642;
import p085.C1717;
import p330.InterfaceC3746;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final WorkerParameters f1786;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1786 = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1388(androidx.work.impl.workers.ConstraintTrackingWorker r15, p185.AbstractC2562 r16) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.m1388(androidx.work.impl.workers.ConstraintTrackingWorker, ˎʻ.ˑʽ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1389(androidx.work.impl.workers.ConstraintTrackingWorker r4, p457.AbstractC5366 r5, p023.C1147 r6, p331.C3768 r7, p185.AbstractC2562 r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof p085.C1724
            if (r0 == 0) goto L16
            r0 = r8
            ʿᐧ.ˑʽ r0 = (p085.C1724) r0
            int r1 = r0.f6708
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6708 = r1
            goto L1b
        L16:
            ʿᐧ.ˑʽ r0 = new ʿᐧ.ˑʽ
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.f6707
            ˊˋ.ـﹶ r8 = p155.EnumC2332.f9250
            int r1 = r0.f6708
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            ˈⁱ.ˉⁱ.ˆʿ(r4)
            goto L4d
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            ˈⁱ.ˉⁱ.ˆʿ(r4)
            ʿᐧ.ʿʼ r4 = new ʿᐧ.ʿʼ
            r1 = 0
            r4.<init>(r5, r6, r7, r1)
            r0.f6708 = r2
            ˊʻ.ᵎـ r5 = new ˊʻ.ᵎـ
            ᴵⁱ.ˉי r6 = r0.mo3963()
            r5.<init>(r0, r6)
            java.lang.Object r4 = ˏʼ.ʽᐧ.ᐧˋ(r5, r5, r4)
            if (r4 != r8) goto L4d
            goto L4e
        L4d:
            r8 = r4
        L4e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.m1389(androidx.work.impl.workers.ConstraintTrackingWorker, ﾞﹶ.ˋˊ, ʼʾ.ᴵʿ, ᴵﹳ.ˑי, ˎʻ.ˑʽ):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    /* renamed from: ʿʼ */
    public final Object mo1367(InterfaceC3746 interfaceC3746) {
        return AbstractC1642.m5295(AbstractC1642.m5305(this.f20826.f1754), new C1717(this, null), interfaceC3746);
    }
}
