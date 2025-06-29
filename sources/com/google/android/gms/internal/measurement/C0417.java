package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0417 implements Iterator {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f2707;

    public C0417(Iterator it) {
        this.f2707 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2707.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C0429((String) this.f2707.next());
    }
}
