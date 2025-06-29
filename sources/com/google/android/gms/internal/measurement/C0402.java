package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ˋⁱ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0402 implements InterfaceC0562, InterfaceC0489 {

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final HashMap f2685 = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0402) {
            return this.f2685.equals(((C0402) obj).f2685);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2685.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f2685;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ */
    public final Double mo1860() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי */
    public final InterfaceC0489 mo1862() {
        C0402 c0402 = new C0402();
        for (Map.Entry entry : this.f2685.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC0562;
            HashMap map = c0402.f2685;
            if (z) {
                map.put((String) entry.getKey(), (InterfaceC0489) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((InterfaceC0489) entry.getValue()).mo1862());
            }
        }
        return c0402;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ˉⁱ */
    public final void mo1863(String str, InterfaceC0489 interfaceC0489) {
        HashMap map = this.f2685;
        if (interfaceC0489 == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC0489);
        }
    }

    /* renamed from: ˏᴵ */
    public InterfaceC0489 mo1866(String str, ﹶˋ.ـﹶ r3, ArrayList arrayList) {
        return "toString".equals(str) ? new C0429(toString()) : AbstractC0370.m2076(this, new C0429(str), r3, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ */
    public final Iterator mo1867() {
        return new C0417(this.f2685.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ٴˎ */
    public final InterfaceC0489 mo1870(String str) {
        HashMap map = this.f2685;
        return map.containsKey(str) ? (InterfaceC0489) map.get(str) : InterfaceC0489.f2827;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ᐧʻ */
    public final boolean mo1871(String str) {
        return this.f2685.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ */
    public final Boolean mo1875() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ */
    public final String mo1876() {
        return "[object Object]";
    }
}
