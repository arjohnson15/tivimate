package com.parse;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
class WeakValueHashMap<K, V> {
    private final HashMap<K, WeakReference<V>> map = new HashMap<>();

    public V get(K k) {
        WeakReference<V> weakReference = this.map.get(k);
        if (weakReference == null) {
            return null;
        }
        V v = weakReference.get();
        if (v == null) {
            this.map.remove(k);
        }
        return v;
    }

    public void put(K k, V v) {
        this.map.put(k, new WeakReference<>(v));
    }

    public void remove(K k) {
        this.map.remove(k);
    }
}
