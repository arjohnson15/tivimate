package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class V implements IntConsumer {
    public final /* synthetic */ InterfaceC5509p2 a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }
}
