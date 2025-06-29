package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.ﹳﹳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0557 implements Iterator {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f2909;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f2910;

    public C0557(Iterator it, Iterator it2) {
        this.f2910 = it;
        this.f2909 = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2910.hasNext()) {
            return true;
        }
        return this.f2909.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.f2910;
        if (it.hasNext()) {
            return new C0429(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f2909;
        if (it2.hasNext()) {
            return new C0429((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
