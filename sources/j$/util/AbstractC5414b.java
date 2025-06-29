package j$.util;

import j$.util.Comparator;
import j$.util.List;
import j$.util.Map;
import j$.util.stream.AbstractC5551y0;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5414b {
    public static void a(U u, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            u.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(u.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            u.forEachRemaining((DoubleConsumer) new D(consumer));
        }
    }

    public static void b(X x, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            x.forEachRemaining((IntConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(x.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            x.forEachRemaining((IntConsumer) new H(consumer));
        }
    }

    public static void c(a0 a0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            a0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (t0.a) {
                t0.a(a0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            a0Var.forEachRemaining((LongConsumer) new L(consumer));
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean f(U u, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return u.tryAdvance((DoubleConsumer) consumer);
        }
        if (t0.a) {
            t0.a(u.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return u.tryAdvance((DoubleConsumer) new D(consumer));
    }

    public static boolean g(X x, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return x.tryAdvance((IntConsumer) consumer);
        }
        if (t0.a) {
            t0.a(x.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return x.tryAdvance((IntConsumer) new H(consumer));
    }

    public static boolean h(a0 a0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return a0Var.tryAdvance((LongConsumer) consumer);
        }
        if (t0.a) {
            t0.a(a0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return a0Var.tryAdvance((LongConsumer) new L(consumer));
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.d(optional.get()) : Optional.a();
    }

    public static A j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? A.d(optionalDouble.getAsDouble()) : A.a();
    }

    public static B k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? B.d(optionalInt.getAsInt()) : B.a();
    }

    public static C l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C.d(optionalLong.getAsLong()) : C.a();
    }

    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.c() ? java.util.Optional.of(optional.b()) : java.util.Optional.empty();
    }

    public static OptionalDouble n(A a) {
        if (a == null) {
            return null;
        }
        return a.c() ? OptionalDouble.of(a.b()) : OptionalDouble.empty();
    }

    public static OptionalInt o(B b) {
        if (b == null) {
            return null;
        }
        return b.c() ? OptionalInt.of(b.b()) : OptionalInt.empty();
    }

    public static OptionalLong p(C c) {
        if (c == null) {
            return null;
        }
        return c.c() ? OptionalLong.of(c.b()) : OptionalLong.empty();
    }

    public static void q(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ void r(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            j$.util.concurrent.t.a((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static void s(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC5565y) {
            ((InterfaceC5565y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Object t(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).getOrDefault(obj, obj2);
        }
        if (map instanceof ConcurrentMap) {
            Object obj3 = ((ConcurrentMap) map).get(obj);
            return obj3 != null ? obj3 : obj2;
        }
        Object obj4 = map.get(obj);
        return (obj4 != null || map.containsKey(obj)) ? obj4 : obj2;
    }

    public static /* synthetic */ Stream u(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).parallelStream() : AbstractC5551y0.f0(x(collection), true);
    }

    public static /* synthetic */ Object v(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static /* synthetic */ void w(java.util.List list, java.util.Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    public static Spliterator x(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return Spliterators.spliterator((LinkedHashSet) collection, 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new Q(sortedSet, sortedSet);
        }
        if (collection instanceof java.util.Set) {
            return Spliterators.spliterator((java.util.Set) collection, 1);
        }
        if (!(collection instanceof java.util.List)) {
            return Spliterators.spliterator(collection, 0);
        }
        java.util.List list = (java.util.List) collection;
        return list instanceof RandomAccess ? new C5413a(list) : Spliterators.spliterator(list, 16);
    }

    public static /* synthetic */ Stream y(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).stream() : AbstractC5551y0.f0(x(collection), false);
    }

    public static /* synthetic */ java.util.Comparator z(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
