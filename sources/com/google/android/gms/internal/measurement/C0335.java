package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.ʿʼ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0335 implements InterfaceC0562, InterfaceC0489, Iterable {

    /* renamed from: ˆʿ, reason: contains not printable characters */
    public final TreeMap f2455;

    /* renamed from: ᐧⁱ, reason: contains not printable characters */
    public final TreeMap f2456;

    public C0335() {
        this.f2456 = new TreeMap();
        this.f2455 = new TreeMap();
    }

    public C0335(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m1864(i, (InterfaceC0489) list.get(i));
            }
        }
    }

    public C0335(InterfaceC0489... interfaceC0489Arr) {
        this(Arrays.asList(interfaceC0489Arr));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0335)) {
            return false;
        }
        C0335 c0335 = (C0335) obj;
        if (m1872() != c0335.m1872()) {
            return false;
        }
        TreeMap treeMap = this.f2456;
        if (treeMap.isEmpty()) {
            return c0335.f2456.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m1868(iIntValue).equals(c0335.m1868(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2456.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0411(2, this);
    }

    public final String toString() {
        return m1873(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public final Double mo1860() {
        TreeMap treeMap = this.f2456;
        return treeMap.size() == 1 ? m1868(0).mo1860() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public final void m1861(int i) {
        TreeMap treeMap = this.f2456;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            if (treeMap.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            treeMap.put(Integer.valueOf(i2), InterfaceC0489.f2827);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            InterfaceC0489 interfaceC0489 = (InterfaceC0489) treeMap.get(Integer.valueOf(i));
            if (interfaceC0489 != null) {
                treeMap.put(Integer.valueOf(i - 1), interfaceC0489);
                treeMap.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˉי, reason: contains not printable characters */
    public final InterfaceC0489 mo1862() {
        C0335 c0335 = new C0335();
        for (Map.Entry entry : this.f2456.entrySet()) {
            boolean z = entry.getValue() instanceof InterfaceC0562;
            TreeMap treeMap = c0335.f2456;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC0489) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC0489) entry.getValue()).mo1862());
            }
        }
        return c0335;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ˉⁱ, reason: contains not printable characters */
    public final void mo1863(String str, InterfaceC0489 interfaceC0489) {
        TreeMap treeMap = this.f2455;
        if (interfaceC0489 == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0489);
        }
    }

    /* renamed from: ˋˊ, reason: contains not printable characters */
    public final void m1864(int i, InterfaceC0489 interfaceC0489) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(ـˈ.ˉᵎ.ˉⁱ("Out of bounds index: ", i));
        }
        TreeMap treeMap = this.f2456;
        if (interfaceC0489 == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), interfaceC0489);
        }
    }

    /* renamed from: ˎٴ, reason: contains not printable characters */
    public final void m1865(InterfaceC0489 interfaceC0489) {
        m1864(m1872(), interfaceC0489);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x041a, code lost:
    
        if (com.google.android.gms.internal.measurement.AbstractC0527.m2394(r3, r34, (com.google.android.gms.internal.measurement.C0420) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m1872() != m1872()) goto L208;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a7  */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v114, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v115, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v116, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.measurement.ˑי] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.google.android.gms.internal.measurement.ˑי] */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.google.android.gms.internal.measurement.ᐧʻ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.measurement.ʿʼ] */
    /* JADX WARN: Type inference failed for: r0v99, types: [com.google.android.gms.internal.measurement.ʿʼ] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˏᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0489 mo1866(java.lang.String r33, ﹶˋ.ـﹶ r34, java.util.ArrayList r35) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0335.mo1866(java.lang.String, ﹶˋ.ـﹶ, java.util.ArrayList):com.google.android.gms.internal.measurement.ᴵʿ");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ˑʽ, reason: contains not printable characters */
    public final Iterator mo1867() {
        return new C0557(this.f2456.keySet().iterator(), this.f2455.keySet().iterator());
    }

    /* renamed from: ˑי, reason: contains not printable characters */
    public final InterfaceC0489 m1868(int i) {
        InterfaceC0489 interfaceC0489;
        if (i < m1872()) {
            return (!m1877(i) || (interfaceC0489 = (InterfaceC0489) this.f2456.get(Integer.valueOf(i))) == null) ? InterfaceC0489.f2827 : interfaceC0489;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* renamed from: יʻ, reason: contains not printable characters */
    public final Iterator m1869() {
        return this.f2456.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ٴˎ, reason: contains not printable characters */
    public final InterfaceC0489 mo1870(String str) {
        InterfaceC0489 interfaceC0489;
        return "length".equals(str) ? new C0477(Double.valueOf(m1872())) : (!mo1871(str) || (interfaceC0489 = (InterfaceC0489) this.f2455.get(str)) == null) ? InterfaceC0489.f2827 : interfaceC0489;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0562
    /* renamed from: ᐧʻ, reason: contains not printable characters */
    public final boolean mo1871(String str) {
        return "length".equals(str) || this.f2455.containsKey(str);
    }

    /* renamed from: ᵎˏ, reason: contains not printable characters */
    public final int m1872() {
        TreeMap treeMap = this.f2456;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* renamed from: ﹳˎ, reason: contains not printable characters */
    public final String m1873(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f2456.isEmpty()) {
            for (int i = 0; i < m1872(); i++) {
                InterfaceC0489 interfaceC0489M1868 = m1868(i);
                sb.append(str);
                if (!(interfaceC0489M1868 instanceof C0550) && !(interfaceC0489M1868 instanceof C0385)) {
                    sb.append(interfaceC0489M1868.mo1876());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: ﹳˑ, reason: contains not printable characters */
    public final ArrayList m1874() {
        ArrayList arrayList = new ArrayList(m1872());
        for (int i = 0; i < m1872(); i++) {
            arrayList.add(m1868(i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public final Boolean mo1875() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0489
    /* renamed from: ﹶˆ, reason: contains not printable characters */
    public final String mo1876() {
        return m1873(",");
    }

    /* renamed from: ﾞˊ, reason: contains not printable characters */
    public final boolean m1877(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f2456;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(ـˈ.ˉᵎ.ˉⁱ("Out of bounds index: ", i));
    }
}
