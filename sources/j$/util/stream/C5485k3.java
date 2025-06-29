package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5485k3 extends AbstractC5490l3 implements Consumer {
    final Object[] b;

    C5485k3(int i) {
        this.b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        this.a = i + 1;
        this.b[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }
}
