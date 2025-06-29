package j$.util;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {
    private static final Spliterator a = new o0();
    private static final X b = new m0();
    private static final a0 c = new n0();
    private static final U d = new l0();

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static U b() {
        return d;
    }

    public static X c() {
        return b;
    }

    public static a0 d() {
        return c;
    }

    public static Spliterator e() {
        return a;
    }

    public static G f(U u) {
        Objects.requireNonNull(u);
        return new i0(u);
    }

    public static K g(X x) {
        Objects.requireNonNull(x);
        return new g0(x);
    }

    public static O h(a0 a0Var) {
        Objects.requireNonNull(a0Var);
        return new h0(a0Var);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new f0(spliterator);
    }

    public static U j(double[] dArr, int i, int i2) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i, i2);
        return new k0(dArr, i, i2, 1040);
    }

    public static X k(int[] iArr, int i, int i2) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new p0(iArr, i, i2, 1040);
    }

    public static a0 l(long[] jArr, int i, int i2) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new r0(jArr, i, i2, 1040);
    }

    public static Spliterator m(Object[] objArr, int i, int i2) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new j0(objArr, i, i2, 1040);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        return new q0((java.util.Collection) Objects.requireNonNull(collection), i);
    }
}
