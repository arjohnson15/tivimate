package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5510p3 implements InterfaceC5499n2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C5510p3(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
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

    @Override // j$.util.stream.InterfaceC5499n2, j$.util.stream.InterfaceC5509p2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                ((U2) this.b).accept(i);
                break;
            default:
                this.b.accept(i);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2, j$.util.stream.InterfaceC5504o2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC5551y0.l();
                throw null;
            default:
                AbstractC5551y0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC5499n2
    public final /* synthetic */ void m(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC5551y0.g(this, num);
                break;
            default:
                AbstractC5551y0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC5509p2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
