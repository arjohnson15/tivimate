package p013;

import android.support.v4.media.session.AbstractC0002;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: ʻי.ˑʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1044 extends C1032 implements ListIterator {

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1033 f4442;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1044(AbstractC1033 abstractC1033, int i) {
        super(0, abstractC1033);
        this.f4442 = abstractC1033;
        int iMo3982 = abstractC1033.mo3982();
        if (i < 0 || i > iMo3982) {
            throw new IndexOutOfBoundsException(AbstractC0002.m55(i, iMo3982, "index: ", ", size: "));
        }
        this.f4433 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4433 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4433;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4433 - 1;
        this.f4433 = i;
        return this.f4442.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4433 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
