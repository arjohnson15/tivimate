package p144;

import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ˉٴ.ـﹶ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2231 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C2229 f8882;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final /* synthetic */ C2230 f8883;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ int f8884 = 0;

    public C2231(C2230 c2230) {
        this.f8883 = c2230;
        this.f8882 = c2230.f8880;
    }

    public C2231(C2230 c2230, byte b) {
        this.f8883 = c2230;
        this.f8882 = c2230.f8880;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8884) {
            case 0:
                if (this.f8882 != null) {
                }
                break;
            default:
                C2229 c2229 = this.f8882;
                if (c2229 != null) {
                    if (c2229.m6215() == null) {
                        m6217();
                        if (this.f8882 != null) {
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8884) {
            case 0:
                C2229 c2229 = this.f8882;
                if (c2229 == null) {
                    return null;
                }
                Object objM6215 = c2229.m6215();
                this.f8882 = this.f8882.f8874;
                return objM6215;
            default:
                C2229 c22292 = this.f8882;
                if (c22292 == null) {
                    return null;
                }
                Object objM62152 = c22292.m6215();
                if (objM62152 == null) {
                    m6217();
                    return next();
                }
                this.f8882 = this.f8882.f8874;
                return objM62152;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8884) {
            case 0:
                C2229 c2229 = this.f8882;
                if (c2229 != null) {
                    C2229 c22292 = c2229.f8874;
                    this.f8883.remove(c2229.m6215());
                    this.f8882 = c22292;
                    break;
                }
                break;
            default:
                C2229 c22293 = this.f8882;
                if (c22293 != null) {
                    C2229 c22294 = c22293.f8874;
                    this.f8883.remove(c22293.m6215());
                    this.f8882 = c22294;
                    break;
                }
                break;
        }
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public void m6217() {
        C2229 c2229;
        C2230 c2230 = this.f8883;
        ReentrantReadWriteLock.WriteLock writeLock = c2230.f8877.writeLock();
        try {
            writeLock.lock();
            do {
                C2229 c22292 = this.f8882;
                c2229 = c22292.f8874;
                this.f8882 = c2229;
                C2229 c22293 = c2230.f8880;
                if (c22292 == c22293) {
                    c2230.f8880 = c22293.f8874;
                }
                C2229 c22294 = c22292.f8872;
                if (c22294 != null) {
                    c22294.f8874 = c2229;
                    C2229 c22295 = c22292.f8874;
                    if (c22295 != null) {
                        c22295.f8872 = c22294;
                    }
                } else if (c2229 != null) {
                    c2229.f8872 = null;
                }
                if (c2229 == null) {
                    break;
                }
            } while (c2229.m6215() == null);
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
