package p345;

import java.util.NoSuchElementException;

/* renamed from: ᵎᴵ.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3950 extends AbstractC3986 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public static final Object f15309 = new Object();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public Object f15310;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15310 != f15309;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f15310;
        Object obj2 = f15309;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f15310 = obj2;
        return obj;
    }
}
