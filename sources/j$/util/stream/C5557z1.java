package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C5557z1 extends CountedCompleter {
    protected final K0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    public C5557z1(K0 k0, Object obj, int i) {
        this.c = i;
        this.a = k0;
        this.b = 0;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5557z1(C5557z1 c5557z1, J0 j0, int i) {
        this(c5557z1, j0, i, (byte) 0);
        this.c = 0;
        this.d = c5557z1.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5557z1(C5557z1 c5557z1, K0 k0, int i) {
        this(c5557z1, k0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) c5557z1.d;
    }

    C5557z1(C5557z1 c5557z1, K0 k0, int i, byte b) {
        super(c5557z1);
        this.a = k0;
        this.b = i;
    }

    final C5557z1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C5557z1(this, ((J0) this.a).b(i), i2);
            default:
                return new C5557z1(this, this.a.b(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C5557z1 c5557z1A = this;
        while (c5557z1A.a.q() != 0) {
            c5557z1A.setPendingCount(c5557z1A.a.q() - 1);
            int i = 0;
            int iCount = 0;
            while (i < c5557z1A.a.q() - 1) {
                C5557z1 c5557z1A2 = c5557z1A.a(i, c5557z1A.b + iCount);
                iCount = (int) (iCount + c5557z1A2.a.count());
                c5557z1A2.fork();
                i++;
            }
            c5557z1A = c5557z1A.a(i, c5557z1A.b + iCount);
        }
        switch (c5557z1A.c) {
            case 0:
                ((J0) c5557z1A.a).r(c5557z1A.b, c5557z1A.d);
                break;
            default:
                c5557z1A.a.i((Object[]) c5557z1A.d, c5557z1A.b);
                break;
        }
        c5557z1A.propagateCompletion();
    }
}
