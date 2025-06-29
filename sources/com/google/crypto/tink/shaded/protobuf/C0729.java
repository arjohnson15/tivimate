package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.AbstractC0001;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.ˆʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0729 extends AbstractC0724 implements InterfaceC0742, RandomAccess {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f3529;

    static {
        new C0729(10).f3523 = false;
    }

    public C0729(int i) {
        this(new ArrayList(i));
    }

    public C0729(ArrayList arrayList) {
        this.f3529 = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m2933();
        this.f3529.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0724, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2933();
        if (collection instanceof InterfaceC0742) {
            collection = ((InterfaceC0742) collection).mo2930();
        }
        boolean zAddAll = this.f3529.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0724, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3529.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0724, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2933();
        this.f3529.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f3529;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0748) {
            AbstractC0748 abstractC0748 = (AbstractC0748) obj;
            abstractC0748.getClass();
            Charset charset = AbstractC0731.f3531;
            if (abstractC0748.size() == 0) {
                str = "";
            } else {
                C0762 c0762 = (C0762) abstractC0748;
                str = new String(c0762.f3602, c0762.mo3169(), c0762.size(), charset);
            }
            C0762 c07622 = (C0762) abstractC0748;
            int iMo3169 = c07622.mo3169();
            if (AbstractC0778.f3639.mo30(c07622.f3602, iMo3169, c07622.size() + iMo3169) == 0) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC0731.f3531);
            AbstractC0001 abstractC0001 = AbstractC0778.f3639;
            if (AbstractC0778.f3639.mo30(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0724, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m2933();
        Object objRemove = this.f3529.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC0748)) {
            return new String((byte[]) objRemove, AbstractC0731.f3531);
        }
        AbstractC0748 abstractC0748 = (AbstractC0748) objRemove;
        abstractC0748.getClass();
        Charset charset = AbstractC0731.f3531;
        if (abstractC0748.size() == 0) {
            return "";
        }
        C0762 c0762 = (C0762) abstractC0748;
        return new String(c0762.f3602, c0762.mo3169(), c0762.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2933();
        Object obj2 = this.f3529.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0748)) {
            return new String((byte[]) obj2, AbstractC0731.f3531);
        }
        AbstractC0748 abstractC0748 = (AbstractC0748) obj2;
        abstractC0748.getClass();
        Charset charset = AbstractC0731.f3531;
        if (abstractC0748.size() == 0) {
            return "";
        }
        C0762 c0762 = (C0762) abstractC0748;
        return new String(c0762.f3602, c0762.mo3169(), c0762.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3529.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ˋⁱ */
    public final Object mo2928(int i) {
        return this.f3529.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ˏʾ */
    public final InterfaceC0742 mo2929() {
        return this.f3523 ? new C0723(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0780
    /* renamed from: ˏᵢ, reason: contains not printable characters */
    public final InterfaceC0780 mo2949(int i) {
        ArrayList arrayList = this.f3529;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C0729(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ᴵʿ */
    public final List mo2930() {
        return DesugarCollections.unmodifiableList(this.f3529);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0742
    /* renamed from: ᵢʿ */
    public final void mo2931(AbstractC0748 abstractC0748) {
        m2933();
        this.f3529.add(abstractC0748);
        ((AbstractList) this).modCount++;
    }
}
