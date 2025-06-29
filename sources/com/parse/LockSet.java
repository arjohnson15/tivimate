package com.parse;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
class LockSet {
    private final Set<Lock> locks;
    private static final WeakHashMap<Lock, Long> stableIds = new WeakHashMap<>();
    private static long nextStableId = 0;

    public LockSet(Collection<Lock> collection) {
        TreeSet treeSet = new TreeSet(new C0810(0));
        this.locks = treeSet;
        treeSet.addAll(collection);
    }

    private static Long getStableId(Lock lock) {
        WeakHashMap<Lock, Long> weakHashMap = stableIds;
        synchronized (weakHashMap) {
            try {
                if (weakHashMap.containsKey(lock)) {
                    return weakHashMap.get(lock);
                }
                long j = nextStableId;
                nextStableId = 1 + j;
                weakHashMap.put(lock, Long.valueOf(j));
                return Long.valueOf(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Lock lock, Lock lock2) {
        return getStableId(lock).compareTo(getStableId(lock2));
    }

    public void lock() {
        Iterator<Lock> it = this.locks.iterator();
        while (it.hasNext()) {
            it.next().lock();
        }
    }

    public void unlock() {
        Iterator<Lock> it = this.locks.iterator();
        while (it.hasNext()) {
            it.next().unlock();
        }
    }
}
