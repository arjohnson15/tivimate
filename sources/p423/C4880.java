package p423;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p034.C1228;
import p148.AbstractC2263;

/* renamed from: ﹶʻ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4880 extends AbstractC2263 {

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final C4883 f18403;

    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f18404;

    public C4880(long j, C4880 c4880, C4883 c4883, int i) {
        super(j, c4880, i);
        this.f18403 = c4883;
        this.f18404 = new AtomicReferenceArray(AbstractC4889.f18421 * 2);
    }

    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final Object m10964(int i) {
        return this.f18404.get((i * 2) + 1);
    }

    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final void m10965(int i, boolean z) {
        if (z) {
            this.f18403.m11001((this.f8996 * AbstractC4889.f18421) + i);
        }
        m6272();
    }

    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final boolean m10966(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f18404;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˏᴵ, reason: contains not printable characters */
    public final void m10967(int i, C1228 c1228) {
        this.f18404.set((i * 2) + 1, c1228);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        m10968(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        r7 = r4.f18417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        p148.AbstractC2269.m6284(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // p148.AbstractC2263
    /* renamed from: ˏᵢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5609(int r7, p330.InterfaceC3747 r8) {
        /*
            r6 = this;
            int r0 = p423.AbstractC4889.f18421
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f18404
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.m10964(r7)
            boolean r3 = r2 instanceof p072.InterfaceC1576
            ﹶʻ.ᐧʻ r4 = r6.f18403
            r5 = 0
            if (r3 != 0) goto L68
            boolean r3 = r2 instanceof p423.C4890
            if (r3 == 0) goto L22
            goto L68
        L22:
            ʼᵔ.ـﹶ r3 = p423.AbstractC4889.f18423
            if (r2 == r3) goto L5b
            ʼᵔ.ـﹶ r3 = p423.AbstractC4889.f18427
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            ʼᵔ.ـﹶ r3 = p423.AbstractC4889.f18434
            if (r2 == r3) goto L12
            ʼᵔ.ـﹶ r3 = p423.AbstractC4889.f18433
            if (r2 != r3) goto L34
            goto L12
        L34:
            ʼᵔ.ـﹶ r7 = p423.AbstractC4889.f18439
            if (r2 == r7) goto L5a
            ʼᵔ.ـﹶ r7 = p423.AbstractC4889.f18438
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            ʼᵔ.ـﹶ r7 = p423.AbstractC4889.f18424
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m10968(r7, r5)
            if (r1 == 0) goto L67
            ᵎˈ.ˉⁱ r7 = r4.f18417
            if (r7 == 0) goto L67
            p148.AbstractC2269.m6284(r7, r0, r8)
        L67:
            return
        L68:
            if (r1 == 0) goto L6d
            ʼᵔ.ـﹶ r3 = p423.AbstractC4889.f18423
            goto L6f
        L6d:
            ʼᵔ.ـﹶ r3 = p423.AbstractC4889.f18427
        L6f:
            boolean r2 = r6.m10966(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m10968(r7, r5)
            r2 = r1 ^ 1
            r6.m10965(r7, r2)
            if (r1 == 0) goto L86
            ᵎˈ.ˉⁱ r7 = r4.f18417
            if (r7 == 0) goto L86
            p148.AbstractC2269.m6284(r7, r0, r8)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p423.C4880.mo5609(int, ᴵⁱ.ˉי):void");
    }

    @Override // p148.AbstractC2263
    /* renamed from: ᐧʻ */
    public final int mo5610() {
        return AbstractC4889.f18421;
    }

    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final void m10968(int i, Object obj) {
        this.f18404.set(i * 2, obj);
    }
}
