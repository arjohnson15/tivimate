package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ˉי, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC0381 implements InterfaceC0562, InterfaceC0489 {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final HashMap f2644 = new HashMap();

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final String f2645;

    public AbstractC0381(String str) {
        this.f2645 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0381)) {
            return false;
        }
        AbstractC0381 abstractC0381 = (AbstractC0381) obj;
        String str = this.f2645;
        if (str != null) {
            return str.equals(abstractC0381.f2645);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2645;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public InterfaceC0489 mo1862() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ˉⁱ */
    public final void mo1863(String str, InterfaceC0489 interfaceC0489) {
        HashMap map = this.f2644;
        if (interfaceC0489 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0489);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ */
    public final InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r3, ArrayList arrayList) {
        return "toString".equals(str) ? new C0429(this.f2645) : AbstractC0370.m2076(this, new C0429(str), r3, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return new C0417(this.f2644.keySet().iterator());
    }

    /* renamed from: ـﹶ */
    public abstract InterfaceC0489 mo1817(ﹶˋ.ـﹶ r1, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ٴˎ */
    public final InterfaceC0489 mo1870(String str) {
        HashMap map = this.f2644;
        return map.containsKey(str) ? (InterfaceC0489) map.get(str) : InterfaceC0489.f2827;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ᐧʻ */
    public final boolean mo1871(String str) {
        return this.f2644.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() {
        return this.f2645;
    }
}
