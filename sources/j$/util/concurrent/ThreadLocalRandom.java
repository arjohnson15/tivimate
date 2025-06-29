package j$.util.concurrent;

import j$.util.stream.AbstractC5551y0;
import j$.util.stream.C5492m0;
import j$.util.stream.E;
import j$.util.stream.IntStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    long a;
    int b;
    boolean c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    private static final ThreadLocal d = new ThreadLocal();
    private static final AtomicInteger e = new AtomicInteger();
    private static final ThreadLocal f = new v();
    private static final AtomicLong g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    static {
        if (((Boolean) AccessController.doPrivileged(new w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            g.set(j);
        }
    }

    private ThreadLocalRandom() {
        this.c = true;
    }

    /* synthetic */ ThreadLocalRandom(int i) {
        this();
    }

    static final int a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f.get()).b = i4;
        return i4;
    }

    static final int b() {
        return ((ThreadLocalRandom) f.get()).b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    static final void f() {
        int iAddAndGet = e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jH = h(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.a = jH;
        threadLocalRandom.b = iAddAndGet;
    }

    private static int g(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    final double c(double d2, double d3) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return dNextLong;
        }
        double d4 = ((d3 - d2) * dNextLong) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    final int d(int i, int i2) {
        int i3;
        int iG = g(i());
        if (i >= i2) {
            return iG;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = iG & i5;
        } else if (i4 > 0) {
            int iG2 = iG >>> 1;
            while (true) {
                int i6 = iG2 + i5;
                i3 = iG2 % i4;
                if (i6 - i3 >= 0) {
                    break;
                }
                iG2 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (iG >= i && iG < i2) {
                    return iG;
                }
                iG = g(i());
            }
        }
        return i3 + i;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return E.k(AbstractC5551y0.K(new x(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d2, double d3) {
        if (d2 < d3) {
            return E.k(AbstractC5551y0.K(new x(0L, Long.MAX_VALUE, d2, d3)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return E.k(AbstractC5551y0.K(new x(0L, j, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d2, double d3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d2 < d3) {
            return E.k(AbstractC5551y0.K(new x(0L, j, d2, d3)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    final long e(long j, long j2) {
        long jH = h(i());
        if (j >= j2) {
            return jH;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (jH & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = jH >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                jH = h(i());
            }
        } else {
            while (true) {
                if (jH >= j && jH < j2) {
                    return jH;
                }
                jH = h(i());
            }
        }
    }

    final long i() {
        long j = this.a - 7046029254386353131L;
        this.a = j;
        return j;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC5551y0.T(new y(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i, int i2) {
        if (i < i2) {
            return IntStream.Wrapper.convert(AbstractC5551y0.T(new y(0L, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j) {
        if (j >= 0) {
            return IntStream.Wrapper.convert(AbstractC5551y0.T(new y(0L, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i < i2) {
            return IntStream.Wrapper.convert(AbstractC5551y0.T(new y(0L, j, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C5492m0.k(AbstractC5551y0.V(new z(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j >= 0) {
            return C5492m0.k(AbstractC5551y0.V(new z(0L, j, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C5492m0.k(AbstractC5551y0.V(new z(0L, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j2 < j3) {
            return C5492m0.k(AbstractC5551y0.V(new z(0L, j, j2, j3)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    protected final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dH = (h(i()) >>> 11) * 1.1102230246251565E-16d * d2;
        return dH < d2 ? dH : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1);
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 < d3) {
            return c(d2, d3);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iG = g(i());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return iG & i2;
        }
        while (true) {
            int i3 = iG >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            iG = g(i());
        }
    }

    public final int nextInt(int i, int i2) {
        if (i < i2) {
            return d(i, i2);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jH = h(i());
        long j2 = j - 1;
        if ((j & j2) == 0) {
            return jH & j2;
        }
        while (true) {
            long j3 = jH >>> 1;
            long j4 = j3 + j2;
            long j5 = j3 % j;
            if (j4 - j5 >= 0) {
                return j5;
            }
            jH = h(i());
        }
    }

    public final long nextLong(long j, long j2) {
        if (j < j2) {
            return e(j, j2);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }
}
