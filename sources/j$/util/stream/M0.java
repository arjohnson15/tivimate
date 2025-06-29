package j$.util.stream;

/* loaded from: classes2.dex */
abstract class M0 implements K0 {
    protected final K0 a;
    protected final K0 b;
    private final long c;

    M0(K0 k0, K0 k02) {
        this.a = k0;
        this.b = k02;
        this.c = k0.count() + k02.count();
    }

    @Override // j$.util.stream.K0
    public /* bridge */ /* synthetic */ J0 b(int i) {
        return (J0) b(i);
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.K0
    public final int q() {
        return 2;
    }
}
