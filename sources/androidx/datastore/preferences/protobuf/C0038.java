package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.ˎᵢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0038 implements Iterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Iterator f432;

    public C0038(C0044 c0044) {
        this.f432 = c0044.f450.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f432.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f432.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
