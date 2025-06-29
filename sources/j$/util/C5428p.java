package j$.util;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5428p implements Consumer {
    public final /* synthetic */ Consumer a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.accept(new C5429q((Map.Entry) obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }
}
