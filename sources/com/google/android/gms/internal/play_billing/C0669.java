package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.ⁱⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0669 implements Iterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final Iterator f3086;

    public C0669(C0681 c0681) {
        this.f3086 = c0681.f3104.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3086.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f3086.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
