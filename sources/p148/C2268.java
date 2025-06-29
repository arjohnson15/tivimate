package p148;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p253.C3147;

/* renamed from: ˊʻ.ˑי, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2268 {
    private volatile AtomicReferenceArray<Object> array;

    public C2268(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final Object m6273(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final void m6274(int i, C3147 c3147) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c3147);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c3147);
        this.array = atomicReferenceArray2;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final int m6275() {
        return this.array.length();
    }
}
