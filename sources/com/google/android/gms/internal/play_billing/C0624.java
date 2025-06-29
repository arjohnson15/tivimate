package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.ˏʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0624 extends AbstractC0626 {

    /* renamed from: ˆᵔ, reason: contains not printable characters */
    public final transient int f2994;

    /* renamed from: ˎˑ, reason: contains not printable characters */
    public final transient C0648 f2995;

    /* renamed from: ᐧˋ, reason: contains not printable characters */
    public final transient Object[] f2996;

    public C0624(C0648 c0648, Object[] objArr, int i) {
        this.f2995 = c0648;
        this.f2996 = objArr;
        this.f2994 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2995.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0597 abstractC0597M2637 = this.f2997;
        if (abstractC0597M2637 == null) {
            abstractC0597M2637 = m2637();
            this.f2997 = abstractC0597M2637;
        }
        return abstractC0597M2637.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2994;
    }

    /* renamed from: ˉי, reason: contains not printable characters */
    public final AbstractC0597 m2637() {
        return new C0608(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0593
    /* renamed from: ﹳﹳ */
    public final int mo2560(Object[] objArr) {
        AbstractC0597 abstractC0597M2637 = this.f2997;
        if (abstractC0597M2637 == null) {
            abstractC0597M2637 = m2637();
            this.f2997 = abstractC0597M2637;
        }
        return abstractC0597M2637.mo2560(objArr);
    }
}
