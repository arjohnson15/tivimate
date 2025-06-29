package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0506 implements InterfaceC0489 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final ArrayList f2853;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f2854;

    public C0506(String str, ArrayList arrayList) {
        this.f2854 = str;
        ArrayList arrayList2 = new ArrayList();
        this.f2853 = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0506)) {
            return false;
        }
        C0506 c0506 = (C0506) obj;
        String str = this.f2854;
        if (str == null ? c0506.f2854 != null : !str.equals(c0506.f2854)) {
            return false;
        }
        ArrayList arrayList = this.f2853;
        ArrayList arrayList2 = c0506.f2853;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f2854;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f2853;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    public final InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r2, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
