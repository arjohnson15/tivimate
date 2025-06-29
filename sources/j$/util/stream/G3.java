package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class G3 implements InterfaceC5509p2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ G3(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
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
    public final void p(Object obj) {
        switch (this.a) {
            case 0:
                ((Z2) this.b).p(obj);
                break;
            default:
                this.b.p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
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
