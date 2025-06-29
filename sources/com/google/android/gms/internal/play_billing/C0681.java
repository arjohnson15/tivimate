package com.google.android.gms.internal.play_billing;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.ﾞﾞ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0681 extends AbstractList implements RandomAccess, InterfaceC0665 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0630 f3104;

    public C0681(C0630 c0630) {
        this.f3104 = c0630;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f3104.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0669(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0628(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3104.f3003.size();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0665
    /* renamed from: ʿʼ */
    public final InterfaceC0665 mo2649() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0665
    /* renamed from: ˑʽ */
    public final List mo2650() {
        return DesugarCollections.unmodifiableList(this.f3104.f3003);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0665
    /* renamed from: ᐧˋ */
    public final Object mo2652(int i) {
        return this.f3104.f3003.get(i);
    }
}
