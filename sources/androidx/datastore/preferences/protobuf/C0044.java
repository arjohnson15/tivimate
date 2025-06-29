package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.ˑʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0044 extends AbstractList implements InterfaceC0019, RandomAccess {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final C0060 f450;

    public C0044(C0060 c0060) {
        this.f450 = c0060;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f450.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0038(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0064(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f450.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ˋⁱ */
    public final Object mo283(int i) {
        return this.f450.f478.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ˎˑ */
    public final void mo284(C0056 c0056) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ˏʾ */
    public final InterfaceC0019 mo285() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ᴵʿ */
    public final List mo286() {
        return DesugarCollections.unmodifiableList(this.f450.f478);
    }
}
