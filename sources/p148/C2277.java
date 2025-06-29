package p148;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p072.AbstractC1642;

/* renamed from: ˊʻ.ﹶˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C2277 {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9024 = AtomicReferenceFieldUpdater.newUpdater(C2277.class, Object.class, "_next$volatile");

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9022 = AtomicReferenceFieldUpdater.newUpdater(C2277.class, Object.class, "_prev$volatile");

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9023 = AtomicReferenceFieldUpdater.newUpdater(C2277.class, Object.class, "_removedRef$volatile");

    public String toString() {
        return new C2266(this, AbstractC1642.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC1642.m5290(this);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final boolean m6291(C2277 c2277, int i) {
        while (true) {
            C2277 c2277M6293 = m6293();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9022;
            if (c2277M6293 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c2277M6293 = (C2277) obj;
                    if (!c2277M6293.mo5236()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c2277M6293);
                }
            }
            if (c2277M6293 instanceof C2271) {
                return (((C2271) c2277M6293).f9014 & i) == 0 && c2277M6293.m6291(c2277, i);
            }
            atomicReferenceFieldUpdater.set(c2277, c2277M6293);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9024;
            atomicReferenceFieldUpdater2.set(c2277, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c2277M6293, this, c2277)) {
                if (atomicReferenceFieldUpdater2.get(c2277M6293) != this) {
                    break;
                }
            }
            c2277.m6294(this);
            return true;
        }
    }

    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final C2277 m6292() {
        C2277 c2277;
        Object obj = f9024.get(this);
        C2265 c2265 = obj instanceof C2265 ? (C2265) obj : null;
        return (c2265 == null || (c2277 = c2265.f8998) == null) ? (C2277) obj : c2277;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p148.C2265) r6).f8998;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* renamed from: ٴˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p148.C2277 m6293() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p148.C2277.f9022
            java.lang.Object r1 = r0.get(r9)
            ˊʻ.ﹶˆ r1 = (p148.C2277) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p148.C2277.f9024
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo5236()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof p148.C2265
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            ˊʻ.ˏᴵ r6 = (p148.C2265) r6
            ˊʻ.ﹶˆ r6 = r6.f8998
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            ˊʻ.ﹶˆ r3 = (p148.C2277) r3
            goto Lb
        L4b:
            r4 = r6
            ˊʻ.ﹶˆ r4 = (p148.C2277) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p148.C2277.m6293():ˊʻ.ﹶˆ");
    }

    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final void m6294(C2277 c2277) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9022;
            C2277 c22772 = (C2277) atomicReferenceFieldUpdater.get(c2277);
            if (f9024.get(this) != c2277) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c2277, c22772, this)) {
                if (atomicReferenceFieldUpdater.get(c2277) != c22772) {
                    break;
                }
            }
            if (mo5236()) {
                c2277.m6293();
                return;
            }
            return;
        }
    }

    /* renamed from: ﹶˆ */
    public boolean mo5236() {
        return f9024.get(this) instanceof C2265;
    }
}
