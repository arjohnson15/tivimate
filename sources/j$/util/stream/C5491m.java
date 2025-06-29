package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5491m extends AbstractC5489l2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5491m(N3 n3, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = n3;
        this.c = true;
    }

    public /* synthetic */ C5491m(InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5491m(C5530u c5530u, InterfaceC5509p2 interfaceC5509p2) {
        super(interfaceC5509p2);
        this.d = c5530u;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                InterfaceC5509p2 interfaceC5509p2 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC5509p2.p((InterfaceC5509p2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC5509p2.p((InterfaceC5509p2) obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C5431a) ((C5530u) this.d).n).apply((C5431a) obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC5509p2 interfaceC5509p22 = this.a;
                        if (z) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC5509p22.n() && spliterator.tryAdvance(interfaceC5509p22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC5509p22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((N3) this.d).m.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        this.a.p((InterfaceC5509p2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5489l2, j$.util.stream.InterfaceC5509p2
    public boolean n() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.n();
            case 2:
                return !this.c || this.a.n();
            default:
                return super.n();
        }
    }
}
