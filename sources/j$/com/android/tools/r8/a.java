package j$.com.android.tools.r8;

import j$.util.Objects;
import j$.util.concurrent.s;
import j$.util.function.b;
import j$.util.function.d;
import j$.util.function.e;
import j$.util.function.f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static f a(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new f(predicate, predicate2, 0);
    }

    public static s b(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new s(1, biConsumer, biConsumer2);
    }

    public static s c(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new s(biFunction, function);
    }

    public static s d(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new s(3, consumer, consumer2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b e(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.e(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.d] */
    public static d f(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.f(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e g(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.g(this, longConsumer3);
            }
        };
    }

    public static f h(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new f(predicate, predicate2, 1);
    }

    public static /* synthetic */ int i(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long j(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry k(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List l(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean m(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long n(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long o(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long p(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long q(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
