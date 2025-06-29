package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5561u extends C5427o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C5427o(this.b);
    }

    @Override // j$.util.C5427o, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C5561u(this.b.subList(i, i2));
    }
}
