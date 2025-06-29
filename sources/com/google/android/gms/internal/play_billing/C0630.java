package com.google.android.gms.internal.play_billing;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.ˑⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0630 extends AbstractC0655 implements RandomAccess, InterfaceC0665 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final List f3003;

    static {
        new C0630();
    }

    public C0630() {
        super(false);
        this.f3003 = Collections.emptyList();
    }

    public C0630(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f3003 = arrayList;
    }

    public C0630(ArrayList arrayList) {
        super(true);
        this.f3003 = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m2672();
        this.f3003.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2672();
        if (collection instanceof InterfaceC0665) {
            collection = ((InterfaceC0665) collection).mo2650();
        }
        boolean zAddAll = this.f3003.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3003.size(), collection);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2672();
        this.f3003.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0655, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m2672();
        Object objRemove = this.f3003.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C0615)) {
            return new String((byte[]) objRemove, AbstractC0595.f2962);
        }
        C0615 c0615 = (C0615) objRemove;
        Charset charset = AbstractC0595.f2962;
        c0615.getClass();
        Charset charset2 = AbstractC0595.f2962;
        if (c0615.mo2574() == 0) {
            return "";
        }
        return new String(c0615.f2984, 0, c0615.mo2574(), charset2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2672();
        Object obj2 = this.f3003.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0615)) {
            return new String((byte[]) obj2, AbstractC0595.f2962);
        }
        C0615 c0615 = (C0615) obj2;
        Charset charset = AbstractC0595.f2962;
        c0615.getClass();
        Charset charset2 = AbstractC0595.f2962;
        if (c0615.mo2574() == 0) {
            return "";
        }
        return new String(c0615.f2984, 0, c0615.mo2574(), charset2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3003.size();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0665
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final InterfaceC0665 mo2649() {
        return this.f3062 ? new C0681(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0665
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final List mo2650() {
        return DesugarCollections.unmodifiableList(this.f3003);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ٴˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final String get(int i) {
        String str;
        List list = this.f3003;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C0615)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0595.f2962);
            C0666 c0666 = AbstractC0585.f2952;
            int length = bArr.length;
            AbstractC0585.f2952.getClass();
            if (C0666.m2714(bArr, 0, length)) {
                list.set(i, str2);
            }
            return str2;
        }
        C0615 c0615 = (C0615) obj;
        Charset charset = AbstractC0595.f2962;
        c0615.getClass();
        Charset charset2 = AbstractC0595.f2962;
        if (c0615.mo2574() == 0) {
            str = "";
        } else {
            str = new String(c0615.f2984, 0, c0615.mo2574(), charset2);
        }
        int iMo2574 = c0615.mo2574();
        AbstractC0585.f2952.getClass();
        if (C0666.m2714(c0615.f2984, 0, iMo2574)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0665
    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final Object mo2652(int i) {
        return this.f3003.get(i);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0680
    /* renamed from: ᵎـ, reason: contains not printable characters */
    public final InterfaceC0680 mo2653(int i) {
        List list = this.f3003;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C0630(arrayList);
    }
}
