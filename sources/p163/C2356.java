package p163;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p407.InterfaceC4671;

/* renamed from: ˊᵎ.ʽᐧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2356 implements Iterator, InterfaceC4671 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final int f9325;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public boolean f9326;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public int f9327;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final int f9328;

    public C2356(int i, int i2, int i3) {
        this.f9328 = i3;
        this.f9325 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f9326 = z;
        this.f9327 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9326;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9327;
        if (i != this.f9325) {
            this.f9327 = this.f9328 + i;
        } else {
            if (!this.f9326) {
                throw new NoSuchElementException();
            }
            this.f9326 = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
