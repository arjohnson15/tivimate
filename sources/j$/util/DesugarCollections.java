package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class DesugarCollections {
    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof RandomAccess ? new C5422j(list) : new C5420h(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C5421i(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new C5423k(set);
    }

    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new C5425m(collection);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof RandomAccess ? new C5561u(list) : new C5427o(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new C5560t(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new C5562v(set);
    }
}
