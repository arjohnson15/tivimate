package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.ᐧⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0060 extends AbstractC0012 implements InterfaceC0019, RandomAccess {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f478;

    static {
        new C0060(10).f358 = false;
    }

    public C0060(int i) {
        this(new ArrayList(i));
    }

    public C0060(ArrayList arrayList) {
        this.f478 = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m233();
        this.f478.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0012, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m233();
        if (collection instanceof InterfaceC0019) {
            collection = ((InterfaceC0019) collection).mo286();
        }
        boolean zAddAll = this.f478.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0012, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f478.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0012, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m233();
        this.f478.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f478;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0056) {
            C0056 c0056 = (C0056) obj;
            c0056.getClass();
            Charset charset = AbstractC0077.f505;
            if (c0056.size() == 0) {
                str = "";
            } else {
                str = new String(c0056.f469, c0056.m485(), c0056.size(), charset);
            }
            int iM485 = c0056.m485();
            if (AbstractC0073.f497.mo237(c0056.f469, iM485, c0056.size() + iM485) == 0) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC0077.f505);
            AbstractC0072 abstractC0072 = AbstractC0073.f497;
            if (AbstractC0073.f497.mo237(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m233();
        Object objRemove = this.f478.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0056)) {
            return new String((byte[]) objRemove, AbstractC0077.f505);
        }
        C0056 c0056 = (C0056) objRemove;
        c0056.getClass();
        Charset charset = AbstractC0077.f505;
        if (c0056.size() == 0) {
            return "";
        }
        return new String(c0056.f469, c0056.m485(), c0056.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m233();
        Object obj2 = this.f478.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0056)) {
            return new String((byte[]) obj2, AbstractC0077.f505);
        }
        C0056 c0056 = (C0056) obj2;
        c0056.getClass();
        Charset charset = AbstractC0077.f505;
        if (c0056.size() == 0) {
            return "";
        }
        return new String(c0056.f469, c0056.m485(), c0056.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f478.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ˋⁱ */
    public final Object mo283(int i) {
        return this.f478.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ˎˑ */
    public final void mo284(C0056 c0056) {
        m233();
        this.f478.add(c0056);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ˏʾ */
    public final InterfaceC0019 mo285() {
        return this.f358 ? new C0044(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0048
    /* renamed from: ˏᵢ */
    public final InterfaceC0048 mo344(int i) {
        ArrayList arrayList = this.f478;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C0060(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0019
    /* renamed from: ᴵʿ */
    public final List mo286() {
        return DesugarCollections.unmodifiableList(this.f478);
    }
}
