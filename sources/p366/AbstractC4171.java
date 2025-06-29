package p366;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ᵔﾞ.ﾞʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC4171 {

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final int f16096;

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public static final AtomicReference[] f16097;

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final C4172 f16098 = new C4172(new byte[0], 0, 0, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16096 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f16097 = atomicReferenceArr;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final C4172 m9584() {
        AtomicReference atomicReference = f16097[(int) (Thread.currentThread().getId() & (f16096 - 1))];
        C4172 c4172 = f16098;
        C4172 c41722 = (C4172) atomicReference.getAndSet(c4172);
        if (c41722 == c4172) {
            return new C4172();
        }
        if (c41722 == null) {
            atomicReference.set(null);
            return new C4172();
        }
        atomicReference.set(c41722.f16103);
        c41722.f16103 = null;
        c41722.f16101 = 0;
        return c41722;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public static final void m9585(C4172 c4172) {
        if (c4172.f16103 != null || c4172.f16104 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c4172.f16105) {
            return;
        }
        AtomicReference atomicReference = f16097[(int) (Thread.currentThread().getId() & (f16096 - 1))];
        C4172 c41722 = f16098;
        C4172 c41723 = (C4172) atomicReference.getAndSet(c41722);
        if (c41723 == c41722) {
            return;
        }
        int i = c41723 != null ? c41723.f16101 : 0;
        if (i >= 65536) {
            atomicReference.set(c41723);
            return;
        }
        c4172.f16103 = c41723;
        c4172.f16099 = 0;
        c4172.f16101 = i + 8192;
        atomicReference.set(c4172);
    }
}
