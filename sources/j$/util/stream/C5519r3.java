package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5519r3 implements InterfaceC5504o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ C5519r3(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC5551y0.a();
                throw null;
            default:
                AbstractC5551y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC5551y0.k();
                throw null;
            default:
                AbstractC5551y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                ((W2) this.b).accept(j);
                break;
            default:
                this.b.accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                j((Long) obj);
                break;
            default:
                j((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC5504o2
    public final /* synthetic */ void j(Long l) {
        switch (this.a) {
            case 0:
                AbstractC5551y0.i(this, l);
                break;
            default:
                AbstractC5551y0.i(this, l);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
