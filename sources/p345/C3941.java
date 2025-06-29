package p345;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ﹶⁱ.ـﹶ;

/* renamed from: ᵎᴵ.ˎٴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3941 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public int f15293;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f15294;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f15295;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C3926 f15296;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public int f15297;

    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final /* synthetic */ C3926 f15298;

    public C3941(C3926 c3926, int i) {
        this.f15294 = i;
        this.f15298 = c3926;
        this.f15296 = c3926;
        this.f15297 = c3926.f15253;
        this.f15293 = c3926.isEmpty() ? -1 : 0;
        this.f15295 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15293 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c3977;
        C3926 c3926 = this.f15296;
        if (c3926.f15253 != this.f15297) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f15293;
        this.f15295 = i;
        switch (this.f15294) {
            case 0:
                c3977 = this.f15298.m9130()[i];
                break;
            case 1:
                c3977 = new C3977(this.f15298, i);
                break;
            default:
                c3977 = this.f15298.m9128()[i];
                break;
        }
        int i2 = this.f15293 + 1;
        if (i2 >= c3926.f15259) {
            i2 = -1;
        }
        this.f15293 = i2;
        return c3977;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3926 c3926 = this.f15296;
        if (c3926.f15253 != this.f15297) {
            throw new ConcurrentModificationException();
        }
        ـﹶ.ˉⁱ("no calls to next() since the last call to remove()", this.f15295 >= 0);
        this.f15297 += 32;
        c3926.remove(c3926.m9130()[this.f15295]);
        this.f15293--;
        this.f15295 = -1;
    }
}
