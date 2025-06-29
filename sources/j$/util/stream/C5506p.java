package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5506p implements DoubleConsumer {
    public final /* synthetic */ InterfaceC5509p2 a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }
}
