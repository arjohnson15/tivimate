package j$.util.concurrent;

import j$.util.AbstractC5414b;
import j$.util.Spliterator;
import j$.util.stream.AbstractC5551y0;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class e extends b implements Set, j$.util.Set {
    private static final long serialVersionUID = 2249069246763182397L;

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.a.f(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        k[] kVarArr = this.a.a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            } else {
                consumer.p(new j(kVarA.b, kVarA.c, this.a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        k[] kVarArr = this.a.a;
        int iHashCode = 0;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                iHashCode += kVarA.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        k[] kVarArr = concurrentHashMap.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new d(kVarArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return AbstractC5551y0.f0(AbstractC5414b.x(this), true);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(AbstractC5551y0.f0(AbstractC5414b.x(this), true));
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.a;
        concurrentHashMap.getClass();
        predicate.getClass();
        k[] kVarArr = concurrentHashMap.a;
        boolean z = false;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                Object obj = kVarA.b;
                Object obj2 = kVarA.c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.a;
        long j = concurrentHashMap.j();
        k[] kVarArr = concurrentHashMap.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new f(kVarArr, length, 0, length, j >= 0 ? j : 0L, concurrentHashMap);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return AbstractC5551y0.f0(AbstractC5414b.x(this), false);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(AbstractC5551y0.f0(AbstractC5414b.x(this), false));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
