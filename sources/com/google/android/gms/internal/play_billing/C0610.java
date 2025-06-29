package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.ˉⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0610 extends AbstractC0626 {

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient C0648 f2979;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient C0617 f2980;

    public C0610(C0648 c0648, C0617 c0617) {
        this.f2979 = c0648;
        this.f2980 = c0617;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2979.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f2980.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2979.f3051;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ﹳﹳ */
    public final int mo2560(Object[] objArr) {
        return this.f2980.mo2560(objArr);
    }
}
