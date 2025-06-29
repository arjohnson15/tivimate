package p029;

import p036.C1245;
import p036.C1252;
import p036.C1253;
import p036.C1255;
import p036.InterfaceC1249;
import p166.C2433;
import p183.InterfaceC2535;
import p345.AbstractC3980;
import p345.C3932;
import p345.C3961;

/* renamed from: ʼˑ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C1180 implements InterfaceC2535, InterfaceC1249 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Object f4878;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4879;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ Object f4880;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4881;

    public /* synthetic */ C1180(boolean z, Object obj, Object obj2, Object obj3) {
        this.f4878 = obj;
        this.f4879 = obj2;
        this.f4881 = z;
        this.f4880 = obj3;
    }

    @Override // p036.InterfaceC1249
    /* renamed from: ʿʼ */
    public C3932 mo4093(int i, C2433 c2433, int[] iArr) {
        C1255 c1255 = (C1255) this.f4878;
        c1255.getClass();
        C1252 c1252 = new C1252(c1255);
        int i2 = ((int[]) this.f4880)[i];
        C3961 c3961M9205 = AbstractC3980.m9205();
        for (int i3 = 0; i3 < c2433.f9699; i3++) {
            int i4 = i3;
            c3961M9205.m9172(new C1253(i, c2433, i4, (C1245) this.f4879, iArr[i3], this.f4881, c1252, i2));
        }
        return c3961M9205.m9167();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    @Override // p183.InterfaceC2535
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4232(java.lang.Exception r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f4878
            ʼˑ.ﹳﹳ r0 = (p029.C1183) r0
            r0.getClass()
            java.lang.Object r1 = r8.f4879
            יˎ.ᐧʻ r1 = (p251.C3136) r1
            if (r9 == 0) goto L11
            r1.m7703(r9)
            goto L68
        L11:
            boolean r9 = r8.f4881
            if (r9 == 0) goto L61
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r9.<init>(r2)
            java.lang.Thread r3 = new java.lang.Thread
            ʻˉ.ᐧˋ r4 = new ʻˉ.ᐧˋ
            r5 = 3
            r4.<init>(r0, r5, r9)
            r3.<init>(r4)
            r3.start()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ExecutorService r3 = p428.AbstractC4939.f18686
            r3 = 2
            r5 = 0
            long r3 = r0.toNanos(r3)     // Catch: java.lang.Throwable -> L55
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 + r3
        L39:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L48 java.lang.InterruptedException -> L4b
            r9.await(r3, r0)     // Catch: java.lang.Throwable -> L48 java.lang.InterruptedException -> L4b
            if (r5 == 0) goto L61
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            goto L61
        L48:
            r9 = move-exception
            r2 = r5
            goto L57
        L4b:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L53
            long r3 = r6 - r3
            r5 = 1
            goto L39
        L53:
            r9 = move-exception
            goto L57
        L55:
            r9 = move-exception
            r2 = 0
        L57:
            if (r2 == 0) goto L60
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L60:
            throw r9
        L61:
            java.lang.Object r9 = r8.f4880
            ﹶˊ.ʽᐧ r9 = (p428.C4918) r9
            r1.m7702(r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p029.C1180.mo4232(java.lang.Exception):void");
    }
}
