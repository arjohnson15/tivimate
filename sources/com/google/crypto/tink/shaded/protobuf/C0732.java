package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˈﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0732 implements Iterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Iterator f3532;

    public C0732(C0723 c0723) {
        this.f3532 = c0723.f3522.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3532.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f3532.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
