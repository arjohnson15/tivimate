package com.google.crypto.tink.shaded.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ʽˆ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0723 extends AbstractList implements InterfaceC0742, RandomAccess {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0729 f3522;

    public C0723(C0729 c0729) {
        this.f3522 = c0729;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f3522.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0732(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0722(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3522.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ˋⁱ, reason: contains not printable characters */
    public final Object mo2928(int i) {
        return this.f3522.f3529.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ˏʾ, reason: contains not printable characters */
    public final InterfaceC0742 mo2929() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ᴵʿ, reason: contains not printable characters */
    public final List mo2930() {
        return DesugarCollections.unmodifiableList(this.f3522.f3529);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ᵢʿ, reason: contains not printable characters */
    public final void mo2931(AbstractC0748 abstractC0748) {
        throw new UnsupportedOperationException();
    }
}
