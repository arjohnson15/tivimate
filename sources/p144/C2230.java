package p144;

import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ˉٴ.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2230 implements Set {

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public static final AtomicLong f8876 = new AtomicLong();

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ReentrantReadWriteLock f8877;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f8878;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final AbstractMap f8879;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public C2229 f8880;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final long f8881;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2230() {
        this(new HashMap(), (byte) 0);
        this.f8878 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2230(AbstractMap abstractMap) {
        this(abstractMap, (byte) 0);
        this.f8878 = 1;
    }

    public C2230(AbstractMap abstractMap, byte b) {
        this.f8881 = f8876.getAndIncrement();
        this.f8877 = new ReentrantReadWriteLock();
        this.f8879 = abstractMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.f8877.writeLock();
        try {
            writeLock.lock();
            AbstractMap abstractMap = this.f8879;
            if (!abstractMap.containsKey(obj)) {
                C2229 c2229M6216 = m6216(obj, this.f8880);
                this.f8880 = c2229M6216;
                abstractMap.put(obj, c2229M6216);
                z = true;
            }
            return z;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z;
        ReentrantReadWriteLock.WriteLock writeLock = this.f8877.writeLock();
        try {
            writeLock.lock();
            boolean z2 = false;
            for (Object obj : collection) {
                if (obj != null) {
                    AbstractMap abstractMap = this.f8879;
                    if (abstractMap.containsKey(obj)) {
                        z = false;
                    } else {
                        C2229 c2229M6216 = m6216(obj, this.f8880);
                        this.f8880 = c2229M6216;
                        abstractMap.put(obj, c2229M6216);
                        z = true;
                    }
                    z2 |= z;
                }
            }
            return z2;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.f8877.writeLock();
        try {
            writeLock.lock();
            this.f8880 = null;
            this.f8879.clear();
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        ReentrantReadWriteLock.ReadLock lock = this.f8877.readLock();
        try {
            lock.lock();
            C2229 c2229 = (C2229) this.f8879.get(obj);
            return (c2229 == null || c2229.m6215() == null) ? false : true;
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f8881 == ((C2230) obj).f8881;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        long j = this.f8881;
        return 31 + ((int) (j ^ (j >>> 32)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8880 == null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8878) {
            case 0:
                return new C2231(this);
            default:
                return new C2231(this, (byte) 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractMap abstractMap = this.f8879;
        if (!contains(obj)) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.f8877.writeLock();
        try {
            writeLock.lock();
            C2229 c2229 = (C2229) abstractMap.get(obj);
            if (c2229 == null) {
                return false;
            }
            C2229 c22292 = this.f8880;
            if (c2229 != c22292) {
                C2229 c22293 = c2229.f8872;
                if (c22293 != null) {
                    c22293.f8874 = c2229.f8874;
                    C2229 c22294 = c2229.f8874;
                    if (c22294 != null) {
                        c22294.f8872 = c22293;
                    }
                } else {
                    C2229 c22295 = c2229.f8874;
                    if (c22295 != null) {
                        c22295.f8872 = null;
                    }
                }
            } else {
                this.f8880 = c22292.f8874;
            }
            abstractMap.remove(obj);
            writeLock.unlock();
            return true;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8879.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f8879.entrySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8879.entrySet().toArray(objArr);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final C2229 m6216(Object obj, C2229 c2229) {
        C2229 c22292;
        C2229 c22293;
        switch (this.f8878) {
            case 0:
                if (c2229 != null) {
                    c22292 = new C2229(c2229, 0);
                    c22292.f8875 = obj;
                } else {
                    c22292 = new C2229(0);
                    c22292.f8875 = obj;
                }
                return c22292;
            default:
                if (c2229 != null) {
                    c22293 = new C2229(c2229, 1);
                    c22293.f8875 = new WeakReference(obj);
                } else {
                    c22293 = new C2229(1);
                    c22293.f8875 = new WeakReference(obj);
                }
                return c22293;
        }
    }
}
