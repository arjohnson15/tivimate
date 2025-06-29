package p345;

import java.util.Iterator;

/* renamed from: ᵎᴵ.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC3976 implements Iterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Iterator f15351;

    public AbstractC3976(Iterator it) {
        it.getClass();
        this.f15351 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15351.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo9115(this.f15351.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15351.remove();
    }

    /* renamed from: ـﹶ */
    public abstract Object mo9115(Object obj);
}
