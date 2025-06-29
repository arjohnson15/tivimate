package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5447d0 implements LongConsumer {
    public final /* synthetic */ InterfaceC5509p2 a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }
}
