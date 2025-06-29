package p435;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ﹶᵔ.ᵎˏ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5060 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public C5040 f19199 = null;

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final /* synthetic */ int f19200;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public int f19201;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ C5045 f19202;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public C5040 f19203;

    public C5060(C5045 c5045, int i) {
        this.f19200 = i;
        this.f19202 = c5045;
        this.f19203 = c5045.f19141.f19126;
        this.f19201 = c5045.f19139;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19203 != this.f19202.f19141;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f19200) {
            case 1:
                return m11216().f19128;
            default:
                return m11217();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5040 c5040 = this.f19199;
        if (c5040 == null) {
            throw new IllegalStateException();
        }
        C5045 c5045 = this.f19202;
        c5045.m11162(c5040, true);
        this.f19199 = null;
        this.f19201 = c5045.f19139;
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public final C5040 m11216() {
        C5040 c5040 = this.f19203;
        C5045 c5045 = this.f19202;
        if (c5040 == c5045.f19141) {
            throw new NoSuchElementException();
        }
        if (c5045.f19139 != this.f19201) {
            throw new ConcurrentModificationException();
        }
        this.f19203 = c5040.f19126;
        this.f19199 = c5040;
        return c5040;
    }

    /* renamed from: ـﹶ, reason: contains not printable characters */
    public final Object m11217() {
        return m11216();
    }
}
